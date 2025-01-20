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
import java.util.ArrayList;
import java.util.List;
import org.springframework.ai.huggingface.model.FinishReason;
import org.springframework.ai.huggingface.model.PrefillToken;
import org.springframework.ai.huggingface.model.Token;
/**
 * BestOfSequence
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-20T16:22:50.245206268Z[Etc/UTC]")
@JsonInclude(JsonInclude.Include.NON_NULL)

public class BestOfSequence {
  @JsonProperty("finish_reason")
  private FinishReason finishReason = null;

  @JsonProperty("generated_text")
  private String generatedText = null;

  @JsonProperty("generated_tokens")
  private Integer generatedTokens = null;

  @JsonProperty("prefill")
  private List<PrefillToken> prefill = new ArrayList<>();

  @JsonProperty("seed")
  private Long seed = null;

  @JsonProperty("tokens")
  private List<Token> tokens = new ArrayList<>();

  public BestOfSequence finishReason(FinishReason finishReason) {
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

  public BestOfSequence generatedText(String generatedText) {
    this.generatedText = generatedText;
    return this;
  }

   /**
   * Get generatedText
   * @return generatedText
  **/
  @Schema(example = "test", required = true, description = "")
  public String getGeneratedText() {
    return generatedText;
  }

  public void setGeneratedText(String generatedText) {
    this.generatedText = generatedText;
  }

  public BestOfSequence generatedTokens(Integer generatedTokens) {
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

  public BestOfSequence prefill(List<PrefillToken> prefill) {
    this.prefill = prefill;
    return this;
  }

  public BestOfSequence addPrefillItem(PrefillToken prefillItem) {
    this.prefill.add(prefillItem);
    return this;
  }

   /**
   * Get prefill
   * @return prefill
  **/
  @Schema(required = true, description = "")
  public List<PrefillToken> getPrefill() {
    return prefill;
  }

  public void setPrefill(List<PrefillToken> prefill) {
    this.prefill = prefill;
  }

  public BestOfSequence seed(Long seed) {
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

  public BestOfSequence tokens(List<Token> tokens) {
    this.tokens = tokens;
    return this;
  }

  public BestOfSequence addTokensItem(Token tokensItem) {
    this.tokens.add(tokensItem);
    return this;
  }

   /**
   * Get tokens
   * @return tokens
  **/
  @Schema(required = true, description = "")
  public List<Token> getTokens() {
    return tokens;
  }

  public void setTokens(List<Token> tokens) {
    this.tokens = tokens;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BestOfSequence bestOfSequence = (BestOfSequence) o;
    return Objects.equals(this.finishReason, bestOfSequence.finishReason) &&
        Objects.equals(this.generatedText, bestOfSequence.generatedText) &&
        Objects.equals(this.generatedTokens, bestOfSequence.generatedTokens) &&
        Objects.equals(this.prefill, bestOfSequence.prefill) &&
        Objects.equals(this.seed, bestOfSequence.seed) &&
        Objects.equals(this.tokens, bestOfSequence.tokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finishReason, generatedText, generatedTokens, prefill, seed, tokens);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BestOfSequence {\n");
    
    sb.append("    finishReason: ").append(toIndentedString(finishReason)).append("\n");
    sb.append("    generatedText: ").append(toIndentedString(generatedText)).append("\n");
    sb.append("    generatedTokens: ").append(toIndentedString(generatedTokens)).append("\n");
    sb.append("    prefill: ").append(toIndentedString(prefill)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
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
