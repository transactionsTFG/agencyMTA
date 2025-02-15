package business.hotel;

import soapclient.hotel.room.RoomSOAP;

public interface RoomService {
    public RoomSOAP getRoom(int number);
}
