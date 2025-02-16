package soap;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import business.hotel.BookingService;
import common.consts.WebMethodConsts;
import common.dto.MakeBookingSOAP;
import common.dto.MakeRoomSOAP;
import common.exceptions.SAException;
import soapclient.hotel.booking.BookingSOAP;
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
    public BookingSOAP makeBooking(@WebParam(name = "booking") MakeBookingSOAP booking, @WebParam(name = "rooms") List<MakeRoomSOAP> rooms) throws SAException {
        return this.bookingService.makeBooking(booking, rooms);
    }

    @WebMethod(operationName = WebMethodConsts.OP_SEARCH_HOTEL_BOOKING)
    @Transactional
    public BookingSOAP readBooking(@WebParam(name = "bookingId") int bookingId) throws SAException {
        return this.bookingService.readBooking(bookingId);
    }
    
}
