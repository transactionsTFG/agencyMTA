package common.dto.soap.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import business.travel.TravelDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "GetTravelSOAP")
@XmlAccessorType(XmlAccessType.FIELD) 
public class GetTravelSOAP {
    @XmlElement
    private long id;
    @XmlElement
    private int userId; 
    @XmlElement
    private String date;
    @XmlElement
    private String returnDate;
    @XmlElement
    private int passengerCounter;
    @XmlElement
    private double cost;
    @XmlElement
    private String status;
    @XmlElement
    private long flightReservationID;
    @XmlElement
    private long hotelReservationID;
    @XmlElement
    private double flightCost;
    @XmlElement
    private double hotelCost;
    @XmlElement
    private boolean active;
    public static GetTravelSOAP toSOAP(TravelDTO dto) {
        return new GetTravelSOAP(
                dto.getId(),
                dto.getUserId(),
                dto.getDate(),
                dto.getReturnDate(),
                dto.getPassengerCounter(),
                dto.getCost(),
                dto.getStatus(),
                dto.getFlightReservationID(),
                dto.getHotelReservationID(),
                dto.getFlightCost(),
                dto.getHotelCost(),
                dto.isActive()
        );
    }
}
