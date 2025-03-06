package common.dto.soap.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IdFlightInstanceWithSeatsSOAP {
    private long idFlightInstance;
    private int seats;
}
