package soap;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import business.user.UserDTO;
import business.user.UserService;
import common.consts.WebMethodConsts;
import common.dto.UserRegisterSOAP;
import common.exceptions.SAException;
import soapclient.airline.flight.FlightSOAP;
import weblogic.wsee.wstx.wsat.Transactional;

@WebService(serviceName = "UserWS")
public class UserWS {

    private final UserService userService;

    @Inject
    public UserWS(final UserService userService) {
        this.userService = userService;
    }

    @WebMethod(operationName = "REGISTER_USER")
    @Transactional
    public long createUser(@WebParam(name = "user") UserRegisterSOAP user) throws SAException {
        return this.userService.createUser(user);
    }
}
