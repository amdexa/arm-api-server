package com.amdexa.example.arm.api;

import com.amdexa.example.arm.model.ReceiptRequest;
import com.amdexa.example.arm.model.GeneralSuccessResp;
import com.amdexa.example.arm.model.PaymentReceiptRequest;
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
import java.io.IOException;


@Controller
public class ContactAPIController implements ContactAPI {

    private static final Logger log = LoggerFactory.getLogger(ContactAPIController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    public ContactAPIController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<GeneralSuccessResp> paymentReceipt( @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The payment receipt endpoint request body is a JSON Object following the paymentReceiptRequest schema.  The object has the following properties." ,required=true )  @Valid @RequestBody PaymentReceiptRequest paymentReceiptRequest) {
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

    public ResponseEntity<GeneralSuccessResp> receiptRequest( @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The receipt request endpoint request body is a JSON Object following the receiptRequest schema.  The object has the following properties." ,required=true )  @Valid @RequestBody ReceiptRequest receiptRequest) {
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