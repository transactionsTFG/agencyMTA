package business.services.externalservices.hotelmta.booking.query;

import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

import business.booking.BookingDTO;
import common.mapper.BookingMapper;
import soapclient.hotel.booking.BookingSOAP;
import soapclient.hotel.booking.BookingWSB_Service;
import weblogic.wsee.wstx.wsat.Transactional;
import weblogic.wsee.wstx.wsat.Transactional.TransactionFlowType;
import weblogic.wsee.wstx.wsat.Transactional.Version;

@Stateless
public class HotelBookingQueryServiceImpl implements HotelBookingQueryService {

    @WebServiceRef(wsdlLocation = "http://localhost:7001/hotelMTA/BookingWSB?wsdl")
    @Transactional(version = Version.WSAT12, value = TransactionFlowType.MANDATORY)
    private BookingWSB_Service bookingService;

    @Override
    public BookingDTO readBooking(int bookingId) {
        BookingSOAP bookingSOAP = (BookingSOAP) this.bookingService.getBookingWSBPort().searchBooking(bookingId)
                .getData();
        return BookingMapper.INSTANCE.fromSOAPToDTO(bookingSOAP);
    }

}
