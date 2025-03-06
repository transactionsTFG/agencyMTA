package common.dto.soap.request;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "ModifyFlightReservationRequestionSOAP")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ModifyFlightReservationRequestionSOAP {
    @XmlElement
    private long idReservation;
    @XmlElementWrapper(name = "flights")
    @XmlElement(name = "flight")
    private List<IdFlightInstanceWithSeatsSOAP> listIdFlightInstanceSeats;
}
