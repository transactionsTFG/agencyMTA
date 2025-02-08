package soap;


import business.travel.SATravel;
import common.consts.WebMethodConsts;
import common.dto.result.Result;
import common.exceptions.SAException;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName = "AgencyFlightWS")
public class AgencyFlightWS {
    
    private final SATravel servicesTravel;

    @Inject
    public AgencyFlightWS(final SATravel servicesFlight){
        this.servicesTravel = servicesFlight;
    }

    @WebMethod(operationName=WebMethodConsts.OP_SEARCH_FLIGHT)
    public boolean search(@WebParam(name = "idFlightSearch") final long idFlight) throws SAException{
        final Result<Void> f = this.servicesTravel.getFlight(idFlight);
        return f.isSuccess();
    }
}
