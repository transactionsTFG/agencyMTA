package soap;


import business.travel.SATravel;
import common.consts.WebMethodConsts;
import common.dto.MakeFlightReservationSOAP;
import common.dto.ModifyFlightReservationSOAP;
import common.exceptions.SAException;
import soapclient.airline.flight.FlightSOAP;
import soapclient.airline.reservation.ReservationSOAP;
import weblogic.wsee.wstx.wsat.Transactional;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName = "AgencyFlight")
public class AgencyFlightWS {
    
    private final SATravel servicesTravel;

    @Inject
    public AgencyFlightWS(final SATravel servicesFlight){
        this.servicesTravel = servicesFlight;
    }

    @WebMethod(operationName=WebMethodConsts.OP_SEARCH_FLIGHT)
    @Transactional
    public FlightSOAP search(@WebParam(name = "idFlightSearch") final long idFlight) throws SAException{
        return this.servicesTravel.getFlight(idFlight);
    }

    @WebMethod(operationName=WebMethodConsts.OP_MAKE_FLIGHT_RESERVATION)
    @Transactional
    public ReservationSOAP makeFlightReservation(@WebParam(name = "reservation") MakeFlightReservationSOAP reservation) throws SAException{
        return this.servicesTravel.makeReservation(reservation);
    }

    @WebMethod(operationName=WebMethodConsts.OP_MODIFY_FLIGHT_RESERVATION)
    @Transactional
    public ReservationSOAP modifyFlightReservation(@WebParam(name = "reservation") ModifyFlightReservationSOAP reservation) throws SAException{
        return this.servicesTravel.modifyReservation(reservation);
    }

    @WebMethod(operationName=WebMethodConsts.OP_SEARCH_FLIGHT_RESERVATION)
    @Transactional
    public ReservationSOAP searchFlightReservation(@WebParam(name = "flightReservationId") long flightReservationId) throws SAException{
        return this.servicesTravel.searchReservation(flightReservationId);
    }
}
