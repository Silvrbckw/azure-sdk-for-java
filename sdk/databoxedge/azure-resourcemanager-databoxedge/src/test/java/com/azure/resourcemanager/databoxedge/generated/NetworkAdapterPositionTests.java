// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databoxedge.models.NetworkAdapterPosition;

public final class NetworkAdapterPositionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkAdapterPosition model = BinaryData.fromString("{\"networkGroup\":\"NonRDMA\",\"port\":706936275}")
            .toObject(NetworkAdapterPosition.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkAdapterPosition model = new NetworkAdapterPosition();
        model = BinaryData.fromObject(model).toObject(NetworkAdapterPosition.class);
    }
}
