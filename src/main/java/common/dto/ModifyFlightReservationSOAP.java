package common.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "ModifyFlightReservationSOAP")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
public class ModifyFlightReservationSOAP {

    @XmlElement
    private long flightReservationId;
    @XmlElement
    private String date;
    @XmlElement
    private long customerId;
    @XmlElement
    private double total;
    @XmlElement
    private long flightInstanceId;
    @XmlElement
    private int passengerCount;
}
