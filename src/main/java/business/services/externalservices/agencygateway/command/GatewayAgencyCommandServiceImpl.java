package business.services.externalservices.agencygateway.command;

import javax.ejb.Stateless;
import javax.inject.Inject;

import business.services.agency.travel.AgencyTravelService;
import business.services.externalservices.airlinemta.reservation.command.AirlineReservationCommandService;
import business.travel.TravelDTO;
import common.dto.services.AgencyReservationFlightDTO;
import common.dto.services.AgencyReservationSuccessDTO;
import common.dto.services.AirlineReservationDTO;
import common.dto.services.MakeFlightReservationDTO;
import common.exceptions.TravelException;

@Stateless
public class GatewayAgencyCommandServiceImpl implements GatewayAgencyCommandService {
    
    private AgencyTravelService agencyTravelService;
    private AirlineReservationCommandService airlineReservationCommandService;

    public GatewayAgencyCommandServiceImpl() {}

    @Inject
    public GatewayAgencyCommandServiceImpl(AgencyTravelService agencyTravelService, AirlineReservationCommandService airlineReservationCommandService) {
        this.agencyTravelService = agencyTravelService;
        this.airlineReservationCommandService = airlineReservationCommandService;
    }

    @Override
    public AgencyReservationSuccessDTO makeReservationFlight(AgencyReservationFlightDTO agencyReservation) {
        TravelDTO saveTravel = this.agencyTravelService.makeTravel(new TravelDTO(agencyReservation));
        AirlineReservationDTO airline = this.airlineReservationCommandService.makeReservation(new MakeFlightReservationDTO(agencyReservation));
        return new AgencyReservationSuccessDTO(saveTravel.getId(), airline);
    }
 
    @Override
    public Object modifyReservationFlight(AgencyReservationFlightDTO agencyReservation) {
        TravelDTO modifyTravel = this.agencyTravelService.modifyTravel(new TravelDTO(agencyReservation));
        

        return null;
    }

    @Override
    public boolean cancelReservationFlight(final long idTravel, final long idFlightInstance) {
        TravelDTO travel = this.agencyTravelService.findWithOptimisticLockById(idTravel);
        boolean cancelReservation = this.airlineReservationCommandService.cancelReservation(travel.getFlightReservationID(), idFlightInstance);
        if (!cancelReservation) 
            throw new TravelException("Error cancelando la reserva de vuelo");
        return this.agencyTravelService.cancelTravel(idTravel);
    }

}
