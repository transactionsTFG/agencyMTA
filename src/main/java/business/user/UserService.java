package business.user;

import common.dto.UserRegisterSOAP;

public interface UserService {
    public long createUser(UserRegisterSOAP user);
}
