
package soapclient.hotel.booking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para bookingSOAP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="bookingSOAP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="withBreakfast" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="peopleNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="available" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="totalPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
    "withBreakfast",
    "peopleNumber",
    "customerId",
    "available",
    "totalPrice"
})
public class BookingSOAP {

    protected long id;
    protected boolean withBreakfast;
    protected int peopleNumber;
    protected long customerId;
    protected boolean available;
    protected double totalPrice;

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
     * Obtiene el valor de la propiedad withBreakfast.
     * 
     */
    public boolean isWithBreakfast() {
        return withBreakfast;
    }

    /**
     * Define el valor de la propiedad withBreakfast.
     * 
     */
    public void setWithBreakfast(boolean value) {
        this.withBreakfast = value;
    }

    /**
     * Obtiene el valor de la propiedad peopleNumber.
     * 
     */
    public int getPeopleNumber() {
        return peopleNumber;
    }

    /**
     * Define el valor de la propiedad peopleNumber.
     * 
     */
    public void setPeopleNumber(int value) {
        this.peopleNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad customerId.
     * 
     */
    public long getCustomerId() {
        return customerId;
    }

    /**
     * Define el valor de la propiedad customerId.
     * 
     */
    public void setCustomerId(long value) {
        this.customerId = value;
    }

    /**
     * Obtiene el valor de la propiedad available.
     * 
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Define el valor de la propiedad available.
     * 
     */
    public void setAvailable(boolean value) {
        this.available = value;
    }

    /**
     * Obtiene el valor de la propiedad totalPrice.
     * 
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * Define el valor de la propiedad totalPrice.
     * 
     */
    public void setTotalPrice(double value) {
        this.totalPrice = value;
    }

}
