package business.travel.services;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import javax.xml.ws.WebServiceRef;

import business.travel.Travel;
import business.travel.TravelDTO;
import common.exceptions.TravelException;
import soapclient.airline.reservation.ReservationWS_Service;
import weblogic.wsee.wstx.wsat.Transactional;
import weblogic.wsee.wstx.wsat.Transactional.TransactionFlowType;
import weblogic.wsee.wstx.wsat.Transactional.Version;

@Stateless
public class SATravelReservationImpl implements SATravelReservation {

    private EntityManager em;

    @WebServiceRef(wsdlLocation = "http://localhost:8001/airlineMTA/ReservationWS?wsdl")
    @Transactional(version = Version.WSAT12, value = TransactionFlowType.MANDATORY)
    private ReservationWS_Service reservationService;


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
    public boolean cancel(int idTravel, int idFlight, long idHotel) {
        if (idHotel != -1) {
            String x = "a";
        }

        throw new UnsupportedOperationException("Unimplemented method 'cancel'");
    }
    
}
