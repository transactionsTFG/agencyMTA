package business.services.externalservices.hotelmta.room.query;

import java.util.List;

import common.dto.services.RoomListDTO;
import soapclient.hotel.room.RoomDTO;

public interface HotelRoomQueryService {
    List<RoomListDTO> getRooms(String nameHotel, String nameCountry);
    List<RoomDTO> getRoomsByBooking(long bookingId);
    RoomDTO getRoom(long id);
}
