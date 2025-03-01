package soap;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import business.externalservices.agencygateway.query.GatewayAgencyQueryService;

@WebService(serviceName = "GatewayAgencyWS")
public class GatewayAgencyWS {
    private final GatewayAgencyQueryService gatewayAgencyQueryService;

    @Inject
    public GatewayAgencyWS(final GatewayAgencyQueryService gatewayAgencyQueryService) {
        this.gatewayAgencyQueryService = gatewayAgencyQueryService;
    }

    @WebMethod(operationName = "holaws")
    public Void holaWS() {
        return null;
    }
}
