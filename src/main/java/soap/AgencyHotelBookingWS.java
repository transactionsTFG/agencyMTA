package soap;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


import business.booking.BookingDTO;
import business.booking.MakeBookingReservationDTO;
import business.booking.ModifyBookingReservationDTO;
import business.services.externalservices.agencygateway.command.GatewayAgencyCommandService;
import business.services.externalservices.hotelmta.booking.command.HotelBookingCommandService;
import common.consts.WebMethodConsts;
import common.exceptions.SAException;

import weblogic.wsee.wstx.wsat.Transactional;

@WebService(serviceName = "AgencyHotelBookingWS")
public class AgencyHotelBookingWS {

    private final GatewayAgencyCommandService gatewayAgencyCommandService;
    private final HotelBookingCommandService hotelBookingCommandService;

    @Inject
    public AgencyHotelBookingWS(final GatewayAgencyCommandService gatewayAgencyCommandService, final HotelBookingCommandService hotelBookingCommandService) {
        this.gatewayAgencyCommandService = gatewayAgencyCommandService;
        this.hotelBookingCommandService = hotelBookingCommandService;
    }

    @WebMethod(operationName = WebMethodConsts.OP_MAKE_HOTEL_BOOKING)
    @Transactional
    public BookingDTO makeBooking(@WebParam(name = "booking") MakeBookingReservationDTO booking, @WebParam(name = "user") long idCustomer, @WebParam(name = "dni")  String dni) throws SAException {
        return this.gatewayAgencyCommandService.makeReservationHotel(booking, idCustomer, dni);
    }

    @WebMethod(operationName = WebMethodConsts.OP_MODIFY_HOTEL_BOOKING)
    @Transactional
    public BookingDTO modifyBooking(@WebParam(name = "booking") ModifyBookingReservationDTO booking) throws SAException {
        return this.gatewayAgencyCommandService.modifyReservationHotel(booking);
    }

    @WebMethod(operationName = WebMethodConsts.OP_CANCEL_HOTEL_BOOKING)
    @Transactional
    public double cancelBooking(@WebParam(name = "bookingId") long bookingId) throws SAException {
        return this.gatewayAgencyCommandService.cancelReservationHotel(bookingId);
    }

    @WebMethod(operationName = WebMethodConsts.OP_CANCEL_HOTEL_BOOKING_LINE)
    @Transactional
    public double cancelBooking(@WebParam(name = "bookingId") long bookingId, @WebParam(name = "roomId") long roomId) throws SAException {
        return this.gatewayAgencyCommandService.cancelReservationLineHotel(bookingId, roomId);
    }

    @WebMethod(operationName = WebMethodConsts.OP_SEARCH_HOTEL_BOOKING)
    @Transactional
    public BookingDTO readBooking(@WebParam(name = "bookingId") int bookingId) throws SAException {
        return this.hotelBookingCommandService.getBookingWithLockMode(bookingId);
    }

}
