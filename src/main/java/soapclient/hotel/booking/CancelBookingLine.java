
package soapclient.hotel.booking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cancelBookingLine complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cancelBookingLine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bookingID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="roomID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelBookingLine", propOrder = {
    "bookingID",
    "roomID"
})
public class CancelBookingLine {

    protected long bookingID;
    protected long roomID;

    /**
     * Obtiene el valor de la propiedad bookingID.
     * 
     */
    public long getBookingID() {
        return bookingID;
    }

    /**
     * Define el valor de la propiedad bookingID.
     * 
     */
    public void setBookingID(long value) {
        this.bookingID = value;
    }

    /**
     * Obtiene el valor de la propiedad roomID.
     * 
     */
    public long getRoomID() {
        return roomID;
    }

    /**
     * Define el valor de la propiedad roomID.
     * 
     */
    public void setRoomID(long value) {
        this.roomID = value;
    }

}
