
package soapclient.hotel.room;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RoomWSB", targetNamespace = "http://soap/", wsdlLocation = "http://localhost:7001/hotelMTA/RoomWSB?wsdl")
public class RoomWSB_Service
    extends Service
{

    private final static URL ROOMWSB_WSDL_LOCATION;
    private final static WebServiceException ROOMWSB_EXCEPTION;
    private final static QName ROOMWSB_QNAME = new QName("http://soap/", "RoomWSB");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7001/hotelMTA/RoomWSB?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ROOMWSB_WSDL_LOCATION = url;
        ROOMWSB_EXCEPTION = e;
    }

    public RoomWSB_Service() {
        super(__getWsdlLocation(), ROOMWSB_QNAME);
    }

    public RoomWSB_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ROOMWSB_QNAME, features);
    }

    public RoomWSB_Service(URL wsdlLocation) {
        super(wsdlLocation, ROOMWSB_QNAME);
    }

    public RoomWSB_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ROOMWSB_QNAME, features);
    }

    public RoomWSB_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RoomWSB_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RoomWSB
     */
    @WebEndpoint(name = "RoomWSBPort")
    public RoomWSB getRoomWSBPort() {
        return super.getPort(new QName("http://soap/", "RoomWSBPort"), RoomWSB.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RoomWSB
     */
    @WebEndpoint(name = "RoomWSBPort")
    public RoomWSB getRoomWSBPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap/", "RoomWSBPort"), RoomWSB.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ROOMWSB_EXCEPTION!= null) {
            throw ROOMWSB_EXCEPTION;
        }
        return ROOMWSB_WSDL_LOCATION;
    }

}
