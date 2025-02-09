
package soapclient.hotel.room;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soapclient.hotel.room package. 
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
    private final static QName _SearchRoom_QNAME = new QName("http://soap/", "searchRoom");
    private final static QName _SearchRoomResponse_QNAME = new QName("http://soap/", "searchRoomResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soapclient.hotel.room
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
     * Create an instance of {@link SearchRoom }
     * 
     */
    public SearchRoom createSearchRoom() {
        return new SearchRoom();
    }

    /**
     * Create an instance of {@link SearchRoomResponse }
     * 
     */
    public SearchRoomResponse createSearchRoomResponse() {
        return new SearchRoomResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRoom }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchRoom }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchRoom")
    public JAXBElement<SearchRoom> createSearchRoom(SearchRoom value) {
        return new JAXBElement<SearchRoom>(_SearchRoom_QNAME, SearchRoom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRoomResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchRoomResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchRoomResponse")
    public JAXBElement<SearchRoomResponse> createSearchRoomResponse(SearchRoomResponse value) {
        return new JAXBElement<SearchRoomResponse>(_SearchRoomResponse_QNAME, SearchRoomResponse.class, null, value);
    }

}
