package soap;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import business.hotel.RoomService;
import common.consts.WebMethodConsts;
import common.dto.MakeBookingSOAP;
import common.dto.MakeRoomSOAP;
import common.exceptions.SAException;
import soapclient.hotel.room.RoomSOAP;
import soapclient.hotel.room.BookingSOAP;
import weblogic.wsee.wstx.wsat.Transactional;


@WebService(serviceName = "AgencyRoomWS")
public class AgencyRoomWS {

    private final RoomService roomService;

    @Inject
    public AgencyRoomWS(final RoomService roomService) {
        this.roomService = roomService;
    }

    @WebMethod(operationName = WebMethodConsts.OP_SEARCH_ROOM)
    @Transactional
    public RoomSOAP readRoom(@WebParam(name = "number") int number) throws SAException {
        return this.roomService.getRoom(number);
    }

    @WebMethod(operationName = WebMethodConsts.OP_MAKE_ROOM_RESERVATION)
    @Transactional
    public BookingSOAP makeRoomReservation(@WebParam(name = "booking") MakeBookingSOAP booking, @WebParam(name = "rooms") List<MakeRoomSOAP> rooms) throws SAException {
        return this.roomService.makeBooking(booking, rooms);
    }
    
}
