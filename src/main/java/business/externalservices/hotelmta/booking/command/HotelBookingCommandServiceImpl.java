package business.externalservices.hotelmta.booking.command;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.xml.ws.WebServiceRef;

import business.travel.Travel;
import business.user.User;
import common.exceptions.SAException;
import soapclient.hotel.booking.BookingSOAP;
import soapclient.hotel.booking.BookingWSB_Service;
import soapclient.hotel.booking.MakeBookingRequestSOAP;
import soapclient.hotel.booking.ModifyBookingRequestSOAP;
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
    public BookingSOAP makeBooking(MakeBookingRequestSOAP booking) {

        BookingSOAP bookingSOAP = (BookingSOAP) this.bookingService.getBookingWSBPort().makeBooking(booking).getData();
        Travel travel = new Travel();
        travel.setActive(true);
        travel.setCost(50);
        travel.setDate(booking.getStartDate());
        travel.setReturnDate(booking.getEndDate());
        travel.setFlightCost(0);
        travel.setFlightReservationID(0);
        travel.setHotelCost(50);
        travel.setHotelReservationID(bookingSOAP.getId());
        travel.setReturnDate("");
        travel.setStatus("");
        User user = this.em.find(User.class, booking.getCustomerId());
        travel.setUser(user);
        this.em.persist(travel);
        return bookingSOAP;
    }

    @Override
    public BookingSOAP modifyBooking(ModifyBookingRequestSOAP booking) {
        BookingSOAP bookingSOAP = (BookingSOAP) this.bookingService.getBookingWSBPort().modifyBooking(booking)
                .getData();

        TypedQuery<Travel> query = this.em.createNamedQuery("business.travel.Travel.findTravelByHotelReservationID",
                Travel.class);
        query.setParameter("hotelReservationID", booking.getId());
        Travel travel = query.getResultList().isEmpty() ? null : query.getResultList().get(0);

        if (travel == null) {
            throw new SAException("modifyBooking: reserva de hotel no encontrada: " + booking.getId());
        }

        // if (!travel.isActive()) {
        // throw new SAException("modifyBooking: reserva de hotel cancelada: " +
        // booking.getId());
        // }

        travel.setActive(true);
        travel.setCost(50);
        travel.setDate(booking.getStartDate());
        travel.setReturnDate(booking.getEndDate());
        travel.setFlightCost(0);
        travel.setFlightReservationID(0);
        travel.setHotelCost(50);
        travel.setHotelReservationID(bookingSOAP.getId());
        travel.setReturnDate("");
        travel.setStatus("");
        User user = this.em.find(User.class, booking.getCustomerId());
        travel.setUser(user);
        return bookingSOAP;
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

        travel.setActive(false);
        travel.setCost(travel.getCost() - moneyReturned);
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
