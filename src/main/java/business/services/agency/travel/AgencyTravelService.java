package business.services.agency.travel;

import business.travel.TravelDTO;

public interface AgencyTravelService {
    TravelDTO findWithOptimisticLockById(final long idTravel);
    TravelDTO makeTravel(final TravelDTO travel);
    TravelDTO modifyTravel(final TravelDTO travel);
    boolean cancelTravel(final long idTravel);
}
