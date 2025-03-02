
package soapclient.hotel.booking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for roomSOAP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="roomSOAP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="hotelId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="singleBed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="available" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="peopleNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dailyPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "roomSOAP", propOrder = {
    "id",
    "hotelId",
    "number",
    "singleBed",
    "available",
    "peopleNumber",
    "dailyPrice"
})
public class RoomSOAP {

    protected long id;
    protected long hotelId;
    protected int number;
    protected boolean singleBed;
    protected boolean available;
    protected int peopleNumber;
    protected double dailyPrice;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the hotelId property.
     * 
     */
    public long getHotelId() {
        return hotelId;
    }

    /**
     * Sets the value of the hotelId property.
     * 
     */
    public void setHotelId(long value) {
        this.hotelId = value;
    }

    /**
     * Gets the value of the number property.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * Gets the value of the singleBed property.
     * 
     */
    public boolean isSingleBed() {
        return singleBed;
    }

    /**
     * Sets the value of the singleBed property.
     * 
     */
    public void setSingleBed(boolean value) {
        this.singleBed = value;
    }

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
     * Gets the value of the peopleNumber property.
     * 
     */
    public int getPeopleNumber() {
        return peopleNumber;
    }

    /**
     * Sets the value of the peopleNumber property.
     * 
     */
    public void setPeopleNumber(int value) {
        this.peopleNumber = value;
    }

    /**
     * Gets the value of the dailyPrice property.
     * 
     */
    public double getDailyPrice() {
        return dailyPrice;
    }

    /**
     * Sets the value of the dailyPrice property.
     * 
     */
    public void setDailyPrice(double value) {
        this.dailyPrice = value;
    }

}
