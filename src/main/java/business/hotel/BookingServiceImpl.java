package business.hotel;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.xml.ws.WebServiceRef;

import business.travel.Travel;
import business.user.User;
import lombok.extern.log4j.Log4j2;
import soapclient.hotel.booking.BookingWSB_Service;
import soapclient.hotel.booking.MakeBookingRequestSOAP;
import soapclient.hotel.booking.BookingSOAP;
import weblogic.wsee.wstx.wsat.Transactional;
import weblogic.wsee.wstx.wsat.Transactional.TransactionFlowType;
import weblogic.wsee.wstx.wsat.Transactional.Version;

@Stateless
@Log4j2
public class BookingServiceImpl implements BookingService {

    private EntityManager em;

    @WebServiceRef(wsdlLocation = "http://localhost:7001/hotelMTA/BookingWSB?wsdl")
    @Transactional(version = Version.WSAT12, value = TransactionFlowType.MANDATORY)
    private BookingWSB_Service bookingService;

    @Inject
    public BookingServiceImpl(EntityManager em) {
        this.em = em;
    }

    public BookingServiceImpl() {
    }

    @Override
    public BookingSOAP makeBooking(MakeBookingRequestSOAP booking) {
        System.out.println(
                "BookingServiceImpl.makeBooking-------------------------------------------------------------- roomNumber:"
                        + booking);
        BookingSOAP bookingSOAP = (BookingSOAP) this.bookingService.getBookingWSBPort().makeBooking(booking).getData();
        System.out.println(
                "BookingServiceImpl.makeBooking-------------------------------------------------------------- BookingSOAP:"
                        + bookingSOAP.toString());
        Travel travel = new Travel();
        travel.setActive(true);
        travel.setCost(50);
        travel.setDate(booking.getDate());
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
    public BookingSOAP readBooking(int bookingId) {
        return (BookingSOAP) this.bookingService.getBookingWSBPort().searchBooking(bookingId).getData();
    }
}
