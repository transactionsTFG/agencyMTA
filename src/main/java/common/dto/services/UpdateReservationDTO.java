package common.dto.services;

import java.util.List;

import business.booking.BookingDTO;
import lombok.Data;

@Data
public class UpdateReservationDTO {
    private long id;
    private String date;
    private double total;
    private long idCustomer;
    private boolean active;
    private double updatePrice;
    private List<UpdatePriceReservationDTO> updatePriceReservationDTO;
    private BookingDTO bookingDTO;
}
