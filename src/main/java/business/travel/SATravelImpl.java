package business.travel;

import soapclient.airline.flight.FlightSOAP;
import soapclient.airline.flight.FlightWS_Service;
import soapclient.airline.reservation.CustomerDTO;
import soapclient.airline.reservation.MakeReservationRequestSOAP;
import soapclient.airline.reservation.ReservationDTO;
import soapclient.airline.reservation.ReservationSOAP;
import soapclient.airline.reservation.ReservationWS_Service;
import weblogic.wsee.wstx.wsat.Transactional;
import weblogic.wsee.wstx.wsat.Transactional.TransactionFlowType;
import weblogic.wsee.wstx.wsat.Transactional.Version;

import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

import business.user.UserDTO;
import business.user.UserService;
import business.user.UserServiceImpl;
import common.dto.MakeFlightReservationSOAP;
import common.dto.UserLoginSOAP;
import soap.UserWS;

@Stateless
public class SATravelImpl implements SATravel {

    @WebServiceRef(wsdlLocation = "http://localhost:8001/airlineMTA/FlightWS?wsdl")
    @Transactional(version = Version.WSAT12, value = TransactionFlowType.MANDATORY)
    private FlightWS_Service flightService;

    @WebServiceRef(wsdlLocation = "http://localhost:8001/airlineMTA/ReservationWS?wsdl")
    @Transactional(version = Version.WSAT12, value = TransactionFlowType.MANDATORY)
    private ReservationWS_Service reservationService;

    private UserWS userWS;
    // private UserWS userWS = new UserWS(new UserServiceImpl());

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

        UserLoginSOAP userLoginSOAP = new UserLoginSOAP();
        userLoginSOAP.setEmail(reservation.getCustomerEmail());
        userLoginSOAP.setPassword("");

        UserDTO userDTO = userWS.readUser(userLoginSOAP);

        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setActive(userDTO.isActive());
        customerDTO.setDni(userDTO.getPassport());
        customerDTO.setEmail(userDTO.getEmail());
        customerDTO.setId(userDTO.getId());
        customerDTO.setName(userDTO.getName());
        customerDTO.setPhone(userDTO.getPhone());

        reservationSOAP.setCustomer(customerDTO);
        reservationSOAP.setReservation(reservationDTO);
        reservationSOAP.setIdFlight(reservation.getFlightId());
        reservationSOAP.setNumberOfSeats(reservation.getNumberOfSeats());
        return (ReservationSOAP) reservationService.getReservationWSPort().makeReservation(reservationSOAP).getData();
    }

}
