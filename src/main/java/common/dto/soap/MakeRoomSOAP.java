package common.dto.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "MakeRoomSOAP")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
public class MakeRoomSOAP {
    @XmlElement
    private int number;
    @XmlElement
    private int peopleNumber;
    @XmlElement
    private boolean singleBed;
}
