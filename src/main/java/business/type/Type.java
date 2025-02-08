package business.type;

import java.io.Serializable;
import java.util.Set;

import business.user.User;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 
@Entity
public class Type implements Serializable {
   private static final long serialVersionUID = 0;
 
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   @OneToMany(mappedBy = "type")
   private Set<User> user;
   @Column(nullable = false, unique = true)
   private String name;
   @Version
   private int version;
    // Constructor vacío (necesario para JPA)
    public Type() {}

    // Getters y Setters
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public Set<User> getUser() {
        return user;
    }
 
    public void setUser(Set<User> user) {
        this.user = user;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getVersion() {
        return version;
    }
 
    public void setVersion(int version) {
        this.version = version;
    }

   public TypeDTO toDTO() {
      return TypeDTO.builder()
              .id(this.id)
              .name(this.name)
              .build();
   }
 }