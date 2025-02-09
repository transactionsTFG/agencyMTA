package soap;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import business.travel.TravelDTO;
import business.travel.services.SATravelReservation;
import common.consts.WebMethodConsts;
import common.exceptions.SAException;

@WebService(serviceName = "AgencyReservation")
public class AgencyReservationWS {
    private final SATravelReservation servicesTravel;

    @Inject
    public AgencyReservationWS(final SATravelReservation servicesFlight){
        this.servicesTravel = servicesFlight;
    }

    @WebMethod(operationName=WebMethodConsts.OP_SEARCH_RESERVATION)
    public TravelDTO searchReservation(@WebParam(name = "idReservation") final long id) throws SAException{
        return this.servicesTravel.get(id);
    }
}
