
package soapclient.hotel.room;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RoomWSB", targetNamespace = "http://soap/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RoomWSB {


    /**
     * 
     * @param arg0
     * @return
     *     returns soapclient.hotel.room.SoapResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchRoom", targetNamespace = "http://soap/", className = "soapclient.hotel.room.SearchRoom")
    @ResponseWrapper(localName = "searchRoomResponse", targetNamespace = "http://soap/", className = "soapclient.hotel.room.SearchRoomResponse")
    @Action(input = "http://soap/RoomWSB/searchRoomRequest", output = "http://soap/RoomWSB/searchRoomResponse")
    public SoapResponse searchRoom(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
