package business.travel;

import common.dto.result.Result;

public interface SATravel {
    Result<Void> getFlight(final long idTravel);
} 
