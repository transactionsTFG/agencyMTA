package business.travel.services;

import business.travel.TravelDTO;

public interface SATravelReservation {
    TravelDTO get(final long id); 
    boolean cancel(final int idTravel, final int idFlight, final long idHotel);
}
