package business.hotel;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

import common.dto.MakeBookingSOAP;
import common.dto.MakeRoomSOAP;
import soapclient.hotel.booking.BookingDTO;
import soapclient.hotel.booking.RoomDTO;
import soapclient.hotel.booking.BookingWSB_Service;
import soapclient.hotel.booking.BookingSOAP;
import weblogic.wsee.wstx.wsat.Transactional;
import weblogic.wsee.wstx.wsat.Transactional.TransactionFlowType;
import weblogic.wsee.wstx.wsat.Transactional.Version;

@Stateless
public class BookingServiceImpl implements BookingService {

    @WebServiceRef(wsdlLocation = "http://localhost:7001/hotelMTA/BookingWSB?wsdl")
    @Transactional(version = Version.WSAT12, value = TransactionFlowType.MANDATORY)
    private BookingWSB_Service bookingService;

    @Override
    public BookingSOAP makeBooking(MakeBookingSOAP booking, List<MakeRoomSOAP> rooms) {

        List<RoomDTO> roomsDTO = new ArrayList<RoomDTO>();

        for (MakeRoomSOAP r : rooms) {
            RoomDTO roomDTO = new RoomDTO();
            roomDTO.setNumber(r.getNumber());
            roomDTO.setPeopleNumber(r.getPeopleNumber());
            roomDTO.setSingleBed(r.isSingleBed());
            roomsDTO.add(roomDTO);
        }

        BookingDTO bookingDTO = new BookingDTO();
        bookingDTO.setDate(booking.getDate());
        bookingDTO.setNumberOfNights(booking.getNumberOfNights());
        bookingDTO.setWithBreakfast(booking.isWithBreakfast());
        bookingDTO.setAgencyName(booking.getAgencyName());
        bookingDTO.setPeopleNumber(booking.getPeopleNumber());
        bookingDTO.setCustomerId(booking.getCustomerId());
        return (BookingSOAP) this.bookingService.getBookingWSBPort().makeBooking(bookingDTO, roomsDTO).getData();
        // return (BookingSOAP)
        // this.bookingService.getBookingWSBPort().makeBooking(bookingDTO,
        // roomsDTO).getData();
    }

    @Override
    public BookingSOAP readBooking(int bookingId) {
        return (BookingSOAP) this.bookingService.getBookingWSBPort().searchBooking(bookingId).getData();
    }
}
