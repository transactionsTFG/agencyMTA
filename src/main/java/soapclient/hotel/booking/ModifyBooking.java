
package soapclient.hotel.booking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modifyBooking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifyBooking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="booking" type="{http://soap/}modifyBookingRequestSOAP" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifyBooking", propOrder = {
    "booking"
})
public class ModifyBooking {

    protected ModifyBookingRequestSOAP booking;

    /**
     * Gets the value of the booking property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyBookingRequestSOAP }
     *     
     */
    public ModifyBookingRequestSOAP getBooking() {
        return booking;
    }

    /**
     * Sets the value of the booking property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyBookingRequestSOAP }
     *     
     */
    public void setBooking(ModifyBookingRequestSOAP value) {
        this.booking = value;
    }

}
