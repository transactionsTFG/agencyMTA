package common.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import business.user.UserDTO;
import soapclient.hotel.booking.UserSOAP;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "dni", target = "dni")
    UserSOAP fromDTOToSOAP(UserDTO userDTO, String dni);
}
