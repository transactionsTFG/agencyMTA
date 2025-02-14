package business.hotel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Version;

@Entity
@NamedQueries({
        @NamedQuery(name = "business.room.Room.findByNumber", query = "SELECT r FROM Room r WHERE r.number = :number"),
})
public class Room implements Serializable {
    private static final long serialVersionUID = 0;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private int number;
    @Column(nullable = false)
    private int peopleNumber;
    @Column(nullable = false)
    private boolean occupied;
    @Column(nullable = false)
    private boolean singleBed;
    @Column(nullable = false)
    private boolean active;
    // @ManyToMany()
    // private List<Booking> bookings;
    @Version
    private int version;

    public RoomDTO toDTO() {
        return RoomDTO.builder()
        .id(this.id)
        .number(this.number)
        .peopleNumber(this.peopleNumber)
        .occupied(this.occupied)
        .singleBed(this.singleBed)
        .active(this.active)
        .build();
    }
}
