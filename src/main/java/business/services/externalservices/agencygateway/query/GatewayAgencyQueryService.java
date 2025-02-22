package business.services.externalservices.agencygateway.query;

import java.util.Map;

import common.dto.services.FlightHotelDTO;

public interface GatewayAgencyQueryService {
    Map<String, FlightHotelDTO> getFlightAndHotels(String countryOrigin, String countryDestination, String dateFrom);  
}
