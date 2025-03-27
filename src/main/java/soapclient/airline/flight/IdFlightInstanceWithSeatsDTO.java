
package soapclient.airline.flight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for idFlightInstanceWithSeatsDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="idFlightInstanceWithSeatsDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idFlightInstance" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="seats" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "idFlightInstanceWithSeatsDTO", propOrder = {
    "idFlightInstance",
    "seats"
})
public class IdFlightInstanceWithSeatsDTO {

    protected long idFlightInstance;
    protected int seats;

    /**
     * Gets the value of the idFlightInstance property.
     * 
     */
    public long getIdFlightInstance() {
        return idFlightInstance;
    }

    /**
     * Sets the value of the idFlightInstance property.
     * 
     */
    public void setIdFlightInstance(long value) {
        this.idFlightInstance = value;
    }

    /**
     * Gets the value of the seats property.
     * 
     */
    public int getSeats() {
        return seats;
    }

    /**
     * Sets the value of the seats property.
     * 
     */
    public void setSeats(int value) {
        this.seats = value;
    }

}
