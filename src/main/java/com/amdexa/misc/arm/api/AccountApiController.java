package com.amdexa.misc.arm.api;

import com.amdexa.misc.arm.model.AccountSearchByAccountNumberRequest;
import com.amdexa.misc.arm.model.AccountSearchByNameRequest;
import com.amdexa.misc.arm.model.AccountSearchByPhoneRequest;
import com.amdexa.misc.arm.model.AccountSearchBySSNRequest;
import com.amdexa.misc.arm.model.AccountSearchResp;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
public class AccountApiController implements AccountApi {

    private static final Logger log = LoggerFactory.getLogger(AccountApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AccountApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<AccountSearchResp> accountSearchbyaccountnumberPost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The Account Search by account number endpoint request body is a JSON Object follows the accountSearchByAccountNumberRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody AccountSearchByAccountNumberRequest accountSearchByAccountNumberRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"ConsumerAccountSets\" : [ {    \"CellPhone\" : \"CellPhone\",    \"PostalCode\" : \"PostalCode\",    \"SpouseLastName\" : \"SpouseLastName\",    \"CellConsent\" : \"CellConsent\",    \"SpouseFirstName\" : \"SpouseFirstName\",    \"CellUMConsent\" : \"CellUMConsent\",    \"HomeUMConsent\" : \"HomeUMConsent\",    \"Status\" : \"Status\",    \"DateOfBirth\" : \"DateOfBirth\",    \"LastCall\" : \"LastCall\",    \"POEName\" : \"POEName\",    \"WorkPhone\" : \"WorkPhone\",    \"consumerId\" : \"consumerId\",    \"FirstName\" : \"FirstName\",    \"SpouseHomePhone\" : \"SpouseHomePhone\",    \"City\" : \"City\",    \"WorkUMConsent\" : \"WorkUMConsent\",    \"AddressLine2\" : \"AddressLine2\",    \"AddressLine1\" : \"AddressLine1\",    \"SMSConsent\" : \"SMSConsent\",    \"HomePhone\" : \"HomePhone\",    \"State\" : \"State\",    \"Country\" : \"Country\",    \"LastName\" : \"LastName\",    \"Balance\" : \"Balance\",    \"Last4SSN\" : \"Last4SSN\",    \"WorkConsent\" : \"WorkConsent\",    \"Accounts\" : [ {      \"ClientName\" : \"ClientName\",      \"ComakerFirstName\" : \"ComakerFirstName\",      \"AttorneyName\" : \"AttorneyName\",      \"ListDate\" : \"ListDate\",      \"ComakerLastName\" : \"ComakerLastName\",      \"AccountNumber\" : \"AccountNumber\",      \"AttorneyPhone\" : \"AttorneyPhone\"    }, {      \"ClientName\" : \"ClientName\",      \"ComakerFirstName\" : \"ComakerFirstName\",      \"AttorneyName\" : \"AttorneyName\",      \"ListDate\" : \"ListDate\",      \"ComakerLastName\" : \"ComakerLastName\",      \"AccountNumber\" : \"AccountNumber\",      \"AttorneyPhone\" : \"AttorneyPhone\"    } ],    \"MinimumPaymentAmount\" : \"MinimumPaymentAmount\"  }, {    \"CellPhone\" : \"CellPhone\",    \"PostalCode\" : \"PostalCode\",    \"SpouseLastName\" : \"SpouseLastName\",    \"CellConsent\" : \"CellConsent\",    \"SpouseFirstName\" : \"SpouseFirstName\",    \"CellUMConsent\" : \"CellUMConsent\",    \"HomeUMConsent\" : \"HomeUMConsent\",    \"Status\" : \"Status\",    \"DateOfBirth\" : \"DateOfBirth\",    \"LastCall\" : \"LastCall\",    \"POEName\" : \"POEName\",    \"WorkPhone\" : \"WorkPhone\",    \"consumerId\" : \"consumerId\",    \"FirstName\" : \"FirstName\",    \"SpouseHomePhone\" : \"SpouseHomePhone\",    \"City\" : \"City\",    \"WorkUMConsent\" : \"WorkUMConsent\",    \"AddressLine2\" : \"AddressLine2\",    \"AddressLine1\" : \"AddressLine1\",    \"SMSConsent\" : \"SMSConsent\",    \"HomePhone\" : \"HomePhone\",    \"State\" : \"State\",    \"Country\" : \"Country\",    \"LastName\" : \"LastName\",    \"Balance\" : \"Balance\",    \"Last4SSN\" : \"Last4SSN\",    \"WorkConsent\" : \"WorkConsent\",    \"Accounts\" : [ {      \"ClientName\" : \"ClientName\",      \"ComakerFirstName\" : \"ComakerFirstName\",      \"AttorneyName\" : \"AttorneyName\",      \"ListDate\" : \"ListDate\",      \"ComakerLastName\" : \"ComakerLastName\",      \"AccountNumber\" : \"AccountNumber\",      \"AttorneyPhone\" : \"AttorneyPhone\"    }, {      \"ClientName\" : \"ClientName\",      \"ComakerFirstName\" : \"ComakerFirstName\",      \"AttorneyName\" : \"AttorneyName\",      \"ListDate\" : \"ListDate\",      \"ComakerLastName\" : \"ComakerLastName\",      \"AccountNumber\" : \"AccountNumber\",      \"AttorneyPhone\" : \"AttorneyPhone\"    } ],    \"MinimumPaymentAmount\" : \"MinimumPaymentAmount\"  } ],  \"XCloudCorrelationID\" : \"XCloudCorrelationID\"}", AccountSearchResp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountSearchResp> accountSearchbynamePost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The Account Search by name endpoint request body is a JSON Object follows the accountSearchByNameRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody AccountSearchByNameRequest accountSearchByNameRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"ConsumerAccountSets\" : [ {    \"CellPhone\" : \"CellPhone\",    \"PostalCode\" : \"PostalCode\",    \"SpouseLastName\" : \"SpouseLastName\",    \"CellConsent\" : \"CellConsent\",    \"SpouseFirstName\" : \"SpouseFirstName\",    \"CellUMConsent\" : \"CellUMConsent\",    \"HomeUMConsent\" : \"HomeUMConsent\",    \"Status\" : \"Status\",    \"DateOfBirth\" : \"DateOfBirth\",    \"LastCall\" : \"LastCall\",    \"POEName\" : \"POEName\",    \"WorkPhone\" : \"WorkPhone\",    \"consumerId\" : \"consumerId\",    \"FirstName\" : \"FirstName\",    \"SpouseHomePhone\" : \"SpouseHomePhone\",    \"City\" : \"City\",    \"WorkUMConsent\" : \"WorkUMConsent\",    \"AddressLine2\" : \"AddressLine2\",    \"AddressLine1\" : \"AddressLine1\",    \"SMSConsent\" : \"SMSConsent\",    \"HomePhone\" : \"HomePhone\",    \"State\" : \"State\",    \"Country\" : \"Country\",    \"LastName\" : \"LastName\",    \"Balance\" : \"Balance\",    \"Last4SSN\" : \"Last4SSN\",    \"WorkConsent\" : \"WorkConsent\",    \"Accounts\" : [ {      \"ClientName\" : \"ClientName\",      \"ComakerFirstName\" : \"ComakerFirstName\",      \"AttorneyName\" : \"AttorneyName\",      \"ListDate\" : \"ListDate\",      \"ComakerLastName\" : \"ComakerLastName\",      \"AccountNumber\" : \"AccountNumber\",      \"AttorneyPhone\" : \"AttorneyPhone\"    }, {      \"ClientName\" : \"ClientName\",      \"ComakerFirstName\" : \"ComakerFirstName\",      \"AttorneyName\" : \"AttorneyName\",      \"ListDate\" : \"ListDate\",      \"ComakerLastName\" : \"ComakerLastName\",      \"AccountNumber\" : \"AccountNumber\",      \"AttorneyPhone\" : \"AttorneyPhone\"    } ],    \"MinimumPaymentAmount\" : \"MinimumPaymentAmount\"  }, {    \"CellPhone\" : \"CellPhone\",    \"PostalCode\" : \"PostalCode\",    \"SpouseLastName\" : \"SpouseLastName\",    \"CellConsent\" : \"CellConsent\",    \"SpouseFirstName\" : \"SpouseFirstName\",    \"CellUMConsent\" : \"CellUMConsent\",    \"HomeUMConsent\" : \"HomeUMConsent\",    \"Status\" : \"Status\",    \"DateOfBirth\" : \"DateOfBirth\",    \"LastCall\" : \"LastCall\",    \"POEName\" : \"POEName\",    \"WorkPhone\" : \"WorkPhone\",    \"consumerId\" : \"consumerId\",    \"FirstName\" : \"FirstName\",    \"SpouseHomePhone\" : \"SpouseHomePhone\",    \"City\" : \"City\",    \"WorkUMConsent\" : \"WorkUMConsent\",    \"AddressLine2\" : \"AddressLine2\",    \"AddressLine1\" : \"AddressLine1\",    \"SMSConsent\" : \"SMSConsent\",    \"HomePhone\" : \"HomePhone\",    \"State\" : \"State\",    \"Country\" : \"Country\",    \"LastName\" : \"LastName\",    \"Balance\" : \"Balance\",    \"Last4SSN\" : \"Last4SSN\",    \"WorkConsent\" : \"WorkConsent\",    \"Accounts\" : [ {      \"ClientName\" : \"ClientName\",      \"ComakerFirstName\" : \"ComakerFirstName\",      \"AttorneyName\" : \"AttorneyName\",      \"ListDate\" : \"ListDate\",      \"ComakerLastName\" : \"ComakerLastName\",      \"AccountNumber\" : \"AccountNumber\",      \"AttorneyPhone\" : \"AttorneyPhone\"    }, {      \"ClientName\" : \"ClientName\",      \"ComakerFirstName\" : \"ComakerFirstName\",      \"AttorneyName\" : \"AttorneyName\",      \"ListDate\" : \"ListDate\",      \"ComakerLastName\" : \"ComakerLastName\",      \"AccountNumber\" : \"AccountNumber\",      \"AttorneyPhone\" : \"AttorneyPhone\"    } ],    \"MinimumPaymentAmount\" : \"MinimumPaymentAmount\"  } ],  \"XCloudCorrelationID\" : \"XCloudCorrelationID\"}", AccountSearchResp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountSearchResp> accountSearchbyphonePost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The Account Search by Phone endpoint request body is a JSON Object follows the accountSearchByPhoneRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody AccountSearchByPhoneRequest accountSearchByPhoneRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"ConsumerAccountSets\" : [ {    \"CellPhone\" : \"CellPhone\",    \"PostalCode\" : \"PostalCode\",    \"SpouseLastName\" : \"SpouseLastName\",    \"CellConsent\" : \"CellConsent\",    \"SpouseFirstName\" : \"SpouseFirstName\",    \"CellUMConsent\" : \"CellUMConsent\",    \"HomeUMConsent\" : \"HomeUMConsent\",    \"Status\" : \"Status\",    \"DateOfBirth\" : \"DateOfBirth\",    \"LastCall\" : \"LastCall\",    \"POEName\" : \"POEName\",    \"WorkPhone\" : \"WorkPhone\",    \"consumerId\" : \"consumerId\",    \"FirstName\" : \"FirstName\",    \"SpouseHomePhone\" : \"SpouseHomePhone\",    \"City\" : \"City\",    \"WorkUMConsent\" : \"WorkUMConsent\",    \"AddressLine2\" : \"AddressLine2\",    \"AddressLine1\" : \"AddressLine1\",    \"SMSConsent\" : \"SMSConsent\",    \"HomePhone\" : \"HomePhone\",    \"State\" : \"State\",    \"Country\" : \"Country\",    \"LastName\" : \"LastName\",    \"Balance\" : \"Balance\",    \"Last4SSN\" : \"Last4SSN\",    \"WorkConsent\" : \"WorkConsent\",    \"Accounts\" : [ {      \"ClientName\" : \"ClientName\",      \"ComakerFirstName\" : \"ComakerFirstName\",      \"AttorneyName\" : \"AttorneyName\",      \"ListDate\" : \"ListDate\",      \"ComakerLastName\" : \"ComakerLastName\",      \"AccountNumber\" : \"AccountNumber\",      \"AttorneyPhone\" : \"AttorneyPhone\"    }, {      \"ClientName\" : \"ClientName\",      \"ComakerFirstName\" : \"ComakerFirstName\",      \"AttorneyName\" : \"AttorneyName\",      \"ListDate\" : \"ListDate\",      \"ComakerLastName\" : \"ComakerLastName\",      \"AccountNumber\" : \"AccountNumber\",      \"AttorneyPhone\" : \"AttorneyPhone\"    } ],    \"MinimumPaymentAmount\" : \"MinimumPaymentAmount\"  }, {    \"CellPhone\" : \"CellPhone\",    \"PostalCode\" : \"PostalCode\",    \"SpouseLastName\" : \"SpouseLastName\",    \"CellConsent\" : \"CellConsent\",    \"SpouseFirstName\" : \"SpouseFirstName\",    \"CellUMConsent\" : \"CellUMConsent\",    \"HomeUMConsent\" : \"HomeUMConsent\",    \"Status\" : \"Status\",    \"DateOfBirth\" : \"DateOfBirth\",    \"LastCall\" : \"LastCall\",    \"POEName\" : \"POEName\",    \"WorkPhone\" : \"WorkPhone\",    \"consumerId\" : \"consumerId\",    \"FirstName\" : \"FirstName\",    \"SpouseHomePhone\" : \"SpouseHomePhone\",    \"City\" : \"City\",    \"WorkUMConsent\" : \"WorkUMConsent\",    \"AddressLine2\" : \"AddressLine2\",    \"AddressLine1\" : \"AddressLine1\",    \"SMSConsent\" : \"SMSConsent\",    \"HomePhone\" : \"HomePhone\",    \"State\" : \"State\",    \"Country\" : \"Country\",    \"LastName\" : \"LastName\",    \"Balance\" : \"Balance\",    \"Last4SSN\" : \"Last4SSN\",    \"WorkConsent\" : \"WorkConsent\",    \"Accounts\" : [ {      \"ClientName\" : \"ClientName\",      \"ComakerFirstName\" : \"ComakerFirstName\",      \"AttorneyName\" : \"AttorneyName\",      \"ListDate\" : \"ListDate\",      \"ComakerLastName\" : \"ComakerLastName\",      \"AccountNumber\" : \"AccountNumber\",      \"AttorneyPhone\" : \"AttorneyPhone\"    }, {      \"ClientName\" : \"ClientName\",      \"ComakerFirstName\" : \"ComakerFirstName\",      \"AttorneyName\" : \"AttorneyName\",      \"ListDate\" : \"ListDate\",      \"ComakerLastName\" : \"ComakerLastName\",      \"AccountNumber\" : \"AccountNumber\",      \"AttorneyPhone\" : \"AttorneyPhone\"    } ],    \"MinimumPaymentAmount\" : \"MinimumPaymentAmount\"  } ],  \"XCloudCorrelationID\" : \"XCloudCorrelationID\"}", AccountSearchResp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountSearchResp> accountSearchbyssnPost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The Account Search by ssn endpoint request body is a JSON Object follows the accountSearchBySSNRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody AccountSearchBySSNRequest accountSearchBySSNRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"ConsumerAccountSets\" : [ {    \"CellPhone\" : \"CellPhone\",    \"PostalCode\" : \"PostalCode\",    \"SpouseLastName\" : \"SpouseLastName\",    \"CellConsent\" : \"CellConsent\",    \"SpouseFirstName\" : \"SpouseFirstName\",    \"CellUMConsent\" : \"CellUMConsent\",    \"HomeUMConsent\" : \"HomeUMConsent\",    \"Status\" : \"Status\",    \"DateOfBirth\" : \"DateOfBirth\",    \"LastCall\" : \"LastCall\",    \"POEName\" : \"POEName\",    \"WorkPhone\" : \"WorkPhone\",    \"consumerId\" : \"consumerId\",    \"FirstName\" : \"FirstName\",    \"SpouseHomePhone\" : \"SpouseHomePhone\",    \"City\" : \"City\",    \"WorkUMConsent\" : \"WorkUMConsent\",    \"AddressLine2\" : \"AddressLine2\",    \"AddressLine1\" : \"AddressLine1\",    \"SMSConsent\" : \"SMSConsent\",    \"HomePhone\" : \"HomePhone\",    \"State\" : \"State\",    \"Country\" : \"Country\",    \"LastName\" : \"LastName\",    \"Balance\" : \"Balance\",    \"Last4SSN\" : \"Last4SSN\",    \"WorkConsent\" : \"WorkConsent\",    \"Accounts\" : [ {      \"ClientName\" : \"ClientName\",      \"ComakerFirstName\" : \"ComakerFirstName\",      \"AttorneyName\" : \"AttorneyName\",      \"ListDate\" : \"ListDate\",      \"ComakerLastName\" : \"ComakerLastName\",      \"AccountNumber\" : \"AccountNumber\",      \"AttorneyPhone\" : \"AttorneyPhone\"    }, {      \"ClientName\" : \"ClientName\",      \"ComakerFirstName\" : \"ComakerFirstName\",      \"AttorneyName\" : \"AttorneyName\",      \"ListDate\" : \"ListDate\",      \"ComakerLastName\" : \"ComakerLastName\",      \"AccountNumber\" : \"AccountNumber\",      \"AttorneyPhone\" : \"AttorneyPhone\"    } ],    \"MinimumPaymentAmount\" : \"MinimumPaymentAmount\"  }, {    \"CellPhone\" : \"CellPhone\",    \"PostalCode\" : \"PostalCode\",    \"SpouseLastName\" : \"SpouseLastName\",    \"CellConsent\" : \"CellConsent\",    \"SpouseFirstName\" : \"SpouseFirstName\",    \"CellUMConsent\" : \"CellUMConsent\",    \"HomeUMConsent\" : \"HomeUMConsent\",    \"Status\" : \"Status\",    \"DateOfBirth\" : \"DateOfBirth\",    \"LastCall\" : \"LastCall\",    \"POEName\" : \"POEName\",    \"WorkPhone\" : \"WorkPhone\",    \"consumerId\" : \"consumerId\",    \"FirstName\" : \"FirstName\",    \"SpouseHomePhone\" : \"SpouseHomePhone\",    \"City\" : \"City\",    \"WorkUMConsent\" : \"WorkUMConsent\",    \"AddressLine2\" : \"AddressLine2\",    \"AddressLine1\" : \"AddressLine1\",    \"SMSConsent\" : \"SMSConsent\",    \"HomePhone\" : \"HomePhone\",    \"State\" : \"State\",    \"Country\" : \"Country\",    \"LastName\" : \"LastName\",    \"Balance\" : \"Balance\",    \"Last4SSN\" : \"Last4SSN\",    \"WorkConsent\" : \"WorkConsent\",    \"Accounts\" : [ {      \"ClientName\" : \"ClientName\",      \"ComakerFirstName\" : \"ComakerFirstName\",      \"AttorneyName\" : \"AttorneyName\",      \"ListDate\" : \"ListDate\",      \"ComakerLastName\" : \"ComakerLastName\",      \"AccountNumber\" : \"AccountNumber\",      \"AttorneyPhone\" : \"AttorneyPhone\"    }, {      \"ClientName\" : \"ClientName\",      \"ComakerFirstName\" : \"ComakerFirstName\",      \"AttorneyName\" : \"AttorneyName\",      \"ListDate\" : \"ListDate\",      \"ComakerLastName\" : \"ComakerLastName\",      \"AccountNumber\" : \"AccountNumber\",      \"AttorneyPhone\" : \"AttorneyPhone\"    } ],    \"MinimumPaymentAmount\" : \"MinimumPaymentAmount\"  } ],  \"XCloudCorrelationID\" : \"XCloudCorrelationID\"}", AccountSearchResp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
