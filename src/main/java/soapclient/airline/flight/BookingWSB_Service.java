
package soapclient.airline.flight;

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
@WebServiceClient(name = "BookingWSB", targetNamespace = "http://soap/", wsdlLocation = "http://localhost:7001/hotelMTA/BookingWSB?wsdl")
public class BookingWSB_Service
    extends Service
{

    private final static URL BOOKINGWSB_WSDL_LOCATION;
    private final static WebServiceException BOOKINGWSB_EXCEPTION;
    private final static QName BOOKINGWSB_QNAME = new QName("http://soap/", "BookingWSB");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7001/hotelMTA/BookingWSB?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BOOKINGWSB_WSDL_LOCATION = url;
        BOOKINGWSB_EXCEPTION = e;
    }

    public BookingWSB_Service() {
        super(__getWsdlLocation(), BOOKINGWSB_QNAME);
    }

    public BookingWSB_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), BOOKINGWSB_QNAME, features);
    }

    public BookingWSB_Service(URL wsdlLocation) {
        super(wsdlLocation, BOOKINGWSB_QNAME);
    }

    public BookingWSB_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BOOKINGWSB_QNAME, features);
    }

    public BookingWSB_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BookingWSB_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BookingWSB
     */
    @WebEndpoint(name = "BookingWSBPort")
    public BookingWSB getBookingWSBPort() {
        return super.getPort(new QName("http://soap/", "BookingWSBPort"), BookingWSB.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BookingWSB
     */
    @WebEndpoint(name = "BookingWSBPort")
    public BookingWSB getBookingWSBPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap/", "BookingWSBPort"), BookingWSB.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BOOKINGWSB_EXCEPTION!= null) {
            throw BOOKINGWSB_EXCEPTION;
        }
        return BOOKINGWSB_WSDL_LOCATION;
    }

}
