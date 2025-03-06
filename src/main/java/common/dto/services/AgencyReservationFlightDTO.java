package common.dto.services;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AgencyReservationFlightDTO {
    private long id;
    private int userId;
    private String date;
    private String returnDate;
    private int passengerCounter;
    private double cost;
    private String status;
    private long flightReservationID;
    private long hotelReservationID;
    private double flightCost;
    private double hotelCost;
    private String dni;
    private double total;
}
