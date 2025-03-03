// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.models.DataTypeState;
import com.azure.resourcemanager.securityinsights.models.OfficeDataConnectorDataTypesExchange;
import org.junit.jupiter.api.Assertions;

public final class OfficeDataConnectorDataTypesExchangeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OfficeDataConnectorDataTypesExchange model
            = BinaryData.fromString("{\"state\":\"Enabled\"}").toObject(OfficeDataConnectorDataTypesExchange.class);
        Assertions.assertEquals(DataTypeState.ENABLED, model.state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OfficeDataConnectorDataTypesExchange model
            = new OfficeDataConnectorDataTypesExchange().withState(DataTypeState.ENABLED);
        model = BinaryData.fromObject(model).toObject(OfficeDataConnectorDataTypesExchange.class);
        Assertions.assertEquals(DataTypeState.ENABLED, model.state());
    }
}
