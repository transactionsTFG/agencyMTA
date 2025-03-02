package business.services.externalservices.agencygateway.command;

import java.util.Map;

import javax.ejb.Stateless;
import javax.inject.Inject;

import business.services.agency.travel.AgencyTravelService;
import business.services.externalservices.airlinemta.flight.command.FlightAirlineCommandService;
import business.services.externalservices.airlinemta.reservation.command.AirlineReservationCommandService;
import business.services.externalservices.hotelmta.booking.command.HotelBookingCommandService;
import business.travel.TravelDTO;
import business.user.UserDTO;
import common.dto.HotelFlightReservationDTO;
import common.dto.services.AgencyReservationFlightDTO;
import common.dto.services.AgencyReservationSuccessDTO;
import common.dto.services.AirlineReservationDTO;
import common.dto.services.MakeFlightReservationDTO;
import common.exceptions.TravelException;

@Stateless
public class GatewayAgencyCommandServiceImpl implements GatewayAgencyCommandService {
    
    private AgencyTravelService agencyTravelService;
    private AirlineReservationCommandService airlineReservationCommandService;
    private HotelBookingCommandService hotelBookingCommandService;
    private FlightAirlineCommandService flightAirlineCommandService;

    public GatewayAgencyCommandServiceImpl() {}

    @Inject
    public GatewayAgencyCommandServiceImpl(AgencyTravelService agencyTravelService, AirlineReservationCommandService airlineReservationCommandService) {
        this.agencyTravelService = agencyTravelService;
        this.airlineReservationCommandService = airlineReservationCommandService;
    }

    @Override
    public AgencyReservationSuccessDTO makeReservationFlight(AgencyReservationFlightDTO agencyReservation, Map<Long, Integer> mapIdFlightInstance, UserDTO user) {
        AirlineReservationDTO airline = null;//this.airlineReservationCommandService.makeReservation(new MakeFlightReservationDTO(agencyReservation), user);
        TravelDTO saveTravel = this.agencyTravelService.makeTravel(new TravelDTO(agencyReservation));
        return new AgencyReservationSuccessDTO(saveTravel.getId(), airline);
    }
 
    @Override
    public Object modifyReservationFlight(AgencyReservationFlightDTO agencyReservation) {
        TravelDTO modifyTravel = this.agencyTravelService.modifyTravel(new TravelDTO(agencyReservation));
        

        return null;
    }

    @Override
    public boolean cancelReservationFlight(final long idTravel, final long idFlightInstance) {
        TravelDTO travel = this.agencyTravelService.findWithOptimisticLockById(idTravel);
        boolean cancelReservation = this.airlineReservationCommandService.cancelReservation(travel.getFlightReservationID(), idFlightInstance);
        if (!cancelReservation) 
            throw new TravelException("Error cancelando la reserva de vuelo");
        return this.agencyTravelService.cancelTravel(idTravel);
    }

    @Override
    public HotelFlightReservationDTO makeHotelFlightReservation(BookingDTO booking, AgencyReservationFlightDTO reservation, Map<Long, Integer> mapIdFlightInstance, UserDTO user) {
        BookingDTO bookingDTO = this.hotelBookingCommandService.makeBooking(booking, user);
        AgencyReservationSuccessDTO reservationDTO = this.makeReservationFlight(reservation, mapIdFlightInstance, user);
        HotelFlightReservationDTO dto = new HotelFlightReservationDTO();
        dto.setBooking(bookingDTO);
        dto.setReservation(reservationDTO);
        return dto;
    }

    @Override
    public HotelFlightReservationDTO modifyHotelFlightReservation(BookingDTO booking, AgencyReservationFlightDTO reservation, Map<Long, Integer> mapIdFlightInstance) {
        throw new Exception("GatewayAgencyQueryService.modifyHotelFlightReservation: FALTA HACER");
    }

    @Override
    public double cancelHotelFlightReservation(long hotelBookingId, long flightReservationId) {
        throw new Exception("GatewayAgencyQueryService.cancelHotelFlightReservation: FALTA HACER");
    }

}
