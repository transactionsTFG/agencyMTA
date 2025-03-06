package common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import business.booking.BookingDTO;
import common.dto.services.ReservationDTO;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotelFlightReservationDTO {
    private BookingDTO booking;
    private ReservationDTO reservation;
}
