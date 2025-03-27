
package soapclient.hotel.room;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchRoomsByBooking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchRoomsByBooking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bookingID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchRoomsByBooking", propOrder = {
    "bookingID"
})
public class SearchRoomsByBooking {

    protected long bookingID;

    /**
     * Gets the value of the bookingID property.
     * 
     */
    public long getBookingID() {
        return bookingID;
    }

    /**
     * Sets the value of the bookingID property.
     * 
     */
    public void setBookingID(long value) {
        this.bookingID = value;
    }

}
