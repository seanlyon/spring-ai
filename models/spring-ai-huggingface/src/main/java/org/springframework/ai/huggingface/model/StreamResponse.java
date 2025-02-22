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
import org.springframework.ai.huggingface.model.Token;
/**
 * StreamResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-20T16:22:50.245206268Z[Etc/UTC]")
@JsonInclude(JsonInclude.Include.NON_NULL)

public class StreamResponse {
  @JsonProperty("details")
  private AllOfStreamResponseDetails details = null;

  @JsonProperty("generated_text")
  private String generatedText = "null";

  @JsonProperty("token")
  private Token token = null;

  public StreamResponse details(AllOfStreamResponseDetails details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @Schema(description = "")
  public AllOfStreamResponseDetails getDetails() {
    return details;
  }

  public void setDetails(AllOfStreamResponseDetails details) {
    this.details = details;
  }

  public StreamResponse generatedText(String generatedText) {
    this.generatedText = generatedText;
    return this;
  }

   /**
   * Get generatedText
   * @return generatedText
  **/
  @Schema(example = "test", description = "")
  public String getGeneratedText() {
    return generatedText;
  }

  public void setGeneratedText(String generatedText) {
    this.generatedText = generatedText;
  }

  public StreamResponse token(Token token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @Schema(required = true, description = "")
  public Token getToken() {
    return token;
  }

  public void setToken(Token token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamResponse streamResponse = (StreamResponse) o;
    return Objects.equals(this.details, streamResponse.details) &&
        Objects.equals(this.generatedText, streamResponse.generatedText) &&
        Objects.equals(this.token, streamResponse.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, generatedText, token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamResponse {\n");
    
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    generatedText: ").append(toIndentedString(generatedText)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
