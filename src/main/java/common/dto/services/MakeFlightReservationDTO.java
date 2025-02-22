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

    public MakeFlightReservationDTO(AgencyReservationFlightDTO agencyReservationFlightDTO){
        this.dni = agencyReservationFlightDTO.getDni();
        this.email = agencyReservationFlightDTO.getEmail();
        this.name = agencyReservationFlightDTO.getName();  
        this.phone = agencyReservationFlightDTO.getPhone();
        this.date = agencyReservationFlightDTO.getDate();
        this.customerId = agencyReservationFlightDTO.getCustomerId();
        this.total = agencyReservationFlightDTO.getTotal();
        this.flightId = agencyReservationFlightDTO.getFlightId();
        this.numberOfSeats = agencyReservationFlightDTO.getNumberOfSeats();
    }
}
