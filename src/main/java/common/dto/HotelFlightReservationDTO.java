package common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import business.booking.BookingDTO;
import soapclient.airline.reservation.ReservationDTO;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotelFlightReservationDTO {
    
    private BookingDTO booking;
    private AgencyReservationSuccessDTO reservation;
    
}
