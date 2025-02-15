package soap;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import business.user.UserDTO;
import business.user.UserService;
import common.consts.WebMethodConsts;
import common.dto.UserLoginSOAP;
import common.dto.UserRegisterSOAP;
import common.exceptions.SAException;
import weblogic.wsee.wstx.wsat.Transactional;

@WebService(serviceName = "UserWS")
public class UserWS {

    private final UserService userService;

    @Inject
    public UserWS(final UserService userService) {
        this.userService = userService;
    }

    @WebMethod(operationName = WebMethodConsts.OP_USER_REGISTRATION)
    @Transactional
    public long createUser(@WebParam(name = "user") UserRegisterSOAP user) throws SAException {
        return this.userService.createUser(user);
    }
    
    @WebMethod(operationName = WebMethodConsts.OP_USER_LOGIN)
    @Transactional
    public UserDTO loginUser(@WebParam(name = "user") UserLoginSOAP user) throws SAException {
        return this.userService.loginUser(user);
    }

    @WebMethod(operationName = WebMethodConsts.OP_SEARCH_USER)
    @Transactional
    public UserDTO readUser(@WebParam(name = "user") UserLoginSOAP user) throws SAException {
        return this.userService.readUser(user);
    }
}
