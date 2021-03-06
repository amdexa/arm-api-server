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

import com.amdexa.example.arm.model.*;
import com.amdexa.example.arm.model.APIError;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Api(value = "demographic", description = "The demographic API", tags = "Demographics API")
public interface DemographicAPI {

    @ApiOperation(value = "", nickname = "deleteAddress", notes = "Used to delete the address for a consumer", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/demographic/address/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<GeneralSuccessResp> deleteAddress(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId);


    @ApiOperation(value = "", nickname = "getAddress", notes = "Used to retrieve the address for a consumer", response = AddressResponse.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = AddressResponse.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/demographic/address/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<AddressResponse> getAddress(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId);


    @ApiOperation(value = "", nickname = "updateAddress", notes = "Used to update the address for a consumer", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/demographic/address/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<GeneralSuccessResp> updateAddress(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The update address request body is a JSON Object following the below properties.  Blank values will be treated as no change." ,required=true )  @Valid @RequestBody UpdateAddressRequest updateAddressRequest);


    @ApiOperation(value = "", nickname = "deleteEmailAddress", notes = "Used to delete the email address for a consumer", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/demographic/email/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<GeneralSuccessResp> deleteEmail(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The delete email address endpoint request body is a JSON Object following the delete email address schema." ,required=true )  @Valid @RequestBody DeleteEmailRequest deleteEmailRequest);


    @ApiOperation(value = "", nickname = "updateEmailAddress", notes = "Used to update the email address for a consumer", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/demographic/email/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<GeneralSuccessResp> updateEmail(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The Update Email Address endpoint request body is a JSON Object following the updateEmailRequest schema. The object has the following properties:" ,required=true )  @Valid @RequestBody UpdateEmailRequest updateEmailRequest);


    @ApiOperation(value = "", nickname = "getFinancialProfile", notes = "Used to get the financial profile the consumer", response = FinancialProfileResponse.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = FinancialProfileResponse.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/demographic/financialprofile/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<FinancialProfileResponse> getFinancialProfile(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId);


    @ApiOperation(value = "", nickname = "updateFinancialProfile", notes = "Used to update the financial profile the consumer", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/demographic/financialprofile/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<GeneralSuccessResp> updateFinancialProfile(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The Update financial profile endpoint request body is a JSON Object following the updateFinancialProfileRequest schema. The object has the following properties:" ,required=true )  @Valid @RequestBody UpdateFinancialProfileRequest updateFinancialProfileRequest);


    @ApiOperation(value = "", nickname = "getMaritalStatus", notes = "Used to get the marital status for the consumer", response = MaritalStatusResponse.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = MaritalStatusResponse.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/demographic/maritalstatus/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<MaritalStatusResponse> getMaritalStatus(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId);


    @ApiOperation(value = "", nickname = "updateMaritalStatus", notes = "Used to update the marital status for the consumer", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/demographic/maritalstatus/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<GeneralSuccessResp> updateMaritalStatus(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The update marital status endpoint request body is a JSON Object following the updateMaritalStatusRequest schema. The object has the following properties" ,required=true )  @Valid @RequestBody UpdateMaritalStatusRequest updateMaritalStatusRequest);


    @ApiOperation(value = "", nickname = "deletePhoneNumber", notes = "Used to delete the phone number for the consumer", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/demographic/phone/{consumerId}/{phoneNumber}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<GeneralSuccessResp> deletePhoneNumber(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId, @ApiParam(value = "The 10 digit Phone Number to remove",required=true) @PathVariable("phoneNumber") String phoneNumber,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId);


    @ApiOperation(value = "", nickname = "updatePhoneNumber", notes = "Used to update the phone number for the consumer", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/demographic/phone/{consumerId}/{phoneNumber}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<GeneralSuccessResp> updatePhoneNumber(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId, @ApiParam(value = "Ten digit phone number.",required=true) @PathVariable("phoneNumber") String phoneNumber,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The update phone request body is a JSON Object following the below properties." ,required=true )  @Valid @RequestBody UpdatePhoneRequest updatePhoneRequest);


    @ApiOperation(value = "", nickname = "getPlaceOfEmployment", notes = "Used to get the place of employment for the consumer", response = EmployerResponse.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = EmployerResponse.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/demographic/poe/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<EmployerResponse> getPlaceOfEmployment(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId);


    @ApiOperation(value = "", nickname = "updatePlaceOfEmployment", notes = "Used to update the place of employment for the consumer", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/demographic/poe/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<GeneralSuccessResp> updatePlaceOfEmployment(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The Update POE endpoint request body is a JSON Object following the updatePOERequest schema. The object has the following properties" ,required=true )  @Valid @RequestBody UpdateEmployerRequest updatePoeRequest);


    @ApiOperation(value = "", nickname = "getSpouse", notes = "Used to get the spouse information for the consumer", response = SpouseResponse.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = SpouseResponse.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/demographic/spouse/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<SpouseResponse> getSpouse(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId);


    @ApiOperation(value = "", nickname = "updateSpouse", notes = "Used to update the spouse information for the consumer", response = GeneralSuccessResp.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "Demographics API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Request", response = GeneralSuccessResp.class),
        @ApiResponse(code = 400, message = "Bad Request Status Code", response = APIError.class),
        @ApiResponse(code = 401, message = "Unauthorized Status Code", response = APIError.class),
        @ApiResponse(code = 403, message = "Forbidden Status Code", response = APIError.class),
        @ApiResponse(code = 404, message = "Not Found Status Code", response = APIError.class),
        @ApiResponse(code = 500, message = "Internal Server Error Status Code", response = APIError.class) })
    @RequestMapping(value = "/demographic/spouse/{consumerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<GeneralSuccessResp> updateSpouse(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The Update Spouse endpoint request body is a JSON Object following the updateSpouseRequest schema. The object has the following properties" ,required=true )  @Valid @RequestBody UpdateSpouseRequest updateSpouseRequest);

}
