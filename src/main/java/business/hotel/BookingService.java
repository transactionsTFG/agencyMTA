package business.hotel;

import java.util.List;

import common.dto.MakeBookingSOAP;
import common.dto.MakeRoomSOAP;
import soapclient.hotel.booking.BookingSOAP;

public interface BookingService {
    public BookingSOAP makeBooking(MakeBookingSOAP booking, List<MakeRoomSOAP> rooms);
    public BookingSOAP readBooking(int bookingId);
}
