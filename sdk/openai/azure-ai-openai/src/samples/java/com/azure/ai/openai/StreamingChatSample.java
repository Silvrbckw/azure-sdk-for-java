// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.openai;

import com.azure.ai.openai.models.ChatCompletionStreamOptions;
import com.azure.ai.openai.models.ChatCompletions;
import com.azure.ai.openai.models.ChatCompletionsOptions;
import com.azure.ai.openai.models.ChatRequestAssistantMessage;
import com.azure.ai.openai.models.ChatRequestMessage;
import com.azure.ai.openai.models.ChatRequestSystemMessage;
import com.azure.ai.openai.models.ChatRequestUserMessage;
import com.azure.ai.openai.models.ChatResponseMessage;
import com.azure.ai.openai.models.CompletionsUsage;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.IterableStream;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates how to get chat completions for the provided chat messages.
 * Completions support a wide variety of tasks and generate text that continues from or "completes" provided
 * prompt data.
 */
public class StreamingChatSample {

    /**
     * Demonstrates how to get chat completions for the provided chat messages.
     * Completions support a wide variety of tasks and generate text that continues from or "completes" provided
     * prompt data.
     *
     * @param args Unused. Arguments to the program.
     */
    public static void main(String[] args) {
        String azureOpenaiKey = Configuration.getGlobalConfiguration().get("AZURE_OPENAI_KEY");
        String endpoint = Configuration.getGlobalConfiguration().get("AZURE_OPENAI_ENDPOINT");
        String deploymentOrModelId = "gpt-4o";

        OpenAIClient client = new OpenAIClientBuilder()
            .endpoint(endpoint)
            .credential(new AzureKeyCredential(azureOpenaiKey))
            .buildClient();

        List<ChatRequestMessage> chatMessages = new ArrayList<>();
        chatMessages.add(new ChatRequestSystemMessage("You are a helpful assistant. You will talk like a pirate."));
        chatMessages.add(new ChatRequestUserMessage("Can you help me?"));
        chatMessages.add(new ChatRequestAssistantMessage("Of course, me hearty! What can I do for ye?"));
        chatMessages.add(new ChatRequestUserMessage("What's the best way to train a parrot?"));

        IterableStream<ChatCompletions> chatCompletionsStream = client.getChatCompletionsStream(deploymentOrModelId,
            new ChatCompletionsOptions(chatMessages), new ChatCompletionStreamOptions().setIncludeUsage(true));

        // The delta is the message content for a streaming response.
        // Subsequence of streaming delta will be like:
        // "delta": {
        //     "role": "assistant"
        // },
        // "delta": {
        //     "content": "Why"
        //  },
        //  "delta": {
        //     "content": " don"
        //  },
        //  "delta": {
        //     "content": "'t"
        //  }
        chatCompletionsStream
                .stream()
                .forEach(chatCompletions -> {
                    CompletionsUsage usage = chatCompletions.getUsage();
                    if (usage != null) {
                        System.out.println("\nTotal token count: " + usage.getTotalTokens());
                    }

                    if (CoreUtils.isNullOrEmpty(chatCompletions.getChoices())) {
                        return;
                    }

                    ChatResponseMessage delta = chatCompletions.getChoices().get(0).getDelta();

                    if (delta.getRole() != null) {
                        System.out.println("Role = " + delta.getRole());
                    }

                    String content = delta.getContent();
                    if (content != null) {
                        System.out.print(content);
                    }
                });
    }
}
