package common.dto.soap.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "paramSearchFlightSOAP")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParamSearchFlightSOAP {
    @XmlElement
    private String countryOrigin;
    @XmlElement
    private String countryDestination;
    @XmlElement
    private String cityOrigin;
    @XmlElement
    private String cityDestination;
    @XmlElement
    private String dateOrigin;
}
