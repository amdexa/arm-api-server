package com.amdexa.example.arm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * The Request Object to Find Card Type Information.
 */
@ApiModel(description = "The Request Object to Find Card Type Information.")
@Validated


public class CardTypeCalcRequest   {
  @JsonProperty("BinNumber")
  private String binNumber = null;

  public CardTypeCalcRequest binNumber(String binNumber) {
    this.binNumber = binNumber;
    return this;
  }

  /**
   * The number on the front of the card
   * @return binNumber
  **/
  @ApiModelProperty(required = true, value = "The number on the front of the card")
  @NotNull


  public String getBinNumber() {
    return binNumber;
  }

  public void setBinNumber(String binNumber) {
    this.binNumber = binNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardTypeCalcRequest cardTypeCalcRequest = (CardTypeCalcRequest) o;
    return Objects.equals(this.binNumber, cardTypeCalcRequest.binNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardTypeCalcRequest {\n");
    
    sb.append("    binNumber: ").append(toIndentedString(binNumber)).append("\n");
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

