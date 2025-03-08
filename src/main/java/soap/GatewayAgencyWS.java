package soap;

import java.util.Map;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import business.booking.MakeBookingReservationDTO;
import business.booking.ModifyBookingReservationDTO;
import business.services.agency.travel.AgencyTravelService;
import business.services.externalservices.agencygateway.command.GatewayAgencyCommandService;
import business.services.externalservices.agencygateway.query.GatewayAgencyQueryService;
import common.consts.WebMethodConsts;
import common.dto.HotelFlightReservationDTO;
import common.dto.MakeFlightReservationSOAP;
import common.dto.services.AgencyReservationSuccessDTO;
import common.dto.services.FlightHotelDTO;
import common.dto.services.UpdateReservationDTO;
import common.dto.soap.request.IdFlightInstanceWithSeatsSOAP;
import common.dto.soap.request.ModifyFlightReservationRequestionSOAP;
import common.dto.soap.request.SearchAirlineHotelRequestSOAP;
import common.dto.soap.response.GetTravelSOAP;
import common.exceptions.SAException;
import weblogic.wsee.wstx.wsat.Transactional;

@WebService(serviceName = "GatewayAgencyWS")
public class GatewayAgencyWS {
    private final GatewayAgencyQueryService gatewayAgencyQueryService;
    private final GatewayAgencyCommandService gatewayAgencyCommandService;
    private final AgencyTravelService agencyTravelService;

    @Inject
    public GatewayAgencyWS(final GatewayAgencyQueryService gatewayAgencyQueryService, final GatewayAgencyCommandService gatewayAgencyCommandService ,final AgencyTravelService agencyTravelService) {
        this.gatewayAgencyQueryService = gatewayAgencyQueryService;
        this.agencyTravelService = agencyTravelService;
        this.gatewayAgencyCommandService = gatewayAgencyCommandService;
    }

    @WebMethod(operationName=WebMethodConsts.OP_SEARCH_FLIGHTS_AND_HOTEL)
    public Map<String, FlightHotelDTO> searchAirlineHotel(@WebParam(name = "parmaSearchAirlineHotel") final SearchAirlineHotelRequestSOAP param) throws SAException {
        return this.gatewayAgencyQueryService
                    .getFlightAndHotels(param);
    }

    @WebMethod(operationName=WebMethodConsts.OP_SEARCH_TRAVEL)
    @Transactional
    public GetTravelSOAP searchTravel(@WebParam(name = "paramSearchTravel") final long id) throws SAException {
        return GetTravelSOAP.toSOAP(this.agencyTravelService.findWithOptimisticLockById(id));
    }

    @WebMethod(operationName=WebMethodConsts.OP_MAKE_FLIGHT_AND_HOTEL)
    @Transactional
    public AgencyReservationSuccessDTO makeReservationHotelAndFlight(@WebParam(name = "booking")  MakeBookingReservationDTO booking, @WebParam(name = "reservation") MakeFlightReservationSOAP reservation) {
        return this.gatewayAgencyCommandService.makeReservationHotelAndFlight(booking, reservation.getIdCustomer(), reservation.getDni(), reservation.getListIdFlightInstanceSeats()
                                                                                                                                        .stream()
                                                                                                                                        .collect(
                                                                                                                                            Collectors.toMap(IdFlightInstanceWithSeatsSOAP::getIdFlightInstance, IdFlightInstanceWithSeatsSOAP::getSeats)
                                                                                                                                        ));
    }

    @WebMethod(operationName=WebMethodConsts.OP_GET_FLIGHT_AND_HOTEL)
    @Transactional
    public HotelFlightReservationDTO getHotelAndFlightReservation(@WebParam(name = "hotelBookingId") long hotelBookingId, @WebParam(name = "flightReservationId") long flightReservationId) {
        return this.gatewayAgencyCommandService.getHotelAndFlightReservationWithLockMode(hotelBookingId, flightReservationId);
    }

    @WebMethod(operationName=WebMethodConsts.OP_MOD_FLIGHT_AND_HOTEL)
    @Transactional
    public UpdateReservationDTO modifyHotelFlightReservation(@WebParam(name = "booking") ModifyBookingReservationDTO booking, @WebParam(name = "reservation") ModifyFlightReservationRequestionSOAP reservation) {
        return this.gatewayAgencyCommandService.modifyHotelFlightReservation(booking, reservation.getIdReservation(), reservation.getListIdFlightInstanceSeats()
                                                                                                                            .stream()
                                                                                                                            .collect(
                                                                                                                                Collectors.toMap(IdFlightInstanceWithSeatsSOAP::getIdFlightInstance, IdFlightInstanceWithSeatsSOAP::getSeats)
                                                                                                                            ));
    }

    @WebMethod(operationName=WebMethodConsts.OP_DEL_FLIGHT_AND_HOTEL)
    @Transactional
    public double cancelHotelFlightReservation(@WebParam(name = "hotelBookingId") long hotelBookingId, @WebParam(name = "flightReservationId") long flightReservationId) {
        return this.gatewayAgencyCommandService.cancelHotelFlightReservation(hotelBookingId, flightReservationId);
    }
}
