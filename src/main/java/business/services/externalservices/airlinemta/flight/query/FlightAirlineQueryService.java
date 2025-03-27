package business.services.externalservices.airlinemta.flight.query;

import java.util.List;

import common.dto.services.FlightListDTO;
import soapclient.airline.flight.FlightInstanceDTO;
import soapclient.airline.flight.FlightSOAP;
import soapclient.airline.flight.IdFlightInstanceWithSeatsDTO;

public interface FlightAirlineQueryService {
    FlightSOAP getFlight(final long idTravel);
    List<FlightListDTO> getFlights(final String countryOrigin, final String countryDestination, final String cityOrigin, final String cityDestination, final String dateOrigin);
    FlightInstanceDTO getFlightInstance(final long idFlightInstance);
    List<IdFlightInstanceWithSeatsDTO> getFlightsByReservation(long reservationId);
}
