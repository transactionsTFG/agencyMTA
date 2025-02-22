package soap;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import business.services.externalservices.hotelmta.room.query.HotelRoomQueryService;
import common.consts.WebMethodConsts;
import common.dto.services.RoomListDTO;
import common.exceptions.SAException;
import soapclient.hotel.room.RoomSOAP;

@WebService(serviceName = "AgencyRoomWS")
public class AgencyRoomWS {

    private final HotelRoomQueryService hotelRoomQueryService;

    @Inject
    public AgencyRoomWS(final HotelRoomQueryService hotelRoomQueryService) {
        this.hotelRoomQueryService = hotelRoomQueryService;
    }

    @WebMethod(operationName = WebMethodConsts.OP_SEARCH_ROOM)
    public RoomSOAP readRoom(@WebParam(name = "number") int id) throws SAException {
        return this.hotelRoomQueryService.getRoom(id);
    }
    
    @WebMethod(operationName = WebMethodConsts.OP_SEARCH_ROOMS)
    public List<RoomListDTO> readRooms(@WebParam(name = "nameHotel") String nameHotel, @WebParam(name = "nameCountry") String nameCountry) {
        return this.hotelRoomQueryService.getRooms(nameHotel, nameCountry);
    }

}
