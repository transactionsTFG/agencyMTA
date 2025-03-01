package business.externalservices.hotelmta.booking.command;

import business.booking.BookingDTO;
import business.booking.MakeBookingReservationDTO;
import business.booking.ModifyBookingReservationDTO;

public interface HotelBookingCommandService {
    BookingDTO makeBooking(MakeBookingReservationDTO booking);
    BookingDTO modifyBooking(ModifyBookingReservationDTO booking);
    double cancelBooking(long bookingId);
    double cancelBookingLine(long bookingId, long roomId);
}
