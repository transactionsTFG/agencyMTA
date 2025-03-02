package business.externalservices.hotelmta.booking.command;

import business.booking.BookingDTO;
import business.booking.MakeBookingReservationDTO;
import business.booking.ModifyBookingReservationDTO;
import business.user.UserDTO;

public interface HotelBookingCommandService {
    BookingDTO makeBooking(MakeBookingReservationDTO booking, UserDTO userDTO);
    BookingDTO modifyBooking(ModifyBookingReservationDTO booking);
    double cancelBooking(long bookingId);
    double cancelBookingLine(long bookingId, long roomId);
}
