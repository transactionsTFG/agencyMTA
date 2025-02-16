package business.hotel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoomDTO {
    private int id;
    private int number;
    private int peopleNumber;
    private boolean occupied;
    private boolean singleBed;
    private boolean active;
}
