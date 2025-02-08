
package soapclient.airline.reservation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para makeReservationRequestSOAP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="makeReservationRequestSOAP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customer" type="{http://soap/}customerDTO" minOccurs="0"/&gt;
 *         &lt;element name="reservation" type="{http://soap/}reservationDTO" minOccurs="0"/&gt;
 *         &lt;element name="idFlight" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="numberOfSeats" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "makeReservationRequestSOAP", propOrder = {
    "customer",
    "reservation",
    "idFlight",
    "numberOfSeats"
})
public class MakeReservationRequestSOAP {

    protected CustomerDTO customer;
    protected ReservationDTO reservation;
    protected long idFlight;
    protected int numberOfSeats;

    /**
     * Obtiene el valor de la propiedad customer.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDTO }
     *     
     */
    public CustomerDTO getCustomer() {
        return customer;
    }

    /**
     * Define el valor de la propiedad customer.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDTO }
     *     
     */
    public void setCustomer(CustomerDTO value) {
        this.customer = value;
    }

    /**
     * Obtiene el valor de la propiedad reservation.
     * 
     * @return
     *     possible object is
     *     {@link ReservationDTO }
     *     
     */
    public ReservationDTO getReservation() {
        return reservation;
    }

    /**
     * Define el valor de la propiedad reservation.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationDTO }
     *     
     */
    public void setReservation(ReservationDTO value) {
        this.reservation = value;
    }

    /**
     * Obtiene el valor de la propiedad idFlight.
     * 
     */
    public long getIdFlight() {
        return idFlight;
    }

    /**
     * Define el valor de la propiedad idFlight.
     * 
     */
    public void setIdFlight(long value) {
        this.idFlight = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfSeats.
     * 
     */
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    /**
     * Define el valor de la propiedad numberOfSeats.
     * 
     */
    public void setNumberOfSeats(int value) {
        this.numberOfSeats = value;
    }

}
