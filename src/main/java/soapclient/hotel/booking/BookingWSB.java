
package soapclient.hotel.booking;

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
     * @param booking
     * @return
     *     returns soapclient.hotel.booking.SoapResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modifyBooking", targetNamespace = "http://soap/", className = "soapclient.hotel.booking.ModifyBooking")
    @ResponseWrapper(localName = "modifyBookingResponse", targetNamespace = "http://soap/", className = "soapclient.hotel.booking.ModifyBookingResponse")
    @Action(input = "http://soap/BookingWSB/modifyBookingRequest", output = "http://soap/BookingWSB/modifyBookingResponse")
    public SoapResponse modifyBooking(
        @WebParam(name = "booking", targetNamespace = "")
        ModifyBookingRequestSOAP booking);

    /**
     * 
     * @param bookingID
     * @return
     *     returns soapclient.hotel.booking.SoapResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchBooking", targetNamespace = "http://soap/", className = "soapclient.hotel.booking.SearchBooking")
    @ResponseWrapper(localName = "searchBookingResponse", targetNamespace = "http://soap/", className = "soapclient.hotel.booking.SearchBookingResponse")
    @Action(input = "http://soap/BookingWSB/searchBookingRequest", output = "http://soap/BookingWSB/searchBookingResponse")
    public SoapResponse searchBooking(
        @WebParam(name = "bookingID", targetNamespace = "")
        long bookingID);

    /**
     * 
     * @param booking
     * @return
     *     returns soapclient.hotel.booking.SoapResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "makeBooking", targetNamespace = "http://soap/", className = "soapclient.hotel.booking.MakeBooking")
    @ResponseWrapper(localName = "makeBookingResponse", targetNamespace = "http://soap/", className = "soapclient.hotel.booking.MakeBookingResponse")
    @Action(input = "http://soap/BookingWSB/makeBookingRequest", output = "http://soap/BookingWSB/makeBookingResponse")
    public SoapResponse makeBooking(
        @WebParam(name = "booking", targetNamespace = "")
        MakeBookingRequestSOAP booking);

    /**
     * 
     * @param bookingID
     * @return
     *     returns soapclient.hotel.booking.SoapResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cancelBooking", targetNamespace = "http://soap/", className = "soapclient.hotel.booking.CancelBooking")
    @ResponseWrapper(localName = "cancelBookingResponse", targetNamespace = "http://soap/", className = "soapclient.hotel.booking.CancelBookingResponse")
    @Action(input = "http://soap/BookingWSB/cancelBookingRequest", output = "http://soap/BookingWSB/cancelBookingResponse")
    public SoapResponse cancelBooking(
        @WebParam(name = "bookingID", targetNamespace = "")
        long bookingID);

}
