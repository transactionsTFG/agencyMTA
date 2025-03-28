package common.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import common.dto.soap.request.IdFlightInstanceWithSeatsSOAP;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@XmlRootElement(name = "MakeFlightReservationSOAP")
@XmlAccessorType(XmlAccessType.FIELD)
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class MakeFlightReservationSOAP {
    @XmlElement
    private String dni;
    @XmlElement
    private long idCustomer;
    @XmlElementWrapper(name = "flights")
    @XmlElement(name = "flight")
    private List<IdFlightInstanceWithSeatsSOAP> listIdFlightInstanceSeats;
}
