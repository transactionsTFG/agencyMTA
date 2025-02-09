package business.travel;

import soapclient.airline.flight.FlightSOAP;
import soapclient.airline.flight.FlightWS_Service;
import weblogic.wsee.wstx.wsat.Transactional;
import weblogic.wsee.wstx.wsat.Transactional.TransactionFlowType;
import weblogic.wsee.wstx.wsat.Transactional.Version;

import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

@Stateless
public class SATravelImpl implements SATravel {

    @WebServiceRef(wsdlLocation = "http://localhost:8001/airlineMTA/FlightWS?wsdl")
    @Transactional(version = Version.WSAT12, value = TransactionFlowType.MANDATORY)
    private FlightWS_Service flightService;

    @Override
    public FlightSOAP getFlight(long idFlight) {
        return (FlightSOAP) flightService.getFlightWSPort().searchFlight(idFlight).getData();
    }
    
}
