
package soapclient.airline.reservation;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="idReservation" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="flights" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="flight" type="{http://soap/}idFlightInstanceWithSeatsDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "idReservation",
    "flights"
})
public class ModifyReservationRequestSOAP {

    protected long idReservation;
    protected ModifyReservationRequestSOAP.Flights flights;

    /**
     * Obtiene el valor de la propiedad idReservation.
     * 
     */
    public long getIdReservation() {
        return idReservation;
    }

    /**
     * Define el valor de la propiedad idReservation.
     * 
     */
    public void setIdReservation(long value) {
        this.idReservation = value;
    }

    /**
     * Obtiene el valor de la propiedad flights.
     * 
     * @return
     *     possible object is
     *     {@link ModifyReservationRequestSOAP.Flights }
     *     
     */
    public ModifyReservationRequestSOAP.Flights getFlights() {
        return flights;
    }

    /**
     * Define el valor de la propiedad flights.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyReservationRequestSOAP.Flights }
     *     
     */
    public void setFlights(ModifyReservationRequestSOAP.Flights value) {
        this.flights = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="flight" type="{http://soap/}idFlightInstanceWithSeatsDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "flight"
    })
    public static class Flights {

        protected List<IdFlightInstanceWithSeatsDTO> flight;

        /**
         * Gets the value of the flight property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flight property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlight().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IdFlightInstanceWithSeatsDTO }
         * 
         * 
         */
        public List<IdFlightInstanceWithSeatsDTO> getFlight() {
            if (flight == null) {
                flight = new ArrayList<IdFlightInstanceWithSeatsDTO>();
            }
            return this.flight;
        }

    }

}
