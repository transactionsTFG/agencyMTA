package business.externalservices.hotelmta.booking.command;

import soapclient.hotel.booking.BookingSOAP;
import soapclient.hotel.booking.MakeBookingRequestSOAP;
import soapclient.hotel.booking.ModifyBookingRequestSOAP;

public interface HotelBookingCommandService {
    BookingSOAP makeBooking(MakeBookingRequestSOAP booking);
    BookingSOAP modifyBooking(ModifyBookingRequestSOAP booking);
    double cancelBooking(long bookingId);
    double cancelBookingLine(long bookingId, long roomId);
}
