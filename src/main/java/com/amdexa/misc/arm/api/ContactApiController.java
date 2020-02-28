package com.amdexa.misc.arm.api;

import com.amdexa.misc.arm.model.GeneralSuccessResp;
import com.amdexa.misc.arm.model.PaymentReceiptRequest;
import com.amdexa.misc.arm.model.ReceiptRequest;
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
public class ContactApiController implements ContactApi {

    private static final Logger log = LoggerFactory.getLogger(ContactApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ContactApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<GeneralSuccessResp> contactPaymentreceiptPost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The payment receipt endpoint request body is a JSON Object following the paymentReceiptRequest schema.  The object has the following properties." ,required=true )  @Valid @RequestBody PaymentReceiptRequest paymentReceiptRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"Status\" : \"Status\",  \"correlationID\" : \"correlationID\"}", GeneralSuccessResp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> contactReceiptrequestPost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The receipt request endpoint request body is a JSON Object following the receiptRequest schema.  The object has the following properties." ,required=true )  @Valid @RequestBody ReceiptRequest receiptRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"Status\" : \"Status\",  \"correlationID\" : \"correlationID\"}", GeneralSuccessResp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
