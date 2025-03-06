package business.services.agency.user;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import javax.persistence.TypedQuery;

import com.tangosol.internal.sleepycat.je.LockMode;

import business.user.User;
import business.user.UserDTO;
import common.dto.UserLoginSOAP;
import common.dto.UserRegisterSOAP;
import common.exceptions.UserException;

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
        if (user == null || !(user.getPassword().equals(userLogin.getPassword()))) 
            throw new UserException("Usuario no encontrado");
        return user.toDTO();
    }

    @Override
    public UserDTO readUser(UserLoginSOAP userLogin) {
        TypedQuery<User> query = this.em.createNamedQuery("business.user.User.findByEmail", User.class);
        query.setParameter("email", userLogin.getEmail());
        List<User> resultList = query.getResultList();
        User user = resultList.isEmpty() ? null : resultList.get(0);
        if (user == null) 
            throw new UserException("Usuario no encontrado");
        return user.toDTO();
    }

    @Override
    public UserDTO readUserById(long id) {
        User u = this.em.find(User.class, id, LockModeType.OPTIMISTIC);
        if (u == null) 
            throw new UserException("Usuario no encontrado");
        return u.toDTO();
    }

}
