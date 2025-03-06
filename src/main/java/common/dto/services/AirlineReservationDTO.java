package common.dto.services;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import soapclient.airline.reservation.NewReservationSOAP;
import soapclient.airline.reservation.ReservationSOAP;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AirlineReservationDTO {
    private long id;
    private String date;
    private double total;
    private boolean active;
    private List<StatusFlightDTO> statusFlightsDTO;
}
