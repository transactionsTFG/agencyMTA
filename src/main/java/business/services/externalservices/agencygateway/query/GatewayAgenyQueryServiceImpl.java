package business.services.externalservices.agencygateway.query;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.ejb.Stateless;
import javax.inject.Inject;

import business.services.externalservices.airlinemta.flight.query.FlightAirlineQueryService;
import business.services.externalservices.hotelmta.room.query.HotelRoomQueryService;
import common.dto.services.FlightHotelDTO;
import common.dto.services.FlightListDTO;
import common.dto.services.RoomListDTO;
import common.dto.soap.request.SearchAirlineHotelRequestSOAP;

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
    public Map<String, FlightHotelDTO> getFlightAndHotels(final SearchAirlineHotelRequestSOAP param) {
        List<RoomListDTO> roomList = this.hotelRoomQueryService.getRooms(param.getHotelName(), param.getCountryDestination());
        List<FlightListDTO> flightList = this.flightQueryService.getFlights(param.getCountryOrigin(), param.getCountryDestination(), param.getCityOrigin(), param.getCityDestination(), param.getDateFrom());
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
