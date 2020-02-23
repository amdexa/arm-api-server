package com.amdexa.misc.arm.api;

import com.amdexa.misc.arm.model.Empty;
import com.amdexa.misc.arm.model.Loginrequest;
import com.amdexa.misc.arm.model.Loginresponse;
import com.amdexa.misc.arm.model.RotatePasswordRequest;
import com.amdexa.misc.arm.model.RotatePasswordResp;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;



@Controller
public class UserApiController implements UserApi {

    private static final Logger log = LoggerFactory.getLogger(UserApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UserApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Loginresponse> userCheckloginresponseRequestIdPost(@ApiParam(value = "The username of the user for the login.  Required." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "The Request ID returned",required=true) @PathVariable("requestId") String requestId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Empty empty,@ApiParam(value = "A unique session id for this login." ) @RequestHeader(value="sessionId", required=false) String sessionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Loginresponse>(objectMapper.readValue("{  \"SessionID\" : \"SessionID\"}", Loginresponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Loginresponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Loginresponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> userCheckresponseRequestIdPost(@ApiParam(value = "Request Header of the username of the user for the login.  Required." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login. Required" ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The Request ID returned.",required=true) @PathVariable("requestId") String requestId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Empty empty) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Loginresponse> userLoginPost(@ApiParam(value = "The username of the user for the login.  Required." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "The Login Request Body is a JSON object with the following properties:" ,required=true )  @Valid @RequestBody Loginrequest loginrequest,@ApiParam(value = "A unique session id for this login." ) @RequestHeader(value="sessionId", required=false) String sessionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Loginresponse>(objectMapper.readValue("{  \"SessionID\" : \"SessionID\"}", Loginresponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Loginresponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Loginresponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RotatePasswordResp> userRotatepasswordPost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The Rotate Password (which allows you to rotate the password for the Systems API User) endpoint request body is a JSON Object following the rotatePasswordRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody RotatePasswordRequest rotatePasswordRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RotatePasswordResp>(objectMapper.readValue("{  \"Status\" : \"Status\",  \"CloudAPIUserPassword\" : \"CloudAPIUserPassword\",  \"XCloudCorrelationID\" : \"XCloudCorrelationID\"}", RotatePasswordResp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RotatePasswordResp>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RotatePasswordResp>(HttpStatus.NOT_IMPLEMENTED);
    }

}
