package common.dto.soap.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "searchAirlineHotelRequestSOAP")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SearchAirlineHotelRequestSOAP {
    @XmlElement
    private String countryOrigin;
    @XmlElement
    private String countryDestination;
    @XmlElement
    private String dateFrom;
}
