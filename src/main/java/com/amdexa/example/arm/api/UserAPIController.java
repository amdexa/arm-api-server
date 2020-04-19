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

import com.amdexa.example.arm.model.Loginrequest;
import com.amdexa.example.arm.model.Loginresponse;
import com.amdexa.example.arm.service.AuthenticationService;
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
public class UserAPIController implements UserAPI {

    private static final Logger log = LoggerFactory.getLogger(UserAPIController.class);

    @Autowired
    AuthenticationService authenticationService;

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    public UserAPIController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Loginresponse> checkLoginResponse(@ApiParam(value = "The username of the user for the login.  Required.", required = true) @RequestHeader(value = "username", required = true) String username,
                                                            @ApiParam(value = "The Request ID returned", required = true) @PathVariable("requestId") String requestId,
                                                            @ApiParam(value = "A unique session id for this login.") @RequestHeader(value = "authorization", required = false) String sessionId) {
        return new ResponseEntity<Loginresponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> checkResponse(@ApiParam(value = "Request Header of the username of the user for the login.  Required.", required = true) @RequestHeader(value = "username", required = true) String username,
                                              @ApiParam(value = "A unique session id for this login. Required", required = true) @RequestHeader(value = "authorization", required = true) String sessionId,
                                              @ApiParam(value = "The Request ID returned.", required = true) @PathVariable("requestId") String requestId) {
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Loginresponse> login(@ApiParam(value = "The Login Request Body is a JSON object with the following properties:", required = true) @Valid @RequestBody Loginrequest loginrequest) {
        Loginresponse res = new Loginresponse();
        res.setSessionID(authenticationService.login(loginrequest.getUsername(), loginrequest.getPasssword()));
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

}
