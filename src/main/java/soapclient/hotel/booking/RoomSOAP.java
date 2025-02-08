
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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="occupied" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="singleBed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="peopleNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "number",
    "occupied",
    "singleBed",
    "active",
    "peopleNumber"
})
public class RoomSOAP {

    protected int id;
    protected int number;
    protected boolean occupied;
    protected boolean singleBed;
    protected boolean active;
    protected int peopleNumber;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
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
     * Obtiene el valor de la propiedad occupied.
     * 
     */
    public boolean isOccupied() {
        return occupied;
    }

    /**
     * Define el valor de la propiedad occupied.
     * 
     */
    public void setOccupied(boolean value) {
        this.occupied = value;
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
     * Obtiene el valor de la propiedad active.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Define el valor de la propiedad active.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
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

}
