package common.dto.services;

import lombok.Data;

@Data
public class UpdatePriceReservationDTO {
    private long idFlightInstance;
    private double price;    
}
