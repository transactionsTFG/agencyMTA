package soap;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import business.booking.BookingDTO;
import business.booking.MakeBookingReservationDTO;
import business.booking.ModifyBookingReservationDTO;
import business.externalservices.hotelmta.booking.command.HotelBookingCommandService;
import business.externalservices.hotelmta.booking.query.HotelBookingQueryService;
import common.consts.WebMethodConsts;
import common.exceptions.SAException;
import soapclient.hotel.booking.BookingSOAP;
import weblogic.wsee.wstx.wsat.Transactional;

@WebService(serviceName = "AgencyBookingWS")
public class AgencyBookingWS {

    private final HotelBookingCommandService bookingCommandService;
    private final HotelBookingQueryService bookingQueryService;

    @Inject
    public AgencyBookingWS(final HotelBookingCommandService bookingCommandService,
            final HotelBookingQueryService bookingQueryService) {
        this.bookingCommandService = bookingCommandService;
        this.bookingQueryService = bookingQueryService;
    }

    @WebMethod(operationName = WebMethodConsts.OP_MAKE_HOTEL_BOOKING)
    @Transactional
    public BookingDTO makeBooking(@WebParam(name = "booking") MakeBookingReservationDTO booking) throws SAException {
        return this.bookingCommandService.makeBooking(booking);
    }

    @WebMethod(operationName = WebMethodConsts.OP_MODIFY_HOTEL_BOOKING)
    @Transactional
    public BookingDTO modifyBooking(@WebParam(name = "booking") ModifyBookingReservationDTO booking) throws SAException {
        return this.bookingCommandService.modifyBooking(booking);
    }

    @WebMethod(operationName = WebMethodConsts.OP_CANCEL_HOTEL_BOOKING)
    @Transactional
    public double cancelBooking(@WebParam(name = "bookingId") long bookingId) throws SAException {
        double moneyReturned = this.bookingCommandService.cancelBooking(bookingId);

        return moneyReturned;
    }

    @WebMethod(operationName = WebMethodConsts.OP_CANCEL_HOTEL_BOOKING_LINE)
    @Transactional
    public double cancelBooking(@WebParam(name = "bookingId") long bookingId, @WebParam(name = "roomId") long roomId)
            throws SAException {
        double moneyReturned = this.bookingCommandService.cancelBookingLine(bookingId, roomId);

        return moneyReturned;
    }

    @WebMethod(operationName = WebMethodConsts.OP_SEARCH_HOTEL_BOOKING)
    @Transactional
    public BookingSOAP readBooking(@WebParam(name = "bookingId") int bookingId) throws SAException {
        BookingSOAP bookingSOAP = this.bookingQueryService.readBooking(bookingId);

        return bookingSOAP;
    }

}
