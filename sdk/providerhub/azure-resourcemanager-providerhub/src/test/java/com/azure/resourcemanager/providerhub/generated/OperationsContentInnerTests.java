// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.providerhub.fluent.models.OperationsContentInner;
import com.azure.resourcemanager.providerhub.models.OperationActionType;
import com.azure.resourcemanager.providerhub.models.OperationOrigins;
import com.azure.resourcemanager.providerhub.models.OperationsDefinitionDisplay;
import org.junit.jupiter.api.Assertions;

public final class OperationsContentInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationsContentInner model = BinaryData.fromString(
            "{\"properties\":{\"name\":\"ttsttktlahbqact\",\"isDataAction\":true,\"origin\":\"NotSpecified\",\"display\":{\"provider\":\"kxitmmqtgqqqxhr\",\"resource\":\"xrxc\",\"operation\":\"juisavokqdzf\",\"description\":\"azivjlfrqttbajl\"},\"actionType\":\"NotSpecified\",\"properties\":\"datawxyiopidkqq\"},\"id\":\"kuvscxkdm\",\"name\":\"igovi\",\"type\":\"rxkpmloazuruoc\"}")
            .toObject(OperationsContentInner.class);
        Assertions.assertEquals("ttsttktlahbqact", model.namePropertiesName());
        Assertions.assertEquals(true, model.isDataAction());
        Assertions.assertEquals(OperationOrigins.NOT_SPECIFIED, model.origin());
        Assertions.assertEquals("kxitmmqtgqqqxhr", model.display().provider());
        Assertions.assertEquals("xrxc", model.display().resource());
        Assertions.assertEquals("juisavokqdzf", model.display().operation());
        Assertions.assertEquals("azivjlfrqttbajl", model.display().description());
        Assertions.assertEquals(OperationActionType.NOT_SPECIFIED, model.actionType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationsContentInner model = new OperationsContentInner().withNamePropertiesName("ttsttktlahbqact")
            .withIsDataAction(true)
            .withOrigin(OperationOrigins.NOT_SPECIFIED)
            .withDisplay(new OperationsDefinitionDisplay().withProvider("kxitmmqtgqqqxhr")
                .withResource("xrxc")
                .withOperation("juisavokqdzf")
                .withDescription("azivjlfrqttbajl"))
            .withActionType(OperationActionType.NOT_SPECIFIED)
            .withProperties("datawxyiopidkqq");
        model = BinaryData.fromObject(model).toObject(OperationsContentInner.class);
        Assertions.assertEquals("ttsttktlahbqact", model.namePropertiesName());
        Assertions.assertEquals(true, model.isDataAction());
        Assertions.assertEquals(OperationOrigins.NOT_SPECIFIED, model.origin());
        Assertions.assertEquals("kxitmmqtgqqqxhr", model.display().provider());
        Assertions.assertEquals("xrxc", model.display().resource());
        Assertions.assertEquals("juisavokqdzf", model.display().operation());
        Assertions.assertEquals("azivjlfrqttbajl", model.display().description());
        Assertions.assertEquals(OperationActionType.NOT_SPECIFIED, model.actionType());
    }
}
