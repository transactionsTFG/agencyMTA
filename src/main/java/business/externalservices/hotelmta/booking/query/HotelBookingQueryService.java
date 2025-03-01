package business.externalservices.hotelmta.booking.query;

import business.booking.BookingDTO;

public interface HotelBookingQueryService {
    public BookingDTO readBooking(int bookingId);
}
