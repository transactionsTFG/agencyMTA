
package soapclient.hotel.booking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para roomSOAP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="roomSOAP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="hotelId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="singleBed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="available" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="peopleNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dailyPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "roomSOAP", propOrder = {
    "id",
    "hotelId",
    "number",
    "singleBed",
    "available",
    "peopleNumber",
    "dailyPrice"
})
public class RoomSOAP {

    protected long id;
    protected long hotelId;
    protected int number;
    protected boolean singleBed;
    protected boolean available;
    protected int peopleNumber;
    protected double dailyPrice;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad hotelId.
     * 
     */
    public long getHotelId() {
        return hotelId;
    }

    /**
     * Define el valor de la propiedad hotelId.
     * 
     */
    public void setHotelId(long value) {
        this.hotelId = value;
    }

    /**
     * Obtiene el valor de la propiedad number.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Define el valor de la propiedad number.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * Obtiene el valor de la propiedad singleBed.
     * 
     */
    public boolean isSingleBed() {
        return singleBed;
    }

    /**
     * Define el valor de la propiedad singleBed.
     * 
     */
    public void setSingleBed(boolean value) {
        this.singleBed = value;
    }

    /**
     * Obtiene el valor de la propiedad available.
     * 
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Define el valor de la propiedad available.
     * 
     */
    public void setAvailable(boolean value) {
        this.available = value;
    }

    /**
     * Obtiene el valor de la propiedad peopleNumber.
     * 
     */
    public int getPeopleNumber() {
        return peopleNumber;
    }

    /**
     * Define el valor de la propiedad peopleNumber.
     * 
     */
    public void setPeopleNumber(int value) {
        this.peopleNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad dailyPrice.
     * 
     */
    public double getDailyPrice() {
        return dailyPrice;
    }

    /**
     * Define el valor de la propiedad dailyPrice.
     * 
     */
    public void setDailyPrice(double value) {
        this.dailyPrice = value;
    }

}
