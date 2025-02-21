package business.externalservices.agencygateway.query;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.ejb.Stateless;
import javax.inject.Inject;

import business.externalservices.airlinemta.flight.query.FlightAirlineQueryService;
import business.externalservices.hotelmta.room.query.HotelRoomQueryService;
import common.dto.services.FlightHotelDTO;
import common.dto.services.FlightListDTO;
import common.dto.services.RoomListDTO;

@Stateless
public class GatewayAgenyQueryServiceImpl implements GatewayAgencyQueryService {

    private HotelRoomQueryService hotelRoomQueryService;
    private FlightAirlineQueryService flightQueryService;

    public GatewayAgenyQueryServiceImpl() {}

    @Inject
    public GatewayAgenyQueryServiceImpl(final HotelRoomQueryService hotelRoomQueryService, final FlightAirlineQueryService flightQueryService) {
        this.hotelRoomQueryService = hotelRoomQueryService;
        this.flightQueryService = flightQueryService;
    }

    @Override
    public Map<String, FlightHotelDTO> getFlightAndHotels(String countryOrigin, String countryDestination, String dateFrom) {
        List<RoomListDTO> roomList = this.hotelRoomQueryService.getRooms(null, countryDestination);
        List<FlightListDTO> flightList = this.flightQueryService.getFlights(countryOrigin, countryDestination, null, null, dateFrom);
        Map<String, List<RoomListDTO>> hotelsByCountry = roomList.stream()
                                                                    .collect(Collectors.groupingBy(RoomListDTO::getCountryName));
        Map<String, List<FlightListDTO>> flightsByCountry = flightList.stream()
                                                                    .collect(Collectors.groupingBy(FlightListDTO::getCountryDestination));
        return flightsByCountry.entrySet().stream()
                                .filter(entry -> hotelsByCountry.containsKey(entry.getKey())) 
                                .collect(
                                    Collectors.toMap(Map.Entry::getKey, entry -> new FlightHotelDTO(entry.getValue(), hotelsByCountry.get(entry.getKey())))
                                );
    }
    
}
