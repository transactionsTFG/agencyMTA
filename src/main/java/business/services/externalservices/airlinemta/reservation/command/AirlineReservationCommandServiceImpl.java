package business.services.externalservices.airlinemta.reservation.command;

import java.util.List;

import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

import common.dto.services.AirlineReservationDTO;
import common.dto.services.IdFlightWithSeatsDTO;
import common.dto.services.MakeFlightReservationDTO;
import common.dto.services.ModifyFlightReservationDTO;
import common.mapper.ReservationMapper;
import soapclient.airline.reservation.CustomerDTO;
import soapclient.airline.reservation.IdFlightInstanceWithSeatsDTO;
import soapclient.airline.reservation.MakeReservationRequestSOAP;
import soapclient.airline.reservation.ReservationDTO;
import soapclient.airline.reservation.ReservationSOAP;
import soapclient.airline.reservation.ReservationWS_Service;
import soapclient.airline.reservation.MakeReservationRequestSOAP.Flights;
import weblogic.wsee.wstx.wsat.Transactional;
import weblogic.wsee.wstx.wsat.Transactional.TransactionFlowType;
import weblogic.wsee.wstx.wsat.Transactional.Version;

@Stateless
public class AirlineReservationCommandServiceImpl implements AirlineReservationCommandService {
    @WebServiceRef(wsdlLocation = "http://localhost:8001/airlineMTA/ReservationWS?wsdl")
    @Transactional(version = Version.WSAT12, value = TransactionFlowType.MANDATORY)
    private ReservationWS_Service reservationService;

    @Override
    public AirlineReservationDTO makeReservation(MakeFlightReservationDTO mDto, List<IdFlightWithSeatsDTO> idsFlightWithSeats) {    
        MakeReservationRequestSOAP reservationSOAP = new MakeReservationRequestSOAP();

        ReservationDTO reservationDTO = new ReservationDTO();
        reservationDTO.setActive(true);
        reservationDTO.setDate(mDto.getDate());
        reservationDTO.setIdCustomer(mDto.getCustomerId());
        reservationDTO.setTotal(mDto.getTotal());

        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setActive(true);
        customerDTO.setDni(mDto.getDni());
        customerDTO.setEmail(mDto.getEmail());
        customerDTO.setId(mDto.getCustomerId());
        customerDTO.setName(mDto.getName());
        customerDTO.setPhone(mDto.getPhone());

        reservationSOAP.setCustomer(customerDTO);
        reservationSOAP.setReservation(reservationDTO);
        List<IdFlightInstanceWithSeatsDTO> flights = idsFlightWithSeats.stream().map(ReservationMapper.INSTANCE::toEntity).toList();
        Flights f = new Flights();
        f.getFlight().addAll(flights);
        reservationSOAP.setFlights(f);
        ReservationSOAP r = (ReservationSOAP) reservationService.getReservationWSPort().makeReservation(reservationSOAP).getData();
        return AirlineReservationDTO.toDTO(r);  
    }

    @Override
    public boolean cancelReservation(long idReservation, long idFlightInstance) {
        return false;//return reservationService.getReservationWSPort().cancelReservation(idReservation, idFlightInstance).isSuccess();
    }

    @Override
    public Object modifyReservation(ModifyFlightReservationDTO mDto) {
        this.reservationService.getReservationWSPort().modifyReservation(null);
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifyReservation'");
    }   

}
