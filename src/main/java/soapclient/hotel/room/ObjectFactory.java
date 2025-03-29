
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

    private final static QName _SearchRoom_QNAME = new QName("http://soap/", "searchRoom");
    private final static QName _SearchRoomResponse_QNAME = new QName("http://soap/", "searchRoomResponse");
    private final static QName _SearchRooms_QNAME = new QName("http://soap/", "searchRooms");
    private final static QName _SearchRoomsByBooking_QNAME = new QName("http://soap/", "searchRoomsByBooking");
    private final static QName _SearchRoomsByBookingResponse_QNAME = new QName("http://soap/", "searchRoomsByBookingResponse");
    private final static QName _SearchRoomsResponse_QNAME = new QName("http://soap/", "searchRoomsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soapclient.hotel.room
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link SearchRooms }
     * 
     */
    public SearchRooms createSearchRooms() {
        return new SearchRooms();
    }

    /**
     * Create an instance of {@link SearchRoomsByBooking }
     * 
     */
    public SearchRoomsByBooking createSearchRoomsByBooking() {
        return new SearchRoomsByBooking();
    }

    /**
     * Create an instance of {@link SearchRoomsByBookingResponse }
     * 
     */
    public SearchRoomsByBookingResponse createSearchRoomsByBookingResponse() {
        return new SearchRoomsByBookingResponse();
    }

    /**
     * Create an instance of {@link SearchRoomsResponse }
     * 
     */
    public SearchRoomsResponse createSearchRoomsResponse() {
        return new SearchRoomsResponse();
    }

    /**
     * Create an instance of {@link BookingDTO }
     * 
     */
    public BookingDTO createBookingDTO() {
        return new BookingDTO();
    }

    /**
     * Create an instance of {@link BookingLineDTO }
     * 
     */
    public BookingLineDTO createBookingLineDTO() {
        return new BookingLineDTO();
    }

    /**
     * Create an instance of {@link RoomDTO }
     * 
     */
    public RoomDTO createRoomDTO() {
        return new RoomDTO();
    }

    /**
     * Create an instance of {@link RoomParamsDTO }
     * 
     */
    public RoomParamsDTO createRoomParamsDTO() {
        return new RoomParamsDTO();
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRooms }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchRooms }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchRooms")
    public JAXBElement<SearchRooms> createSearchRooms(SearchRooms value) {
        return new JAXBElement<SearchRooms>(_SearchRooms_QNAME, SearchRooms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRoomsByBooking }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchRoomsByBooking }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchRoomsByBooking")
    public JAXBElement<SearchRoomsByBooking> createSearchRoomsByBooking(SearchRoomsByBooking value) {
        return new JAXBElement<SearchRoomsByBooking>(_SearchRoomsByBooking_QNAME, SearchRoomsByBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRoomsByBookingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchRoomsByBookingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchRoomsByBookingResponse")
    public JAXBElement<SearchRoomsByBookingResponse> createSearchRoomsByBookingResponse(SearchRoomsByBookingResponse value) {
        return new JAXBElement<SearchRoomsByBookingResponse>(_SearchRoomsByBookingResponse_QNAME, SearchRoomsByBookingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRoomsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchRoomsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "searchRoomsResponse")
    public JAXBElement<SearchRoomsResponse> createSearchRoomsResponse(SearchRoomsResponse value) {
        return new JAXBElement<SearchRoomsResponse>(_SearchRoomsResponse_QNAME, SearchRoomsResponse.class, null, value);
    }

}
