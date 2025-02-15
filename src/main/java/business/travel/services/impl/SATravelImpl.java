package business.travel.services.impl;

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

import java.util.List;

import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

import business.travel.services.SATravelFlight;
import common.dto.soap.request.ParamSearchFlight;
import common.dto.MakeFlightReservationSOAP;

@Stateless
public class SATravelImpl implements SATravelFlight {

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
    public List<Object> getFlights(final ParamSearchFlight param) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFlights'");
    }
    

}
