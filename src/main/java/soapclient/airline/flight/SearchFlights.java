
package soapclient.airline.flight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchFlights complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchFlights"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramSearch" type="{http://soap/}paramFlightSOAP" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchFlights", propOrder = {
    "paramSearch"
})
public class SearchFlights {

    protected ParamFlightSOAP paramSearch;

    /**
     * Gets the value of the paramSearch property.
     * 
     * @return
     *     possible object is
     *     {@link ParamFlightSOAP }
     *     
     */
    public ParamFlightSOAP getParamSearch() {
        return paramSearch;
    }

    /**
     * Sets the value of the paramSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamFlightSOAP }
     *     
     */
    public void setParamSearch(ParamFlightSOAP value) {
        this.paramSearch = value;
    }

}
