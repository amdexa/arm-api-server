package com.amdexa.misc.arm.api;

import com.amdexa.misc.arm.model.AccountSearchByAccountNumberRequest;
import com.amdexa.misc.arm.model.AccountSearchByNameRequest;
import com.amdexa.misc.arm.model.AccountSearchByPhoneRequest;
import com.amdexa.misc.arm.model.AccountSearchBySSNRequest;
import com.amdexa.misc.arm.model.AccountSearchResp;
import com.amdexa.misc.arm.model.Cloudapierror;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Api(value = "account", description = "the account API")
public interface AccountApi {

    @ApiOperation(value = "", nickname = "accountSearchbyaccountnumberPost", notes = "Used to search for accounts by account number", response = AccountSearchResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Account Search API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = AccountSearchResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = Cloudapierror.class) })
    @RequestMapping(value = "/account/searchbyaccountnumber",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<AccountSearchResp> accountSearchbyaccountnumberPost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The Account Search by account number endpoint request body is a JSON Object follows the accountSearchByAccountNumberRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody AccountSearchByAccountNumberRequest accountSearchByAccountNumberRequest);


    @ApiOperation(value = "", nickname = "accountSearchbynamePost", notes = "Used to search for accounts by consumer name", response = AccountSearchResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Account Search API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = AccountSearchResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = Cloudapierror.class) })
    @RequestMapping(value = "/account/searchbyname",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<AccountSearchResp> accountSearchbynamePost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The Account Search by name endpoint request body is a JSON Object follows the accountSearchByNameRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody AccountSearchByNameRequest accountSearchByNameRequest);


    @ApiOperation(value = "", nickname = "accountSearchbyphonePost", notes = "Used to search for accounts by consumer phone number", response = AccountSearchResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Account Search API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = AccountSearchResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = Cloudapierror.class) })
    @RequestMapping(value = "/account/searchbyphone",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<AccountSearchResp> accountSearchbyphonePost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The Account Search by Phone endpoint request body is a JSON Object follows the accountSearchByPhoneRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody AccountSearchByPhoneRequest accountSearchByPhoneRequest);


    @ApiOperation(value = "", nickname = "accountSearchbyssnPost", notes = "Used to search for accounts by consumer SSN", response = AccountSearchResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Account Search API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = AccountSearchResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = Cloudapierror.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = Cloudapierror.class) })
    @RequestMapping(value = "/account/searchbyssn",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<AccountSearchResp> accountSearchbyssnPost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The Account Search by ssn endpoint request body is a JSON Object follows the accountSearchBySSNRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody AccountSearchBySSNRequest accountSearchBySSNRequest);

}
