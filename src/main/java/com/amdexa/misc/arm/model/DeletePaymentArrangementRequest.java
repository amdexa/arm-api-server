package com.amdexa.misc.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * The delete Payment Arrangement Request Object
 */
@ApiModel(description = "The delete Payment Arrangement Request Object")
@Validated


public class DeletePaymentArrangementRequest   {
  @JsonProperty("ScheduleId")
  private String scheduleId = null;

  public DeletePaymentArrangementRequest scheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  /**
   * The payment arrangement schedule identifier
   * @return scheduleId
  **/
  @ApiModelProperty(required = true, value = "The payment arrangement schedule identifier")
  @NotNull


  public String getScheduleId() {
    return scheduleId;
  }

  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletePaymentArrangementRequest deletePaymentArrangementRequest = (DeletePaymentArrangementRequest) o;
    return Objects.equals(this.scheduleId, deletePaymentArrangementRequest.scheduleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePaymentArrangementRequest {\n");
    
    sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

