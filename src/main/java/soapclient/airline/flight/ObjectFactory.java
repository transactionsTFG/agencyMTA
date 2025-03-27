
package soapclient.airline.flight;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soapclient.airline.flight package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ParamFlightSOAP_QNAME = new QName("http://soap/", "ParamFlightSOAP");
    private final static QName _FlightSOAP_QNAME = new QName("http://soap/", "FlightSOAP");
    private final static QName _NewReservationSOAP_QNAME = new QName("http://soap/", "NewReservationSOAP");
    private final static QName _ReservationSOAP_QNAME = new QName("http://soap/", "ReservationSOAP");
    private final static QName _SoapResponse_QNAME = new QName("http://soap/", "SoapResponse");
    private final static QName _UpdateReservationSOAP_QNAME = new QName("http://soap/", "UpdateReservationSOAP");
    private final static QName _SearchFlights_QNAME = new QName("http://soap/", "searchFlights");
    private final static QName _SearchFlightsResponse_QNAME = new QName("http://soap/", "searchFlightsResponse");
    private final static QName _SearchFlight_QNAME = new QName("http://soap/", "searchFlight");
    private final static QName _SearchFlightsByReservation_QNAME = new QName("http://soap/", "searchFlightsByReservation");
    private final static QName _SearchFlightsByReservationResponse_QNAME = new QName("http://soap/", "searchFlightsByReservationResponse");
    private final static QName _SearchFlightInstace_QNAME = new QName("http://soap/", "searchFlightInstace");
    private final static QName _SearchFlightInstaceResponse_QNAME = new QName("http://soap/", "searchFlightInstaceResponse");
    private final static QName _SearchFlightResponse_QNAME = new QName("http://soap/", "searchFlightResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soapclient.airline.flight
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NewReservationSOAP }
     * 
     */
    public NewReservationSOAP createNewReservationSOAP() {
        return new NewReservationSOAP();
    }

    /**
     * Create an instance of {@link ParamFlightSOAP }
     * 
     */
    public ParamFlightSOAP createParamFlightSOAP() {
        return new ParamFlightSOAP();
    }

    /**
     * Create an instance of {@link FlightSOAP }
     * 
     */
    public FlightSOAP createFlightSOAP() {
        return new FlightSOAP();
    }

    /**
     * Create an instance of {@link ReservationSOAP }
     * 
     */
    public ReservationSOAP createReservationSOAP() {
        return new ReservationSOAP();
    }

    /**
     * Create an instance of {@link SoapResponse }
     * 
     */
    public SoapResponse createSoapResponse() {
        return new SoapResponse();
    }

    /**
     * Create an instance of {@link UpdateReservationSOAP }
     * 
     */
    public UpdateReservationSOAP createUpdateReservationSOAP() {
        return new UpdateReservationSOAP();
    }

    /**
     * Create an instance of {@link SearchFlights }
     * 
     */
    public SearchFlights createSearchFlights() {
        return new SearchFlights();
    }

    /**
     * Create an instance of {@link SearchFlightsResponse }
     * 
     */
    public SearchFlightsResponse createSearchFlightsResponse() {
        return new SearchFlightsResponse();
    }

    /**
     * Create an instance of {@link SearchFlight }
     * 
     */
    public SearchFlight createSearchFlight() {
        return new SearchFlight();
    }

    /**
     * Create an instance of {@link SearchFlightsByReservation }
     * 
     */
    public SearchFlightsByReservation createSearchFlightsByReservation() {
        return new SearchFlightsByReservation();
    }

    /**
     * Create an instance of {@link SearchFlightsByReservationResponse }
     * 
     */
    public SearchFlightsByReservationResponse createSearchFlightsByReservationResponse() {
        return new SearchFlightsByReservationResponse();
    }

    /**
     * Create an instance of {@link SearchFlightInstace }
     * 
     */
    public SearchFlightInstace createSearchFlightInstace() {
        return new SearchFlightInstace();
    }

    /**
     * Create an instance of {@link SearchFlightInstaceResponse }
     * 
     */
    public SearchFlightInstaceResponse createSearchFlightInstaceResponse() {
        return new SearchFlightInstaceResponse();
    }

    /**
     * Create an instance of {@link SearchFlightResponse }
     * 
     */
    public SearchFlightResponse createSearchFlightResponse() {
        return new SearchFlightResponse();
    }

    /**
     * Create an instance of {@link FlightInstanceDTO }
     * 
     */
    public FlightInstanceDTO createFlightInstanceDTO() {
        return new FlightInstanceDTO();
    }

    /**
     * Create an instance of {@link IdFlightInstanceWithSeatsDTO }
     * 
     */
    public IdFlightInstanceWithSeatsDTO createIdFlightInstanceWithSeatsDTO() {
        return new IdFlightInstanceWithSeatsDTO();
    }

    /**
     * Create an instance of {@link FlightDataListSOAP }
     * 
     */
    public FlightDataListSOAP createFlightDataListSOAP() {
        return new FlightDataListSOAP();
    }

    /**
     * Create an instance of {@link StatusFlightSOAP }
     * 
     */
    public StatusFlightSOAP createStatusFlightSOAP() {
        return new StatusFlightSOAP();
    }

    /**
     * Create an instance of {@link UpdatePriceReservationSOAP }
     * 
     */
    public UpdatePriceReservationSOAP createUpdatePriceReservationSOAP() {
        return new UpdatePriceReservationSOAP();
    }

    /**
     * Create an instance of {@link NewReservationSOAP.StatusFlights }
     * 
     */
    public NewReservationSOAP.StatusFlights createNewReservationSOAPStatusFlights() {
        return new NewReservationSOAP.StatusFlights();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamFlightSOAP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ParamFlightSOAP }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "ParamFlightSOAP")
    public JAXBElement<ParamFlightSOAP> createParamFlightSOAP(ParamFlightSOAP value) {
        return new JAXBElement<ParamFlightSOAP>(_ParamFlightSOAP_QNAME, ParamFlightSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightSOAP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FlightSOAP }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "FlightSOAP")
    public JAXBElement<FlightSOAP> createFlightSOAP(FlightSOAP value) {
        return new JAXBElement<FlightSOAP>(_FlightSOAP_QNAME, FlightSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewReservationSOAP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NewReservationSOAP }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "NewReservationSOAP")
    public JAXBElement<NewReservationSOAP> createNewReservationSOAP(NewReservationSOAP value) {
        return new JAXBElement<NewReservationSOAP>(_NewReservationSOAP_QNAME, NewReservationSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationSOAP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReservationSOAP }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "ReservationSOAP")
    public JAXBElement<ReservationSOAP> createReservationSOAP(ReservationSOAP value) {
        return new JAXBElement<ReservationSOAP>(_ReservationSOAP_QNAME, ReservationSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoapResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "SoapResponse")
    public JAXBElement<SoapResponse> createSoapResponse(SoapResponse value) {
        return new JAXBElement<SoapResponse>(_SoapResponse_QNAME, SoapResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateReservationSOAP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateReservationSOAP }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "UpdateReservationSOAP")
    public JAXBElement<UpdateReservationSOAP> createUpdateReservationSOAP(UpdateReservationSOAP value) {
        return new JAXBElement<UpdateReservationSOAP>(_UpdateReservationSOAP_QNAME, UpdateReservationSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFlights }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchFlights }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchFlights")
    public JAXBElement<SearchFlights> createSearchFlights(SearchFlights value) {
        return new JAXBElement<SearchFlights>(_SearchFlights_QNAME, SearchFlights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFlightsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchFlightsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchFlightsResponse")
    public JAXBElement<SearchFlightsResponse> createSearchFlightsResponse(SearchFlightsResponse value) {
        return new JAXBElement<SearchFlightsResponse>(_SearchFlightsResponse_QNAME, SearchFlightsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFlight }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchFlight }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchFlight")
    public JAXBElement<SearchFlight> createSearchFlight(SearchFlight value) {
        return new JAXBElement<SearchFlight>(_SearchFlight_QNAME, SearchFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFlightsByReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchFlightsByReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchFlightsByReservation")
    public JAXBElement<SearchFlightsByReservation> createSearchFlightsByReservation(SearchFlightsByReservation value) {
        return new JAXBElement<SearchFlightsByReservation>(_SearchFlightsByReservation_QNAME, SearchFlightsByReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFlightsByReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchFlightsByReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchFlightsByReservationResponse")
    public JAXBElement<SearchFlightsByReservationResponse> createSearchFlightsByReservationResponse(SearchFlightsByReservationResponse value) {
        return new JAXBElement<SearchFlightsByReservationResponse>(_SearchFlightsByReservationResponse_QNAME, SearchFlightsByReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFlightInstace }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchFlightInstace }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchFlightInstace")
    public JAXBElement<SearchFlightInstace> createSearchFlightInstace(SearchFlightInstace value) {
        return new JAXBElement<SearchFlightInstace>(_SearchFlightInstace_QNAME, SearchFlightInstace.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFlightInstaceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchFlightInstaceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchFlightInstaceResponse")
    public JAXBElement<SearchFlightInstaceResponse> createSearchFlightInstaceResponse(SearchFlightInstaceResponse value) {
        return new JAXBElement<SearchFlightInstaceResponse>(_SearchFlightInstaceResponse_QNAME, SearchFlightInstaceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFlightResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchFlightResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchFlightResponse")
    public JAXBElement<SearchFlightResponse> createSearchFlightResponse(SearchFlightResponse value) {
        return new JAXBElement<SearchFlightResponse>(_SearchFlightResponse_QNAME, SearchFlightResponse.class, null, value);
    }

}
