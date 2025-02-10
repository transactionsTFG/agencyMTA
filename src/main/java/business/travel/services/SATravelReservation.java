package business.travel.services;

import business.travel.TravelDTO;

public interface SATravelReservation {
    TravelDTO get(final long id); 
    boolean cancel(final long idTravel, final long idFlight, final long idFlightInstance, final int idHotel);
}
