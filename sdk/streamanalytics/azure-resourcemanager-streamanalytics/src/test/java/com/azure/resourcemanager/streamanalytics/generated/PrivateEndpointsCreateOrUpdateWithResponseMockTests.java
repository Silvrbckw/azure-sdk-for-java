// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager;
import com.azure.resourcemanager.streamanalytics.models.PrivateEndpoint;
import com.azure.resourcemanager.streamanalytics.models.PrivateLinkConnectionState;
import com.azure.resourcemanager.streamanalytics.models.PrivateLinkServiceConnection;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateEndpointsCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"createdDate\":\"ywjhhgdnhx\",\"manualPrivateLinkServiceConnections\":[{\"properties\":{\"privateLinkServiceId\":\"omi\",\"groupIds\":[\"ggdufiqndieu\",\"ao\"],\"requestMessage\":\"chvcyyysfgdo\",\"privateLinkServiceConnectionState\":{}}},{\"properties\":{\"privateLinkServiceId\":\"iipuipwoqonm\",\"groupIds\":[\"ekni\",\"shqvcimpev\",\"gmblrri\"],\"requestMessage\":\"ywdxsmic\",\"privateLinkServiceConnectionState\":{}}},{\"properties\":{\"privateLinkServiceId\":\"fscjfnynszquji\",\"groupIds\":[\"oqytibyowbblgy\",\"vutpthjoxo\"],\"requestMessage\":\"msksbp\",\"privateLinkServiceConnectionState\":{}}}]},\"etag\":\"qolj\",\"id\":\"kcgxxlxsffgcvi\",\"name\":\"qzdwlvwlyoup\",\"type\":\"gfbkjubdyh\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        StreamAnalyticsManager manager = StreamAnalyticsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PrivateEndpoint response = manager.privateEndpoints()
            .define("vyvnqqyb")
            .withExistingCluster("orfmluiqt", "zf")
            .withManualPrivateLinkServiceConnections(Arrays.asList(
                new PrivateLinkServiceConnection().withPrivateLinkServiceId("rnntiewdjcv")
                    .withGroupIds(Arrays.asList("wr", "ehwagoh", "uffkmrqemvvh"))
                    .withPrivateLinkServiceConnectionState(new PrivateLinkConnectionState()),
                new PrivateLinkServiceConnection().withPrivateLinkServiceId("cjznmwcpmg")
                    .withGroupIds(Arrays.asList("draufactkah", "ovajjziuxxps", "neekulfg", "lqubkwdlen"))
                    .withPrivateLinkServiceConnectionState(new PrivateLinkConnectionState()),
                new PrivateLinkServiceConnection().withPrivateLinkServiceId("o")
                    .withGroupIds(Arrays.asList("nyfln", "rwm", "uvwpklvxwmyg", "xpgpq"))
                    .withPrivateLinkServiceConnectionState(new PrivateLinkConnectionState())))
            .withIfMatch("soldweyuqdunv")
            .withIfNoneMatch("nnrwrbiork")
            .create();

        Assertions.assertEquals("omi", response.manualPrivateLinkServiceConnections().get(0).privateLinkServiceId());
        Assertions.assertEquals("ggdufiqndieu",
            response.manualPrivateLinkServiceConnections().get(0).groupIds().get(0));
    }
}
