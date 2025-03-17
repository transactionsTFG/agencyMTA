
package soapclient.airline.flight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para updatePriceReservationSOAP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="updatePriceReservationSOAP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idFlightInstance" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePriceReservationSOAP", propOrder = {
    "idFlightInstance",
    "price"
})
public class UpdatePriceReservationSOAP {

    protected long idFlightInstance;
    protected double price;

    /**
     * Obtiene el valor de la propiedad idFlightInstance.
     * 
     */
    public long getIdFlightInstance() {
        return idFlightInstance;
    }

    /**
     * Define el valor de la propiedad idFlightInstance.
     * 
     */
    public void setIdFlightInstance(long value) {
        this.idFlightInstance = value;
    }

    /**
     * Obtiene el valor de la propiedad price.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Define el valor de la propiedad price.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

}
