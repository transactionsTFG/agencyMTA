package business.services.externalservices.agencygateway.query;

import java.util.Map;

import common.dto.services.FlightHotelDTO;
import common.dto.soap.request.SearchAirlineHotelRequestSOAP;

public interface GatewayAgencyQueryService {
    Map<String, FlightHotelDTO> getFlightAndHotels(final SearchAirlineHotelRequestSOAP param);
}
