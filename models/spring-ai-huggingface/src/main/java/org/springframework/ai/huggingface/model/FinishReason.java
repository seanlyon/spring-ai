/*
 * Text Generation Inference
 * Text Generation Webserver
 *
 * OpenAPI spec version: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.springframework.ai.huggingface.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets FinishReason
 */
public enum FinishReason {
  LENGTH("length"),
  EOS_TOKEN("eos_token"),
  STOP_SEQUENCE("stop_sequence");

  private String value;

  FinishReason(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FinishReason fromValue(String input) {
    for (FinishReason b : FinishReason.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }
}
