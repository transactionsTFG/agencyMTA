package business.services.agency.travel;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.LockModeType;

import business.travel.Travel;
import business.travel.TravelDTO;
import common.exceptions.TravelException;

@Stateless
public class AgencyTravelServiceImpl implements AgencyTravelService{
    private EntityManager em;

    public AgencyTravelServiceImpl(){}

    @Inject
    public AgencyTravelServiceImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public TravelDTO findWithOptimisticLockById(long id) {
        Travel t = this.em.find(Travel.class, id, LockModeType.OPTIMISTIC);
        if (t == null) 
            throw new TravelException("Reserva no encontrada");
        return t.toDTO();
    }

    @Override
    public TravelDTO makeTravel(TravelDTO travel) {
        Travel t = new Travel(travel); 
        this.em.persist(t);
        this.em.flush();
        return t.toDTO();
    }

    @Override
    public TravelDTO modifyTravel(TravelDTO travel) {
        Travel t = this.em.find(Travel.class, travel.getId(), LockModeType.OPTIMISTIC);
        if (t == null) 
            throw new TravelException("Reserva no encontrada");
        t.setActive(travel.isActive());
        t.setCost(travel.getCost());
        t.setHotelReservationID(travel.getHotelReservationID());
        t.setFlightReservationID(travel.getFlightReservationID());   
        t.setFlightCost(travel.getFlightCost());
        t.setHotelCost(travel.getHotelCost());
        t.setPassengerCounter(travel.getPassengerCounter());
        t.setReturnDate(travel.getReturnDate());
        t.setStatus(travel.getStatus());
        t.getUser().setId(travel.getUserId());
        t.setDate(travel.getDate());
        this.em.merge(t);
        return t.toDTO();
    }

    @Override
    public boolean cancelTravel(long idTravel) {
        Travel t = this.em.find(Travel.class, idTravel, LockModeType.OPTIMISTIC);
        if (t == null) 
            throw new TravelException("Viaje no encontrado");
        t.setActive(false);
        this.em.merge(t);
        return true;
    }

    @Override
    public List<TravelDTO> findTravelByIdUser(final long idUser) {
        return this.em.createNamedQuery("business.travel.Travel.findTravelByIdUser", Travel.class)
                .setParameter("idUser", idUser)
                .getResultList()
                .stream()
                .map(Travel::toDTO)
                .toList();
    }

    @Override
    public List<TravelDTO> findTravelByIdReservationFlight(final long idReservationFlight) {
        return this.em.createNamedQuery("business.travel.Travel.findTravelByFlightReservation", Travel.class)
                .setParameter("flightReservationID", idReservationFlight)
                .getResultList()
                .stream()
                .map(Travel::toDTO)
                .toList();
    }

    @Override
    public TravelDTO findTravelByIdReservationHotel(long idReservationHotel) {
        return this.em.createNamedQuery("business.travel.Travel.findTravelByHotelReservationID", Travel.class)
            .setParameter("hotelReservationID", idReservationHotel)
            .getSingleResult()
            .toDTO();
    }

    @Override
    public List<TravelDTO> findTravelByIdReservationFlightAndHotel(long idReservationFlight, long idReservationHotel) {
        return this.em.createNamedQuery("business.travel.Travel.findTravelByFlightReservationAndHotelId", Travel.class)
                .setParameter("flightReservationID", idReservationFlight).setParameter("hotelReservationID", idReservationHotel)
                .getResultList()
                .stream()
                .map(Travel::toDTO)
                .toList();
    }
    
}
