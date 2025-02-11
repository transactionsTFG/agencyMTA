package business.user;

import common.dto.UserLoginSOAP;
import common.dto.UserRegisterSOAP;

public interface UserService {
    public long createUser(UserRegisterSOAP user);
    public UserDTO loginUser(UserLoginSOAP user);
}
