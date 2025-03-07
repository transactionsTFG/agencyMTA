package common.mapper;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import common.dto.services.AirlineReservationDTO;
import common.dto.services.IdFlightWithSeatsDTO;
import common.dto.services.ReservationDTO;
import common.dto.services.StatusFlightDTO;
import common.dto.services.UpdateReservationDTO;
import soapclient.airline.reservation.IdFlightInstanceWithSeatsDTO;
import soapclient.airline.reservation.NewReservationSOAP;
import soapclient.airline.reservation.ReservationSOAP;
import soapclient.airline.reservation.StatusFlightSOAP;
import soapclient.airline.reservation.UpdateReservationSOAP;

@Mapper
public interface ReservationMapper {
    ReservationMapper INSTANCE = Mappers.getMapper(ReservationMapper.class);
    
    IdFlightInstanceWithSeatsDTO toEntity(IdFlightWithSeatsDTO dto);

    @Mapping(target = "updatePriceReservationDTO", source = "updatePriceReservationSOAP")
    UpdateReservationDTO toUpdateReservationDTO(UpdateReservationSOAP soap);

    @Mapping(target = "statusFlightsDTO", source = "statusFlights.statusFlightSOAP")
    AirlineReservationDTO newReservationToDTO(NewReservationSOAP soap);

    ReservationDTO toReservationDTO(ReservationSOAP soap);

    default List<StatusFlightDTO> mapStatusFlights(NewReservationSOAP.StatusFlights statusFlights) {
        if (statusFlights == null || statusFlights.getStatusFlightSOAP() == null) 
            return new ArrayList<>();
        
        List<StatusFlightDTO> dtoList = new ArrayList<>();
        for (StatusFlightSOAP soapFlight : statusFlights.getStatusFlightSOAP()) 
            dtoList.add(StatusFlightDTO.builder().returnDate(soapFlight.getReturnDate()).seats(soapFlight.getSeats()).status(soapFlight.getStatus()).price(soapFlight.getPrice()).build());
        
        return dtoList;
    }

}

