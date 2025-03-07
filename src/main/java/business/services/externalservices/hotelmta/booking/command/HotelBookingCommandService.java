package business.services.externalservices.hotelmta.booking.command;

import business.booking.BookingDTO;
import business.booking.MakeBookingReservationDTO;
import business.booking.ModifyBookingReservationDTO;
import business.user.UserDTO;

public interface HotelBookingCommandService {
    BookingDTO getBookingWithLockMode(long bookingId);
    BookingDTO makeBooking(MakeBookingReservationDTO booking, UserDTO userDTO, final String dni);
    BookingDTO modifyBooking(ModifyBookingReservationDTO booking);
    double cancelBooking(long bookingId);
    double cancelBookingLine(long bookingId, long roomId);
}
