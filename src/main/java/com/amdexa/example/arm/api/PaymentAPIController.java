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

import com.amdexa.example.arm.model.CardTypeCalcRequest;
import com.amdexa.example.arm.model.CardTypeCalcResponse;
import com.amdexa.example.arm.model.PaymentArrangementRequest;
import com.amdexa.example.arm.model.SinglePaymentRequest;
import com.amdexa.example.arm.model.DeletePAPaymentRequest;
import com.amdexa.example.arm.model.DeletePaymentArrangementRequest;
import com.amdexa.example.arm.model.DeletePaymentRequest;
import com.amdexa.example.arm.model.FeeByPercentCalcRequest;
import com.amdexa.example.arm.model.FeeByPercentCalcResponse;
import com.amdexa.example.arm.model.GeneralSuccessResp;
import com.amdexa.example.arm.model.ImmedPaymentACHRequest;
import com.amdexa.example.arm.model.ImmedPaymentACHResp;
import com.amdexa.example.arm.model.ImmedPaymentCCRequest;
import com.amdexa.example.arm.model.ImmedPaymentCCResp;
import com.amdexa.example.arm.model.ImmediatePaymentTokenResponse;
import com.amdexa.example.arm.model.ImmediatePaymentWithTokenRequest;
import com.amdexa.example.arm.model.PaymentHistoryResponse;
import com.amdexa.example.arm.model.PendingPaymentsResp;
import com.amdexa.example.arm.model.ScheduleRequest;
import com.amdexa.example.arm.model.TokenizePaymentACHRequest;
import com.amdexa.example.arm.model.TokenizePaymentACHResponse;
import com.amdexa.example.arm.model.TokenizePaymentMethodCCRequest;
import com.amdexa.example.arm.model.TokenizePaymentMethodCCResponse;
import com.amdexa.example.arm.model.UpdatePAPaymentRequest;
import com.amdexa.example.arm.model.UpdatePaymentRequest;
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
public class PaymentAPIController implements PaymentAPI {

    private static final Logger log = LoggerFactory.getLogger(PaymentAPIController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    public PaymentAPIController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<GeneralSuccessResp> deletePaymentArranged(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The delete PA payment endpoint request body is a JSON Object following the deletePAPaymentRequest schema." ,required=true )  @Valid @RequestBody DeletePAPaymentRequest deletePAPaymentRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> updatePaymentArranged(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The update PA payment endpoint request body is a JSON Object following the updatePAPaymentRequest schema. The object has the following properties:" ,required=true )  @Valid @RequestBody UpdatePAPaymentRequest updatePAPaymentRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> deletePaymentArrangement(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The delete payment endpoint request body is a JSON Object following the deletePaymentArrangementRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody DeletePaymentArrangementRequest deletePaymentArrangementRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> createPaymentArrangement( @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The post payment arrangement endpoint request body is a JSON Object following the createPaymentArrangementRequest schema. The object has the following properties:" ,required=true )  @Valid @RequestBody PaymentArrangementRequest paymentArrangementRequest) {
        return new ResponseEntity<GeneralSuccessResp>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CardTypeCalcResponse> paymentCardTypeCalc( @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The post card type calc endpoint request body is a JSON Object following the cardTypeCalcRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody CardTypeCalcRequest cardTypeCalcRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> deletePayment(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The delete payment endpoint request body is a JSON Object following the deletePaymentRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody DeletePaymentRequest deletePaymentRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> updatePayment(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The update payment endpoint request body is a JSON Object following the updatePaymentRequest schema. The object has the following properties:" ,required=true )  @Valid @RequestBody UpdatePaymentRequest updatePaymentRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FeeByPercentCalcResponse> paymentFeeByPercentCalc( @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The fee by percent calc endpoint request body is a JSON Object following the feeByPercentCalcRequest schema.  The object has the following properties." ,required=true )  @Valid @RequestBody FeeByPercentCalcRequest feeByPercentCalcRequest) {
        return new ResponseEntity<FeeByPercentCalcResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentHistoryResponse> getPaymentHistory(@ApiParam(value = "The Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ImmedPaymentACHResp> createPaymentImmediateACH( @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The Immediate Payment with ACH endpoint request body is a JSON Object following the immedPaymentACHRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody ImmedPaymentACHRequest immedPaymentACHRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ImmedPaymentCCResp> createPaymentImmediateCard( @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The Immediate Payment with CC endpoint request body is a JSON Object following the immedPaymentCCRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody ImmedPaymentCCRequest immedPaymentCCRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ImmediatePaymentTokenResponse> createImmediatePaymentWithToken( @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The immediate payment with token endpoint request body is a JSON Object follows the immediatePaymentWithTokenRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody ImmediatePaymentWithTokenRequest immediatePaymentWithTokenRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PendingPaymentsResp> getPaymentPending(@ApiParam(value = "Consumer ID.",required=true) @PathVariable("consumerId") String consumerId,  @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> createPayment( @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The create payment endpoint request body is a JSON Object following the createSinglePaymentRequest schema. The object has the following properties:" ,required=true )  @Valid @RequestBody SinglePaymentRequest singlePaymentRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GeneralSuccessResp> paymentSchedulePost(@ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId,@ApiParam(value = "The paSchedule endpoint request body is a JSON Object follows the paScheduleRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody ScheduleRequest paScheduleRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TokenizePaymentACHResponse> createPaymentTokenizeMethodACH( @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "The post tokenize ACH payment endpoint request body is a JSON Object following the tokenizePaymentACHRequest schema.  The object has the following properties:" ,required=true )  @Valid @RequestBody TokenizePaymentACHRequest tokenizePaymentACHRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TokenizePaymentMethodCCResponse> createPaymentTokenizeMethodCC( @ApiParam(value = "A unique session id for this login." ,required=true) @RequestHeader(value="authorization", required=true) String sessionId, @ApiParam(value = "" ,required=true )  @Valid @RequestBody TokenizePaymentMethodCCRequest tokenizePaymentMethodCCRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
