// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.communication.CommunicationManager;
import com.azure.resourcemanager.communication.models.CommunicationServiceResource;
import com.azure.resourcemanager.communication.models.ManagedServiceIdentity;
import com.azure.resourcemanager.communication.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.communication.models.UserAssignedIdentity;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class CommunicationServicesCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Succeeded\",\"hostName\":\"sfwxosowzxc\",\"dataLocation\":\"gicjooxdjeb\",\"notificationHubId\":\"ucww\",\"version\":\"ovbvmeueciv\",\"immutableResourceId\":\"zceuojgjrw\",\"linkedDomains\":[\"iotwmcdytdxwit\",\"nrjawgqwg\",\"hniskxfbkpyc\"]},\"identity\":{\"principalId\":\"3fe3db54-7aa6-4c28-997b-f30b04c93b0b\",\"tenantId\":\"620b147c-fea6-4022-9b3b-18f9659bb674\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"dauwhvylwzbtd\":{\"principalId\":\"de08871c-265c-41a1-a5fd-96bb91f18ec4\",\"clientId\":\"09bbd313-650a-4094-8224-949b1be0ada7\"},\"jznb\":{\"principalId\":\"5e766b65-0963-4241-8a1a-5dfa709e7d9d\",\"clientId\":\"5d5b0eeb-9906-4d45-8a3a-59af98b09f94\"}}},\"location\":\"ow\",\"tags\":{\"lupj\":\"rzqlveu\",\"riplrbpbewtg\":\"khfxobbcswsrt\"},\"id\":\"fgb\",\"name\":\"c\",\"type\":\"wxzvlvqhjkb\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        CommunicationManager manager = CommunicationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        CommunicationServiceResource response = manager.communicationServices()
            .define("kfrlhrxsbky")
            .withRegion("hcdhmdual")
            .withExistingResourceGroup("bh")
            .withTags(mapOf("adm", "qpv", "r", "sr", "fmisg", "vxpvgomz"))
            .withIdentity(
                new ManagedServiceIdentity().withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                    .withUserAssignedIdentities(mapOf("ahvljuaha", new UserAssignedIdentity())))
            .withDataLocation("z")
            .withLinkedDomains(Arrays.asList("eyvjusrtslhspkde", "maofmxagkv"))
            .create();

        Assertions.assertEquals("ow", response.location());
        Assertions.assertEquals("rzqlveu", response.tags().get("lupj"));
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, response.identity().type());
        Assertions.assertEquals("gicjooxdjeb", response.dataLocation());
        Assertions.assertEquals("iotwmcdytdxwit", response.linkedDomains().get(0));
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
