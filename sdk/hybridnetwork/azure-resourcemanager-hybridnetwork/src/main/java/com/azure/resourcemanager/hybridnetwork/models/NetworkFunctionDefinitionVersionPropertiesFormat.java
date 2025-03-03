// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Network function definition version properties.
 */
@Fluent
public class NetworkFunctionDefinitionVersionPropertiesFormat
    implements JsonSerializable<NetworkFunctionDefinitionVersionPropertiesFormat> {
    /*
     * The network function type.
     */
    private NetworkFunctionType networkFunctionType
        = NetworkFunctionType.fromString("NetworkFunctionDefinitionVersionPropertiesFormat");

    /*
     * The provisioning state of the network function definition version resource.
     */
    private ProvisioningState provisioningState;

    /*
     * The network function definition version state.
     */
    private VersionState versionState;

    /*
     * The network function definition version description.
     */
    private String description;

    /*
     * The deployment parameters of the network function definition version.
     */
    private String deployParameters;

    /**
     * Creates an instance of NetworkFunctionDefinitionVersionPropertiesFormat class.
     */
    public NetworkFunctionDefinitionVersionPropertiesFormat() {
    }

    /**
     * Get the networkFunctionType property: The network function type.
     * 
     * @return the networkFunctionType value.
     */
    public NetworkFunctionType networkFunctionType() {
        return this.networkFunctionType;
    }

    /**
     * Get the provisioningState property: The provisioning state of the network function definition version resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the network function definition version resource.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the NetworkFunctionDefinitionVersionPropertiesFormat object itself.
     */
    NetworkFunctionDefinitionVersionPropertiesFormat withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the versionState property: The network function definition version state.
     * 
     * @return the versionState value.
     */
    public VersionState versionState() {
        return this.versionState;
    }

    /**
     * Set the versionState property: The network function definition version state.
     * 
     * @param versionState the versionState value to set.
     * @return the NetworkFunctionDefinitionVersionPropertiesFormat object itself.
     */
    NetworkFunctionDefinitionVersionPropertiesFormat withVersionState(VersionState versionState) {
        this.versionState = versionState;
        return this;
    }

    /**
     * Get the description property: The network function definition version description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The network function definition version description.
     * 
     * @param description the description value to set.
     * @return the NetworkFunctionDefinitionVersionPropertiesFormat object itself.
     */
    public NetworkFunctionDefinitionVersionPropertiesFormat withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the deployParameters property: The deployment parameters of the network function definition version.
     * 
     * @return the deployParameters value.
     */
    public String deployParameters() {
        return this.deployParameters;
    }

    /**
     * Set the deployParameters property: The deployment parameters of the network function definition version.
     * 
     * @param deployParameters the deployParameters value to set.
     * @return the NetworkFunctionDefinitionVersionPropertiesFormat object itself.
     */
    public NetworkFunctionDefinitionVersionPropertiesFormat withDeployParameters(String deployParameters) {
        this.deployParameters = deployParameters;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("networkFunctionType",
            this.networkFunctionType == null ? null : this.networkFunctionType.toString());
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("deployParameters", this.deployParameters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkFunctionDefinitionVersionPropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkFunctionDefinitionVersionPropertiesFormat if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkFunctionDefinitionVersionPropertiesFormat.
     */
    public static NetworkFunctionDefinitionVersionPropertiesFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("networkFunctionType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("ContainerizedNetworkFunction".equals(discriminatorValue)) {
                    return ContainerizedNetworkFunctionDefinitionVersion.fromJson(readerToUse.reset());
                } else if ("VirtualNetworkFunction".equals(discriminatorValue)) {
                    return VirtualNetworkFunctionDefinitionVersion.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static NetworkFunctionDefinitionVersionPropertiesFormat fromJsonKnownDiscriminator(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkFunctionDefinitionVersionPropertiesFormat deserializedNetworkFunctionDefinitionVersionPropertiesFormat
                = new NetworkFunctionDefinitionVersionPropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("networkFunctionType".equals(fieldName)) {
                    deserializedNetworkFunctionDefinitionVersionPropertiesFormat.networkFunctionType
                        = NetworkFunctionType.fromString(reader.getString());
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedNetworkFunctionDefinitionVersionPropertiesFormat.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("versionState".equals(fieldName)) {
                    deserializedNetworkFunctionDefinitionVersionPropertiesFormat.versionState
                        = VersionState.fromString(reader.getString());
                } else if ("description".equals(fieldName)) {
                    deserializedNetworkFunctionDefinitionVersionPropertiesFormat.description = reader.getString();
                } else if ("deployParameters".equals(fieldName)) {
                    deserializedNetworkFunctionDefinitionVersionPropertiesFormat.deployParameters = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkFunctionDefinitionVersionPropertiesFormat;
        });
    }
}
