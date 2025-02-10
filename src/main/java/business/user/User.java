package business.user;

import java.io.Serializable;
import java.util.Set;

import business.travel.Travel;
import business.type.Type;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import common.dto.UserRegisterSOAP;

@Entity
@Getter
@Setter
@NoArgsConstructor
@NamedQueries({
    @NamedQuery(name = "findByEmail", query = "SELECT u FROM User u WHERE u.email = :email")
})
public class User implements Serializable {
	private static final long serialVersionUID = 0;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne(optional = false)
	private Type type;
	@OneToMany(mappedBy = "user")
	private Set<Travel> travel;
    @Column(nullable = false)
	private String name;
    @Column(nullable = false)
	private String surname;
    @Column(nullable = false, unique = true)
	private String email;
    @Column(nullable = false)
	private String password;
    @Column(nullable = false)
	private boolean active;
    @Column(nullable = false)
	private String passport;
    @Column(nullable = false)
	private String born;
	@Version
	private int version;

    public User(UserRegisterSOAP user) {
        this.name = user.getName();
        this.surname = user.getSurname();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.active = true;
        this.passport = user.getPassport();
        this.born = user.getBorn();
    }

	public UserDTO toDTO(){
		return UserDTO.builder()
		.id(this.id)
		.type(this.type.getName())
		.name(this.name)
		.surname(this.surname)
		.email(this.email)
		.active(this.active)
		.passport(this.passport)
		.born(this.born)
		.build();
	}
}
