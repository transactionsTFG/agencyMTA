
package soapclient.hotel.booking;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soapclient.hotel.booking package. 
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

    private final static QName _BookingSOAP_QNAME = new QName("http://soap/", "BookingSOAP");
    private final static QName _RoomSOAP_QNAME = new QName("http://soap/", "RoomSOAP");
    private final static QName _SoapResponse_QNAME = new QName("http://soap/", "SoapResponse");
    private final static QName _CancelBooking_QNAME = new QName("http://soap/", "cancelBooking");
    private final static QName _CancelBookingResponse_QNAME = new QName("http://soap/", "cancelBookingResponse");
    private final static QName _MakeBooking_QNAME = new QName("http://soap/", "makeBooking");
    private final static QName _MakeBookingResponse_QNAME = new QName("http://soap/", "makeBookingResponse");
    private final static QName _ModifyBooking_QNAME = new QName("http://soap/", "modifyBooking");
    private final static QName _ModifyBookingResponse_QNAME = new QName("http://soap/", "modifyBookingResponse");
    private final static QName _SearchBooking_QNAME = new QName("http://soap/", "searchBooking");
    private final static QName _SearchBookingResponse_QNAME = new QName("http://soap/", "searchBookingResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soapclient.hotel.booking
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookingSOAP }
     * 
     */
    public BookingSOAP createBookingSOAP() {
        return new BookingSOAP();
    }

    /**
     * Create an instance of {@link RoomSOAP }
     * 
     */
    public RoomSOAP createRoomSOAP() {
        return new RoomSOAP();
    }

    /**
     * Create an instance of {@link SoapResponse }
     * 
     */
    public SoapResponse createSoapResponse() {
        return new SoapResponse();
    }

    /**
     * Create an instance of {@link CancelBooking }
     * 
     */
    public CancelBooking createCancelBooking() {
        return new CancelBooking();
    }

    /**
     * Create an instance of {@link CancelBookingResponse }
     * 
     */
    public CancelBookingResponse createCancelBookingResponse() {
        return new CancelBookingResponse();
    }

    /**
     * Create an instance of {@link MakeBooking }
     * 
     */
    public MakeBooking createMakeBooking() {
        return new MakeBooking();
    }

    /**
     * Create an instance of {@link MakeBookingResponse }
     * 
     */
    public MakeBookingResponse createMakeBookingResponse() {
        return new MakeBookingResponse();
    }

    /**
     * Create an instance of {@link ModifyBooking }
     * 
     */
    public ModifyBooking createModifyBooking() {
        return new ModifyBooking();
    }

    /**
     * Create an instance of {@link ModifyBookingResponse }
     * 
     */
    public ModifyBookingResponse createModifyBookingResponse() {
        return new ModifyBookingResponse();
    }

    /**
     * Create an instance of {@link SearchBooking }
     * 
     */
    public SearchBooking createSearchBooking() {
        return new SearchBooking();
    }

    /**
     * Create an instance of {@link SearchBookingResponse }
     * 
     */
    public SearchBookingResponse createSearchBookingResponse() {
        return new SearchBookingResponse();
    }

    /**
     * Create an instance of {@link BookingDTO }
     * 
     */
    public BookingDTO createBookingDTO() {
        return new BookingDTO();
    }

    /**
     * Create an instance of {@link RoomDTO }
     * 
     */
    public RoomDTO createRoomDTO() {
        return new RoomDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookingSOAP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BookingSOAP }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "BookingSOAP")
    public JAXBElement<BookingSOAP> createBookingSOAP(BookingSOAP value) {
        return new JAXBElement<BookingSOAP>(_BookingSOAP_QNAME, BookingSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomSOAP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoomSOAP }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "RoomSOAP")
    public JAXBElement<RoomSOAP> createRoomSOAP(RoomSOAP value) {
        return new JAXBElement<RoomSOAP>(_RoomSOAP_QNAME, RoomSOAP.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelBooking }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelBooking }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "cancelBooking")
    public JAXBElement<CancelBooking> createCancelBooking(CancelBooking value) {
        return new JAXBElement<CancelBooking>(_CancelBooking_QNAME, CancelBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelBookingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelBookingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "cancelBookingResponse")
    public JAXBElement<CancelBookingResponse> createCancelBookingResponse(CancelBookingResponse value) {
        return new JAXBElement<CancelBookingResponse>(_CancelBookingResponse_QNAME, CancelBookingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeBooking }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MakeBooking }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "makeBooking")
    public JAXBElement<MakeBooking> createMakeBooking(MakeBooking value) {
        return new JAXBElement<MakeBooking>(_MakeBooking_QNAME, MakeBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeBookingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MakeBookingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "makeBookingResponse")
    public JAXBElement<MakeBookingResponse> createMakeBookingResponse(MakeBookingResponse value) {
        return new JAXBElement<MakeBookingResponse>(_MakeBookingResponse_QNAME, MakeBookingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyBooking }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModifyBooking }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "modifyBooking")
    public JAXBElement<ModifyBooking> createModifyBooking(ModifyBooking value) {
        return new JAXBElement<ModifyBooking>(_ModifyBooking_QNAME, ModifyBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyBookingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModifyBookingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "modifyBookingResponse")
    public JAXBElement<ModifyBookingResponse> createModifyBookingResponse(ModifyBookingResponse value) {
        return new JAXBElement<ModifyBookingResponse>(_ModifyBookingResponse_QNAME, ModifyBookingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBooking }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchBooking }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchBooking")
    public JAXBElement<SearchBooking> createSearchBooking(SearchBooking value) {
        return new JAXBElement<SearchBooking>(_SearchBooking_QNAME, SearchBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBookingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchBookingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchBookingResponse")
    public JAXBElement<SearchBookingResponse> createSearchBookingResponse(SearchBookingResponse value) {
        return new JAXBElement<SearchBookingResponse>(_SearchBookingResponse_QNAME, SearchBookingResponse.class, null, value);
    }

}
