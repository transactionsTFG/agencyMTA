package business.room;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import common.exceptions.RoomException;

@Stateless
public class RoomServiceImpl implements RoomService {

    private EntityManager em;

    public RoomServiceImpl() {}
    
    @Inject
    public RoomServiceImpl(EntityManager em) {
        this.em = em;
    }
    @Override
    public RoomDTO searchRoom(int number) {
        TypedQuery<Room> query = this.em.createNamedQuery("business.room.Room.findByNumber", Room.class);
        query.setParameter("number", number);
        List<Room> resultList = query.getResultList();
        Room room = resultList.isEmpty() ? null : resultList.get(0);
        if (room == null) {
            throw new RoomException("Habitación no encontrada");
        } 
        return room.toDTO();
    }
}
