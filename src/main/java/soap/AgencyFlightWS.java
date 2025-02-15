package soap;


import java.util.List;

import common.consts.WebMethodConsts;
import common.dto.soap.request.ParamSearchFlight;
import common.exceptions.SAException;
import soapclient.airline.flight.FlightSOAP;
import weblogic.wsee.wstx.wsat.Transactional;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import business.travel.services.SATravelFlight;

@WebService(serviceName = "AgencyFlight")
public class AgencyFlightWS {
    
    private final SATravelFlight servicesTravel;

    @Inject
    public AgencyFlightWS(final SATravelFlight servicesFlight){
        this.servicesTravel = servicesFlight;
    }

    @WebMethod(operationName=WebMethodConsts.OP_SEARCH_FLIGHT)
    @Transactional
    public FlightSOAP search(@WebParam(name = "idFlightSearch") final long idFlight) throws SAException{
        return this.servicesTravel.getFlight(idFlight);
    }

    @WebMethod(operationName=WebMethodConsts.OP_SEARCH_FLIGHTS)
    public List<Object> searchAll(@WebParam(name = "paramSearchFlight") final ParamSearchFlight param) throws SAException{
        return this.servicesTravel.getFlights(param);
    }

}
