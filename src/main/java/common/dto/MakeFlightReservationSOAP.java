package common.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "MakeFlightReservationSOAP")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
public class MakeFlightReservationSOAP {
    @XmlElement
    private String date;
    @XmlElement
    private long customerId;
    @XmlElement
    private double total;
    @XmlElement
    private long flightId;
    @XmlElement
    private int numberOfSeats;
    @XmlElement
    private String customerEmail;

}
