// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.automation.models.ContentHash;
import com.azure.resourcemanager.automation.models.ContentSource;
import com.azure.resourcemanager.automation.models.ContentSourceType;
import com.azure.resourcemanager.automation.models.DscConfigurationParameter;
import com.azure.resourcemanager.automation.models.DscConfigurationUpdateParameters;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DscConfigurationUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DscConfigurationUpdateParameters model = BinaryData.fromString(
            "{\"properties\":{\"logVerbose\":false,\"logProgress\":true,\"source\":{\"hash\":{\"algorithm\":\"smexiitdf\",\"value\":\"xtyasiibmiyb\"},\"type\":\"uri\",\"value\":\"tgnljhnmgixhcmav\",\"version\":\"foudor\"},\"parameters\":{\"cmjkavlgorbmftpm\":{\"type\":\"yprotwyp\",\"isMandatory\":false,\"position\":2095396733,\"defaultValue\":\"hu\"},\"edsvqwthmk\":{\"type\":\"zfjltfvnzcyjto\",\"isMandatory\":false,\"position\":1964877049,\"defaultValue\":\"pbdbzqgqqi\"},\"mcdzsufcohdxbz\":{\"type\":\"bcysih\",\"isMandatory\":false,\"position\":1568742845,\"defaultValue\":\"hohsd\"}},\"description\":\"cmuapcvhd\"},\"name\":\"v\",\"tags\":{\"z\":\"xeyskonqzinkfkbg\",\"vkzqk\":\"owxeqocljmy\"}}")
            .toObject(DscConfigurationUpdateParameters.class);
        Assertions.assertEquals("v", model.name());
        Assertions.assertEquals("xeyskonqzinkfkbg", model.tags().get("z"));
        Assertions.assertEquals(false, model.logVerbose());
        Assertions.assertEquals(true, model.logProgress());
        Assertions.assertEquals("smexiitdf", model.source().hash().algorithm());
        Assertions.assertEquals("xtyasiibmiyb", model.source().hash().value());
        Assertions.assertEquals(ContentSourceType.URI, model.source().type());
        Assertions.assertEquals("tgnljhnmgixhcmav", model.source().value());
        Assertions.assertEquals("foudor", model.source().version());
        Assertions.assertEquals("yprotwyp", model.parameters().get("cmjkavlgorbmftpm").type());
        Assertions.assertEquals(false, model.parameters().get("cmjkavlgorbmftpm").isMandatory());
        Assertions.assertEquals(2095396733, model.parameters().get("cmjkavlgorbmftpm").position());
        Assertions.assertEquals("hu", model.parameters().get("cmjkavlgorbmftpm").defaultValue());
        Assertions.assertEquals("cmuapcvhd", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DscConfigurationUpdateParameters model = new DscConfigurationUpdateParameters().withName("v")
            .withTags(mapOf("z", "xeyskonqzinkfkbg", "vkzqk", "owxeqocljmy"))
            .withLogVerbose(false)
            .withLogProgress(true)
            .withSource(
                new ContentSource().withHash(new ContentHash().withAlgorithm("smexiitdf").withValue("xtyasiibmiyb"))
                    .withType(ContentSourceType.URI)
                    .withValue("tgnljhnmgixhcmav")
                    .withVersion("foudor"))
            .withParameters(mapOf("cmjkavlgorbmftpm",
                new DscConfigurationParameter().withType("yprotwyp")
                    .withIsMandatory(false)
                    .withPosition(2095396733)
                    .withDefaultValue("hu"),
                "edsvqwthmk",
                new DscConfigurationParameter().withType("zfjltfvnzcyjto")
                    .withIsMandatory(false)
                    .withPosition(1964877049)
                    .withDefaultValue("pbdbzqgqqi"),
                "mcdzsufcohdxbz",
                new DscConfigurationParameter().withType("bcysih")
                    .withIsMandatory(false)
                    .withPosition(1568742845)
                    .withDefaultValue("hohsd")))
            .withDescription("cmuapcvhd");
        model = BinaryData.fromObject(model).toObject(DscConfigurationUpdateParameters.class);
        Assertions.assertEquals("v", model.name());
        Assertions.assertEquals("xeyskonqzinkfkbg", model.tags().get("z"));
        Assertions.assertEquals(false, model.logVerbose());
        Assertions.assertEquals(true, model.logProgress());
        Assertions.assertEquals("smexiitdf", model.source().hash().algorithm());
        Assertions.assertEquals("xtyasiibmiyb", model.source().hash().value());
        Assertions.assertEquals(ContentSourceType.URI, model.source().type());
        Assertions.assertEquals("tgnljhnmgixhcmav", model.source().value());
        Assertions.assertEquals("foudor", model.source().version());
        Assertions.assertEquals("yprotwyp", model.parameters().get("cmjkavlgorbmftpm").type());
        Assertions.assertEquals(false, model.parameters().get("cmjkavlgorbmftpm").isMandatory());
        Assertions.assertEquals(2095396733, model.parameters().get("cmjkavlgorbmftpm").position());
        Assertions.assertEquals("hu", model.parameters().get("cmjkavlgorbmftpm").defaultValue());
        Assertions.assertEquals("cmuapcvhd", model.description());
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
