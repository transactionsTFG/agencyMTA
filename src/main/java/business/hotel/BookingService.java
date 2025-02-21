package business.hotel;

import soapclient.hotel.booking.BookingSOAP;
import soapclient.hotel.booking.MakeBookingRequestSOAP;

public interface BookingService {
    public BookingSOAP makeBooking(MakeBookingRequestSOAP booking);
    public BookingSOAP readBooking(int bookingId);
}
