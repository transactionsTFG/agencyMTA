package business.travel;

import business.user.User;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Version;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@ManyToOne(optional = false)
	private User user;
    @Column(nullable = false)
	private String date;
    @Column(nullable = false)
	private String returnDate;
    @Column(nullable = false)
	private int passengerCounter;
    @Column(nullable = false)
	private double cost;
    @Column(nullable = false)
	private String status;
	private long flightReservationID;
	private long hotelReservationID;
	private double flightCost;
	private double hotelCost;
    private boolean active;
    @Version
    private int version;
    public TravelDTO toDTO(){
        return TravelDTO.builder()
            .id(this.id)
            .userId(this.user.getId())
            .date(this.date)
            .returnDate(this.returnDate)
            .passengerCounter(this.passengerCounter)
            .cost(this.cost)
            .status(this.status)
            .flightReservationID(this.flightReservationID)
            .hotelReservationID(this.hotelReservationID)
            .flightCost(this.flightCost)
            .hotelCost(this.hotelCost)
            .active(this.active)
            .build();
    }
}
