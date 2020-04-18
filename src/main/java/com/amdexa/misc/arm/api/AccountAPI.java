package com.amdexa.misc.arm.api;

import com.amdexa.misc.arm.model.*;
import com.amdexa.misc.arm.model.APIError;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.Valid;

@Api(value = "account", description = "The account API", tags = "Account Search API")
public interface AccountAPI {

    @ApiOperation(value = "", nickname = "search", notes = "Used to search for accounts by consumer", response = AccountResponse.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Account Search API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = AccountResponse.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/account/search",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<AccountResponse> search(@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The Account Search by ssn endpoint request body is a JSON Object follows the accountSearchBySSNRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody AccountSearchRequest accountSearchRequest);

    @ApiOperation(value = "", nickname = "retrieve_consumer", notes = "Used to search for consumer by id", response = AccountResponse.class, authorizations = {
            @Authorization(value = "api_key")
    }, tags = {"Account Search API",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful Request", response = AccountResponse.class),
            @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
            @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
            @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
            @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
            @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class)})
    @RequestMapping(value = "/account/{id}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<ConsumerResponse> retrieveConsumer(@ApiParam(value = "A unique session id for this login.", required = true) @RequestHeader(value = "authorization", required = true) String sessionId,
                                                             @ApiParam(value = "consumer id to lookup", required = true) @PathVariable long id);

    @ApiOperation(value = "", nickname = "create_consumer", notes = "Used to search for consumer by id", response = AccountResponse.class, authorizations = {
            @Authorization(value = "api_key")
    }, tags = {"Account Search API",})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful Request", response = Object.class),
            @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
            @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
            @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
            @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
            @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class)})
    @RequestMapping(value = "/account",
            consumes = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<Object> createConsumer(@ApiParam(value = "A unique session id for this login.", required = true) @RequestHeader(value = "authorization", required = true) String sessionId,
                                                             @ApiParam(value = "consumer to create", required = true) @Valid @RequestBody ConsumerResponse consumerReq);
}
