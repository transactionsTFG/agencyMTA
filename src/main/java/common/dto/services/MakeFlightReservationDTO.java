package common.dto.services;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MakeFlightReservationDTO {
    private String dni;
    private String email;
    private String name;
    private String phone;
    private String date;
    private long customerId;
    private double total;
    private long flightId;
    private int numberOfSeats;
}
