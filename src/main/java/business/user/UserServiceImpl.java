package business.user;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import common.dto.UserRegisterSOAP;

@Stateless
public class UserServiceImpl implements UserService {

    private EntityManager em;

    public UserServiceImpl() {
    }

    @Inject
    public UserServiceImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public long createUser(UserRegisterSOAP userRegister) {

        User user = new User(userRegister);
        this.em.persist(user);
        this.em.flush();
        return user.getId();
    }

}
