package business.travel;

import java.time.LocalDateTime;

import common.dto.services.AgencyReservationFlightDTO;
import common.dto.services.AirlineReservationDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TravelDTO {
    private long id;
    private long userId; // Relación con User representada por el ID del usuario.
    private String date;
    private String returnDate;
    private int passengerCounter;
    private double cost;
    private String status;
    private long flightReservationID;
    private long hotelReservationID;
    private double flightCost;
    private double hotelCost;
    private boolean active;
    private LocalDateTime dateCreation;
}
