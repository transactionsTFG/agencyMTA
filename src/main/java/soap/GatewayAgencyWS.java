package soap;

import java.util.Map;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import business.services.agency.travel.AgencyTravelService;
import business.services.externalservices.agencygateway.query.GatewayAgencyQueryService;
import common.consts.WebMethodConsts;
import common.dto.services.FlightHotelDTO;
import common.dto.soap.request.SearchAirlineHotelRequestSOAP;
import common.dto.soap.response.GetTravelSOAP;
import common.exceptions.SAException;
import weblogic.wsee.wstx.wsat.Transactional;

@WebService(serviceName = "GatewayAgencyWS")
public class GatewayAgencyWS {
    private final GatewayAgencyQueryService gatewayAgencyQueryService;
    private final AgencyTravelService agencyTravelService;

    @Inject
    public GatewayAgencyWS(final GatewayAgencyQueryService gatewayAgencyQueryService, final AgencyTravelService agencyTravelService) {
        this.gatewayAgencyQueryService = gatewayAgencyQueryService;
        this.agencyTravelService = agencyTravelService;
    }

    @WebMethod(operationName=WebMethodConsts.OP_SEARCH_FLIGHTS_AND_HOTEL)
    public Map<String, FlightHotelDTO> searchAirlineHotel(@WebParam(name = "parmaSearchAirlineHotel") final SearchAirlineHotelRequestSOAP param) throws SAException {
        return this.gatewayAgencyQueryService
                    .getFlightAndHotels(param.getCountryOrigin(), param.getCountryDestination(), param.getDateFrom());
    }

    @WebMethod(operationName=WebMethodConsts.OP_SEARCH_TRAVEL)
    @Transactional
    public GetTravelSOAP searchTravel(@WebParam(name = "paramSearchTravel") final long id) throws SAException {
        return GetTravelSOAP.toSOAP(this.agencyTravelService.findWithOptimisticLockById(id));
    }
}
