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
import com.amdexa.example.arm.model.AccountResponse;
import com.amdexa.example.arm.model.AccountSearchRequest;
import com.amdexa.example.arm.model.ConsumerResponse;
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
