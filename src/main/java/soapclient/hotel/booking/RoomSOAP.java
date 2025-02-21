
package soapclient.hotel.booking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for roomSOAP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the number property.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * Gets the value of the occupied property.
     * 
     */
    public boolean isOccupied() {
        return occupied;
    }

    /**
     * Sets the value of the occupied property.
     * 
     */
    public void setOccupied(boolean value) {
        this.occupied = value;
    }

    /**
     * Gets the value of the singleBed property.
     * 
     */
    public boolean isSingleBed() {
        return singleBed;
    }

    /**
     * Sets the value of the singleBed property.
     * 
     */
    public void setSingleBed(boolean value) {
        this.singleBed = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the peopleNumber property.
     * 
     */
    public int getPeopleNumber() {
        return peopleNumber;
    }

    /**
     * Sets the value of the peopleNumber property.
     * 
     */
    public void setPeopleNumber(int value) {
        this.peopleNumber = value;
    }

}
