package common.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import business.user.UserDTO;
import soapclient.hotel.booking.UserSOAP;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserSOAP fromDTOToSOAP(UserDTO userDTO);
}
