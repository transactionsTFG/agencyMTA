package soap;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import business.room.RoomDTO;
import business.room.RoomService;
import common.consts.WebMethodConsts;
import common.exceptions.SAException;
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
    public RoomDTO readRoom(@WebParam(name = "number") int number) throws SAException {
        return this.roomService.searchRoom(number);
    }
    
}
