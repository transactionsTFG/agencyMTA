
package soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchFlights complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad paramSearch.
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
     * Define el valor de la propiedad paramSearch.
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
