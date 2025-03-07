
package soapclient.hotel.booking;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para modifyBookingRequestSOAP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modifyBookingRequestSOAP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numberOfNights" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="withBreakfast" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="peopleNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="roomId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifyBookingRequestSOAP", propOrder = {
    "id",
    "startDate",
    "endDate",
    "numberOfNights",
    "withBreakfast",
    "peopleNumber",
    "customerId",
    "roomId"
})
public class ModifyBookingRequestSOAP {

    protected long id;
    protected String startDate;
    protected String endDate;
    protected int numberOfNights;
    protected boolean withBreakfast;
    protected int peopleNumber;
    protected long customerId;
    @XmlElement(type = Long.class)
    protected List<Long> roomId;

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
     * Obtiene el valor de la propiedad startDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Define el valor de la propiedad startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Obtiene el valor de la propiedad endDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Define el valor de la propiedad endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfNights.
     * 
     */
    public int getNumberOfNights() {
        return numberOfNights;
    }

    /**
     * Define el valor de la propiedad numberOfNights.
     * 
     */
    public void setNumberOfNights(int value) {
        this.numberOfNights = value;
    }

    /**
     * Obtiene el valor de la propiedad withBreakfast.
     * 
     */
    public boolean isWithBreakfast() {
        return withBreakfast;
    }

    /**
     * Define el valor de la propiedad withBreakfast.
     * 
     */
    public void setWithBreakfast(boolean value) {
        this.withBreakfast = value;
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
     * Obtiene el valor de la propiedad customerId.
     * 
     */
    public long getCustomerId() {
        return customerId;
    }

    /**
     * Define el valor de la propiedad customerId.
     * 
     */
    public void setCustomerId(long value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the roomId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getRoomId() {
        if (roomId == null) {
            roomId = new ArrayList<Long>();
        }
        return this.roomId;
    }

}
