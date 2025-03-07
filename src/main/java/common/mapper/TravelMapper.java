package common.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import business.booking.BookingDTO;
import business.booking.MakeBookingReservationDTO;
import business.travel.TravelDTO;
import common.dto.services.AirlineReservationDTO;
import common.dto.services.StatusFlightDTO;

@Mapper
public interface TravelMapper {
    TravelMapper INSTANCE = Mappers.getMapper(TravelMapper.class);
    
    default TravelDTO toMakeReservationAirline(AirlineReservationDTO air, StatusFlightDTO status, long idUser) {
        return TravelDTO.builder()
                    .userId(idUser)
                    .date(air.getDate())
                    .returnDate(status.getReturnDate())
                    .passengerCounter(status.getSeats())
                    .cost(status.getPrice())
                    .status(status.getStatus())
                    .flightReservationID(air.getId())
                    .hotelReservationID(-1)
                    .flightCost(air.getTotal())
                    .hotelCost(0.0)
                    .active(air.isActive())
                    .build();
    }

    default TravelDTO toMakeReservationHotel(MakeBookingReservationDTO makeBooking, BookingDTO bookingDTO, long idUser) {
        return TravelDTO.builder()
                        .userId(idUser)
                        .active(true)
                        .cost(bookingDTO.getTotalPrice())
                        .date(makeBooking.getStartDate())
                        .returnDate(makeBooking.getEndDate())
                        .passengerCounter(bookingDTO.getPeopleNumber())
                        .flightCost(0)
                        .flightReservationID(-1)
                        .hotelCost(bookingDTO.getTotalPrice())
                        .hotelReservationID(bookingDTO.getId())
                        .status("")
                        .build();
    }

    default TravelDTO toMakeReservationAirlineAndHotel(BookingDTO bookingDTO,  AirlineReservationDTO air, StatusFlightDTO status, final long idUser) {
        return TravelDTO.builder()
                    .userId(idUser)
                    .date(air.getDate())
                    .returnDate(status.getReturnDate())
                    .passengerCounter(status.getSeats())
                    .cost(status.getPrice() + bookingDTO.getTotalPrice())
                    .status(status.getStatus())
                    .flightReservationID(air.getId())
                    .hotelReservationID(bookingDTO.getId())
                    .flightCost(air.getTotal())
                    .hotelCost(bookingDTO.getTotalPrice())
                    .active(air.isActive())
                    .build();
    }

}
