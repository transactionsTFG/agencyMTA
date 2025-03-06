package common.dto.services;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class AgencyReservationSuccessDTO {
    private long idReservation;
    private long idBooking;
    private String dateReservation;
    private double totalReservation;
    private List<StatusFlightDTO> statusFlightsDTO;
}
