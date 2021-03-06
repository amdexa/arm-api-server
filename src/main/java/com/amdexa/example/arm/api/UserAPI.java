/*
 * Copyright (c) 2020 Amdexa. (https://amdexa.com) All Rights Reserved.
 *
 * Amdexa licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.amdexa.example.arm.api;

import com.amdexa.example.arm.model.APIError;
import com.amdexa.example.arm.model.LoginRequest;
import com.amdexa.example.arm.model.LoginResponse;
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

    @ApiOperation(value = "", nickname = "checkLoginResponse", notes = "Verify the login response", response = LoginResponse.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "User API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = LoginResponse.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/user/checkloginresponse/{requestId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LoginResponse> checkLoginResponse(@ApiParam(value = "The username of the user for the login.  Required." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "The Request ID returned to you as part of a status 598 on a login request.",required=true) @PathVariable("requestId") String requestId, @ApiParam(value = "A unique session id for this login." ) @RequestHeader(value="authorization", required=false) String sessionId);


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
    ResponseEntity<Void> checkResponse(@ApiParam(value = "Request Header of the username of the user for the login.  Required." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login. Required" ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The Request ID returned.",required=true) @PathVariable("requestId") String requestId);


    @ApiOperation(value = "", nickname = "login", notes = "Used to login to the system", response = LoginResponse.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "User API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = LoginResponse.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/user/login",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LoginResponse> login(@ApiParam(value = "The Login Request Body is a JSON object with the following properties:", required = true)
                                        @Valid @RequestBody LoginRequest loginrequest);

}
