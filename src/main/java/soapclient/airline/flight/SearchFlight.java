
package soapclient.airline.flight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchFlight complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad idFlightSearch.
     * 
     */
    public long getIdFlightSearch() {
        return idFlightSearch;
    }

    /**
     * Define el valor de la propiedad idFlightSearch.
     * 
     */
    public void setIdFlightSearch(long value) {
        this.idFlightSearch = value;
    }

}
