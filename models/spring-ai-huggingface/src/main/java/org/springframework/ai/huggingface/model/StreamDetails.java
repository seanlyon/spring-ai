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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.ai.huggingface.model.FinishReason;
/**
 * StreamDetails
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-20T16:22:50.245206268Z[Etc/UTC]")
@JsonInclude(JsonInclude.Include.NON_NULL)

public class StreamDetails {
  @JsonProperty("finish_reason")
  private FinishReason finishReason = null;

  @JsonProperty("generated_tokens")
  private Integer generatedTokens = null;

  @JsonProperty("seed")
  private Long seed = null;

  public StreamDetails finishReason(FinishReason finishReason) {
    this.finishReason = finishReason;
    return this;
  }

   /**
   * Get finishReason
   * @return finishReason
  **/
  @Schema(required = true, description = "")
  public FinishReason getFinishReason() {
    return finishReason;
  }

  public void setFinishReason(FinishReason finishReason) {
    this.finishReason = finishReason;
  }

  public StreamDetails generatedTokens(Integer generatedTokens) {
    this.generatedTokens = generatedTokens;
    return this;
  }

   /**
   * Get generatedTokens
   * minimum: 0
   * @return generatedTokens
  **/
  @Schema(example = "1", required = true, description = "")
  public Integer getGeneratedTokens() {
    return generatedTokens;
  }

  public void setGeneratedTokens(Integer generatedTokens) {
    this.generatedTokens = generatedTokens;
  }

  public StreamDetails seed(Long seed) {
    this.seed = seed;
    return this;
  }

   /**
   * Get seed
   * minimum: 0
   * @return seed
  **/
  @Schema(example = "42", description = "")
  public Long getSeed() {
    return seed;
  }

  public void setSeed(Long seed) {
    this.seed = seed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamDetails streamDetails = (StreamDetails) o;
    return Objects.equals(this.finishReason, streamDetails.finishReason) &&
        Objects.equals(this.generatedTokens, streamDetails.generatedTokens) &&
        Objects.equals(this.seed, streamDetails.seed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finishReason, generatedTokens, seed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamDetails {\n");
    
    sb.append("    finishReason: ").append(toIndentedString(finishReason)).append("\n");
    sb.append("    generatedTokens: ").append(toIndentedString(generatedTokens)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
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
