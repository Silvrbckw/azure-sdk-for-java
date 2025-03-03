// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.WaitActivityTypeProperties;

public final class WaitActivityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WaitActivityTypeProperties model = BinaryData.fromString("{\"waitTimeInSeconds\":\"datagsurfnktxht\"}")
            .toObject(WaitActivityTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WaitActivityTypeProperties model = new WaitActivityTypeProperties().withWaitTimeInSeconds("datagsurfnktxht");
        model = BinaryData.fromObject(model).toObject(WaitActivityTypeProperties.class);
    }
}
