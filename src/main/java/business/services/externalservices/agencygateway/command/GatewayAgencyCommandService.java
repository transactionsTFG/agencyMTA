package business.services.externalservices.agencygateway.command;

import common.dto.services.AgencyReservationFlightDTO;
import common.dto.services.AgencyReservationSuccessDTO;

public interface GatewayAgencyCommandService {
    AgencyReservationSuccessDTO makeReservationFlight(AgencyReservationFlightDTO agencyReservationFlightDTO);
    Object modifyReservationFlight(AgencyReservationFlightDTO agencyReservationFlightDTO);
    boolean cancelReservationFlight(final long idTravel, final long idFlightInstance);
}
