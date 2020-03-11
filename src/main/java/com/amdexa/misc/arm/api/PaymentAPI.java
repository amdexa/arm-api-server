package com.amdexa.misc.arm.api;

import com.amdexa.misc.arm.model.*;
import com.amdexa.misc.arm.model.APIError;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Api(value = "payment", description = "The payment API", tags = "Payments API")
public interface PaymentAPI {

    @ApiOperation(value = "", nickname = "deletePaymentArranged", notes = "Used to delete a previously created pre-arranged payment", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Payments API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/payment/arranged/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<GeneralSuccessResp> deletePaymentArranged(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId, @ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId, @ApiParam(value = "The delete PA payment endpoint request body is a JSON Object following the deletePAPaymentRequest schema." ,required=true )  @Valid @RequestBody DeletePAPaymentRequest deletePAPaymentRequest);


    @ApiOperation(value = "", nickname = "updatePaymentArranged", notes = "Used to update a previously created arranged payment", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Payments API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/payment/arranged/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<GeneralSuccessResp> updatePaymentArranged(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId, @ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId, @ApiParam(value = "The update PA payment endpoint request body is a JSON Object following the updatePAPaymentRequest schema. The object has the following properties:" ,required=true )  @Valid @RequestBody UpdatePAPaymentRequest updatePAPaymentRequest);


    @ApiOperation(value = "", nickname = "deletePaymentArrangement", notes = "Used to delete a payment arrangement for a consumer", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Payments API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/payment/arrangement/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<GeneralSuccessResp> deletePaymentArrangement(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId, @ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId, @ApiParam(value = "The delete payment endpoint request body is a JSON Object following the deletePaymentArrangementRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody DeletePaymentArrangementRequest deletePaymentArrangementRequest);


    @ApiOperation(value = "", nickname = "addPaymentArrangement", notes = "Used to create a payment arrangement for a consumer", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Payments API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/payment/arrangement",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<GeneralSuccessResp> addPaymentArrangement(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId, @ApiParam(value = "The post payment arrangement endpoint request body is a JSON Object following the createPaymentArrangementRequest schema. The object has the following properties:" ,required=true )  @Valid @RequestBody CreatePaymentArrangementRequest createPaymentArrangementRequest);


    @ApiOperation(value = "", nickname = "paymentCardtypeCalc", notes = "Used to determine if the type of card is credit or debit, based on the card number.", response = CardTypeCalcResponse.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Payments API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = CardTypeCalcResponse.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/payment/cardtypecalc",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<CardTypeCalcResponse> paymentCardtypeCalc(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId, @ApiParam(value = "The post card type calc endpoint request body is a JSON Object following the cardTypeCalcRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody CardTypeCalcRequest cardTypeCalcRequest);


    @ApiOperation(value = "", nickname = "deletePayment", notes = "Used to delete a payment", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Payments API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/payment/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<GeneralSuccessResp> deletePayment(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId, @ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId, @ApiParam(value = "The delete payment endpoint request body is a JSON Object following the deletePaymentRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody DeletePaymentRequest deletePaymentRequest);


    @ApiOperation(value = "", nickname = "updatePayment", notes = "Used to update a payment", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Payments API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/payment/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<GeneralSuccessResp> updatePayment(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId, @ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId, @ApiParam(value = "The update payment endpoint request body is a JSON Object following the updatePaymentRequest schema. The object has the following properties:" ,required=true )  @Valid @RequestBody UpdatePaymentRequest updatePaymentRequest);


    @ApiOperation(value = "", nickname = "paymentFeeByPercentCalc", notes = "Used to calculate the fee for a payment for each type of payment", response = FeeByPercentCalcResponse.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Payments API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = FeeByPercentCalcResponse.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/payment/feebypercentcalc",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<FeeByPercentCalcResponse> paymentFeeByPercentCalc(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId, @ApiParam(value = "The fee by percent calc endpoint request body is a JSON Object following the feeByPercentCalcRequest schema.  The object has the following properties." ,required=true )  @Valid @RequestBody FeeByPercentCalcRequest feeByPercentCalcRequest);


    @ApiOperation(value = "", nickname = "getPaymentHistory", notes = "Used to get the payment history for a consumer", response = PaymentHistoryResponse.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Payments API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = PaymentHistoryResponse.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/payment/history/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<PaymentHistoryResponse> getPaymentHistory(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId, @ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId, @ApiParam(value = "The payment history endpoint request body is a JSON Object following the paymentHistoryRequest schema. The object has the following properties:" ,required=true )  @Valid @RequestBody PaymentHistoryRequest paymentHistoryRequest);


    @ApiOperation(value = "", nickname = "addPaymentImmediateACH", notes = "Used to make an immediate payment using the ACH method", response = ImmedPaymentACHResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Payments API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = ImmedPaymentACHResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/payment/immediateach",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<ImmedPaymentACHResp> addPaymentImmediateACH(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId, @ApiParam(value = "The Immediate Payment with ACH endpoint request body is a JSON Object following the immedPaymentACHRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody ImmedPaymentACHRequest immedPaymentACHRequest);


    @ApiOperation(value = "", nickname = "paymentImmediatecardPost", notes = "Used to make an immediate payment using either a credit or debit card", response = ImmedPaymentCCResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Payments API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = ImmedPaymentCCResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/payment/immediatecard",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<ImmedPaymentCCResp> paymentImmediatecardPost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The Immediate Payment with CC endpoint request body is a JSON Object following the immedPaymentCCRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody ImmedPaymentCCRequest immedPaymentCCRequest);


    @ApiOperation(value = "", nickname = "paymentImmediatewithtokenPost", notes = "Used to make an immediate payment using a pre-assigned token", response = ImmediatePaymentTokenResponse.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Payments API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = ImmediatePaymentTokenResponse.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/payment/immediatewithtoken",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<ImmediatePaymentTokenResponse> paymentImmediatewithtokenPost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The immediate payment with token endpoint request body is a JSON Object follows the immediatePaymentWithTokenRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody ImmediatePaymentWithTokenRequest immediatePaymentWithTokenRequest);


    @ApiOperation(value = "", nickname = "paymentPendingConsumerIdGet", notes = "Used to get the pending payments for a consumer", response = PendingPaymentsResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Payments API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = PendingPaymentsResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/payment/pending/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<PendingPaymentsResp> paymentPendingConsumerIdGet(@ApiParam(value = "Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Empty empty);


    @ApiOperation(value = "", nickname = "paymentPost", notes = "Used to create a payment", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Payments API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/payment",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<GeneralSuccessResp> paymentPost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The create payment endpoint request body is a JSON Object following the createSinglePaymentRequest schema. The object has the following properties:" ,required=true )  @Valid @RequestBody CreateSinglePaymentRequest createSinglePaymentRequest);


    @ApiOperation(value = "", nickname = "paymentSchedulePost", notes = "Used to create a schedule for an arranged payment", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Payments API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/payment/schedule",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<GeneralSuccessResp> paymentSchedulePost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The paSchedule endpoint request body is a JSON Object follows the paScheduleRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody ScheduleRequest paScheduleRequest);


    @ApiOperation(value = "", nickname = "paymentTokenizemethodachPost", notes = "Used to create a tokenized version of an ACH payment", response = TokenizePaymentACHResponse.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Payments API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = TokenizePaymentACHResponse.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/payment/tokenizemethodach",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<TokenizePaymentACHResponse> paymentTokenizemethodachPost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The post tokenize ACH payment endpoint request body is a JSON Object following the tokenizePaymentACHRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody TokenizePaymentACHRequest tokenizePaymentACHRequest);


    @ApiOperation(value = "", nickname = "paymentTokenizemethodccPost", notes = "Used to create a tokenized version of an ACH payment", response = TokenizePaymentMethodCCResponse.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Payments API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = TokenizePaymentMethodCCResponse.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/payment/tokenizemethodcc",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<TokenizePaymentMethodCCResponse> paymentTokenizemethodccPost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody TokenizePaymentMethodCCRequest tokenizePaymentMethodCCRequest);

}
