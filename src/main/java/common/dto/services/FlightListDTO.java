package common.dto.services;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import soapclient.airline.flight.FlightDataListSOAP;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlightListDTO {
    private long id;
    private String arrivalTime;
    private String departureTime;
    private String cityDestination;
    private String countryOrigin;
    private String countryDestination;
    private String weekDay;

    // Método de mapeo desde FlightDataListSOAP a FlightListDTO
    public static FlightListDTO fromFlightDataListSOAP(FlightDataListSOAP flightData) {
        return FlightListDTO.builder()
                .id(flightData.getId())
                .arrivalTime(flightData.getArrivalDate().toString())
                .departureTime(flightData.getDepartureDate().toString())
                .cityDestination(flightData.getCityDestination())
                .countryOrigin(flightData.getCountryOrigin())
                .countryDestination(flightData.getCountryDestination())
                .weekDay(flightData.getWeekDay())
                .build();
    }
}
