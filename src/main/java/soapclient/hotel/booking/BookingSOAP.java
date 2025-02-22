
package soapclient.hotel.booking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bookingSOAP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bookingSOAP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numberOfNights" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="withBreakfast" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="peopleNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookingSOAP", propOrder = {
    "id",
    "date",
    "numberOfNights",
    "withBreakfast",
    "peopleNumber",
    "customerId",
    "active"
})
public class BookingSOAP {

    protected long id;
    protected String date;
    protected int numberOfNights;
    protected boolean withBreakfast;
    protected int peopleNumber;
    protected int customerId;
    protected boolean active;

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
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
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
     * Gets the value of the withBreakfast property.
     * 
     */
    public boolean isWithBreakfast() {
        return withBreakfast;
    }

    /**
     * Sets the value of the withBreakfast property.
     * 
     */
    public void setWithBreakfast(boolean value) {
        this.withBreakfast = value;
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
     * Gets the value of the customerId property.
     * 
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     */
    public void setCustomerId(int value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

}
