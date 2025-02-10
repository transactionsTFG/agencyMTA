package soap;


import business.travel.SATravel;
import common.consts.WebMethodConsts;
import common.exceptions.SAException;
import soapclient.airline.flight.FlightSOAP;
import weblogic.wsee.wstx.wsat.Transactional;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName = "AgencyFlight")
public class AgencyFlightWS {
    
    private final SATravel servicesTravel;

    @Inject
    public AgencyFlightWS(final SATravel servicesFlight){
        this.servicesTravel = servicesFlight;
    }

    @WebMethod(operationName=WebMethodConsts.OP_SEARCH_FLIGHT)
    @Transactional
    public FlightSOAP search(@WebParam(name = "idFlightSearch") final long idFlight) throws SAException{
        return this.servicesTravel.getFlight(idFlight);
    }
}
