
package soapclient.hotel.room;

import java.util.List;
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
@WebService(name = "BookingWSB", targetNamespace = "http://soap/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BookingWSB {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns soapclient.hotel.room.SoapResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "makeBooking", targetNamespace = "http://soap/", className = "soapclient.hotel.room.MakeBooking")
    @ResponseWrapper(localName = "makeBookingResponse", targetNamespace = "http://soap/", className = "soapclient.hotel.room.MakeBookingResponse")
    @Action(input = "http://soap/BookingWSB/makeBookingRequest", output = "http://soap/BookingWSB/makeBookingResponse")
    public SoapResponse makeBooking(
        @WebParam(name = "arg0", targetNamespace = "")
        BookingDTO arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        List<RoomDTO> arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns soapclient.hotel.room.SoapResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modifyBooking", targetNamespace = "http://soap/", className = "soapclient.hotel.room.ModifyBooking")
    @ResponseWrapper(localName = "modifyBookingResponse", targetNamespace = "http://soap/", className = "soapclient.hotel.room.ModifyBookingResponse")
    @Action(input = "http://soap/BookingWSB/modifyBookingRequest", output = "http://soap/BookingWSB/modifyBookingResponse")
    public SoapResponse modifyBooking(
        @WebParam(name = "arg0", targetNamespace = "")
        BookingDTO arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        List<RoomDTO> arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns soapclient.hotel.room.SoapResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cancelBooking", targetNamespace = "http://soap/", className = "soapclient.hotel.room.CancelBooking")
    @ResponseWrapper(localName = "cancelBookingResponse", targetNamespace = "http://soap/", className = "soapclient.hotel.room.CancelBookingResponse")
    @Action(input = "http://soap/BookingWSB/cancelBookingRequest", output = "http://soap/BookingWSB/cancelBookingResponse")
    public SoapResponse cancelBooking(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns soapclient.hotel.room.SoapResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchBooking", targetNamespace = "http://soap/", className = "soapclient.hotel.room.SearchBooking")
    @ResponseWrapper(localName = "searchBookingResponse", targetNamespace = "http://soap/", className = "soapclient.hotel.room.SearchBookingResponse")
    @Action(input = "http://soap/BookingWSB/searchBookingRequest", output = "http://soap/BookingWSB/searchBookingResponse")
    public SoapResponse searchBooking(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
