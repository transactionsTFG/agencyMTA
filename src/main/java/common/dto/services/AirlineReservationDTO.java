package common.dto.services;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import soapclient.airline.reservation.ReservationSOAP;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AirlineReservationDTO {
    private long id;
    private String date;
    private double total;
    private long idCustomer;
    private boolean active;
    public static AirlineReservationDTO toDTO(ReservationSOAP soap) {
        return AirlineReservationDTO.builder()
                .id(soap.getId())
                .date(soap.getDate())
                .total(soap.getTotal())
                .idCustomer(soap.getIdCustomer())
                .active(soap.isActive())
                .build();
    }
}
