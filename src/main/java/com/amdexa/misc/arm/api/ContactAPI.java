package com.amdexa.misc.arm.api;

import com.amdexa.misc.arm.model.APIError;
import com.amdexa.misc.arm.model.GeneralSuccessResp;
import com.amdexa.misc.arm.model.PaymentReceiptRequest;
import com.amdexa.misc.arm.model.ReceiptRequest;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Api(value = "contact", description = "The contact API", tags = "Contact API")
public interface ContactAPI {


    @ApiOperation(value = "", nickname = "paymentReceipt", notes = "Used to send an email receipt to the consumer", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Contact API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/contact/paymentreceipt",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<GeneralSuccessResp> paymentReceipt( @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The payment receipt endpoint request body is a JSON Object following the paymentReceiptRequest schema.  The object has the following properties." ,required=true )  @Valid @RequestBody PaymentReceiptRequest paymentReceiptRequest);


    @ApiOperation(value = "", nickname = "receiptRequest", notes = "Used to request a receipt for the consumer", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Contact API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/contact/receiptrequest",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<GeneralSuccessResp> receiptRequest( @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The receipt request endpoint request body is a JSON Object following the receiptRequest schema.  The object has the following properties." ,required=true )  @Valid @RequestBody ReceiptRequest receiptRequest);

}
