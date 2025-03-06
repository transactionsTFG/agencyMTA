package business.services.agency.user;

import business.user.UserDTO;
import common.dto.UserLoginSOAP;
import common.dto.UserRegisterSOAP;

public interface UserService {
    public long createUser(UserRegisterSOAP user);
    public UserDTO loginUser(UserLoginSOAP user);
    public UserDTO readUser(UserLoginSOAP user);
    UserDTO readUserById(long id);
}
