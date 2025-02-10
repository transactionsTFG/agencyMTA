package business.travel.services;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import javax.xml.ws.WebServiceRef;

import business.travel.Travel;
import business.travel.TravelDTO;
import common.exceptions.TravelException;
import soapclient.airline.reservation.ReservationSOAP;
import soapclient.airline.reservation.ReservationWS_Service;
import soapclient.airline.reservation.SoapResponse;
import soapclient.hotel.booking.BookingWSB_Service;
import weblogic.wsee.wstx.wsat.Transactional;
import weblogic.wsee.wstx.wsat.Transactional.TransactionFlowType;
import weblogic.wsee.wstx.wsat.Transactional.Version;

@Stateless
public class SATravelReservationImpl implements SATravelReservation {

    private EntityManager em;

    @WebServiceRef(wsdlLocation = "http://localhost:8001/airlineMTA/ReservationWS?wsdl")
    @Transactional(version = Version.WSAT12, value = TransactionFlowType.MANDATORY)
    private ReservationWS_Service reservationService;

    @WebServiceRef(wsdlLocation = "http://localhost:7001/hotelMTA/BookingWSB?wsdl")
    @Transactional(version = Version.WSAT12, value = TransactionFlowType.MANDATORY)
    private BookingWSB_Service bookingService;

    public SATravelReservationImpl(){}
    
    @Inject
    public SATravelReservationImpl(EntityManager em){
        this.em = em;
    }

    @Override
    public TravelDTO get(long id) {
        Travel t = this.em.find(Travel.class, id, LockModeType.OPTIMISTIC);
        if (t == null) 
            throw new TravelException("Reserva no encontrada");
        return t.toDTO();
    }

    @Override
    public boolean cancel(long idTravel, long idFlight, final long idFlightInstance, int idHotel) {
        Travel t = this.em.find(Travel.class, idTravel, LockModeType.OPTIMISTIC);
        if (t == null) 
            throw new TravelException("Viaje no encontrado");

        if (t.getHotelReservationID() != -1) 
            this.bookingService.getBookingWSBPort().cancelBooking(idHotel);

        SoapResponse sResponse = this.reservationService.getReservationWSPort().searchReservation(t.getFlightReservationID()); //TODO: Devolver flightInstance tambien
        final ReservationSOAP reservation = (ReservationSOAP) sResponse.getData();
        
        this.reservationService.getReservationWSPort().cancelReservation(t.getFlightReservationID(), 0);
        this.em.remove(bookingService);
        return true;
    }
    
}
