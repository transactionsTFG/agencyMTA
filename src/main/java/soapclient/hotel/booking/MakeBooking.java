
package soapclient.hotel.booking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para makeBooking complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="makeBooking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="booking" type="{http://soap/}makeBookingRequestSOAP" minOccurs="0"/&gt;
 *         &lt;element name="user" type="{http://soap/}userSOAP" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "makeBooking", propOrder = {
    "booking",
    "user"
})
public class MakeBooking {

    protected MakeBookingRequestSOAP booking;
    protected UserSOAP user;

    /**
     * Obtiene el valor de la propiedad booking.
     * 
     * @return
     *     possible object is
     *     {@link MakeBookingRequestSOAP }
     *     
     */
    public MakeBookingRequestSOAP getBooking() {
        return booking;
    }

    /**
     * Define el valor de la propiedad booking.
     * 
     * @param value
     *     allowed object is
     *     {@link MakeBookingRequestSOAP }
     *     
     */
    public void setBooking(MakeBookingRequestSOAP value) {
        this.booking = value;
    }

    /**
     * Obtiene el valor de la propiedad user.
     * 
     * @return
     *     possible object is
     *     {@link UserSOAP }
     *     
     */
    public UserSOAP getUser() {
        return user;
    }

    /**
     * Define el valor de la propiedad user.
     * 
     * @param value
     *     allowed object is
     *     {@link UserSOAP }
     *     
     */
    public void setUser(UserSOAP value) {
        this.user = value;
    }

}
