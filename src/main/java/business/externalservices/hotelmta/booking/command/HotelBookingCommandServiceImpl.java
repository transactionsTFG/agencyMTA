package business.externalservices.hotelmta.booking.command;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import javax.persistence.TypedQuery;
import javax.xml.ws.WebServiceRef;

import business.booking.BookingDTO;
import business.booking.MakeBookingReservationDTO;
import business.booking.ModifyBookingReservationDTO;
import business.travel.Travel;
import business.user.User;
import common.exceptions.SAException;
import common.mapper.BookingMapper;
import soapclient.hotel.booking.BookingSOAP;
import soapclient.hotel.booking.BookingWSB_Service;
import weblogic.wsee.wstx.wsat.Transactional;
import weblogic.wsee.wstx.wsat.Transactional.TransactionFlowType;
import weblogic.wsee.wstx.wsat.Transactional.Version;

@Stateless
public class HotelBookingCommandServiceImpl implements HotelBookingCommandService {

    private EntityManager em;

    @WebServiceRef(wsdlLocation = "http://localhost:7001/hotelMTA/BookingWSB?wsdl")
    @Transactional(version = Version.WSAT12, value = TransactionFlowType.MANDATORY)
    private BookingWSB_Service bookingService;

    @Inject
    public HotelBookingCommandServiceImpl(EntityManager em) {
        this.em = em;
    }

    public HotelBookingCommandServiceImpl() {
    }

    @Override
    public BookingDTO makeBooking(MakeBookingReservationDTO booking) {
        BookingSOAP bookingSOAP = (BookingSOAP) this.bookingService.getBookingWSBPort()
                .makeBooking(BookingMapper.INSTANCE.fromMakeDTOToRequestSOAP(booking)).getData();
        Travel travel = new Travel();
        travel.setActive(true);
        travel.setCost(bookingSOAP.getTotalPrice());
        travel.setDate(booking.getStartDate());
        travel.setReturnDate(booking.getEndDate());
        travel.setFlightCost(0);
        travel.setFlightReservationID(0);
        travel.setHotelCost(bookingSOAP.getTotalPrice());
        travel.setHotelReservationID(bookingSOAP.getId());
        travel.setStatus("");
        User user = this.em.find(User.class, booking.getCustomerId(), LockModeType.OPTIMISTIC);
        travel.setUser(user);
        this.em.persist(travel);
        return BookingMapper.INSTANCE.fromSOAPToDTO(bookingSOAP);
    }

    @Override
    public BookingDTO modifyBooking(ModifyBookingReservationDTO booking) {
        BookingSOAP bookingSOAP = (BookingSOAP) this.bookingService.getBookingWSBPort()
                .modifyBooking(BookingMapper.INSTANCE.fromModifyDTOToRequestSOAP(booking))
                .getData();

        TypedQuery<Travel> query = this.em.createNamedQuery("business.travel.Travel.findTravelByHotelReservationID",
                Travel.class);
        query.setParameter("hotelReservationID", booking.getId());
        Travel travel = query.getResultList().isEmpty() ? null : query.getResultList().get(0);

        if (travel == null) {
            throw new SAException("modifyBooking: reserva de hotel no encontrada: " + booking.getId());
        }

        if (!travel.isActive()) {
            throw new SAException("modifyBooking: reserva de hotel cancelada: " +
                    booking.getId());
        }

        travel.setActive(true);
        travel.setDate(booking.getStartDate());
        travel.setReturnDate(booking.getEndDate());
        travel.setFlightCost(0);
        travel.setFlightReservationID(0);
        travel.setHotelCost(bookingSOAP.getTotalPrice());
        travel.setCost(travel.getFlightCost() + travel.getHotelCost());
        travel.setHotelReservationID(bookingSOAP.getId());
        travel.setStatus("");
        User user = this.em.find(User.class, booking.getCustomerId());
        travel.setUser(user);
        return BookingMapper.INSTANCE.fromSOAPToDTO(bookingSOAP);
    }

    @Override
    public double cancelBooking(long bookingId) {
        double moneyReturned = (double) this.bookingService.getBookingWSBPort().cancelBooking(bookingId)
                .getData();

        TypedQuery<Travel> query = this.em.createNamedQuery("business.travel.Travel.findTravelByHotelReservationID",
                Travel.class);
        query.setParameter("hotelReservationID", bookingId);
        Travel travel = query.getResultList().isEmpty() ? null : query.getResultList().get(0);

        if (travel == null) {
            throw new SAException("modifyBooking: reserva de hotel no encontrada: " + bookingId);
        }

        if (!travel.isActive()) {
            throw new SAException("modifyBooking: reserva de hotel cancelada: " +
                    bookingId);
        }

        travel.setHotelCost(travel.getHotelCost() - moneyReturned);
        travel.setCost(travel.getHotelCost() + travel.getFlightCost());
        if (travel.getCost() <= 0) {
            travel.setCost(0);
            travel.setActive(false);
        }
        return moneyReturned;
    }

    @Override
    public double cancelBookingLine(long bookingId, long roomId) {
        double moneyReturned = (double) this.bookingService.getBookingWSBPort().cancelBookingLine(bookingId, roomId)
                .getData();

        TypedQuery<Travel> query = this.em.createNamedQuery("business.travel.Travel.findTravelByHotelReservationID",
                Travel.class);
        query.setParameter("hotelReservationID", bookingId);
        Travel travel = query.getResultList().isEmpty() ? null : query.getResultList().get(0);

        if (travel == null) {
            throw new SAException("modifyBooking: reserva de hotel no encontrada: " + bookingId);
        }

        if (!travel.isActive()) {
            throw new SAException("modifyBooking: reserva de hotel cancelada: " +
                    bookingId);
        }

        travel.setHotelCost(travel.getHotelCost() - moneyReturned);
        travel.setCost(travel.getCost() - moneyReturned);
        if (travel.getCost() <= 0) {
            travel.setHotelCost(0);
            travel.setFlightCost(0);
            travel.setCost(0);
            travel.setActive(false);
        }
        return moneyReturned;
    }

}
