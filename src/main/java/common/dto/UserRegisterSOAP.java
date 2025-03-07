package common.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "UserRegisterSOAP")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
public class UserRegisterSOAP {
    @XmlElement
    private String name;

    @XmlElement
    private String surname;

    @XmlElement
    private String email;

    @XmlElement
    private String password;

    @XmlElement
    private String born;

    @XmlElement
    private String phone;

    @XmlElement
    private int idTypeUser;

}
