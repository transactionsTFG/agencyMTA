package soap;


import java.util.List;

import common.consts.WebMethodConsts;
import common.dto.services.FlightListDTO;
import common.dto.soap.request.ParamSearchFlightSOAP;
import common.exceptions.SAException;
import soapclient.airline.flight.FlightSOAP;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import business.services.externalservices.airlinemta.flight.query.FlightAirlineQueryService;

@WebService(serviceName = "AgencyFlight")
public class AgencyFlightWS {
    
    private final FlightAirlineQueryService flightAirlineQueryService;

    @Inject
    public AgencyFlightWS(final FlightAirlineQueryService flightAirlineQueryService) {
        this.flightAirlineQueryService = flightAirlineQueryService;
    }

    @WebMethod(operationName=WebMethodConsts.OP_SEARCH_FLIGHT)
    public FlightSOAP search(@WebParam(name = "idFlightSearch") final long idFlight) throws SAException{
        return this.flightAirlineQueryService.getFlight(idFlight);
    }

    @WebMethod(operationName=WebMethodConsts.OP_SEARCH_FLIGHTS)
    public List<FlightListDTO> searchAll(@WebParam(name = "paramSearchFlight") final ParamSearchFlightSOAP param) throws SAException {
        return this.flightAirlineQueryService
                    .getFlights(param.getCountryOrigin(), param.getCountryDestination(), param.getCityOrigin(), param.getCityDestination(), param.getDateOrigin());
    }


}
