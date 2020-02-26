package com.amdexa.misc.arm.api;

import com.amdexa.misc.arm.model.AddressRequest;
import com.amdexa.misc.arm.model.AddressResponse;
import com.amdexa.misc.arm.model.DeleteAddressRequest;
import com.amdexa.misc.arm.model.DeleteEmailRequest;
import com.amdexa.misc.arm.model.DeletePhoneRequest;
import com.amdexa.misc.arm.model.FinancialProfileRequest;
import com.amdexa.misc.arm.model.FinancialProfileResponse;
import com.amdexa.misc.arm.model.GeneralSuccessResp;
import com.amdexa.misc.arm.model.MaritalStatusRequest;
import com.amdexa.misc.arm.model.MaritalStatusResponse;
import com.amdexa.misc.arm.model.PoeRequest;
import com.amdexa.misc.arm.model.PoeResponse;
import com.amdexa.misc.arm.model.SpouseRequest;
import com.amdexa.misc.arm.model.SpouseResponse;
import com.amdexa.misc.arm.model.UpdateAddressRequest;
import com.amdexa.misc.arm.model.UpdateEmailRequest;
import com.amdexa.misc.arm.model.UpdateFinancialProfileRequest;
import com.amdexa.misc.arm.model.UpdateMaritalStatusRequest;
import com.amdexa.misc.arm.model.UpdatePhoneRequest;
import com.amdexa.misc.arm.model.UpdatePoeRequest;
import com.amdexa.misc.arm.model.UpdateSpouseRequest;
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
public class DemographicApiController implements DemographicApi {

    private static final Logger log = LoggerFactory.getLogger(DemographicApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DemographicApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<GeneralSuccessResp> demographicAddressConsumerIdDelete(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The delete address endpoint request body is a JSON Object following the delete address schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody DeleteAddressRequest deleteAddressRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"Status\" : \"Status\",  \"XCloudCorrelationID\" : \"XCloudCorrelationID\"}", GeneralSuccessResp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AddressResponse> demographicAddressConsumerIdGet(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The get address endpoint request body is a JSON Object following the addressRequest schema.  The object has the following properties" ,required=true )  @Valid @RequestBody AddressRequest addressRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"AddressLine2\" : \"AddressLine2\",  \"AddressLine1\" : \"AddressLine1\",  \"consumerId\" : \"consumerId\",  \"State\" : \"State\",  \"PostalCode\" : \"PostalCode\",  \"Country\" : \"Country\",  \"City\" : \"City\"}", AddressResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AddressResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> demographicAddressConsumerIdPut(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The update address request body is a JSON Object following the below properties.  Blank values will be treated as no change." ,required=true )  @Valid @RequestBody UpdateAddressRequest updateAddressRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"Status\" : \"Status\",  \"XCloudCorrelationID\" : \"XCloudCorrelationID\"}", GeneralSuccessResp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GeneralSuccessResp>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> demographicEmailaddressConsumerIdDelete(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The delete email address endpoint request body is a JSON Object following the delete email address schema." ,required=true )  @Valid @RequestBody DeleteEmailRequest deleteEmailRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"Status\" : \"Status\",  \"XCloudCorrelationID\" : \"XCloudCorrelationID\"}", GeneralSuccessResp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> demographicEmailaddressConsumerIdPut(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The Update Email Address endpoint request body is a JSON Object following the updateEmailRequest schema. The object has the following properties:" ,required=true )  @Valid @RequestBody UpdateEmailRequest updateEmailRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"Status\" : \"Status\",  \"XCloudCorrelationID\" : \"XCloudCorrelationID\"}", GeneralSuccessResp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FinancialProfileResponse> demographicFinancialprofileConsumerIdGet(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The get financial profile endpoint request body is a JSON Object following the financialProfileRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody FinancialProfileRequest financialProfileRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"consumerId\" : \"consumerId\",  \"HomeOwner\" : \"HomeOwner\",  \"MortgagePayment\" : \"MortgagePayment\",  \"AnnualHouseholdIncome\" : \"AnnualHouseholdIncome\",  \"NumberOfDependents\" : \"NumberOfDependents\"}", FinancialProfileResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> demographicFinancialprofileConsumerIdPut(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The Update financial profile endpoint request body is a JSON Object following the updateFinancialProfileRequest schema. The object has the following properties:" ,required=true )  @Valid @RequestBody UpdateFinancialProfileRequest updateFinancialProfileRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"Status\" : \"Status\",  \"XCloudCorrelationID\" : \"XCloudCorrelationID\"}", GeneralSuccessResp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MaritalStatusResponse> demographicMaritalstatusConsumerIdGet(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The get marital status endpoint request body is a JSON Object following the maritalStatusRequest schema.  The object has the following properties" ,required=true )  @Valid @RequestBody MaritalStatusRequest maritalStatusRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"MaritalStatus\" : \"MaritalStatus\",  \"consumerId\" : \"consumerId\"}", MaritalStatusResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> demographicMaritalstatusConsumerIdPut(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The update marital status endpoint request body is a JSON Object following the updateMaritalStatusRequest schema. The object has the following properties" ,required=true )  @Valid @RequestBody UpdateMaritalStatusRequest updateMaritalStatusRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"Status\" : \"Status\",  \"XCloudCorrelationID\" : \"XCloudCorrelationID\"}", GeneralSuccessResp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> demographicPhoneConsumerIdPhoneNumberDelete(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The 10 digit Phone Number to remove",required=true) @PathVariable("phoneNumber") String phoneNumber,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The delete phone endpoint request body is a JSON Object following the delete phone schema.  The object has the following properties." ,required=true )  @Valid @RequestBody DeletePhoneRequest deletePhoneRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"Status\" : \"Status\",  \"XCloudCorrelationID\" : \"XCloudCorrelationID\"}", GeneralSuccessResp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> demographicPhoneConsumerIdPhoneNumberPut(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "Ten digit phone number.",required=true) @PathVariable("phoneNumber") String phoneNumber,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The update phone request body is a JSON Object following the below properties." ,required=true )  @Valid @RequestBody UpdatePhoneRequest updatePhoneRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"Status\" : \"Status\",  \"XCloudCorrelationID\" : \"XCloudCorrelationID\"}", GeneralSuccessResp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PoeResponse> demographicPoeConsumerIdGet(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The get POE endpoint request body is a JSON Object following the POE schema.  The object has the following properties" ,required=true )  @Valid @RequestBody PoeRequest poeRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"POEName\" : \"POEName\",  \"consumerId\" : \"consumerId\",  \"JobTitle\" : \"JobTitle\"}", PoeResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> demographicPoeConsumerIdPut(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The Update POE endpoint request body is a JSON Object following the updatePOERequest schema. The object has the following properties" ,required=true )  @Valid @RequestBody UpdatePoeRequest updatePoeRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"Status\" : \"Status\",  \"XCloudCorrelationID\" : \"XCloudCorrelationID\"}", GeneralSuccessResp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SpouseResponse> demographicSpouseConsumerIdGet(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The get spouse endpoint request body is a JSON Object following the spouseRequest schema.  The object has the following properties" ,required=true )  @Valid @RequestBody SpouseRequest spouseRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"consumerId\" : \"consumerId\",  \"SpouseName\" : \"SpouseName\"}", SpouseResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> demographicSpouseConsumerIdPut(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The Update Spouse endpoint request body is a JSON Object following the updateSpouseRequest schema. The object has the following properties" ,required=true )  @Valid @RequestBody UpdateSpouseRequest updateSpouseRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"Status\" : \"Status\",  \"XCloudCorrelationID\" : \"XCloudCorrelationID\"}", GeneralSuccessResp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
