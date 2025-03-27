
package soapclient.airline.flight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for flightInstanceDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flightInstanceDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="arrivalDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/&gt;
 *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="idFlight" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="passengerCounter" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="statusFlight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightInstanceDTO", propOrder = {
    "active",
    "arrivalDate",
    "departureDate",
    "id",
    "idFlight",
    "passengerCounter",
    "price",
    "statusFlight"
})
public class FlightInstanceDTO {

    protected boolean active;
    protected Object arrivalDate;
    protected Object departureDate;
    protected long id;
    protected long idFlight;
    protected int passengerCounter;
    protected double price;
    protected String statusFlight;

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

    /**
     * Gets the value of the arrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the value of the arrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setArrivalDate(Object value) {
        this.arrivalDate = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDepartureDate(Object value) {
        this.departureDate = value;
    }

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
     * Gets the value of the idFlight property.
     * 
     */
    public long getIdFlight() {
        return idFlight;
    }

    /**
     * Sets the value of the idFlight property.
     * 
     */
    public void setIdFlight(long value) {
        this.idFlight = value;
    }

    /**
     * Gets the value of the passengerCounter property.
     * 
     */
    public int getPassengerCounter() {
        return passengerCounter;
    }

    /**
     * Sets the value of the passengerCounter property.
     * 
     */
    public void setPassengerCounter(int value) {
        this.passengerCounter = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Gets the value of the statusFlight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusFlight() {
        return statusFlight;
    }

    /**
     * Sets the value of the statusFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusFlight(String value) {
        this.statusFlight = value;
    }

}
