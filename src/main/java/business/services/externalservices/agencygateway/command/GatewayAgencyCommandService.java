package business.services.externalservices.agencygateway.command;

import java.util.Map;

import business.user.UserDTO;
import common.dto.services.AgencyReservationFlightDTO;
import common.dto.services.AgencyReservationSuccessDTO;

public interface GatewayAgencyCommandService {
    // TODO: probar/hacer
    AgencyReservationSuccessDTO makeReservationFlight(AgencyReservationFlightDTO agencyReservationFlightDTO, final Map<Long, Integer> mapIdFlightInstance, final UserDTO user);
    // TODO: probar/hacer
    Object modifyReservationFlight(AgencyReservationFlightDTO agencyReservationFlightDTO);
    // TODO: probar/hacer
    boolean cancelReservationFlight(final long idTravel, final long idFlightInstance);
    // TODO: probar/hacer
    HotelFlightReservationDTO makeHotelFlightReservation(BookingDTO booking, AgencyReservationFlightDTO reservation, Map<Long, Integer> mapIdFlightInstance, UserDTO user);
    // TODO: probar/hacer
    HotelFlightReservationDTO modifyHotelFlightReservation(BookingDTO booking, AgencyReservationFlightDTO reservation, Map<Long, Integer> mapIdFlightInstance);
    // TODO: probar/hacer
    double cancelHotelFlightReservation(long hotelBookingId, long flightReservationId);
}
