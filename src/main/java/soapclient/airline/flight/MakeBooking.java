
package soapclient.airline.flight;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="arg0" type="{http://soap/}bookingDTO" minOccurs="0"/&gt;
 *         &lt;element name="arg1" type="{http://soap/}roomDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "arg0",
    "arg1"
})
public class MakeBooking {

    protected BookingDTO arg0;
    protected List<RoomDTO> arg1;

    /**
     * Obtiene el valor de la propiedad arg0.
     * 
     * @return
     *     possible object is
     *     {@link BookingDTO }
     *     
     */
    public BookingDTO getArg0() {
        return arg0;
    }

    /**
     * Define el valor de la propiedad arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingDTO }
     *     
     */
    public void setArg0(BookingDTO value) {
        this.arg0 = value;
    }

    /**
     * Gets the value of the arg1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arg1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArg1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomDTO }
     * 
     * 
     */
    public List<RoomDTO> getArg1() {
        if (arg1 == null) {
            arg1 = new ArrayList<RoomDTO>();
        }
        return this.arg1;
    }

}
