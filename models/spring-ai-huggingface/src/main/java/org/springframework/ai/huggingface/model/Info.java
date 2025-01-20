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
 * Info
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-20T16:22:50.245206268Z[Etc/UTC]")
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Info {
  @JsonProperty("docker_label")
  private String dockerLabel = null;

  @JsonProperty("max_batch_total_tokens")
  private Integer maxBatchTotalTokens = null;

  @JsonProperty("max_best_of")
  private Integer maxBestOf = null;

  @JsonProperty("max_concurrent_requests")
  private Integer maxConcurrentRequests = null;

  @JsonProperty("max_input_length")
  private Integer maxInputLength = null;

  @JsonProperty("max_stop_sequences")
  private Integer maxStopSequences = null;

  @JsonProperty("max_total_tokens")
  private Integer maxTotalTokens = null;

  @JsonProperty("max_waiting_tokens")
  private Integer maxWaitingTokens = null;

  @JsonProperty("model_device_type")
  private String modelDeviceType = null;

  @JsonProperty("model_dtype")
  private String modelDtype = null;

  @JsonProperty("model_id")
  private String modelId = null;

  @JsonProperty("model_pipeline_tag")
  private String modelPipelineTag = null;

  @JsonProperty("model_sha")
  private String modelSha = null;

  @JsonProperty("sha")
  private String sha = null;

  @JsonProperty("validation_workers")
  private Integer validationWorkers = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("waiting_served_ratio")
  private Float waitingServedRatio = null;

  public Info dockerLabel(String dockerLabel) {
    this.dockerLabel = dockerLabel;
    return this;
  }

   /**
   * Get dockerLabel
   * @return dockerLabel
  **/
  @Schema(description = "")
  public String getDockerLabel() {
    return dockerLabel;
  }

  public void setDockerLabel(String dockerLabel) {
    this.dockerLabel = dockerLabel;
  }

  public Info maxBatchTotalTokens(Integer maxBatchTotalTokens) {
    this.maxBatchTotalTokens = maxBatchTotalTokens;
    return this;
  }

   /**
   * Get maxBatchTotalTokens
   * minimum: 0
   * @return maxBatchTotalTokens
  **/
  @Schema(example = "32000", required = true, description = "")
  public Integer getMaxBatchTotalTokens() {
    return maxBatchTotalTokens;
  }

  public void setMaxBatchTotalTokens(Integer maxBatchTotalTokens) {
    this.maxBatchTotalTokens = maxBatchTotalTokens;
  }

  public Info maxBestOf(Integer maxBestOf) {
    this.maxBestOf = maxBestOf;
    return this;
  }

   /**
   * Get maxBestOf
   * minimum: 0
   * @return maxBestOf
  **/
  @Schema(example = "2", required = true, description = "")
  public Integer getMaxBestOf() {
    return maxBestOf;
  }

  public void setMaxBestOf(Integer maxBestOf) {
    this.maxBestOf = maxBestOf;
  }

  public Info maxConcurrentRequests(Integer maxConcurrentRequests) {
    this.maxConcurrentRequests = maxConcurrentRequests;
    return this;
  }

   /**
   * Router Parameters
   * minimum: 0
   * @return maxConcurrentRequests
  **/
  @Schema(example = "128", required = true, description = "Router Parameters")
  public Integer getMaxConcurrentRequests() {
    return maxConcurrentRequests;
  }

  public void setMaxConcurrentRequests(Integer maxConcurrentRequests) {
    this.maxConcurrentRequests = maxConcurrentRequests;
  }

  public Info maxInputLength(Integer maxInputLength) {
    this.maxInputLength = maxInputLength;
    return this;
  }

   /**
   * Get maxInputLength
   * minimum: 0
   * @return maxInputLength
  **/
  @Schema(example = "1024", required = true, description = "")
  public Integer getMaxInputLength() {
    return maxInputLength;
  }

  public void setMaxInputLength(Integer maxInputLength) {
    this.maxInputLength = maxInputLength;
  }

  public Info maxStopSequences(Integer maxStopSequences) {
    this.maxStopSequences = maxStopSequences;
    return this;
  }

   /**
   * Get maxStopSequences
   * minimum: 0
   * @return maxStopSequences
  **/
  @Schema(example = "4", required = true, description = "")
  public Integer getMaxStopSequences() {
    return maxStopSequences;
  }

  public void setMaxStopSequences(Integer maxStopSequences) {
    this.maxStopSequences = maxStopSequences;
  }

  public Info maxTotalTokens(Integer maxTotalTokens) {
    this.maxTotalTokens = maxTotalTokens;
    return this;
  }

   /**
   * Get maxTotalTokens
   * minimum: 0
   * @return maxTotalTokens
  **/
  @Schema(example = "2048", required = true, description = "")
  public Integer getMaxTotalTokens() {
    return maxTotalTokens;
  }

  public void setMaxTotalTokens(Integer maxTotalTokens) {
    this.maxTotalTokens = maxTotalTokens;
  }

  public Info maxWaitingTokens(Integer maxWaitingTokens) {
    this.maxWaitingTokens = maxWaitingTokens;
    return this;
  }

   /**
   * Get maxWaitingTokens
   * minimum: 0
   * @return maxWaitingTokens
  **/
  @Schema(example = "20", required = true, description = "")
  public Integer getMaxWaitingTokens() {
    return maxWaitingTokens;
  }

  public void setMaxWaitingTokens(Integer maxWaitingTokens) {
    this.maxWaitingTokens = maxWaitingTokens;
  }

  public Info modelDeviceType(String modelDeviceType) {
    this.modelDeviceType = modelDeviceType;
    return this;
  }

   /**
   * Get modelDeviceType
   * @return modelDeviceType
  **/
  @Schema(example = "cuda", required = true, description = "")
  public String getModelDeviceType() {
    return modelDeviceType;
  }

  public void setModelDeviceType(String modelDeviceType) {
    this.modelDeviceType = modelDeviceType;
  }

  public Info modelDtype(String modelDtype) {
    this.modelDtype = modelDtype;
    return this;
  }

   /**
   * Get modelDtype
   * @return modelDtype
  **/
  @Schema(example = "torch.float16", required = true, description = "")
  public String getModelDtype() {
    return modelDtype;
  }

  public void setModelDtype(String modelDtype) {
    this.modelDtype = modelDtype;
  }

  public Info modelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * Model info
   * @return modelId
  **/
  @Schema(example = "bigscience/blomm-560m", required = true, description = "Model info")
  public String getModelId() {
    return modelId;
  }

  public void setModelId(String modelId) {
    this.modelId = modelId;
  }

  public Info modelPipelineTag(String modelPipelineTag) {
    this.modelPipelineTag = modelPipelineTag;
    return this;
  }

   /**
   * Get modelPipelineTag
   * @return modelPipelineTag
  **/
  @Schema(example = "text-generation", description = "")
  public String getModelPipelineTag() {
    return modelPipelineTag;
  }

  public void setModelPipelineTag(String modelPipelineTag) {
    this.modelPipelineTag = modelPipelineTag;
  }

  public Info modelSha(String modelSha) {
    this.modelSha = modelSha;
    return this;
  }

   /**
   * Get modelSha
   * @return modelSha
  **/
  @Schema(example = "e985a63cdc139290c5f700ff1929f0b5942cced2", description = "")
  public String getModelSha() {
    return modelSha;
  }

  public void setModelSha(String modelSha) {
    this.modelSha = modelSha;
  }

  public Info sha(String sha) {
    this.sha = sha;
    return this;
  }

   /**
   * Get sha
   * @return sha
  **/
  @Schema(description = "")
  public String getSha() {
    return sha;
  }

  public void setSha(String sha) {
    this.sha = sha;
  }

  public Info validationWorkers(Integer validationWorkers) {
    this.validationWorkers = validationWorkers;
    return this;
  }

   /**
   * Get validationWorkers
   * minimum: 0
   * @return validationWorkers
  **/
  @Schema(example = "2", required = true, description = "")
  public Integer getValidationWorkers() {
    return validationWorkers;
  }

  public void setValidationWorkers(Integer validationWorkers) {
    this.validationWorkers = validationWorkers;
  }

  public Info version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Router Info
   * @return version
  **/
  @Schema(example = "0.5.0", required = true, description = "Router Info")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Info waitingServedRatio(Float waitingServedRatio) {
    this.waitingServedRatio = waitingServedRatio;
    return this;
  }

   /**
   * Get waitingServedRatio
   * @return waitingServedRatio
  **/
  @Schema(example = "1.2", required = true, description = "")
  public Float getWaitingServedRatio() {
    return waitingServedRatio;
  }

  public void setWaitingServedRatio(Float waitingServedRatio) {
    this.waitingServedRatio = waitingServedRatio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Info info = (Info) o;
    return Objects.equals(this.dockerLabel, info.dockerLabel) &&
        Objects.equals(this.maxBatchTotalTokens, info.maxBatchTotalTokens) &&
        Objects.equals(this.maxBestOf, info.maxBestOf) &&
        Objects.equals(this.maxConcurrentRequests, info.maxConcurrentRequests) &&
        Objects.equals(this.maxInputLength, info.maxInputLength) &&
        Objects.equals(this.maxStopSequences, info.maxStopSequences) &&
        Objects.equals(this.maxTotalTokens, info.maxTotalTokens) &&
        Objects.equals(this.maxWaitingTokens, info.maxWaitingTokens) &&
        Objects.equals(this.modelDeviceType, info.modelDeviceType) &&
        Objects.equals(this.modelDtype, info.modelDtype) &&
        Objects.equals(this.modelId, info.modelId) &&
        Objects.equals(this.modelPipelineTag, info.modelPipelineTag) &&
        Objects.equals(this.modelSha, info.modelSha) &&
        Objects.equals(this.sha, info.sha) &&
        Objects.equals(this.validationWorkers, info.validationWorkers) &&
        Objects.equals(this.version, info.version) &&
        Objects.equals(this.waitingServedRatio, info.waitingServedRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dockerLabel, maxBatchTotalTokens, maxBestOf, maxConcurrentRequests, maxInputLength, maxStopSequences, maxTotalTokens, maxWaitingTokens, modelDeviceType, modelDtype, modelId, modelPipelineTag, modelSha, sha, validationWorkers, version, waitingServedRatio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Info {\n");
    
    sb.append("    dockerLabel: ").append(toIndentedString(dockerLabel)).append("\n");
    sb.append("    maxBatchTotalTokens: ").append(toIndentedString(maxBatchTotalTokens)).append("\n");
    sb.append("    maxBestOf: ").append(toIndentedString(maxBestOf)).append("\n");
    sb.append("    maxConcurrentRequests: ").append(toIndentedString(maxConcurrentRequests)).append("\n");
    sb.append("    maxInputLength: ").append(toIndentedString(maxInputLength)).append("\n");
    sb.append("    maxStopSequences: ").append(toIndentedString(maxStopSequences)).append("\n");
    sb.append("    maxTotalTokens: ").append(toIndentedString(maxTotalTokens)).append("\n");
    sb.append("    maxWaitingTokens: ").append(toIndentedString(maxWaitingTokens)).append("\n");
    sb.append("    modelDeviceType: ").append(toIndentedString(modelDeviceType)).append("\n");
    sb.append("    modelDtype: ").append(toIndentedString(modelDtype)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    modelPipelineTag: ").append(toIndentedString(modelPipelineTag)).append("\n");
    sb.append("    modelSha: ").append(toIndentedString(modelSha)).append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
    sb.append("    validationWorkers: ").append(toIndentedString(validationWorkers)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    waitingServedRatio: ").append(toIndentedString(waitingServedRatio)).append("\n");
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
