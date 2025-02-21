package business.travel.services;

import business.travel.TravelDTO;
import common.dto.MakeFlightReservationSOAP;
import soapclient.airline.reservation.ReservationSOAP;

public interface SATravelReservation {
    TravelDTO get(final long id); 
    boolean cancel(final long idTravel, final long idFlight, final long idFlightInstance, final int idHotel);
    ReservationSOAP makeReservation(final MakeFlightReservationSOAP reservation);
}
