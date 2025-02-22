package business.services.externalservices.airlinemta.flight.query;

import java.util.List;

import common.dto.services.FlightListDTO;
import soapclient.airline.flight.FlightSOAP;

public interface FlightAirlineQueryService {
    FlightSOAP getFlight(final long idTravel);
    List<FlightListDTO> getFlights(final String countryOrigin, final String countryDestination, final String cityOrigin, final String cityDestination, final String dateOrigin);
}
