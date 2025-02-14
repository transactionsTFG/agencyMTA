package business.hotel;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

import common.dto.MakeBookingSOAP;
import common.dto.MakeRoomSOAP;
import soapclient.hotel.room.BookingSOAP;
import soapclient.hotel.room.RoomSOAP;
import soapclient.hotel.room.RoomWSB_Service;
import soapclient.hotel.booking.RoomDTO;
import soapclient.hotel.booking.BookingWSB_Service;
import soapclient.hotel.booking.BookingDTO;
import weblogic.wsee.wstx.wsat.Transactional;
import weblogic.wsee.wstx.wsat.Transactional.TransactionFlowType;
import weblogic.wsee.wstx.wsat.Transactional.Version;

import common.exceptions.RoomException;

@Stateless
public class RoomServiceImpl implements RoomService {

    @WebServiceRef(wsdlLocation = "http://localhost:7001/hotelMTA/RoomWSB?wsdl")
    @Transactional(version = Version.WSAT12, value = TransactionFlowType.MANDATORY)
    private RoomWSB_Service roomService;

    @WebServiceRef(wsdlLocation = "http://localhost:7001/hotelMTA/BookingWSB?wsdl")
    @Transactional(version = Version.WSAT12, value = TransactionFlowType.MANDATORY)
    private BookingWSB_Service bookingService;

    @Override
    public RoomSOAP getRoom(int number) {
        return (RoomSOAP) this.roomService.getRoomWSBPort().searchRoom(number).getData();
    }

    @Override
    public BookingSOAP makeBooking(MakeBookingSOAP booking, List<MakeRoomSOAP> rooms) {

        List<RoomDTO> roomsDTO = new ArrayList<RoomDTO>();

        for (MakeRoomSOAP r : rooms) {
            RoomSOAP roomSOAP =  this.getRoom(r.getNumber());
            if (roomSOAP.isOccupied()) {
                throw new RoomException("La habitación " + r.getNumber() + " está ocupada para la fecha " + booking.getDate());
            }
            if (!roomSOAP.isActive()) {
                throw new RoomException("La habitación " + r.getNumber() + " no está disponible para la fecha " + booking.getDate());
            }
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
    }


}
