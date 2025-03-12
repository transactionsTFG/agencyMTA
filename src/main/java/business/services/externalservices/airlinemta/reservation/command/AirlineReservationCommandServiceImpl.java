package business.services.externalservices.airlinemta.reservation.command;

import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

import business.user.UserDTO;
import common.dto.services.AirlineReservationDTO;
import common.dto.services.IdFlightWithSeatsDTO;
import common.dto.services.ReservationDTO;
import common.dto.services.UpdateReservationDTO;
import common.mapper.ReservationMapper;
import soapclient.airline.reservation.CustomerDTO;
import soapclient.airline.reservation.IdFlightInstanceWithSeatsDTO;
import soapclient.airline.reservation.MakeReservationRequestSOAP;
import soapclient.airline.reservation.NewReservationSOAP;
import soapclient.airline.reservation.ReservationSOAP;
import soapclient.airline.reservation.ReservationWS_Service;
import soapclient.airline.reservation.UpdateReservationSOAP;
import soapclient.airline.reservation.MakeReservationRequestSOAP.Flights;
import soapclient.airline.reservation.ModifyReservationRequestSOAP;
import weblogic.wsee.wstx.wsat.Transactional;
import weblogic.wsee.wstx.wsat.Transactional.TransactionFlowType;
import weblogic.wsee.wstx.wsat.Transactional.Version;

@Stateless
public class AirlineReservationCommandServiceImpl implements AirlineReservationCommandService {
    @WebServiceRef(wsdlLocation = "https://localhost:8002/airlineMTA/ReservationWS?wsdl")
    @Transactional(version = Version.WSAT12, value = TransactionFlowType.MANDATORY)
    private ReservationWS_Service reservationService;

    @Override
    public ReservationDTO getAirlineReservationWithLockMode(long idAirlineReservation) {
        return ReservationMapper.INSTANCE.toReservationDTO((ReservationSOAP) this.reservationService.getReservationWSPort().searchReservation(idAirlineReservation).getData());
    }   

    @Override
    public AirlineReservationDTO makeReservation(final UserDTO u, final String dni, List<IdFlightWithSeatsDTO> idsFlightWithSeats) {    
        MakeReservationRequestSOAP reservationSOAP = new MakeReservationRequestSOAP();
        soapclient.airline.reservation.ReservationDTO reservationDTO = new soapclient.airline.reservation.ReservationDTO();
        CustomerDTO customerDTO = new CustomerDTO();
        
        customerDTO.setActive(true);
        customerDTO.setDni(dni);
        customerDTO.setEmail(u.getEmail());
        customerDTO.setName(u.getName());
        customerDTO.setPhone(u.getPhone());
        reservationSOAP.setCustomer(customerDTO);
        reservationSOAP.setReservation(reservationDTO);

        List<IdFlightInstanceWithSeatsDTO> flights = idsFlightWithSeats.stream().map(ReservationMapper.INSTANCE::toEntity).toList();
        Flights f = new Flights();
        f.getFlight().addAll(flights);
        reservationSOAP.setFlights(f);
        NewReservationSOAP newReservationSOAP = (NewReservationSOAP) reservationService.getReservationWSPort().makeReservation(reservationSOAP).getData();
        return ReservationMapper.INSTANCE.newReservationToDTO(newReservationSOAP);  
    }

    @Override
    public double cancelReservation(long idReservation) {
        return (Double) this.reservationService.getReservationWSPort().cancelReservation(idReservation).getData();
    }

    @Override
    public UpdateReservationDTO modifyReservation(final long idReservation, final Map<Long, Integer> idFlightInstanceWithSeatsMap) {
        ModifyReservationRequestSOAP modifyFlightReservationSOAP = new ModifyReservationRequestSOAP();
        modifyFlightReservationSOAP.setIdReservation(idReservation);
        soapclient.airline.reservation.ModifyReservationRequestSOAP.Flights f = new soapclient.airline.reservation.ModifyReservationRequestSOAP.Flights();
        List<IdFlightInstanceWithSeatsDTO> flights = idFlightInstanceWithSeatsMap.entrySet().stream().map(fl -> {
            IdFlightInstanceWithSeatsDTO id = new IdFlightInstanceWithSeatsDTO();
            id.setIdFlightInstance(fl.getKey());
            id.setSeats(fl.getValue());
            return id;
        }).toList();
        f.getFlight().addAll(flights);
        modifyFlightReservationSOAP.setFlights(f);
        UpdateReservationSOAP update = (UpdateReservationSOAP) this.reservationService.getReservationWSPort().modifyReservation(modifyFlightReservationSOAP).getData();
        return ReservationMapper.INSTANCE.toUpdateReservationDTO(update);
    }

}
