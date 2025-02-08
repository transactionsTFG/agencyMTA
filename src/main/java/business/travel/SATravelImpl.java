package business.travel;


import business.type.Type;
import common.dto.result.Result;
import common.exceptions.SAException;
import common.exceptions.TravelException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class SATravelImpl implements SATravel {

    @PersistenceContext(unitName = "MtaAgency")
    private EntityManager em;

    @Override
    public Result<Void> getFlight(long idFlight) {
        return Result.success(null);
    }
    
}
