
package soapclient.airline.reservation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modifyReservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifyReservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://soap/}modifyReservationRequestSOAP" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifyReservation", propOrder = {
    "request"
})
public class ModifyReservation {

    protected ModifyReservationRequestSOAP request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyReservationRequestSOAP }
     *     
     */
    public ModifyReservationRequestSOAP getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyReservationRequestSOAP }
     *     
     */
    public void setRequest(ModifyReservationRequestSOAP value) {
        this.request = value;
    }

}
