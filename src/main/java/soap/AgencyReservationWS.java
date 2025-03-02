package soap;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import business.services.externalservices.agencygateway.command.GatewayAgencyCommandService;
import common.consts.WebMethodConsts;
import common.dto.MakeFlightReservationSOAP;
import common.exceptions.SAException;
import soapclient.airline.reservation.ReservationSOAP;
import weblogic.wsee.wstx.wsat.Transactional;

@WebService(serviceName = "AgencyReservation")
public class AgencyReservationWS {
    
    private final GatewayAgencyCommandService getewAgencyCommandService;

    @Inject
    public AgencyReservationWS(final GatewayAgencyCommandService gatewayAgencyCommandService){
        this.getewAgencyCommandService = gatewayAgencyCommandService;
    }
    
    @WebMethod(operationName=WebMethodConsts.OP_MAKE_FLIGHT_RESERVATION)
    @Transactional
    public ReservationSOAP makeFlightReservation(@WebParam(name = "reservation") MakeFlightReservationSOAP reservation) throws SAException{
        return null; //this.getewAgencyCommandService.makeReservationFlight(reservation);
    }
}
