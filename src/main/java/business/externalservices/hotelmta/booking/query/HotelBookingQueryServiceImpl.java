package business.externalservices.hotelmta.booking.query;

import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

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
    public BookingSOAP readBooking(int bookingId) {
        return (BookingSOAP) this.bookingService.getBookingWSBPort().searchBooking(bookingId).getData();
    }

}
