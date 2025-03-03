// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.devtestlabs.DevTestLabsManager;
import com.azure.resourcemanager.devtestlabs.models.Artifact;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ArtifactsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"title\":\"xtdisnjevhd\",\"description\":\"ydidwhepfwwtjf\",\"publisher\":\"esxxhmwcdbckyoi\",\"filePath\":\"kxhnegknj\",\"icon\":\"bhtmeplvuk\",\"targetOsType\":\"brlbpgs\",\"parameters\":\"dataagnchjhgemuowaky\",\"createdDate\":\"2021-08-17T10:32:52Z\"},\"location\":\"hjym\",\"tags\":{\"gdrclssolj\":\"qt\",\"dkkgjiiytssikizb\":\"mevtfycnlbvgjc\"},\"id\":\"ufqbvntnr\",\"name\":\"mqso\",\"type\":\"hcekxgnlykm\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DevTestLabsManager manager = DevTestLabsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Artifact response = manager.artifacts()
            .getWithResponse("w", "pcpahprzrvxhmtf", "ocnxz", "mj", "ngxno", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("hjym", response.location());
        Assertions.assertEquals("qt", response.tags().get("gdrclssolj"));
    }
}
