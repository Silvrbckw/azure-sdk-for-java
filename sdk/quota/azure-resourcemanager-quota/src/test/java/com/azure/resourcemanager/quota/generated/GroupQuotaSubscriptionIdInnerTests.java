// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.quota.fluent.models.GroupQuotaSubscriptionIdInner;
import com.azure.resourcemanager.quota.models.GroupQuotaSubscriptionIdProperties;
import org.junit.jupiter.api.Assertions;

public final class GroupQuotaSubscriptionIdInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GroupQuotaSubscriptionIdInner model = BinaryData.fromString(
            "{\"properties\":{\"subscriptionId\":\"ikxwc\",\"provisioningState\":\"Accepted\"},\"id\":\"cnpqxuhivyqniwby\",\"name\":\"rkxvdum\",\"type\":\"grtfwvu\"}")
            .toObject(GroupQuotaSubscriptionIdInner.class);
        Assertions.assertEquals("ikxwc", model.properties().subscriptionId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GroupQuotaSubscriptionIdInner model = new GroupQuotaSubscriptionIdInner()
            .withProperties(new GroupQuotaSubscriptionIdProperties().withSubscriptionId("ikxwc"));
        model = BinaryData.fromObject(model).toObject(GroupQuotaSubscriptionIdInner.class);
        Assertions.assertEquals("ikxwc", model.properties().subscriptionId());
    }
}
