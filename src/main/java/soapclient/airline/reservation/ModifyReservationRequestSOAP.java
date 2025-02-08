
package soapclient.airline.reservation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para modifyReservationRequestSOAP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modifyReservationRequestSOAP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reservation" type="{http://soap/}reservationDTO" minOccurs="0"/&gt;
 *         &lt;element name="reservationLine" type="{http://soap/}reservationLineDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifyReservationRequestSOAP", propOrder = {
    "reservation",
    "reservationLine"
})
public class ModifyReservationRequestSOAP {

    protected ReservationDTO reservation;
    protected ReservationLineDTO reservationLine;

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
     * Obtiene el valor de la propiedad reservationLine.
     * 
     * @return
     *     possible object is
     *     {@link ReservationLineDTO }
     *     
     */
    public ReservationLineDTO getReservationLine() {
        return reservationLine;
    }

    /**
     * Define el valor de la propiedad reservationLine.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationLineDTO }
     *     
     */
    public void setReservationLine(ReservationLineDTO value) {
        this.reservationLine = value;
    }

}
