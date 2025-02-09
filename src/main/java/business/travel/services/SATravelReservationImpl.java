package business.travel.services;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.LockModeType;

import business.travel.Travel;
import business.travel.TravelDTO;
import common.exceptions.TravelException;

@Stateless
public class SATravelReservationImpl implements SATravelReservation {

    private EntityManager em;

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
    
}
