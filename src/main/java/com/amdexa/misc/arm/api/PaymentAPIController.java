package com.amdexa.misc.arm.api;

import com.amdexa.misc.arm.model.CardTypeCalcRequest;
import com.amdexa.misc.arm.model.CardTypeCalcResponse;
import com.amdexa.misc.arm.model.CreatePaymentArrangementRequest;
import com.amdexa.misc.arm.model.CreateSinglePaymentRequest;
import com.amdexa.misc.arm.model.DeletePAPaymentRequest;
import com.amdexa.misc.arm.model.DeletePaymentArrangementRequest;
import com.amdexa.misc.arm.model.DeletePaymentRequest;
import com.amdexa.misc.arm.model.Empty;
import com.amdexa.misc.arm.model.FeeByPercentCalcRequest;
import com.amdexa.misc.arm.model.FeeByPercentCalcResponse;
import com.amdexa.misc.arm.model.GeneralSuccessResp;
import com.amdexa.misc.arm.model.ImmedPaymentACHRequest;
import com.amdexa.misc.arm.model.ImmedPaymentACHResp;
import com.amdexa.misc.arm.model.ImmedPaymentCCRequest;
import com.amdexa.misc.arm.model.ImmedPaymentCCResp;
import com.amdexa.misc.arm.model.ImmediatePaymentTokenResponse;
import com.amdexa.misc.arm.model.ImmediatePaymentWithTokenRequest;
import com.amdexa.misc.arm.model.PaymentHistoryRequest;
import com.amdexa.misc.arm.model.PaymentHistoryResponse;
import com.amdexa.misc.arm.model.PendingPaymentsResp;
import com.amdexa.misc.arm.model.ScheduleRequest;
import com.amdexa.misc.arm.model.TokenizePaymentACHRequest;
import com.amdexa.misc.arm.model.TokenizePaymentACHResponse;
import com.amdexa.misc.arm.model.TokenizePaymentMethodCCRequest;
import com.amdexa.misc.arm.model.TokenizePaymentMethodCCResponse;
import com.amdexa.misc.arm.model.UpdatePAPaymentRequest;
import com.amdexa.misc.arm.model.UpdatePaymentRequest;
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
import java.io.IOException;

@Controller
public class PaymentAPIController implements PaymentAPI {

    private static final Logger log = LoggerFactory.getLogger(PaymentAPIController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    public PaymentAPIController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<GeneralSuccessResp> deletePaymentArranged(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId, @ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId, @ApiParam(value = "The delete PA payment endpoint request body is a JSON Object following the deletePAPaymentRequest schema." ,required=true )  @Valid @RequestBody DeletePAPaymentRequest deletePAPaymentRequest) {
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

    public ResponseEntity<GeneralSuccessResp> updatePaymentArranged(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId, @ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId, @ApiParam(value = "The update PA payment endpoint request body is a JSON Object following the updatePAPaymentRequest schema. The object has the following properties:" ,required=true )  @Valid @RequestBody UpdatePAPaymentRequest updatePAPaymentRequest) {
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

    public ResponseEntity<GeneralSuccessResp> deletePaymentArrangement(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId, @ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId, @ApiParam(value = "The delete payment endpoint request body is a JSON Object following the deletePaymentArrangementRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody DeletePaymentArrangementRequest deletePaymentArrangementRequest) {
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

    public ResponseEntity<GeneralSuccessResp> addPaymentArrangement(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId, @ApiParam(value = "The post payment arrangement endpoint request body is a JSON Object following the createPaymentArrangementRequest schema. The object has the following properties:" ,required=true )  @Valid @RequestBody CreatePaymentArrangementRequest createPaymentArrangementRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"Status\" : \"Status\",  \"correlationID\" : \"correlationID\"}", GeneralSuccessResp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GeneralSuccessResp>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CardTypeCalcResponse> paymentCardtypeCalc(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId, @ApiParam(value = "The post card type calc endpoint request body is a JSON Object following the cardTypeCalcRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody CardTypeCalcRequest cardTypeCalcRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"CardType\" : \"CardType\"}", CardTypeCalcResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> deletePayment(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId, @ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId, @ApiParam(value = "The delete payment endpoint request body is a JSON Object following the deletePaymentRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody DeletePaymentRequest deletePaymentRequest) {
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

    public ResponseEntity<GeneralSuccessResp> updatePayment(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId, @ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId, @ApiParam(value = "The update payment endpoint request body is a JSON Object following the updatePaymentRequest schema. The object has the following properties:" ,required=true )  @Valid @RequestBody UpdatePaymentRequest updatePaymentRequest) {
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

    public ResponseEntity<FeeByPercentCalcResponse> paymentFeeByPercentCalc(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId, @ApiParam(value = "The fee by percent calc endpoint request body is a JSON Object following the feeByPercentCalcRequest schema.  The object has the following properties." ,required=true )  @Valid @RequestBody FeeByPercentCalcRequest feeByPercentCalcRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"consumerId\" : \"consumerId\",  \"DebitFee\" : \"DebitFee\",  \"CreditFee\" : \"CreditFee\",  \"PaymentAmount\" : \"PaymentAmount\",  \"ACHFee\" : \"ACHFee\"}", FeeByPercentCalcResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FeeByPercentCalcResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentHistoryResponse> getPaymentHistory(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId, @ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId, @ApiParam(value = "The payment history endpoint request body is a JSON Object following the paymentHistoryRequest schema. The object has the following properties:" ,required=true )  @Valid @RequestBody PaymentHistoryRequest paymentHistoryRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"correlationID\" : \"correlationID\",  \"Payments\" : [ {    \"PaymentDate\" : \"PaymentDate\",    \"Reference\" : \"Reference\",    \"RemainingBalance\" : \"RemainingBalance\",    \"PaymentType\" : \"PaymentType\",    \"PaymentAmount\" : \"PaymentAmount\",    \"Accounts\" : [ {      \"Amount\" : \"Amount\",      \"CreditorAccountNumber\" : \"CreditorAccountNumber\",      \"AccountName\" : \"AccountName\",      \"FeeAmount\" : \"FeeAmount\"    }, {      \"Amount\" : \"Amount\",      \"CreditorAccountNumber\" : \"CreditorAccountNumber\",      \"AccountName\" : \"AccountName\",      \"FeeAmount\" : \"FeeAmount\"    } ]  }, {    \"PaymentDate\" : \"PaymentDate\",    \"Reference\" : \"Reference\",    \"RemainingBalance\" : \"RemainingBalance\",    \"PaymentType\" : \"PaymentType\",    \"PaymentAmount\" : \"PaymentAmount\",    \"Accounts\" : [ {      \"Amount\" : \"Amount\",      \"CreditorAccountNumber\" : \"CreditorAccountNumber\",      \"AccountName\" : \"AccountName\",      \"FeeAmount\" : \"FeeAmount\"    }, {      \"Amount\" : \"Amount\",      \"CreditorAccountNumber\" : \"CreditorAccountNumber\",      \"AccountName\" : \"AccountName\",      \"FeeAmount\" : \"FeeAmount\"    } ]  } ]}", PaymentHistoryResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ImmedPaymentACHResp> addPaymentImmediateACH(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username, @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId, @ApiParam(value = "The Immediate Payment with ACH endpoint request body is a JSON Object following the immedPaymentACHRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody ImmedPaymentACHRequest immedPaymentACHRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"Status\" : \"Status\",  \"BankName\" : \"BankName\",  \"PaymentReference\" : \"PaymentReference\",  \"HistoryId\" : \"HistoryId\",  \"AccountLast4\" : \"AccountLast4\",  \"correlationID\" : \"correlationID\",  \"ABANumber\" : \"ABANumber\",  \"AccountType\" : \"AccountType\"}", ImmedPaymentACHResp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ImmedPaymentCCResp> paymentImmediatecardPost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The Immediate Payment with CC endpoint request body is a JSON Object following the immedPaymentCCRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody ImmedPaymentCCRequest immedPaymentCCRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"Status\" : \"Status\",  \"CardExpirationDate\" : \"CardExpirationDate\",  \"PaymentReference\" : \"PaymentReference\",  \"HistoryId\" : \"HistoryId\",  \"correlationID\" : \"correlationID\",  \"IsDebitCard\" : true,  \"CardBrand\" : \"CardBrand\",  \"CardLast4\" : \"CardLast4\"}", ImmedPaymentCCResp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ImmediatePaymentTokenResponse> paymentImmediatewithtokenPost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The immediate payment with token endpoint request body is a JSON Object follows the immediatePaymentWithTokenRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody ImmediatePaymentWithTokenRequest immediatePaymentWithTokenRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"Status\" : \"Status\",  \"PaymentReference\" : \"PaymentReference\",  \"HistoryId\" : \"HistoryId\"}", ImmediatePaymentTokenResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PendingPaymentsResp> paymentPendingConsumerIdGet(@ApiParam(value = "Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Empty empty) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"correlationID\" : \"correlationID\",  \"PendingPaymentsSet\" : [ {    \"PaymentDate\" : \"PaymentDate\",    \"Reference\" : \"Reference\",    \"PaymentId\" : \"PaymentId\",    \"PaymentType\" : \"PaymentType\",    \"PaymentAmount\" : \"PaymentAmount\",    \"PaymentScheduleId\" : \"PaymentScheduleId\",    \"PSInstrumentId\" : \"PSInstrumentId\",    \"PSToken\" : \"PSToken\"  }, {    \"PaymentDate\" : \"PaymentDate\",    \"Reference\" : \"Reference\",    \"PaymentId\" : \"PaymentId\",    \"PaymentType\" : \"PaymentType\",    \"PaymentAmount\" : \"PaymentAmount\",    \"PaymentScheduleId\" : \"PaymentScheduleId\",    \"PSInstrumentId\" : \"PSInstrumentId\",    \"PSToken\" : \"PSToken\"  } ]}", PendingPaymentsResp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> paymentPost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The create payment endpoint request body is a JSON Object following the createSinglePaymentRequest schema. The object has the following properties:" ,required=true )  @Valid @RequestBody CreateSinglePaymentRequest createSinglePaymentRequest) {
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

    public ResponseEntity<GeneralSuccessResp> paymentSchedulePost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The paSchedule endpoint request body is a JSON Object follows the paScheduleRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody ScheduleRequest paScheduleRequest) {
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

    public ResponseEntity<TokenizePaymentACHResponse> paymentTokenizemethodachPost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "The post tokenize ACH payment endpoint request body is a JSON Object following the tokenizePaymentACHRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody TokenizePaymentACHRequest tokenizePaymentACHRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"Status\" : \"Status\",  \"BankName\" : \"BankName\",  \"PIID\" : \"PIID\",  \"AccountLast4\" : \"AccountLast4\",  \"ABANumber\" : \"ABANumber\",  \"PaymentToken\" : \"PaymentToken\",  \"AccountType\" : \"AccountType\"}", TokenizePaymentACHResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TokenizePaymentMethodCCResponse> paymentTokenizemethodccPost(@ApiParam(value = "The username of the user for the login." ,required=true) @RequestHeader(value="username", required=true) String username,@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="sessionId", required=true) String sessionId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody TokenizePaymentMethodCCRequest tokenizePaymentMethodCCRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<>(objectMapper.readValue("{  \"Status\" : \"Status\",  \"PIID\" : \"PIID\",  \"CardExpirationDate\" : \"CardExpirationDate\",  \"correlationID\" : \"correlationID\",  \"IsDebitCard\" : true,  \"CardBrand\" : \"CardBrand\",  \"PaymentToken\" : \"PaymentToken\",  \"CardLast4\" : \"CardLast4\"}", TokenizePaymentMethodCCResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
