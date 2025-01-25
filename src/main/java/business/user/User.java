package business.user;

import java.io.Serializable;
import java.util.Set;

import business.travel.Travel;
import business.type.Type;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
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
