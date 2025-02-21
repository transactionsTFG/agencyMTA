<<<<<<<< HEAD:src/main/java/business/hotel/RoomServiceImpl.java
package business.hotel;
========
package business.externalservices.hotelmta.room.command;
>>>>>>>> origin/main:src/main/java/business/externalservices/hotelmta/room/command/HotelRoomCommandServiceImpl.java

import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

import soapclient.hotel.room.RoomWSB_Service;
import weblogic.wsee.wstx.wsat.Transactional;
import weblogic.wsee.wstx.wsat.Transactional.TransactionFlowType;
import weblogic.wsee.wstx.wsat.Transactional.Version;

@Stateless
public class HotelRoomCommandServiceImpl implements HotelRoomCommandService {

    @WebServiceRef(wsdlLocation = "http://localhost:7001/hotelMTA/RoomWSB?wsdl")
    @Transactional(version = Version.WSAT12, value = TransactionFlowType.MANDATORY)
<<<<<<<< HEAD:src/main/java/business/hotel/RoomServiceImpl.java
    private RoomWSB_Service roomService;

    @Override
    public RoomSOAP getRoom(int number) {
        return (RoomSOAP) this.roomService.getRoomWSBPort().searchRoom(number).getData();
    }

========
    private RoomWSB_Service roomServiceWithTransactionWrite;
    
>>>>>>>> origin/main:src/main/java/business/externalservices/hotelmta/room/command/HotelRoomCommandServiceImpl.java
}
