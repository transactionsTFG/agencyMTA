
package soapclient.airline.flight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchFlight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchFlight"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idFlightSearch" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchFlight", propOrder = {
    "idFlightSearch"
})
public class SearchFlight {

    protected long idFlightSearch;

    /**
     * Gets the value of the idFlightSearch property.
     * 
     */
    public long getIdFlightSearch() {
        return idFlightSearch;
    }

    /**
     * Sets the value of the idFlightSearch property.
     * 
     */
    public void setIdFlightSearch(long value) {
        this.idFlightSearch = value;
    }

}
