package business.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    private long id;
    private String type; 
    private String name;
    private String surname;
    private String email;
    private boolean active;
    private String born;
    private String phone;
}
