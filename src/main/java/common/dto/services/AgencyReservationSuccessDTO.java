package common.dto.services;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AgencyReservationSuccessDTO {
    private long idUser;
    private long idReservation;
    private String dateReservation;
    private double totalReservation;
    private long idCustomer;
    private boolean active;

    public AgencyReservationSuccessDTO(final long idUser, AirlineReservationDTO airlineReservationDTO){
        this.idUser = idUser;
        this.idReservation = airlineReservationDTO.getId();
        this.dateReservation = airlineReservationDTO.getDate();
        this.totalReservation = airlineReservationDTO.getTotal();
        this.idCustomer = airlineReservationDTO.getIdCustomer();
        this.active = airlineReservationDTO.isActive();
    }
}
