package business.services.agency.travel;

import java.util.List;

import business.travel.TravelDTO;

public interface AgencyTravelService {
    TravelDTO findWithOptimisticLockById(final long idTravel);
    TravelDTO findTravelByIdReservationHotel(final long idReservationHotel);
    List<TravelDTO> findTravelByIdReservationFlight(final long idReservationFlight);
    List<TravelDTO> findTravelByIdReservationFlightAndHotel(final long idReservationFlight, final long idReservationHotel);

    TravelDTO makeTravel(final TravelDTO travel);
    TravelDTO modifyTravel(final TravelDTO travel);
    boolean cancelTravel(final long idTravel);
}
