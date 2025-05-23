package business.services.externalservices.hotelmta.room.query;

import java.util.List;

import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

import common.dto.services.RoomListDTO;
import soapclient.hotel.room.BookingLineDTO;
import soapclient.hotel.room.RoomDTO;
import soapclient.hotel.room.RoomWSB_Service;

@Stateless
public class HotelRoomQueryServiceImpl implements HotelRoomQueryService {

    @WebServiceRef(wsdlLocation = "https://localhost:7002/hotelMTA/RoomWSB?wsdl")
    private RoomWSB_Service roomServiceWithTransactionRead;

    @Override
    public List<RoomListDTO> getRooms(String nameHotel, String nameCountry) {
        return this.roomServiceWithTransactionRead.getRoomWSBPort()
                        .searchRooms(nameHotel, nameCountry)
                        .stream().map(RoomListDTO::fromRoomParamsDTO).toList();
    }

    @Override
    public RoomDTO getRoom(long id) {
        return this.roomServiceWithTransactionRead.getRoomWSBPort().searchRoom(id);
    }

    @Override
    public List<BookingLineDTO> getRoomsByBooking(long bookingId) {
        return this.roomServiceWithTransactionRead.getRoomWSBPort().searchRoomsByBooking(bookingId);
    }
    
}
