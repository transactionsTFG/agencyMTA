
package soapclient.airline.flight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for flightSOAP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flightSOAP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="codeFlight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weekDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arrivalTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/&gt;
 *         &lt;element name="departureTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/&gt;
 *         &lt;element name="idAircraft" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="idOriginFlight" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="idDestinationFlight" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
@XmlType(name = "flightSOAP", propOrder = {
    "id",
    "codeFlight",
    "weekDay",
    "arrivalTime",
    "departureTime",
    "idAircraft",
    "idOriginFlight",
    "idDestinationFlight",
    "active"
})
public class FlightSOAP {

    protected long id;
    protected String codeFlight;
    protected String weekDay;
    protected Object arrivalTime;
    protected Object departureTime;
    protected long idAircraft;
    protected long idOriginFlight;
    protected long idDestinationFlight;
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
     * Gets the value of the codeFlight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeFlight() {
        return codeFlight;
    }

    /**
     * Sets the value of the codeFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeFlight(String value) {
        this.codeFlight = value;
    }

    /**
     * Gets the value of the weekDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeekDay() {
        return weekDay;
    }

    /**
     * Sets the value of the weekDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekDay(String value) {
        this.weekDay = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setArrivalTime(Object value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDepartureTime(Object value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the idAircraft property.
     * 
     */
    public long getIdAircraft() {
        return idAircraft;
    }

    /**
     * Sets the value of the idAircraft property.
     * 
     */
    public void setIdAircraft(long value) {
        this.idAircraft = value;
    }

    /**
     * Gets the value of the idOriginFlight property.
     * 
     */
    public long getIdOriginFlight() {
        return idOriginFlight;
    }

    /**
     * Sets the value of the idOriginFlight property.
     * 
     */
    public void setIdOriginFlight(long value) {
        this.idOriginFlight = value;
    }

    /**
     * Gets the value of the idDestinationFlight property.
     * 
     */
    public long getIdDestinationFlight() {
        return idDestinationFlight;
    }

    /**
     * Sets the value of the idDestinationFlight property.
     * 
     */
    public void setIdDestinationFlight(long value) {
        this.idDestinationFlight = value;
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
