package com.amdexa.misc.arm.api;

import com.amdexa.misc.arm.model.AgentTransferRequest;
import com.amdexa.misc.arm.model.CallCompletedRequest;
import com.amdexa.misc.arm.model.Cloudapierror;
import com.amdexa.misc.arm.model.DisclosureRequest;
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

@Api(value = "contact", description = "the contact API")
public interface ContactApi {

    @ApiOperation(value = "", nickname = "contactAgenttransferPost", notes = "Used to transfer a call from an external, vendor system", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Contact API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = Cloudapierror.class) })
    @RequestMapping(value = "/contact/agenttransfer",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<GeneralSuccessResp> contactAgenttransferPost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The post agent transfer endpoint request body is a JSON Object following the agentTransferRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody AgentTransferRequest agentTransferRequest);


    @ApiOperation(value = "", nickname = "contactCallcompletedPost", notes = "How an external, vendor system can notify that a call was successfully handled by the vendor system", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Contact API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = Cloudapierror.class) })
    @RequestMapping(value = "/contact/callcompleted",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<GeneralSuccessResp> contactCallcompletedPost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The get call completed endpoint request body is a JSON Object following the callCompletedRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody CallCompletedRequest callCompletedRequest);


    @ApiOperation(value = "", nickname = "contactDisclosurePost", notes = "How an external vendor that is handling a communications contact with a consumer can notify what disclosures they have already provided to the consumer", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Contact API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 404, message = "Not found Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = Cloudapierror.class) })
    @RequestMapping(value = "/contact/disclosure",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<GeneralSuccessResp> contactDisclosurePost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The post disclosures endpoint request body is a JSON Object following the disclosure schema.  The object has the following properties" ,required=true )  @Valid @RequestBody DisclosureRequest disclosureRequest);


    @ApiOperation(value = "", nickname = "contactPaymentreceiptPost", notes = "Used to send an email receipt to the consumer", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Contact API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = Cloudapierror.class) })
    @RequestMapping(value = "/contact/paymentreceipt",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<GeneralSuccessResp> contactPaymentreceiptPost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The payment receipt endpoint request body is a JSON Object following the paymentReceiptRequest schema.  The object has the following properties." ,required=true )  @Valid @RequestBody PaymentReceiptRequest paymentReceiptRequest);


    @ApiOperation(value = "", nickname = "contactReceiptrequestPost", notes = "Used to request a receipt for the consumer", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Contact API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = Cloudapierror.class) })
    @RequestMapping(value = "/contact/receiptrequest",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<GeneralSuccessResp> contactReceiptrequestPost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The receipt request endpoint request body is a JSON Object following the receiptRequest schema.  The object has the following properties." ,required=true )  @Valid @RequestBody ReceiptRequest receiptRequest);

}
