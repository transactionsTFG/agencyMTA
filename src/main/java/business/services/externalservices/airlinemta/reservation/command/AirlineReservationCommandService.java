package business.services.externalservices.airlinemta.reservation.command;

import java.util.List;
import java.util.Map;

import business.user.UserDTO;
import common.dto.services.AirlineReservationDTO;
import common.dto.services.IdFlightWithSeatsDTO;
import common.dto.services.ReservationDTO;
import common.dto.services.UpdateReservationDTO;

public interface AirlineReservationCommandService {
    ReservationDTO getAirlineReservationWithLockMode(final long idAirlineReservation);
    AirlineReservationDTO makeReservation(final UserDTO user, final String dni, List<IdFlightWithSeatsDTO> idsFlightWithSeats);
    UpdateReservationDTO modifyReservation(final long idReservation, final Map<Long, Integer> idFlightInstanceWithSeatsMap);
    double cancelReservation(final long idReservation);
}
