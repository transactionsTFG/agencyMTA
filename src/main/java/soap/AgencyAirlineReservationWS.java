package soap;

import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import business.services.externalservices.agencygateway.command.GatewayAgencyCommandService;
import common.consts.WebMethodConsts;
import common.dto.MakeFlightReservationSOAP;
import common.dto.services.AgencyReservationSuccessDTO;
import common.dto.services.UpdateReservationDTO;
import common.dto.soap.request.IdFlightInstanceWithSeatsSOAP;
import common.dto.soap.request.ModifyFlightReservationRequestionSOAP;
import common.exceptions.SAException;
import common.dto.services.ReservationDTO;
import weblogic.wsee.wstx.wsat.Transactional;

@WebService(serviceName = "AgencyAirlineReservationWS")
public class AgencyAirlineReservationWS {
    
    private final GatewayAgencyCommandService gatewayAgencyCommandService;

    @Inject
    public AgencyAirlineReservationWS(final GatewayAgencyCommandService gatewayAgencyCommandService){
        this.gatewayAgencyCommandService = gatewayAgencyCommandService;
    }
    
    @WebMethod(operationName=WebMethodConsts.OP_MAKE_FLIGHT_RESERVATION)
    @Transactional
    public AgencyReservationSuccessDTO makeFlightReservation(@WebParam(name = "reservation") MakeFlightReservationSOAP reservation) throws SAException{
        return this.gatewayAgencyCommandService.makeReservationFlight(reservation.getIdCustomer(), reservation.getDni(), reservation.getListIdFlightInstanceSeats()
                                                                                                                                        .stream()
                                                                                                                                        .collect(
                                                                                                                                            Collectors.toMap(IdFlightInstanceWithSeatsSOAP::getIdFlightInstance, IdFlightInstanceWithSeatsSOAP::getSeats)
                                                                                                                                        ));
    }
    
    @WebMethod(operationName=WebMethodConsts.OP_MOD_FLIGHT_RESERVATION)
    @Transactional
    public UpdateReservationDTO modifyReservation(@WebParam(name = "reservation") ModifyFlightReservationRequestionSOAP reservation) throws SAException {
        return this.gatewayAgencyCommandService.modifyReservationFlight(reservation.getIdReservation(), reservation.getListIdFlightInstanceSeats()
                                                                                                                    .stream()
                                                                                                                    .collect(
                                                                                                                        Collectors.toMap(IdFlightInstanceWithSeatsSOAP::getIdFlightInstance, IdFlightInstanceWithSeatsSOAP::getSeats)
                                                                                                                    ));
    }

    @WebMethod(operationName=WebMethodConsts.OP_DEL_FLIGHT_RESERVATION)
    @Transactional
    public double cancelReservation(@WebParam(name = "idReservationAirline") long idReservationAirline) throws SAException{
        return this.gatewayAgencyCommandService.cancelReservationFlight(idReservationAirline);
    }

    @WebMethod(operationName=WebMethodConsts.OP_SEARCH_FLIGHT_RESERVATION)
    @Transactional
    public common.dto.services.ReservationDTO searchReservation(@WebParam(name = "idReservationAirline") long idReservationAirline) throws SAException{
        return this.gatewayAgencyCommandService.searchFlightReservation(idReservationAirline);
    }

}
