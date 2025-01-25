package business.type;

import java.io.Serializable;
import java.util.Set;

import business.user.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 
@Entity
@Getter
@Setter
@NoArgsConstructor
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
   public TypeDTO toDTO() {
      return TypeDTO.builder()
              .id(this.id)
              .name(this.name)
              .build();
   }
 }