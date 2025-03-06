package business.services.externalservices.agencygateway.command;

import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.inject.Inject;

import business.booking.BookingDTO;
import business.booking.MakeBookingReservationDTO;
import business.booking.ModifyBookingReservationDTO;
import business.services.agency.travel.AgencyTravelService;
import business.services.agency.user.UserService;
import business.services.externalservices.airlinemta.reservation.command.AirlineReservationCommandService;
import business.services.externalservices.hotelmta.booking.command.HotelBookingCommandService;
import business.travel.TravelDTO;
import business.user.UserDTO;
import common.dto.HotelFlightReservationDTO;
import common.dto.services.AgencyReservationSuccessDTO;
import common.dto.services.AirlineReservationDTO;
import common.dto.services.IdFlightWithSeatsDTO;
import common.dto.services.ReservationDTO;
import common.dto.services.UpdateReservationDTO;
import common.exceptions.TravelException;
import common.mapper.TravelMapper;

@Stateless
public class GatewayAgencyCommandServiceImpl implements GatewayAgencyCommandService {
    
    private UserService userService;
    private AgencyTravelService agencyTravelService;
    private AirlineReservationCommandService airlineReservationCommandService;
    private HotelBookingCommandService hotelBookingCommandService;

    public GatewayAgencyCommandServiceImpl() {}

    @Inject
    public GatewayAgencyCommandServiceImpl(UserService userService, AgencyTravelService agencyTravelService, AirlineReservationCommandService airlineReservationCommandService, HotelBookingCommandService hotelBookingCommandService) {
        this.userService = userService;
        this.agencyTravelService = agencyTravelService;
        this.airlineReservationCommandService = airlineReservationCommandService;
        this.hotelBookingCommandService = hotelBookingCommandService;
    }

    @Override
    public HotelFlightReservationDTO getHotelAndFlightReservationWithLockMode(long hotelBookingId, long flightReservationId) {
        ReservationDTO reservationDTO = this.airlineReservationCommandService.getAirlineReservationWithLockMode(flightReservationId);
        BookingDTO bookingDTO = this.hotelBookingCommandService.getBookingWithLockMode(hotelBookingId);
        return new HotelFlightReservationDTO(bookingDTO, reservationDTO);
    }

    @Override
    public AgencyReservationSuccessDTO makeReservationFlight(final long idCustomer, final String dni, Map<Long, Integer> mapIdFlightInstance) {
        UserDTO userDTO = this.userService.readUserById(idCustomer);
        List<IdFlightWithSeatsDTO> idFlightWithSeatsDTOs = mapIdFlightInstance.entrySet().stream().map(entry -> new IdFlightWithSeatsDTO(entry.getKey(), entry.getValue())).toList();
        AirlineReservationDTO airlineMTAReservationDTO = this.airlineReservationCommandService.makeReservation(userDTO, dni, idFlightWithSeatsDTOs);
        airlineMTAReservationDTO.getStatusFlightsDTO()
                                .forEach(status -> this.agencyTravelService.makeTravel(TravelMapper.INSTANCE.toMakeReservationAirline(airlineMTAReservationDTO, status, idCustomer)));
        return AgencyReservationSuccessDTO.builder()
                    .dateReservation(airlineMTAReservationDTO.getDate())
                    .idReservation(airlineMTAReservationDTO.getId())
                    .statusFlightsDTO(airlineMTAReservationDTO.getStatusFlightsDTO())
                    .totalReservation(airlineMTAReservationDTO.getTotal())
                    .build();
    }

    @Override
    public BookingDTO makeReservationHotel(MakeBookingReservationDTO booking, long idCustomer, String dni) {
        UserDTO userDTO = this.userService.readUserById(idCustomer);
        BookingDTO bookingHotel = this.hotelBookingCommandService.makeBooking(booking, userDTO);
        TravelDTO travelDTO = TravelMapper.INSTANCE.toMakeReservationHotel(booking, bookingHotel, idCustomer);
        this.agencyTravelService.makeTravel(travelDTO);
        return bookingHotel;
    }

    
    @Override
    public AgencyReservationSuccessDTO makeReservationHotelAndFlight(final MakeBookingReservationDTO booking, long idCustomer, String dni, Map<Long, Integer> mapIdFlightInstance) {
        UserDTO userDTO = this.userService.readUserById(idCustomer);
        List<IdFlightWithSeatsDTO> idFlightWithSeatsDTOs = mapIdFlightInstance.entrySet().stream().map(entry -> new IdFlightWithSeatsDTO(entry.getKey(), entry.getValue())).toList();
        BookingDTO bookingHotel = this.hotelBookingCommandService.makeBooking(booking, userDTO);
        AirlineReservationDTO airlineMTAReservationDTO = this.airlineReservationCommandService.makeReservation(userDTO, dni, idFlightWithSeatsDTOs);
        airlineMTAReservationDTO.getStatusFlightsDTO().forEach(status -> this.agencyTravelService.makeTravel(TravelMapper.INSTANCE.toMakeReservationAirlineAndHotel(bookingHotel, airlineMTAReservationDTO, status, idCustomer)));
        return AgencyReservationSuccessDTO.builder()
                .dateReservation(airlineMTAReservationDTO.getDate())
                .idBooking(bookingHotel.getId())
                .idReservation(airlineMTAReservationDTO.getId())
                .statusFlightsDTO(airlineMTAReservationDTO.getStatusFlightsDTO())
                .totalReservation(airlineMTAReservationDTO.getTotal() + bookingHotel.getTotalPrice())
                .build();
    }
 
    @Override
    public UpdateReservationDTO modifyReservationFlight(final long idReservation, final Map<Long, Integer> idFlightInstanceWithSeatsMap) {
        UpdateReservationDTO updateReservationDTO = this.airlineReservationCommandService.modifyReservation(idReservation, idFlightInstanceWithSeatsMap);
        List<TravelDTO> listTravel = this.agencyTravelService.findTravelByIdReservationFlight(idReservation);
        if(listTravel.isEmpty()) 
            throw new TravelException("No se encontraron viajes asociados a la reserva de vuelo");
        listTravel.forEach(travel -> {
            final long idTravelFlight = travel.getFlightReservationID();
            final int numberSeats = idFlightInstanceWithSeatsMap.get(idTravelFlight);
            final double price = updateReservationDTO.getUpdatePriceReservationDTO().stream().filter(f -> f.getIdFlightInstance() == idTravelFlight).findFirst().get().getPrice();
            if(numberSeats == 0)
                travel.setActive(false);
            
            travel.setPassengerCounter(numberSeats);
            travel.setCost(updateReservationDTO.getTotal());
            travel.setFlightCost(price);
            travel = this.agencyTravelService.modifyTravel(travel);
        });
        return updateReservationDTO;
    }

    @Override
    public BookingDTO modifyReservationHotel(ModifyBookingReservationDTO booking) {
        BookingDTO bookingHotel = this.hotelBookingCommandService.modifyBooking(booking);
        TravelDTO travelDTO = this.agencyTravelService.findTravelByIdReservationHotel(booking.getId());
        travelDTO.setActive(true); 
        travelDTO.setDate(booking.getStartDate());
        travelDTO.setReturnDate(booking.getEndDate());
        travelDTO.setHotelCost(bookingHotel.getTotalPrice());
        travelDTO.setCost(travelDTO.getFlightCost() + travelDTO.getHotelCost());
        this.agencyTravelService.makeTravel(travelDTO);
        return bookingHotel;
    }

    @Override
    public UpdateReservationDTO modifyHotelFlightReservation(final ModifyBookingReservationDTO booking, final long idReservation, final Map<Long, Integer> idFlightInstanceWithSeatsMap) {
        UpdateReservationDTO updateReservationDTO = this.airlineReservationCommandService.modifyReservation(idReservation, idFlightInstanceWithSeatsMap);
        BookingDTO bookingHotel = this.hotelBookingCommandService.modifyBooking(booking);
        List<TravelDTO> listTravel = this.agencyTravelService.findTravelByIdReservationFlightAndHotel(idReservation, booking.getId());
        if(listTravel.isEmpty()) 
            throw new TravelException("No se encontraron viajes asociados a la reserva de vuelo");
        listTravel.forEach(travel -> {
            final long idTravelFlight = travel.getFlightReservationID();
            final int numberSeats = idFlightInstanceWithSeatsMap.get(idTravelFlight);
            final double price = updateReservationDTO.getUpdatePriceReservationDTO().stream().filter(f -> f.getIdFlightInstance() == idTravelFlight).findFirst().get().getPrice();
            travel.setPassengerCounter(numberSeats + bookingHotel.getPeopleNumber());
            travel.setCost(updateReservationDTO.getTotal() + bookingHotel.getTotalPrice());
            travel.setHotelCost(bookingHotel.getTotalPrice());
            travel.setFlightCost(price);
            this.agencyTravelService.modifyTravel(travel);
        });
        updateReservationDTO.setBookingDTO(bookingHotel);
        return updateReservationDTO;
    }

    @Override
    public double cancelReservationFlight(final long idReservationFlight) {
        double priceReturn = this.airlineReservationCommandService.cancelReservation(idReservationFlight);
        List<TravelDTO> listTravel = this.agencyTravelService.findTravelByIdReservationFlight(idReservationFlight);
        if(listTravel.isEmpty()) 
            throw new TravelException("No se encontraron viajes asociados a la reserva de vuelo");
        boolean isAllTravelFlightCancel = listTravel.stream().map(travel -> this.agencyTravelService.cancelTravel(travel.getId())).allMatch(isCancel -> isCancel);
        if(!isAllTravelFlightCancel)   
            throw new TravelException("No se han podido cancelar todos los viajes asociados a la reserva de vuelo");
        return priceReturn;
    }

    @Override
    public double cancelReservationHotel(final long idHotelBooking) {
        double moneyReturned = this.hotelBookingCommandService.cancelBooking(idHotelBooking);
        TravelDTO travelDTO = this.agencyTravelService.findTravelByIdReservationHotel(idHotelBooking);
        travelDTO.setHotelCost(travelDTO.getHotelCost() - moneyReturned);
        travelDTO.setCost(travelDTO.getHotelCost() + travelDTO.getFlightCost());
        if (travelDTO.getCost() <= 0) {
            travelDTO.setCost(0);
            travelDTO.setActive(false);
        }
        return moneyReturned;
    }

    @Override
    public double cancelReservationLineHotel(final long idHotelBooking, final long roomId) {
        double moneyReturned = this.hotelBookingCommandService.cancelBooking(idHotelBooking);
        TravelDTO travelDTO = this.agencyTravelService.findTravelByIdReservationHotel(idHotelBooking);
        travelDTO.setHotelCost(travelDTO.getHotelCost() - moneyReturned);
        travelDTO.setCost(travelDTO.getCost() - moneyReturned);
        if (travelDTO.getCost() <= 0) {
            travelDTO.setHotelCost(0);
            travelDTO.setFlightCost(0);
            travelDTO.setCost(0);
            travelDTO.setActive(false);
        }
        return moneyReturned;
    }

    @Override
    public double cancelHotelFlightReservation(long hotelBookingId, long flightReservationId) {
        double priceReturn = this.airlineReservationCommandService.cancelReservation(flightReservationId);
        double moneyReturned = this.hotelBookingCommandService.cancelBooking(hotelBookingId);
        List<TravelDTO> listTravel = this.agencyTravelService.findTravelByIdReservationFlightAndHotel(flightReservationId, hotelBookingId);
        if(listTravel.isEmpty()) 
            throw new TravelException("No se encontraron viajes asociados a la reserva de vuelo");
        boolean isAllTravelFlightCancel = listTravel.stream().map(travel -> this.agencyTravelService.cancelTravel(travel.getId())).allMatch(isCancel -> isCancel);
        if(!isAllTravelFlightCancel)   
            throw new TravelException("No se han podido cancelar todos los viajes asociados a la reserva de vuelo");
        return priceReturn + moneyReturned;
    }

}
