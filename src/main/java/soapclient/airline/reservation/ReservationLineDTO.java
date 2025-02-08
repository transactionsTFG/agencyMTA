
package soapclient.airline.reservation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reservationLineDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reservationLineDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flightInstanceId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="passengerCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="reservationId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservationLineDTO", propOrder = {
    "flightInstanceId",
    "passengerCount",
    "reservationId"
})
public class ReservationLineDTO {

    protected long flightInstanceId;
    protected int passengerCount;
    protected long reservationId;

    /**
     * Obtiene el valor de la propiedad flightInstanceId.
     * 
     */
    public long getFlightInstanceId() {
        return flightInstanceId;
    }

    /**
     * Define el valor de la propiedad flightInstanceId.
     * 
     */
    public void setFlightInstanceId(long value) {
        this.flightInstanceId = value;
    }

    /**
     * Obtiene el valor de la propiedad passengerCount.
     * 
     */
    public int getPassengerCount() {
        return passengerCount;
    }

    /**
     * Define el valor de la propiedad passengerCount.
     * 
     */
    public void setPassengerCount(int value) {
        this.passengerCount = value;
    }

    /**
     * Obtiene el valor de la propiedad reservationId.
     * 
     */
    public long getReservationId() {
        return reservationId;
    }

    /**
     * Define el valor de la propiedad reservationId.
     * 
     */
    public void setReservationId(long value) {
        this.reservationId = value;
    }

}
