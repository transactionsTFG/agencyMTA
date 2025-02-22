package soap;

import java.util.Map;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import business.externalservices.agencygateway.query.GatewayAgencyQueryService;
import common.consts.WebMethodConsts;
import common.dto.services.FlightHotelDTO;
import common.dto.soap.request.SearchAirlineHotelRequestSOAP;
import common.exceptions.SAException;

@WebService(serviceName = "GatewayAgencyWS")
public class GatewayAgencyWS {
    private final GatewayAgencyQueryService gatewayAgencyQueryService;

    @Inject
    public GatewayAgencyWS(final GatewayAgencyQueryService gatewayAgencyQueryService) {
        this.gatewayAgencyQueryService = gatewayAgencyQueryService;
    }

    @WebMethod(operationName=WebMethodConsts.OP_SEARCH_FLIGHTS_AND_HOTEL)
    public Map<String, FlightHotelDTO> searchAirlineHotel(@WebParam(name = "parmaSearchAirlineHotel") final SearchAirlineHotelRequestSOAP param) throws SAException {
        return this.gatewayAgencyQueryService
                    .getFlightAndHotels(param.getCountryOrigin(), param.getCountryDestination(), param.getDateFrom());
    }
}
