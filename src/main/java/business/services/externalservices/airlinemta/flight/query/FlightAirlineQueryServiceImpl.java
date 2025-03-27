package business.services.externalservices.airlinemta.flight.query;

import java.util.List;

import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

import common.dto.services.FlightListDTO;
import common.exceptions.SAException;
import common.validator.ValidatorTime;
import soapclient.airline.flight.FlightInstanceDTO;
import soapclient.airline.flight.FlightSOAP;
import soapclient.airline.flight.FlightWS_Service;
import soapclient.airline.flight.IdFlightInstanceWithSeatsDTO;
import soapclient.airline.flight.ParamFlightSOAP;

@Stateless
public class FlightAirlineQueryServiceImpl implements FlightAirlineQueryService {

    @WebServiceRef(wsdlLocation = "https://localhost:8002/airlineMTA/FlightWS?wsdl")
    private FlightWS_Service flightServiceWithTransactionRead;

    @Override
    public List<FlightListDTO> getFlights(String countryOrigin, String countryDestination, String cityOrigin, String cityDestination, String dateOrigin) {
        if(dateOrigin != null && !ValidatorTime.isValidDate(dateOrigin))
            throw new SAException("Fecha de origen no válida");
        
        String dateOriginParam = dateOrigin != null ? dateOrigin : null;

        ParamFlightSOAP param = new ParamFlightSOAP();
        param.setCountryOrigin(countryOrigin);
        param.setCountryDestination(countryDestination);
        param.setCityOrigin(cityOrigin);
        param.setCityDestination(cityDestination);
        param.setDateOrigin(dateOriginParam);
        return this.flightServiceWithTransactionRead.getFlightWSPort().searchFlights(param)
                .stream()
                .map(FlightListDTO::fromFlightDataListSOAP)
                .toList();
    }

    @Override
    public FlightSOAP getFlight(long idTravel) {
        return  (FlightSOAP) this.flightServiceWithTransactionRead.getFlightWSPort().searchFlight(idTravel).getData();
    }

    @Override
    public FlightInstanceDTO getFlightInstance(long idFlightInstance) {
        return this.flightServiceWithTransactionRead.getFlightWSPort().searchFlightInstace(idFlightInstance);
    }

    @Override
    public List<IdFlightInstanceWithSeatsDTO> getFlightsByReservation(long reservationId) {
        return this.flightServiceWithTransactionRead.getFlightWSPort().searchFlightsByReservation(reservationId);
    }

}
