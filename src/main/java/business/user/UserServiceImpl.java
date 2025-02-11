package business.user;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.apache.openjpa.util.UserException;

import common.dto.UserLoginSOAP;
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

    @Override
    public UserDTO loginUser(UserLoginSOAP userLogin) {
        TypedQuery<User> query = this.em.createNamedQuery("business.user.User.findByEmail", User.class);
        query.setParameter("email", userLogin.getEmail());
        List<User> resultList = query.getResultList();
        User user = resultList.isEmpty() ? null : resultList.get(0);
        if (user == null || (user.getPassword().equals(userLogin.getPassword()))) 
            throw new UserException("Usuario no encontrado");
        return user.toDTO();
    }

}
