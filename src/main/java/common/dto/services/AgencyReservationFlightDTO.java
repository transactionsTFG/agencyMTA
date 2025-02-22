package common.dto.services;


import business.travel.TravelDTO;
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
    private boolean active;
    private String dni;
    private String email;
    private String name;
    private String phone;
    private long customerId;
    private double total;
    private long flightId;
    private int numberOfSeats;
}
