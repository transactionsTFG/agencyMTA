
package soapclient.airline.flight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para statusFlightSOAP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="statusFlightSOAP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/&gt;
 *         &lt;element name="returnDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/&gt;
 *         &lt;element name="seats" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "statusFlightSOAP", propOrder = {
    "status",
    "timeDate",
    "returnDate",
    "seats",
    "price"
})
public class StatusFlightSOAP {

    protected String status;
    protected Object timeDate;
    protected Object returnDate;
    protected int seats;
    protected double price;

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad timeDate.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTimeDate() {
        return timeDate;
    }

    /**
     * Define el valor de la propiedad timeDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTimeDate(Object value) {
        this.timeDate = value;
    }

    /**
     * Obtiene el valor de la propiedad returnDate.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getReturnDate() {
        return returnDate;
    }

    /**
     * Define el valor de la propiedad returnDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setReturnDate(Object value) {
        this.returnDate = value;
    }

    /**
     * Obtiene el valor de la propiedad seats.
     * 
     */
    public int getSeats() {
        return seats;
    }

    /**
     * Define el valor de la propiedad seats.
     * 
     */
    public void setSeats(int value) {
        this.seats = value;
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
