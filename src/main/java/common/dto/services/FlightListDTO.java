package common.dto.services;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import soapclient.airline.flight.FlightDataListSOAP;
import org.w3c.dom.Element;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlightListDTO {
    private long id;
    private String arrivalDate;
    private String departureDate;
    private String cityDestination;
    private String countryOrigin;
    private String countryDestination;
    private String weekDay;
    private double price;

    public static FlightListDTO fromFlightDataListSOAP(FlightDataListSOAP flightData) {
        String arrivalDateTxt = null;
        String departureDateTxt = null;
        if(flightData.getArrivalDate() instanceof Element arrivalDate)
            arrivalDateTxt = arrivalDate.getTextContent();
        
        if (flightData.getDepartureDate() instanceof Element departureDate) 
            departureDateTxt = departureDate.getTextContent();

        return FlightListDTO.builder()
                .id(flightData.getId())
                .arrivalDate(arrivalDateTxt)
                .departureDate(departureDateTxt)
                .cityDestination(flightData.getCityDestination())
                .countryOrigin(flightData.getCountryOrigin())
                .countryDestination(flightData.getCountryDestination())
                .weekDay(flightData.getWeekDay())
                .price(flightData.getPrice())
                .build();
    }
}
