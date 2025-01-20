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
/**
 * Token
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-20T16:22:50.245206268Z[Etc/UTC]")
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Token {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("logprob")
  private Float logprob = null;

  @JsonProperty("special")
  private Boolean special = null;

  @JsonProperty("text")
  private String text = null;

  public Token id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * minimum: 0
   * @return id
  **/
  @Schema(example = "0", required = true, description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Token logprob(Float logprob) {
    this.logprob = logprob;
    return this;
  }

   /**
   * Get logprob
   * @return logprob
  **/
  @Schema(example = "-0.34", required = true, description = "")
  public Float getLogprob() {
    return logprob;
  }

  public void setLogprob(Float logprob) {
    this.logprob = logprob;
  }

  public Token special(Boolean special) {
    this.special = special;
    return this;
  }

   /**
   * Get special
   * @return special
  **/
  @Schema(example = "false", required = true, description = "")
  public Boolean isSpecial() {
    return special;
  }

  public void setSpecial(Boolean special) {
    this.special = special;
  }

  public Token text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @Schema(example = "test", required = true, description = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Token token = (Token) o;
    return Objects.equals(this.id, token.id) &&
        Objects.equals(this.logprob, token.logprob) &&
        Objects.equals(this.special, token.special) &&
        Objects.equals(this.text, token.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, logprob, special, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Token {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logprob: ").append(toIndentedString(logprob)).append("\n");
    sb.append("    special: ").append(toIndentedString(special)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
