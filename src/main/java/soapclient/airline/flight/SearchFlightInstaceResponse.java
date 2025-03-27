
package soapclient.airline.flight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchFlightInstaceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.

 * 
 * <pre>
 * &lt;complexType name="searchFlightInstaceResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://soap/}flightInstanceDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchFlightInstaceResponse", propOrder = {
    "_return"
})
public class SearchFlightInstaceResponse {

    @XmlElement(name = "return")
    protected FlightInstanceDTO _return;

    /**
     * Gets the value of the return property.

     * 
     * @return
     *     possible object is
     *     {@link FlightInstanceDTO }
     *     
     */
    public FlightInstanceDTO getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightInstanceDTO }
     *     
     */
    public void setReturn(FlightInstanceDTO value) {
        this._return = value;
    }

}
