
package soapclient.airline.flight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramFlightSOAP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad countryOrigin.
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
     * Define el valor de la propiedad countryOrigin.
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
     * Obtiene el valor de la propiedad countryDestination.
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
     * Define el valor de la propiedad countryDestination.
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
     * Obtiene el valor de la propiedad cityOrigin.
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
     * Define el valor de la propiedad cityOrigin.
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
     * Obtiene el valor de la propiedad cityDestination.
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
     * Define el valor de la propiedad cityDestination.
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
     * Obtiene el valor de la propiedad dateOrigin.
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
     * Define el valor de la propiedad dateOrigin.
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
