package org.springframework.ai.huggingface.api;

import org.springframework.ai.huggingface.invoker.ApiClient;

import org.springframework.ai.huggingface.model.CompatGenerateRequest;
import org.springframework.ai.huggingface.model.ErrorResponse;
import org.springframework.ai.huggingface.model.GenerateRequest;
import org.springframework.ai.huggingface.model.GenerateResponse;
import org.springframework.ai.huggingface.model.Info;
import org.springframework.ai.huggingface.model.StreamResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-20T16:22:50.245206268Z[Etc/UTC]")
@Component("org.springframework.ai.huggingface.api.TextGenerationInferenceApi")
public class TextGenerationInferenceApi {
    private ApiClient apiClient;

    public TextGenerationInferenceApi() {
        this(new ApiClient());
    }

    @Autowired
    public TextGenerationInferenceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Generate tokens if &#x60;stream &#x3D;&#x3D; false&#x60; or a stream of token if &#x60;stream &#x3D;&#x3D; true&#x60;
     * Generate tokens if &#x60;stream &#x3D;&#x3D; false&#x60; or a stream of token if &#x60;stream &#x3D;&#x3D; true&#x60;
     * <p><b>200</b> - Generated Text
     * <p><b>422</b> - Input validation error
     * <p><b>424</b> - Generation Error
     * <p><b>429</b> - Model is overloaded
     * <p><b>500</b> - Incomplete generation
     * @param body  (required)
     * @return List&lt;GenerateResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GenerateResponse> compatGenerate(CompatGenerateRequest body) throws RestClientException {
        return compatGenerateWithHttpInfo(body).getBody();
    }

    /**
     * Generate tokens if &#x60;stream &#x3D;&#x3D; false&#x60; or a stream of token if &#x60;stream &#x3D;&#x3D; true&#x60;
     * Generate tokens if &#x60;stream &#x3D;&#x3D; false&#x60; or a stream of token if &#x60;stream &#x3D;&#x3D; true&#x60;
     * <p><b>200</b> - Generated Text
     * <p><b>422</b> - Input validation error
     * <p><b>424</b> - Generation Error
     * <p><b>429</b> - Model is overloaded
     * <p><b>500</b> - Incomplete generation
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;GenerateResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<GenerateResponse>> compatGenerateWithHttpInfo(CompatGenerateRequest body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling compatGenerate");
        }
        String path = UriComponentsBuilder.fromPath("/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "text/event-stream"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<GenerateResponse>> returnType = new ParameterizedTypeReference<List<GenerateResponse>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Generate tokens
     * Generate tokens
     * <p><b>200</b> - Generated Text
     * <p><b>422</b> - Input validation error
     * <p><b>424</b> - Generation Error
     * <p><b>429</b> - Model is overloaded
     * <p><b>500</b> - Incomplete generation
     * @param body  (required)
     * @return GenerateResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GenerateResponse generate(GenerateRequest body) throws RestClientException {
        return generateWithHttpInfo(body).getBody();
    }

    /**
     * Generate tokens
     * Generate tokens
     * <p><b>200</b> - Generated Text
     * <p><b>422</b> - Input validation error
     * <p><b>424</b> - Generation Error
     * <p><b>429</b> - Model is overloaded
     * <p><b>500</b> - Incomplete generation
     * @param body  (required)
     * @return ResponseEntity&lt;GenerateResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GenerateResponse> generateWithHttpInfo(GenerateRequest body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling generate");
        }
        String path = UriComponentsBuilder.fromPath("/generate").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<GenerateResponse> returnType = new ParameterizedTypeReference<GenerateResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Generate a stream of token using Server-Sent Events
     * Generate a stream of token using Server-Sent Events
     * <p><b>200</b> - Generated Text
     * <p><b>422</b> - Input validation error
     * <p><b>424</b> - Generation Error
     * <p><b>429</b> - Model is overloaded
     * <p><b>500</b> - Incomplete generation
     * @param body  (required)
     * @return StreamResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StreamResponse generateStream(GenerateRequest body) throws RestClientException {
        return generateStreamWithHttpInfo(body).getBody();
    }

    /**
     * Generate a stream of token using Server-Sent Events
     * Generate a stream of token using Server-Sent Events
     * <p><b>200</b> - Generated Text
     * <p><b>422</b> - Input validation error
     * <p><b>424</b> - Generation Error
     * <p><b>429</b> - Model is overloaded
     * <p><b>500</b> - Incomplete generation
     * @param body  (required)
     * @return ResponseEntity&lt;StreamResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StreamResponse> generateStreamWithHttpInfo(GenerateRequest body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling generateStream");
        }
        String path = UriComponentsBuilder.fromPath("/generate_stream").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "text/event-stream"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<StreamResponse> returnType = new ParameterizedTypeReference<StreamResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Text Generation Inference endpoint info
     * Text Generation Inference endpoint info
     * <p><b>200</b> - Served model info
     * @return Info
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Info getModelInfo() throws RestClientException {
        return getModelInfoWithHttpInfo().getBody();
    }

    /**
     * Text Generation Inference endpoint info
     * Text Generation Inference endpoint info
     * <p><b>200</b> - Served model info
     * @return ResponseEntity&lt;Info&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Info> getModelInfoWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/info").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Info> returnType = new ParameterizedTypeReference<Info>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Health check method
     * Health check method
     * <p><b>200</b> - Everything is working fine
     * <p><b>503</b> - Text generation inference is down
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void health() throws RestClientException {
        healthWithHttpInfo();
    }

    /**
     * Health check method
     * Health check method
     * <p><b>200</b> - Everything is working fine
     * <p><b>503</b> - Text generation inference is down
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> healthWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/health").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Prometheus metrics scrape endpoint
     * Prometheus metrics scrape endpoint
     * <p><b>200</b> - Prometheus Metrics
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String metrics() throws RestClientException {
        return metricsWithHttpInfo().getBody();
    }

    /**
     * Prometheus metrics scrape endpoint
     * Prometheus metrics scrape endpoint
     * <p><b>200</b> - Prometheus Metrics
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> metricsWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/metrics").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "text/plain"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
