package common.dto.services;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StatusFlightDTO {
    private String status;
    private String returnDate;
    private int seats;
    private double price;
}
