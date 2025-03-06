
package soapclient.airline.reservation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soapclient.airline.reservation package. 
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

    private final static QName _MakeReservationRequestSOAP_QNAME = new QName("http://soap/", "MakeReservationRequestSOAP");
    private final static QName _ModifyReservationRequestSOAP_QNAME = new QName("http://soap/", "ModifyReservationRequestSOAP");
    private final static QName _FlightSOAP_QNAME = new QName("http://soap/", "FlightSOAP");
    private final static QName _NewReservationSOAP_QNAME = new QName("http://soap/", "NewReservationSOAP");
    private final static QName _ReservationSOAP_QNAME = new QName("http://soap/", "ReservationSOAP");
    private final static QName _SoapResponse_QNAME = new QName("http://soap/", "SoapResponse");
    private final static QName _UpdateReservationSOAP_QNAME = new QName("http://soap/", "UpdateReservationSOAP");
    private final static QName _CancelReservation_QNAME = new QName("http://soap/", "cancelReservation");
    private final static QName _CancelReservationResponse_QNAME = new QName("http://soap/", "cancelReservationResponse");
    private final static QName _MakeReservation_QNAME = new QName("http://soap/", "makeReservation");
    private final static QName _MakeReservationResponse_QNAME = new QName("http://soap/", "makeReservationResponse");
    private final static QName _ModifyReservation_QNAME = new QName("http://soap/", "modifyReservation");
    private final static QName _ModifyReservationResponse_QNAME = new QName("http://soap/", "modifyReservationResponse");
    private final static QName _SearchReservation_QNAME = new QName("http://soap/", "searchReservation");
    private final static QName _SearchReservationResponse_QNAME = new QName("http://soap/", "searchReservationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soapclient.airline.reservation
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
     * Create an instance of {@link ModifyReservationRequestSOAP }
     * 
     */
    public ModifyReservationRequestSOAP createModifyReservationRequestSOAP() {
        return new ModifyReservationRequestSOAP();
    }

    /**
     * Create an instance of {@link MakeReservationRequestSOAP }
     * 
     */
    public MakeReservationRequestSOAP createMakeReservationRequestSOAP() {
        return new MakeReservationRequestSOAP();
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
     * Create an instance of {@link CancelReservation }
     * 
     */
    public CancelReservation createCancelReservation() {
        return new CancelReservation();
    }

    /**
     * Create an instance of {@link CancelReservationResponse }
     * 
     */
    public CancelReservationResponse createCancelReservationResponse() {
        return new CancelReservationResponse();
    }

    /**
     * Create an instance of {@link MakeReservation }
     * 
     */
    public MakeReservation createMakeReservation() {
        return new MakeReservation();
    }

    /**
     * Create an instance of {@link MakeReservationResponse }
     * 
     */
    public MakeReservationResponse createMakeReservationResponse() {
        return new MakeReservationResponse();
    }

    /**
     * Create an instance of {@link ModifyReservation }
     * 
     */
    public ModifyReservation createModifyReservation() {
        return new ModifyReservation();
    }

    /**
     * Create an instance of {@link ModifyReservationResponse }
     * 
     */
    public ModifyReservationResponse createModifyReservationResponse() {
        return new ModifyReservationResponse();
    }

    /**
     * Create an instance of {@link SearchReservation }
     * 
     */
    public SearchReservation createSearchReservation() {
        return new SearchReservation();
    }

    /**
     * Create an instance of {@link SearchReservationResponse }
     * 
     */
    public SearchReservationResponse createSearchReservationResponse() {
        return new SearchReservationResponse();
    }

    /**
     * Create an instance of {@link CustomerDTO }
     * 
     */
    public CustomerDTO createCustomerDTO() {
        return new CustomerDTO();
    }

    /**
     * Create an instance of {@link ReservationDTO }
     * 
     */
    public ReservationDTO createReservationDTO() {
        return new ReservationDTO();
    }

    /**
     * Create an instance of {@link IdFlightInstanceWithSeatsDTO }
     * 
     */
    public IdFlightInstanceWithSeatsDTO createIdFlightInstanceWithSeatsDTO() {
        return new IdFlightInstanceWithSeatsDTO();
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
     * Create an instance of {@link ModifyReservationRequestSOAP.Flights }
     * 
     */
    public ModifyReservationRequestSOAP.Flights createModifyReservationRequestSOAPFlights() {
        return new ModifyReservationRequestSOAP.Flights();
    }

    /**
     * Create an instance of {@link MakeReservationRequestSOAP.Flights }
     * 
     */
    public MakeReservationRequestSOAP.Flights createMakeReservationRequestSOAPFlights() {
        return new MakeReservationRequestSOAP.Flights();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeReservationRequestSOAP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MakeReservationRequestSOAP }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "MakeReservationRequestSOAP")
    public JAXBElement<MakeReservationRequestSOAP> createMakeReservationRequestSOAP(MakeReservationRequestSOAP value) {
        return new JAXBElement<MakeReservationRequestSOAP>(_MakeReservationRequestSOAP_QNAME, MakeReservationRequestSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyReservationRequestSOAP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModifyReservationRequestSOAP }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "ModifyReservationRequestSOAP")
    public JAXBElement<ModifyReservationRequestSOAP> createModifyReservationRequestSOAP(ModifyReservationRequestSOAP value) {
        return new JAXBElement<ModifyReservationRequestSOAP>(_ModifyReservationRequestSOAP_QNAME, ModifyReservationRequestSOAP.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "cancelReservation")
    public JAXBElement<CancelReservation> createCancelReservation(CancelReservation value) {
        return new JAXBElement<CancelReservation>(_CancelReservation_QNAME, CancelReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "cancelReservationResponse")
    public JAXBElement<CancelReservationResponse> createCancelReservationResponse(CancelReservationResponse value) {
        return new JAXBElement<CancelReservationResponse>(_CancelReservationResponse_QNAME, CancelReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MakeReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "makeReservation")
    public JAXBElement<MakeReservation> createMakeReservation(MakeReservation value) {
        return new JAXBElement<MakeReservation>(_MakeReservation_QNAME, MakeReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MakeReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "makeReservationResponse")
    public JAXBElement<MakeReservationResponse> createMakeReservationResponse(MakeReservationResponse value) {
        return new JAXBElement<MakeReservationResponse>(_MakeReservationResponse_QNAME, MakeReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModifyReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "modifyReservation")
    public JAXBElement<ModifyReservation> createModifyReservation(ModifyReservation value) {
        return new JAXBElement<ModifyReservation>(_ModifyReservation_QNAME, ModifyReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModifyReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "modifyReservationResponse")
    public JAXBElement<ModifyReservationResponse> createModifyReservationResponse(ModifyReservationResponse value) {
        return new JAXBElement<ModifyReservationResponse>(_ModifyReservationResponse_QNAME, ModifyReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchReservation")
    public JAXBElement<SearchReservation> createSearchReservation(SearchReservation value) {
        return new JAXBElement<SearchReservation>(_SearchReservation_QNAME, SearchReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchReservationResponse")
    public JAXBElement<SearchReservationResponse> createSearchReservationResponse(SearchReservationResponse value) {
        return new JAXBElement<SearchReservationResponse>(_SearchReservationResponse_QNAME, SearchReservationResponse.class, null, value);
    }

}
