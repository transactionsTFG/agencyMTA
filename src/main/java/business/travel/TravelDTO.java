package business.travel;

import common.dto.services.AgencyReservationFlightDTO;
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
    private int userId; // Relación con User representada por el ID del usuario.
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

    public TravelDTO(AgencyReservationFlightDTO agencyReservationFlightDTO){
        this.id = agencyReservationFlightDTO.getId();
        this.userId = agencyReservationFlightDTO.getUserId();
        this.date = agencyReservationFlightDTO.getDate();
        this.returnDate = agencyReservationFlightDTO.getReturnDate();
        this.passengerCounter = agencyReservationFlightDTO.getPassengerCounter();
        this.cost = agencyReservationFlightDTO.getCost();
        this.status = agencyReservationFlightDTO.getStatus();
        this.flightReservationID = agencyReservationFlightDTO.getFlightReservationID();
        this.hotelReservationID = agencyReservationFlightDTO.getHotelReservationID();
        this.flightCost = agencyReservationFlightDTO.getFlightCost();
        this.hotelCost = agencyReservationFlightDTO.getHotelCost();
        this.active = agencyReservationFlightDTO.isActive();
    }
}
