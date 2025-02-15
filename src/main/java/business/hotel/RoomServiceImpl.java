package business.hotel;

import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

import soapclient.hotel.room.RoomSOAP;
import soapclient.hotel.room.RoomWSB_Service;
import weblogic.wsee.wstx.wsat.Transactional;
import weblogic.wsee.wstx.wsat.Transactional.TransactionFlowType;
import weblogic.wsee.wstx.wsat.Transactional.Version;

@Stateless
public class RoomServiceImpl implements RoomService {

    @WebServiceRef(wsdlLocation = "http://localhost:7001/hotelMTA/RoomWSB?wsdl")
    @Transactional(version = Version.WSAT12, value = TransactionFlowType.MANDATORY)
    private RoomWSB_Service roomService;

    @Override
    public RoomSOAP getRoom(int number) {
        return (RoomSOAP) this.roomService.getRoomWSBPort().searchRoom(number).getData();
    }

}
