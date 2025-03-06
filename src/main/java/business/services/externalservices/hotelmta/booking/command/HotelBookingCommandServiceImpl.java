package business.services.externalservices.hotelmta.booking.command;

import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

import business.booking.BookingDTO;
import business.booking.MakeBookingReservationDTO;
import business.booking.ModifyBookingReservationDTO;
import business.user.UserDTO;
import common.mapper.BookingMapper;
import common.mapper.UserMapper;
import soapclient.hotel.booking.BookingSOAP;
import soapclient.hotel.booking.BookingWSB_Service;
import weblogic.wsee.wstx.wsat.Transactional;
import weblogic.wsee.wstx.wsat.Transactional.TransactionFlowType;
import weblogic.wsee.wstx.wsat.Transactional.Version;

@Stateless
public class HotelBookingCommandServiceImpl implements HotelBookingCommandService {

    @WebServiceRef(wsdlLocation = "http://localhost:7001/hotelMTA/BookingWSB?wsdl")
    @Transactional(version = Version.WSAT12, value = TransactionFlowType.MANDATORY)
    private BookingWSB_Service bookingService;


    @Override
    public BookingDTO getBookingWithLockMode(long bookingId) {
        BookingSOAP bookingSOAP = (BookingSOAP) this.bookingService.getBookingWSBPort().searchBooking(bookingId)
                .getData();
        return BookingMapper.INSTANCE.fromSOAPToDTO(bookingSOAP);
    }

    @Override
    public BookingDTO makeBooking(MakeBookingReservationDTO booking, UserDTO userDTO) {
        BookingSOAP bookingSOAP = (BookingSOAP) this.bookingService.getBookingWSBPort()
                .makeBooking(BookingMapper.INSTANCE.fromMakeDTOToRequestSOAP(booking), UserMapper.INSTANCE.fromDTOToSOAP(userDTO)).getData();
        return BookingMapper.INSTANCE.fromSOAPToDTO(bookingSOAP);
    }

    @Override
    public BookingDTO modifyBooking(ModifyBookingReservationDTO booking) {
        BookingSOAP bookingSOAP = (BookingSOAP) this.bookingService.getBookingWSBPort()
                .modifyBooking(BookingMapper.INSTANCE.fromModifyDTOToRequestSOAP(booking))
                .getData();
        return BookingMapper.INSTANCE.fromSOAPToDTO(bookingSOAP);
    }

    @Override
    public double cancelBooking(long bookingId) {
        return (double) this.bookingService.getBookingWSBPort().cancelBooking(bookingId).getData();
    }

    @Override
    public double cancelBookingLine(long bookingId, long roomId) {
        return (double) this.bookingService.getBookingWSBPort().cancelBookingLine(bookingId, roomId).getData();
    }

}
