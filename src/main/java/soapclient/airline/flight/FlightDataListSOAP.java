
package soapclient.airline.flight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para flightDataListSOAP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="flightDataListSOAP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="arrivalDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/&gt;
 *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/&gt;
 *         &lt;element name="cityDestination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryDestination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weekDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightDataListSOAP", propOrder = {
    "id",
    "arrivalDate",
    "departureDate",
    "cityDestination",
    "countryOrigin",
    "countryDestination",
    "weekDay",
    "price"
})
public class FlightDataListSOAP {

    protected long id;
    protected Object arrivalDate;
    protected Object departureDate;
    protected String cityDestination;
    protected String countryOrigin;
    protected String countryDestination;
    protected String weekDay;
    protected double price;

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
     * Obtiene el valor de la propiedad arrivalDate.
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
     * Define el valor de la propiedad arrivalDate.
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
     * Obtiene el valor de la propiedad departureDate.
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
     * Define el valor de la propiedad departureDate.
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
     * Obtiene el valor de la propiedad cityDestination.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityDestination() {
        return cityDestination;
    }

    /**
     * Define el valor de la propiedad cityDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityDestination(String value) {
        this.cityDestination = value;
    }

    /**
     * Obtiene el valor de la propiedad countryOrigin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOrigin() {
        return countryOrigin;
    }

    /**
     * Define el valor de la propiedad countryOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOrigin(String value) {
        this.countryOrigin = value;
    }

    /**
     * Obtiene el valor de la propiedad countryDestination.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryDestination() {
        return countryDestination;
    }

    /**
     * Define el valor de la propiedad countryDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryDestination(String value) {
        this.countryDestination = value;
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
     * Obtiene el valor de la propiedad price.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Define el valor de la propiedad price.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

}
