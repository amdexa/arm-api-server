
package com.amdexa.misc.arm.api;

import com.amdexa.misc.arm.model.APIError;
import com.amdexa.misc.arm.model.Empty;
import com.amdexa.misc.arm.model.Loginrequest;
import com.amdexa.misc.arm.model.Loginresponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;


@Api(value = "user", description = "The user API", tags = "User API")
public interface UserAPI {

    @ApiOperation(value = "", nickname = "checkLoginResponse", notes = "Verify the login response", response = Loginresponse.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "User API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = Loginresponse.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/user/checkloginresponse/{requestId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Loginresponse> checkLoginResponse(@ApiParam(value = "The username of the user for the login.  Required." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "The Request ID returned to you as part of a status 598 on a login request.",required=true) @PathVariable("requestId") String requestId, @ApiParam(value = "" ,required=true )  @Valid @RequestBody Empty empty, @ApiParam(value = "A unique session id for this login." ) @RequestHeader(value="sessionId", required=false) String sessionId);


    @ApiOperation(value = "", nickname = "checkResponse", notes = "Used to verify the response", authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "User API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request"),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/user/checkresponse/{requestId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> checkResponse(@ApiParam(value = "Request Header of the username of the user for the login.  Required." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login. Required" ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId, @ApiParam(value = "The Request ID returned.",required=true) @PathVariable("requestId") String requestId, @ApiParam(value = "" ,required=true )  @Valid @RequestBody Empty empty);


    @ApiOperation(value = "", nickname = "login", notes = "Used to login to the system", response = Loginresponse.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "User API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = Loginresponse.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/user/login",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Loginresponse> login(@ApiParam(value = "The Login Request Body is a JSON object with the following properties:", required = true)
                                        @Valid @RequestBody Loginrequest loginrequest);

}
