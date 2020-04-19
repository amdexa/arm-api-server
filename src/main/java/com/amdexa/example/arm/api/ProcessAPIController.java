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

import com.amdexa.example.arm.model.AttorneyRequest;
import com.amdexa.example.arm.model.BankruptcyRequest;
import com.amdexa.example.arm.model.DisputeRequest;
import com.amdexa.example.arm.model.InsuranceRequest;
import com.amdexa.example.arm.model.CeaseRequest;
import com.amdexa.example.arm.model.DeceasedRequest;
import com.amdexa.example.arm.model.GeneralSuccessResp;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;

@Controller
public class ProcessAPIController implements ProcessAPI {

    private static final Logger log = LoggerFactory.getLogger(ProcessAPIController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    public ProcessAPIController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<GeneralSuccessResp> processAttorney( @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The attorney endpoint request body is a JSON Object following the attorneyRequest schema.  The object has the following properties." ,required=true )  @Valid @RequestBody AttorneyRequest attorneyRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> processBankruptcy( @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The bankruptcy endpoint request body is a JSON Object following the bankruptcyRequest schema.  The object has the following properties." ,required=true )  @Valid @RequestBody BankruptcyRequest bankruptcyRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> processCease( @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The cease and desist endpoint request body is a JSON Object following the ceaseAndDesistRequest schema.  The object has the following properties." ,required=true )  @Valid @RequestBody CeaseRequest ceaseRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> processDeceased( @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The deceased endpoint request body is a JSON Object following the deceasedRequest schema.  The object has the following properties." ,required=true )  @Valid @RequestBody DeceasedRequest deceasedRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> processDispute( @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The dispute endpoint request body is a JSON Object following the disputeRequest schema.  The object has the following properties." ,required=true )  @Valid @RequestBody DisputeRequest disputeRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> processInsurance( @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The insurance endpoint request body is a JSON Object following the insuranceRequest schema.  The object has the following properties." ,required=true )  @Valid @RequestBody InsuranceRequest insuranceRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
