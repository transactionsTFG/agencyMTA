package soap;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import business.hotel.BookingService;
import common.consts.WebMethodConsts;
import common.exceptions.SAException;
import soapclient.hotel.booking.BookingSOAP;
import soapclient.hotel.booking.MakeBookingRequestSOAP;
import weblogic.wsee.wstx.wsat.Transactional;

@WebService(serviceName = "AgencyBookingWS")
public class AgencyBookingWS {

    private final BookingService bookingService;

    @Inject
    public AgencyBookingWS(final BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @WebMethod(operationName = WebMethodConsts.OP_MAKE_HOTEL_BOOKING)
    @Transactional
    public BookingSOAP makeBooking(@WebParam(name = "booking") MakeBookingRequestSOAP booking) throws SAException {
        System.out.println("AgencyBookingWS.makeBooking-----------------------------------------------------------------" + booking.toString());
        BookingSOAP bookingSOAP = this.bookingService.makeBooking(booking);
        System.out.println("AgencyBookingWS.makeBooking----------------------------------------------------------------- bOOKNIGSOAP" + bookingSOAP.toString());
        return bookingSOAP;
    }

    @WebMethod(operationName = WebMethodConsts.OP_SEARCH_HOTEL_BOOKING)
    @Transactional
    public BookingSOAP readBooking(@WebParam(name = "bookingId") int bookingId) throws SAException {
        return this.bookingService.readBooking(bookingId);
    }
    
}
