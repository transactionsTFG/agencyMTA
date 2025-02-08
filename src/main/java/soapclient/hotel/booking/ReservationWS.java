
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
@WebService(name = "ReservationWS", targetNamespace = "http://soap/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReservationWS {


    /**
     * 
     * @param request
     * @return
     *     returns soapclient.hotel.booking.SoapResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "makeReservation", targetNamespace = "http://soap/", className = "soapclient.hotel.booking.MakeReservation")
    @ResponseWrapper(localName = "makeReservationResponse", targetNamespace = "http://soap/", className = "soapclient.hotel.booking.MakeReservationResponse")
    @Action(input = "http://soap/ReservationWS/makeReservationRequest", output = "http://soap/ReservationWS/makeReservationResponse")
    public SoapResponse makeReservation(
        @WebParam(name = "request", targetNamespace = "")
        MakeReservationRequestSOAP request);

    /**
     * 
     * @param idReservation
     * @param idFlightInstance
     * @return
     *     returns soapclient.hotel.booking.SoapResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cancelReservation", targetNamespace = "http://soap/", className = "soapclient.hotel.booking.CancelReservation")
    @ResponseWrapper(localName = "cancelReservationResponse", targetNamespace = "http://soap/", className = "soapclient.hotel.booking.CancelReservationResponse")
    @Action(input = "http://soap/ReservationWS/cancelReservationRequest", output = "http://soap/ReservationWS/cancelReservationResponse")
    public SoapResponse cancelReservation(
        @WebParam(name = "idReservation", targetNamespace = "")
        long idReservation,
        @WebParam(name = "idFlightInstance", targetNamespace = "")
        long idFlightInstance);

    /**
     * 
     * @param request
     * @return
     *     returns soapclient.hotel.booking.SoapResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modifyReservation", targetNamespace = "http://soap/", className = "soapclient.hotel.booking.ModifyReservation")
    @ResponseWrapper(localName = "modifyReservationResponse", targetNamespace = "http://soap/", className = "soapclient.hotel.booking.ModifyReservationResponse")
    @Action(input = "http://soap/ReservationWS/modifyReservationRequest", output = "http://soap/ReservationWS/modifyReservationResponse")
    public SoapResponse modifyReservation(
        @WebParam(name = "request", targetNamespace = "")
        ModifyReservationRequestSOAP request);

    /**
     * 
     * @param idReservation
     * @return
     *     returns soapclient.hotel.booking.SoapResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchReservation", targetNamespace = "http://soap/", className = "soapclient.hotel.booking.SearchReservation")
    @ResponseWrapper(localName = "searchReservationResponse", targetNamespace = "http://soap/", className = "soapclient.hotel.booking.SearchReservationResponse")
    @Action(input = "http://soap/ReservationWS/searchReservationRequest", output = "http://soap/ReservationWS/searchReservationResponse")
    public SoapResponse searchReservation(
        @WebParam(name = "idReservation", targetNamespace = "")
        long idReservation);

}
