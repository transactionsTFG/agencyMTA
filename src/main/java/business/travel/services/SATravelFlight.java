package business.travel.services;

import java.util.List;

import common.dto.soap.request.ParamSearchFlight;
import soapclient.airline.flight.FlightSOAP;

public interface SATravelFlight {
    FlightSOAP getFlight(final long idTravel);
    List<Object> getFlights(final ParamSearchFlight param);
} 
