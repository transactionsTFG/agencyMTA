
package soapclient.hotel.room;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bookingLineDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bookingLineDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="available" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="bookingDTO" type="{http://soap/}bookingDTO" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numberOfNights" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="roomDTO" type="{http://soap/}roomDTO" minOccurs="0"/&gt;
 *         &lt;element name="roomDailyPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookingLineDTO", propOrder = {
    "available",
    "bookingDTO",
    "endDate",
    "numberOfNights",
    "roomDTO",
    "roomDailyPrice",
    "startDate"
})
public class BookingLineDTO {

    protected boolean available;
    protected BookingDTO bookingDTO;
    protected String endDate;
    protected int numberOfNights;
    protected RoomDTO roomDTO;
    protected double roomDailyPrice;
    protected String startDate;

    /**
     * Gets the value of the available property.
     * 
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     */
    public void setAvailable(boolean value) {
        this.available = value;
    }

    /**
     * Gets the value of the bookingDTO property.
     * 
     * @return
     *     possible object is
     *     {@link BookingDTO }
     *     
     */
    public BookingDTO getBookingDTO() {
        return bookingDTO;
    }

    /**
     * Sets the value of the bookingDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingDTO }
     *     
     */
    public void setBookingDTO(BookingDTO value) {
        this.bookingDTO = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the numberOfNights property.
     * 
     */
    public int getNumberOfNights() {
        return numberOfNights;
    }

    /**
     * Sets the value of the numberOfNights property.
     * 
     */
    public void setNumberOfNights(int value) {
        this.numberOfNights = value;
    }

    /**
     * Gets the value of the roomDTO property.
     * 
     * @return
     *     possible object is
     *     {@link RoomDTO }
     *     
     */
    public RoomDTO getRoomDTO() {
        return roomDTO;
    }

    /**
     * Sets the value of the roomDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomDTO }
     *     
     */
    public void setRoomDTO(RoomDTO value) {
        this.roomDTO = value;
    }

    /**
     * Gets the value of the roomDailyPrice property.
     * 
     */
    public double getRoomDailyPrice() {
        return roomDailyPrice;
    }

    /**
     * Sets the value of the roomDailyPrice property.
     * 
     */
    public void setRoomDailyPrice(double value) {
        this.roomDailyPrice = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

}
