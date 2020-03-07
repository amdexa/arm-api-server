
package com.amdexa.misc.arm.api;

import com.amdexa.misc.arm.model.*;
import com.amdexa.misc.arm.model.APIError;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;



@Api(value = "process", description = "The process API", tags = "Business Processes")
public interface ProcessAPI {

    @ApiOperation(value = "", nickname = "processAttorney", notes = "Used to add an Attorney information", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Business Processes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/process/attorney",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<GeneralSuccessResp> processAttorney(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId, @ApiParam(value = "The attorney endpoint request body is a JSON Object following the attorneyRequest schema.  The object has the following properties." ,required=true )  @Valid @RequestBody AttorneyRequest attorneyRequest);


    @ApiOperation(value = "", nickname = "processBankruptcy", notes = "Used to post bankruptcy status", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Business Processes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/process/bankruptcy",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<GeneralSuccessResp> processBankruptcy(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId, @ApiParam(value = "The bankruptcy endpoint request body is a JSON Object following the bankruptcyRequest schema.  The object has the following properties." ,required=true )  @Valid @RequestBody BankruptcyRequest bankruptcyRequest);


    @ApiOperation(value = "", nickname = "processCease", notes = "Used to mark account as cease and desist", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Business Processes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/process/cease",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<GeneralSuccessResp> processCease(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId, @ApiParam(value = "The cease and desist endpoint request body is a JSON Object following the ceaseAndDesistRequest schema.  The object has the following properties." ,required=true )  @Valid @RequestBody CeaseRequest ceaseRequest);


    @ApiOperation(value = "", nickname = "processDeceased", notes = "Used to add a deceased record", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Business Processes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/process/deceased",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<GeneralSuccessResp> processDeceased(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId, @ApiParam(value = "The deceased endpoint request body is a JSON Object following the deceasedRequest schema.  The object has the following properties." ,required=true )  @Valid @RequestBody DeceasedRequest deceasedRequest);


    @ApiOperation(value = "", nickname = "processDispute", notes = "Used to create disputes on consumer accounts", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Business Processes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/process/dispute",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<GeneralSuccessResp> processDispute(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId, @ApiParam(value = "The dispute endpoint request body is a JSON Object following the disputeRequest schema.  The object has the following properties." ,required=true )  @Valid @RequestBody DisputeRequest disputeRequest);


    @ApiOperation(value = "", nickname = "processInsurance", notes = "Used to add insurance information", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Business Processes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/process/insurance",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<GeneralSuccessResp> processInsurance(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId, @ApiParam(value = "The insurance endpoint request body is a JSON Object following the insuranceRequest schema.  The object has the following properties." ,required=true )  @Valid @RequestBody InsuranceRequest insuranceRequest);

}
