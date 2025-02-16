package business.travel;

import soapclient.airline.flight.FlightSOAP;
import soapclient.airline.flight.FlightWS_Service;
import soapclient.airline.reservation.CustomerDTO;
import soapclient.airline.reservation.MakeReservationRequestSOAP;
import soapclient.airline.reservation.ModifyReservationRequestSOAP;
import soapclient.airline.reservation.ReservationDTO;
import soapclient.airline.reservation.ReservationLineDTO;
import soapclient.airline.reservation.ReservationSOAP;
import soapclient.airline.reservation.ReservationWS_Service;
import weblogic.wsee.wstx.wsat.Transactional;
import weblogic.wsee.wstx.wsat.Transactional.TransactionFlowType;
import weblogic.wsee.wstx.wsat.Transactional.Version;

import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

import common.dto.MakeFlightReservationSOAP;
import common.dto.ModifyFlightReservationSOAP;
import common.exceptions.TravelException;

@Stateless
public class SATravelImpl implements SATravel {

    @WebServiceRef(wsdlLocation = "http://localhost:8001/airlineMTA/FlightWS?wsdl")
    @Transactional(version = Version.WSAT12, value = TransactionFlowType.MANDATORY)
    private FlightWS_Service flightService;

    @WebServiceRef(wsdlLocation = "http://localhost:8001/airlineMTA/ReservationWS?wsdl")
    @Transactional(version = Version.WSAT12, value = TransactionFlowType.MANDATORY)
    private ReservationWS_Service reservationService;

    @Override
    public FlightSOAP getFlight(long idFlight) {
        return (FlightSOAP) flightService.getFlightWSPort().searchFlight(idFlight).getData();
    }

    @Override
    public ReservationSOAP makeReservation(MakeFlightReservationSOAP reservation) {
        MakeReservationRequestSOAP reservationSOAP = new MakeReservationRequestSOAP();

        ReservationDTO reservationDTO = new ReservationDTO();
        reservationDTO.setActive(true);
        reservationDTO.setDate(reservation.getDate());
        reservationDTO.setIdCustomer(reservation.getCustomerId());
        reservationDTO.setTotal(reservation.getTotal());

        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setActive(true);
        customerDTO.setDni(reservation.getDni());
        customerDTO.setEmail(reservation.getEmail());
        customerDTO.setId(reservation.getCustomerId());
        customerDTO.setName(reservation.getName());
        customerDTO.setPhone(reservation.getPhone());

        reservationSOAP.setCustomer(customerDTO);
        reservationSOAP.setReservation(reservationDTO);
        reservationSOAP.setIdFlight(reservation.getFlightId());
        reservationSOAP.setNumberOfSeats(reservation.getNumberOfSeats());
        return (ReservationSOAP) reservationService.getReservationWSPort().makeReservation(reservationSOAP).getData();
    }

    @Override
    public ReservationSOAP modifyReservation(ModifyFlightReservationSOAP reservation) {
        ReservationSOAP readReservationSOAP = (ReservationSOAP) reservationService.getReservationWSPort().searchReservation(reservation.getFlightReservationId()).getData();

        if (readReservationSOAP == null) {
            throw new TravelException("Reserva de vuelo no encontrada");
        }
        
        if (!readReservationSOAP.isActive()) {
            throw new TravelException("Reserva de vuelo inactiva");
        }
        
        ModifyReservationRequestSOAP reservationSOAP = new ModifyReservationRequestSOAP();

        ReservationDTO reservationDTO = new ReservationDTO();
        reservationDTO.setId(reservation.getFlightReservationId());
        reservationDTO.setActive(true);
        reservationDTO.setDate(reservation.getDate());
        reservationDTO.setIdCustomer(reservation.getCustomerId());
        reservationDTO.setTotal(reservation.getTotal());

        ReservationLineDTO reservationLineDTO = new ReservationLineDTO();
        reservationLineDTO.setFlightInstanceId(reservation.getFlightInstanceId());
        reservationLineDTO.setPassengerCount(reservation.getPassengerCount());
        reservationLineDTO.setReservationId(reservation.getFlightReservationId());

        reservationSOAP.setReservation(reservationDTO);
        reservationSOAP.setReservationLine(reservationLineDTO);
        return (ReservationSOAP) reservationService.getReservationWSPort().modifyReservation(reservationSOAP).getData();
    }

    @Override
    public ReservationSOAP searchReservation(long flightReservationId) {
        return (ReservationSOAP) reservationService.getReservationWSPort().searchReservation(flightReservationId).getData();
    }

    @Override
    public ReservationSOAP cancelReservation(long flightReservationId, long flightInstanceId) {
        return (ReservationSOAP) reservationService.getReservationWSPort().cancelReservation(flightReservationId, flightInstanceId).getData();
    }

}
