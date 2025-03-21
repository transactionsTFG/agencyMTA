package business.travel;

import business.user.User;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrePersist;
import javax.persistence.Version;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@NamedQueries({
    @NamedQuery(name = "business.travel.Travel.findTravelByIdUser", query = "SELECT t FROM Travel t where t.user.id = :idUser"),
    @NamedQuery(name = "business.travel.Travel.findTravelByHotelReservationID", query = "SELECT t FROM Travel t where t.hotelReservationID = :hotelReservationID AND t.active = true"),
    @NamedQuery(name = "business.travel.Travel.findTravelByFlightReservation", query = "SELECT t FROM Travel t where t.flightReservationID = :flightReservationID AND t.active = true"),
    @NamedQuery(name = "business.travel.Travel.findTravelByFlightReservationAndHotelId", query = "SELECT t FROM Travel t where t.flightReservationID = :flightReservationID AND t.hotelReservationID = :hotelReservationID AND t.active = true")

})
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
    @Column(nullable = false) 
    private LocalDateTime dateCreation;
    @Version
    private int version;

    @PrePersist
    public void prePersist() {
        this.dateCreation = LocalDateTime.now();
    }
    
    public Travel(TravelDTO dto){
        this.id = dto.getId();
        this.user = new User();
        this.user.setId(dto.getUserId());  
        this.date = dto.getDate();
        this.returnDate = dto.getReturnDate();
        this.passengerCounter = dto.getPassengerCounter();
        this.cost = dto.getCost();
        this.status = dto.getStatus();
        this.flightReservationID = dto.getFlightReservationID();
        this.hotelReservationID = dto.getHotelReservationID();
        this.flightCost = dto.getFlightCost();
        this.hotelCost = dto.getHotelCost();
        this.active = dto.isActive();
    }

    public TravelDTO toDTO(){
        return TravelDTO.builder()
            .id(this.id)
            .dateCreation(this.dateCreation)
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
