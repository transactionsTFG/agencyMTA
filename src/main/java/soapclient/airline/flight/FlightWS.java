
package soapclient.airline.flight;

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
@WebService(name = "FlightWS", targetNamespace = "http://soap/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FlightWS {


    /**
     * 
     * @param idFlightSearch
     * @return
     *     returns soapclient.airline.flight.SoapResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchFlight", targetNamespace = "http://soap/", className = "soapclient.airline.flight.SearchFlight")
    @ResponseWrapper(localName = "searchFlightResponse", targetNamespace = "http://soap/", className = "soapclient.airline.flight.SearchFlightResponse")
    @Action(input = "http://soap/FlightWS/searchFlightRequest", output = "http://soap/FlightWS/searchFlightResponse")
    public SoapResponse searchFlight(
        @WebParam(name = "idFlightSearch", targetNamespace = "")
        long idFlightSearch);

    /**
     * 
     * @param paramSearch
     * @return
     *     returns java.util.List<soapclient.airline.flight.FlightDataListSOAP>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchFlights", targetNamespace = "http://soap/", className = "soapclient.airline.flight.SearchFlights")
    @ResponseWrapper(localName = "searchFlightsResponse", targetNamespace = "http://soap/", className = "soapclient.airline.flight.SearchFlightsResponse")
    @Action(input = "http://soap/FlightWS/searchFlightsRequest", output = "http://soap/FlightWS/searchFlightsResponse")
    public List<FlightDataListSOAP> searchFlights(
        @WebParam(name = "paramSearch", targetNamespace = "")
        ParamFlightSOAP paramSearch);

}
