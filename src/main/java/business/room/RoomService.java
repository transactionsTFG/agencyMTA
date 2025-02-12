package business.room;

import soapclient.hotel.room.RoomSOAP;

public interface RoomService {
    public RoomSOAP getRoom(int number);
}
