package common.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import common.dto.services.IdFlightWithSeatsDTO;
import soapclient.airline.reservation.IdFlightInstanceWithSeatsDTO;

@Mapper
public interface ReservationMapper {
    ReservationMapper INSTANCE = Mappers.getMapper(ReservationMapper.class);
    IdFlightInstanceWithSeatsDTO toEntity(IdFlightWithSeatsDTO dto);
}

