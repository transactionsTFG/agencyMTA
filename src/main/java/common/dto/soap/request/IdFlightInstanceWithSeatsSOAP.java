package common.dto.soap.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IdFlightInstanceWithSeatsSOAP {
    private long idFlightInstance;
    private int seats;
}
