
package soapclient.airline.flight;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateReservationSOAP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateReservationSOAP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="idCustomer" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="updatePrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="updatePriceReservationSOAP" type="{http://soap/}updatePriceReservationSOAP" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateReservationSOAP", propOrder = {
    "id",
    "date",
    "total",
    "idCustomer",
    "active",
    "updatePrice",
    "updatePriceReservationSOAP"
})
public class UpdateReservationSOAP {

    protected long id;
    protected String date;
    protected double total;
    protected long idCustomer;
    protected boolean active;
    protected double updatePrice;
    protected List<UpdatePriceReservationSOAP> updatePriceReservationSOAP;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the total property.
     * 
     */
    public double getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     */
    public void setTotal(double value) {
        this.total = value;
    }

    /**
     * Gets the value of the idCustomer property.
     * 
     */
    public long getIdCustomer() {
        return idCustomer;
    }

    /**
     * Sets the value of the idCustomer property.
     * 
     */
    public void setIdCustomer(long value) {
        this.idCustomer = value;
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
     * Gets the value of the updatePrice property.
     * 
     */
    public double getUpdatePrice() {
        return updatePrice;
    }

    /**
     * Sets the value of the updatePrice property.
     * 
     */
    public void setUpdatePrice(double value) {
        this.updatePrice = value;
    }

    /**
     * Gets the value of the updatePriceReservationSOAP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updatePriceReservationSOAP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdatePriceReservationSOAP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatePriceReservationSOAP }
     * 
     * 
     */
    public List<UpdatePriceReservationSOAP> getUpdatePriceReservationSOAP() {
        if (updatePriceReservationSOAP == null) {
            updatePriceReservationSOAP = new ArrayList<UpdatePriceReservationSOAP>();
        }
        return this.updatePriceReservationSOAP;
    }

}
