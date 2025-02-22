package business.services.externalservices.hotelmta.booking.query;

import soapclient.hotel.booking.BookingSOAP;

public interface HotelBookingQueryService {
    public BookingSOAP readBooking(int bookingId);
}
