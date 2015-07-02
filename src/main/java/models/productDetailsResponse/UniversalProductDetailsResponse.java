package models.productDetailsResponse;

import models.ResponseBase;
import models.productDetailsResponse.productDetailsResult.UniversalProductDetailsResult;

public class UniversalProductDetailsResponse extends ResponseBase {
    private UniversalProductDetailsResult result;

    public UniversalProductDetailsResponse() {
    }

    public UniversalProductDetailsResult getResult() {
        return result;
    }
}
