package common.dto.services;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IdFlightWithSeatsDTO {
    private long idFlightInstance;
    private int seats;    
}
