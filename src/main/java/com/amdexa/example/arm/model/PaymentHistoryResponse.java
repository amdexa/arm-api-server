package com.amdexa.example.arm.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import javax.validation.Valid;

/**
 * Payment History Response Object
 */
@ApiModel(description = "Payment History Response Object")
@Validated
@Data
@EqualsAndHashCode
@ToString
public class PaymentHistoryResponse {

    @JsonProperty("Payments")
    @Valid
    @ApiModelProperty(value = "List of Payments")
    private List<PaymentHistoryResponsePayments> payments = null;

}

