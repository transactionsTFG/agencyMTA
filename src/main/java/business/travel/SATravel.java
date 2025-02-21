package business.travel;

import common.dto.MakeFlightReservationSOAP;
import soapclient.airline.flight.FlightSOAP;
import soapclient.airline.reservation.ReservationSOAP;

public interface SATravel {
    FlightSOAP getFlight(final long idTravel);
} 
