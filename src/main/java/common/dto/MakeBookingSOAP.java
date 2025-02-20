package common.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "MakeBookingSOAP")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
public class MakeBookingSOAP {
    @XmlElement
    private String date;
    @XmlElement
    private int numberOfNights;
    @XmlElement
    private boolean withBreakfast;
    @XmlElement
    private String agencyName;
    @XmlElement
    private int peopleNumber;
    @XmlElement
    private int customerId;
    @XmlElementWrapper(name = "roomsNumber")
    @XmlElement(name = "room")
    private List<Integer> roomsNumber;

}
