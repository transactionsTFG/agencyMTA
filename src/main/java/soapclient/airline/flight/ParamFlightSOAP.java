
package soapclient.airline.flight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paramFlightSOAP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paramFlightSOAP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="countryOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryDestination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cityOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cityDestination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramFlightSOAP", propOrder = {
    "countryOrigin",
    "countryDestination",
    "cityOrigin",
    "cityDestination",
    "dateOrigin"
})
public class ParamFlightSOAP {

    protected String countryOrigin;
    protected String countryDestination;
    protected String cityOrigin;
    protected String cityDestination;
    protected String dateOrigin;

    /**
     * Gets the value of the countryOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOrigin() {
        return countryOrigin;
    }

    /**
     * Sets the value of the countryOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOrigin(String value) {
        this.countryOrigin = value;
    }

    /**
     * Gets the value of the countryDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryDestination() {
        return countryDestination;
    }

    /**
     * Sets the value of the countryDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryDestination(String value) {
        this.countryDestination = value;
    }

    /**
     * Gets the value of the cityOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityOrigin() {
        return cityOrigin;
    }

    /**
     * Sets the value of the cityOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityOrigin(String value) {
        this.cityOrigin = value;
    }

    /**
     * Gets the value of the cityDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityDestination() {
        return cityDestination;
    }

    /**
     * Sets the value of the cityDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityDestination(String value) {
        this.cityDestination = value;
    }

    /**
     * Gets the value of the dateOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOrigin() {
        return dateOrigin;
    }

    /**
     * Sets the value of the dateOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOrigin(String value) {
        this.dateOrigin = value;
    }

}
