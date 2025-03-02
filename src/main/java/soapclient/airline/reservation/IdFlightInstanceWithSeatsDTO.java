
package soapclient.airline.reservation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para idFlightInstanceWithSeatsDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad idFlightInstance.
     * 
     */
    public long getIdFlightInstance() {
        return idFlightInstance;
    }

    /**
     * Define el valor de la propiedad idFlightInstance.
     * 
     */
    public void setIdFlightInstance(long value) {
        this.idFlightInstance = value;
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

}
