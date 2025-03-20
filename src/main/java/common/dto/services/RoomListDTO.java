package common.dto.services;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import soapclient.hotel.room.RoomParamsDTO;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoomListDTO {
    private long id;
    private int number;
    private boolean occupied;
    private boolean singleBed;
    private boolean active;
    private int peopleNumber;
    private String hotelName;
    private String countryName;
    private double dailyPrice;

    public static RoomListDTO fromRoomParamsDTO(RoomParamsDTO roomParamsDTO) {
        return RoomListDTO.builder()
                .id(roomParamsDTO.getId())
                .number(roomParamsDTO.getNumber())
                .singleBed(roomParamsDTO.isSingleBed())
                .active(roomParamsDTO.isAvailable())
                .peopleNumber(roomParamsDTO.getPeopleNumber())
                .hotelName(roomParamsDTO.getHotelName())
                .countryName(roomParamsDTO.getCountryName())
                .dailyPrice(roomParamsDTO.getDailyPrice())
                .build();
    }
}
