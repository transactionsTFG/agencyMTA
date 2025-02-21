
package soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para flightSOAP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="flightSOAP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="codeFlight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weekDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arrivalTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="departureTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    protected String arrivalTime;
    protected String departureTime;
    protected long idAircraft;
    protected long idOriginFlight;
    protected long idDestinationFlight;
    protected boolean active;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad codeFlight.
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
     * Define el valor de la propiedad codeFlight.
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
     * Obtiene el valor de la propiedad weekDay.
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
     * Define el valor de la propiedad weekDay.
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
     * Obtiene el valor de la propiedad arrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Define el valor de la propiedad arrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTime(String value) {
        this.arrivalTime = value;
    }

    /**
     * Obtiene el valor de la propiedad departureTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * Define el valor de la propiedad departureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTime(String value) {
        this.departureTime = value;
    }

    /**
     * Obtiene el valor de la propiedad idAircraft.
     * 
     */
    public long getIdAircraft() {
        return idAircraft;
    }

    /**
     * Define el valor de la propiedad idAircraft.
     * 
     */
    public void setIdAircraft(long value) {
        this.idAircraft = value;
    }

    /**
     * Obtiene el valor de la propiedad idOriginFlight.
     * 
     */
    public long getIdOriginFlight() {
        return idOriginFlight;
    }

    /**
     * Define el valor de la propiedad idOriginFlight.
     * 
     */
    public void setIdOriginFlight(long value) {
        this.idOriginFlight = value;
    }

    /**
     * Obtiene el valor de la propiedad idDestinationFlight.
     * 
     */
    public long getIdDestinationFlight() {
        return idDestinationFlight;
    }

    /**
     * Define el valor de la propiedad idDestinationFlight.
     * 
     */
    public void setIdDestinationFlight(long value) {
        this.idDestinationFlight = value;
    }

    /**
     * Obtiene el valor de la propiedad active.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Define el valor de la propiedad active.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

}
