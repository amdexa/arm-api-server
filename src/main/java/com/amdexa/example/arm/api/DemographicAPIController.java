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

import com.amdexa.example.arm.model.AddressResponse;
import com.amdexa.example.arm.model.DeleteEmailRequest;
import com.amdexa.example.arm.model.FinancialProfileResponse;
import com.amdexa.example.arm.model.GeneralSuccessResp;
import com.amdexa.example.arm.model.MaritalStatusResponse;
import com.amdexa.example.arm.model.PoeResponse;
import com.amdexa.example.arm.model.SpouseResponse;
import com.amdexa.example.arm.model.UpdateAddressRequest;
import com.amdexa.example.arm.model.UpdateEmailRequest;
import com.amdexa.example.arm.model.UpdateFinancialProfileRequest;
import com.amdexa.example.arm.model.UpdateMaritalStatusRequest;
import com.amdexa.example.arm.model.UpdatePhoneRequest;
import com.amdexa.example.arm.model.UpdatePoeRequest;
import com.amdexa.example.arm.model.UpdateSpouseRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;

@Controller
public class DemographicAPIController implements DemographicAPI {

    private static final Logger log = LoggerFactory.getLogger(DemographicAPIController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    public DemographicAPIController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<GeneralSuccessResp> deleteAddress(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId) {
          return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AddressResponse> getAddress(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,
                                                      @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId) {
        return new ResponseEntity<AddressResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> updateAddress(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The update address request body is a JSON Object following the below properties.  Blank values will be treated as no change." ,required=true )  @Valid @RequestBody UpdateAddressRequest updateAddressRequest) {
        return new ResponseEntity<GeneralSuccessResp>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> deleteEmail(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The delete email address endpoint request body is a JSON Object following the delete email address schema." ,required=true )  @Valid @RequestBody DeleteEmailRequest deleteEmailRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> updateEmail(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The Update Email Address endpoint request body is a JSON Object following the updateEmailRequest schema. The object has the following properties:" ,required=true )  @Valid @RequestBody UpdateEmailRequest updateEmailRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FinancialProfileResponse> getFinancialProfile(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> updateFinancialProfile(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The Update financial profile endpoint request body is a JSON Object following the updateFinancialProfileRequest schema. The object has the following properties:" ,required=true )  @Valid @RequestBody UpdateFinancialProfileRequest updateFinancialProfileRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MaritalStatusResponse> getMaritalStatus(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> updateMaritalStatus(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The update marital status endpoint request body is a JSON Object following the updateMaritalStatusRequest schema. The object has the following properties" ,required=true )  @Valid @RequestBody UpdateMaritalStatusRequest updateMaritalStatusRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> deletePhoneNumber(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId, @ApiParam(value = "The 10 digit Phone Number to remove",required=true) @PathVariable("phoneNumber") String phoneNumber,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> updatePhoneNumber(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId, @ApiParam(value = "Ten digit phone number.",required=true) @PathVariable("phoneNumber") String phoneNumber,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The update phone request body is a JSON Object following the below properties." ,required=true )  @Valid @RequestBody UpdatePhoneRequest updatePhoneRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PoeResponse> getPlaceOfEmployment(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> updatePlaceOfEmployment(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The Update POE endpoint request body is a JSON Object following the updatePOERequest schema. The object has the following properties" ,required=true )  @Valid @RequestBody UpdatePoeRequest updatePoeRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SpouseResponse> getSpouse(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> updateSpouse(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The Update Spouse endpoint request body is a JSON Object following the updateSpouseRequest schema. The object has the following properties" ,required=true )  @Valid @RequestBody UpdateSpouseRequest updateSpouseRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
