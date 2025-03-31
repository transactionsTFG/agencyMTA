package business.services.externalservices.agencygateway.command;

import java.util.Map;

import business.booking.BookingDTO;
import business.booking.MakeBookingReservationDTO;
import business.booking.ModifyBookingReservationDTO;
import common.dto.HotelFlightReservationDTO;
import common.dto.services.AgencyReservationSuccessDTO;
import common.dto.services.ReservationDTO;
import common.dto.services.UpdateReservationDTO;

public interface GatewayAgencyCommandService {
    //TODO: probar
    HotelFlightReservationDTO getHotelAndFlightReservationWithLockMode(long hotelBookingId, long flightReservationId);
    
    //TODO: probar
    AgencyReservationSuccessDTO makeReservationFlight(final long idCustomer, final String dni, final Map<Long, Integer> mapIdFlightInstance);
    //TODO: probar
    BookingDTO makeReservationHotel(final MakeBookingReservationDTO booking, final long idCustomer, final String dni);
    //TODO: probar
    AgencyReservationSuccessDTO makeReservationHotelAndFlight(final MakeBookingReservationDTO booking, final long idCustomer, final String dni, final Map<Long, Integer> mapIdFlightInstance);
    
    //TODO: probar
    UpdateReservationDTO modifyReservationFlight(final long idReservation, final Map<Long, Integer> idFlightInstanceWithSeatsMap);
    //TODO: probar
    BookingDTO modifyReservationHotel(final ModifyBookingReservationDTO booking);
    // TODO: probar
    UpdateReservationDTO modifyHotelFlightReservation(final ModifyBookingReservationDTO booking, final long idReservation, final Map<Long, Integer> idFlightInstanceWithSeatsMap);
   
    //TODO: probar
    ReservationDTO searchFlightReservation(final long flightReservationId);

    //TODO: probar
    double cancelReservationFlight(final long idReservationFlight);
    //TODO: probar
    double cancelReservationHotel(final long idHotelBooking);
    //TODO: probar
    double cancelReservationLineHotel(final long idHotelBooking, final long roomId);
    // TODO: probar
    double cancelHotelFlightReservation(long hotelBookingId, long flightReservationId);
}
