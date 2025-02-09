package business.travel;

import soapclient.airline.flight.FlightSOAP;

public interface SATravel {
    FlightSOAP getFlight(final long idTravel);
} 
