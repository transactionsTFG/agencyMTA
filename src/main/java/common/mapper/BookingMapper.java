package common.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import business.booking.BookingDTO;
import business.booking.MakeBookingReservationDTO;
import business.booking.ModifyBookingReservationDTO;
import soapclient.hotel.booking.BookingSOAP;
import soapclient.hotel.booking.MakeBookingRequestSOAP;
import soapclient.hotel.booking.ModifyBookingRequestSOAP;

@Mapper
public interface BookingMapper {

    BookingMapper INSTANCE = Mappers.getMapper(BookingMapper.class);

    MakeBookingRequestSOAP fromMakeDTOToRequestSOAP(MakeBookingReservationDTO booking);
    ModifyBookingRequestSOAP fromModifyDTOToRequestSOAP(ModifyBookingReservationDTO booking);
    BookingDTO fromSOAPToDTO(BookingSOAP bookingSOAP);

}
