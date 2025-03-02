package business.services.externalservices.airlinemta.reservation.command;

import java.util.List;

import common.dto.services.AirlineReservationDTO;
import common.dto.services.IdFlightWithSeatsDTO;
import common.dto.services.MakeFlightReservationDTO;
import common.dto.services.ModifyFlightReservationDTO;

public interface AirlineReservationCommandService {
    AirlineReservationDTO makeReservation(MakeFlightReservationDTO mDto, List<IdFlightWithSeatsDTO> idsFlightWithSeats);
    Object modifyReservation(ModifyFlightReservationDTO mDto);
    boolean cancelReservation(final long idReservation, final long idFlightInstance);
}
