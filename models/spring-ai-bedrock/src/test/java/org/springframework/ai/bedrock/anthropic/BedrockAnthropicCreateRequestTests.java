/*
 * Copyright 2023-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.ai.bedrock.anthropic;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.Test;
import software.amazon.awssdk.regions.Region;

import org.springframework.ai.bedrock.anthropic.api.AnthropicChatBedrockApi;
import org.springframework.ai.bedrock.anthropic.api.AnthropicChatBedrockApi.AnthropicChatModel;
import org.springframework.ai.chat.prompt.Prompt;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Christian Tzolov
 */
public class BedrockAnthropicCreateRequestTests {

	private AnthropicChatBedrockApi anthropicChatApi = new AnthropicChatBedrockApi(AnthropicChatModel.CLAUDE_V2.id(),
			Region.US_EAST_1.id(), Duration.ofMillis(1000L));

	@Test
	public void createRequestWithChatOptions() {

		var client = new BedrockAnthropicChatModel(this.anthropicChatApi,
				AnthropicChatOptions.builder()
					.temperature(66.6)
					.topK(66)
					.topP(0.66)
					.maxTokensToSample(666)
					.anthropicVersion("X.Y.Z")
					.stopSequences(List.of("stop1", "stop2"))
					.build());

		var request = client.createRequest(new Prompt("Test message content"));

		assertThat(request.prompt()).isNotEmpty();
		assertThat(request.temperature()).isEqualTo(66.6);
		assertThat(request.topK()).isEqualTo(66);
		assertThat(request.topP()).isEqualTo(0.66);
		assertThat(request.maxTokensToSample()).isEqualTo(666);
		assertThat(request.anthropicVersion()).isEqualTo("X.Y.Z");
		assertThat(request.stopSequences()).containsExactly("stop1", "stop2");

		request = client.createRequest(new Prompt("Test message content",
				AnthropicChatOptions.builder()
					.temperature(99.9)
					.topP(0.99)
					.maxTokensToSample(999)
					.anthropicVersion("zzz")
					.stopSequences(List.of("stop3", "stop4"))
					.build()

		));

		assertThat(request.prompt()).isNotEmpty();
		assertThat(request.temperature()).isEqualTo(99.9);
		assertThat(request.topK()).as("unchanged from the default options").isEqualTo(66);
		assertThat(request.topP()).isEqualTo(0.99);
		assertThat(request.maxTokensToSample()).isEqualTo(999);
		assertThat(request.anthropicVersion()).isEqualTo("zzz");
		assertThat(request.stopSequences()).containsExactly("stop3", "stop4");
	}

}
