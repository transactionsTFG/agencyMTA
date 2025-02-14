package business.hotel;

import java.util.List;

import common.dto.MakeBookingSOAP;
import common.dto.MakeRoomSOAP;
import soapclient.hotel.room.RoomSOAP;
import soapclient.hotel.room.BookingSOAP;

public interface RoomService {
    public RoomSOAP getRoom(int number);
    public BookingSOAP makeBooking(MakeBookingSOAP booking, List<MakeRoomSOAP> rooms);
}
