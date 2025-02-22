package business.services.externalservices.hotelmta.room.query;

import java.util.List;

import common.dto.services.RoomListDTO;
import soapclient.hotel.room.RoomSOAP;

public interface HotelRoomQueryService {
    List<RoomListDTO> getRooms(String nameHotel, String nameCountry);
    RoomSOAP getRoom(int id);
}
