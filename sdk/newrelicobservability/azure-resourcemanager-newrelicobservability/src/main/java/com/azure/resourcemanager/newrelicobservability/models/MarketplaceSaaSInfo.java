// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Marketplace SAAS Info of the resource.
 */
@Fluent
public final class MarketplaceSaaSInfo implements JsonSerializable<MarketplaceSaaSInfo> {
    /*
     * Marketplace Subscription Id. This is a GUID-formatted string.
     */
    private String marketplaceSubscriptionId;

    /*
     * Marketplace Subscription Details: SAAS Name
     */
    private String marketplaceSubscriptionName;

    /*
     * Marketplace Subscription Details: Resource URI
     */
    private String marketplaceResourceId;

    /*
     * Marketplace Subscription Details: SaaS Subscription Status
     */
    private String marketplaceStatus;

    /*
     * The Azure Subscription ID to which the Marketplace Subscription belongs and gets billed into.
     */
    private String billedAzureSubscriptionId;

    /**
     * Creates an instance of MarketplaceSaaSInfo class.
     */
    public MarketplaceSaaSInfo() {
    }

    /**
     * Get the marketplaceSubscriptionId property: Marketplace Subscription Id. This is a GUID-formatted string.
     * 
     * @return the marketplaceSubscriptionId value.
     */
    public String marketplaceSubscriptionId() {
        return this.marketplaceSubscriptionId;
    }

    /**
     * Set the marketplaceSubscriptionId property: Marketplace Subscription Id. This is a GUID-formatted string.
     * 
     * @param marketplaceSubscriptionId the marketplaceSubscriptionId value to set.
     * @return the MarketplaceSaaSInfo object itself.
     */
    public MarketplaceSaaSInfo withMarketplaceSubscriptionId(String marketplaceSubscriptionId) {
        this.marketplaceSubscriptionId = marketplaceSubscriptionId;
        return this;
    }

    /**
     * Get the marketplaceSubscriptionName property: Marketplace Subscription Details: SAAS Name.
     * 
     * @return the marketplaceSubscriptionName value.
     */
    public String marketplaceSubscriptionName() {
        return this.marketplaceSubscriptionName;
    }

    /**
     * Set the marketplaceSubscriptionName property: Marketplace Subscription Details: SAAS Name.
     * 
     * @param marketplaceSubscriptionName the marketplaceSubscriptionName value to set.
     * @return the MarketplaceSaaSInfo object itself.
     */
    public MarketplaceSaaSInfo withMarketplaceSubscriptionName(String marketplaceSubscriptionName) {
        this.marketplaceSubscriptionName = marketplaceSubscriptionName;
        return this;
    }

    /**
     * Get the marketplaceResourceId property: Marketplace Subscription Details: Resource URI.
     * 
     * @return the marketplaceResourceId value.
     */
    public String marketplaceResourceId() {
        return this.marketplaceResourceId;
    }

    /**
     * Set the marketplaceResourceId property: Marketplace Subscription Details: Resource URI.
     * 
     * @param marketplaceResourceId the marketplaceResourceId value to set.
     * @return the MarketplaceSaaSInfo object itself.
     */
    public MarketplaceSaaSInfo withMarketplaceResourceId(String marketplaceResourceId) {
        this.marketplaceResourceId = marketplaceResourceId;
        return this;
    }

    /**
     * Get the marketplaceStatus property: Marketplace Subscription Details: SaaS Subscription Status.
     * 
     * @return the marketplaceStatus value.
     */
    public String marketplaceStatus() {
        return this.marketplaceStatus;
    }

    /**
     * Set the marketplaceStatus property: Marketplace Subscription Details: SaaS Subscription Status.
     * 
     * @param marketplaceStatus the marketplaceStatus value to set.
     * @return the MarketplaceSaaSInfo object itself.
     */
    public MarketplaceSaaSInfo withMarketplaceStatus(String marketplaceStatus) {
        this.marketplaceStatus = marketplaceStatus;
        return this;
    }

    /**
     * Get the billedAzureSubscriptionId property: The Azure Subscription ID to which the Marketplace Subscription
     * belongs and gets billed into.
     * 
     * @return the billedAzureSubscriptionId value.
     */
    public String billedAzureSubscriptionId() {
        return this.billedAzureSubscriptionId;
    }

    /**
     * Set the billedAzureSubscriptionId property: The Azure Subscription ID to which the Marketplace Subscription
     * belongs and gets billed into.
     * 
     * @param billedAzureSubscriptionId the billedAzureSubscriptionId value to set.
     * @return the MarketplaceSaaSInfo object itself.
     */
    public MarketplaceSaaSInfo withBilledAzureSubscriptionId(String billedAzureSubscriptionId) {
        this.billedAzureSubscriptionId = billedAzureSubscriptionId;
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
        jsonWriter.writeStringField("marketplaceSubscriptionId", this.marketplaceSubscriptionId);
        jsonWriter.writeStringField("marketplaceSubscriptionName", this.marketplaceSubscriptionName);
        jsonWriter.writeStringField("marketplaceResourceId", this.marketplaceResourceId);
        jsonWriter.writeStringField("marketplaceStatus", this.marketplaceStatus);
        jsonWriter.writeStringField("billedAzureSubscriptionId", this.billedAzureSubscriptionId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MarketplaceSaaSInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MarketplaceSaaSInfo if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MarketplaceSaaSInfo.
     */
    public static MarketplaceSaaSInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MarketplaceSaaSInfo deserializedMarketplaceSaaSInfo = new MarketplaceSaaSInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("marketplaceSubscriptionId".equals(fieldName)) {
                    deserializedMarketplaceSaaSInfo.marketplaceSubscriptionId = reader.getString();
                } else if ("marketplaceSubscriptionName".equals(fieldName)) {
                    deserializedMarketplaceSaaSInfo.marketplaceSubscriptionName = reader.getString();
                } else if ("marketplaceResourceId".equals(fieldName)) {
                    deserializedMarketplaceSaaSInfo.marketplaceResourceId = reader.getString();
                } else if ("marketplaceStatus".equals(fieldName)) {
                    deserializedMarketplaceSaaSInfo.marketplaceStatus = reader.getString();
                } else if ("billedAzureSubscriptionId".equals(fieldName)) {
                    deserializedMarketplaceSaaSInfo.billedAzureSubscriptionId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMarketplaceSaaSInfo;
        });
    }
}
