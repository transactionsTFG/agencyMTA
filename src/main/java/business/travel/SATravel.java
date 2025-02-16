package business.travel;

import common.dto.MakeFlightReservationSOAP;
import common.dto.ModifyFlightReservationSOAP;
import soapclient.airline.flight.FlightSOAP;
import soapclient.airline.reservation.ReservationSOAP;

public interface SATravel {
    FlightSOAP getFlight(final long idTravel);
    ReservationSOAP makeReservation(final MakeFlightReservationSOAP reservation);
    ReservationSOAP modifyReservation(final ModifyFlightReservationSOAP reservation);
    ReservationSOAP searchReservation(final long flightReservationId);
    ReservationSOAP cancelReservation(final long flightReservationId, final long flightInstanceId);
} 
