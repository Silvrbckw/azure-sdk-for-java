// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The properties that are associated with an Azure SQL database data source.
 */
@Fluent
public class AzureSynapseDataSourceProperties implements JsonSerializable<AzureSynapseDataSourceProperties> {
    /*
     * The name of the SQL server containing the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     */
    private String server;

    /*
     * The name of the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     */
    private String database;

    /*
     * The name of the table in the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     */
    private String table;

    /*
     * The user name that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     */
    private String user;

    /*
     * The password that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     */
    private String password;

    /**
     * Creates an instance of AzureSynapseDataSourceProperties class.
     */
    public AzureSynapseDataSourceProperties() {
    }

    /**
     * Get the server property: The name of the SQL server containing the Azure SQL database. Required on PUT
     * (CreateOrReplace) requests.
     * 
     * @return the server value.
     */
    public String server() {
        return this.server;
    }

    /**
     * Set the server property: The name of the SQL server containing the Azure SQL database. Required on PUT
     * (CreateOrReplace) requests.
     * 
     * @param server the server value to set.
     * @return the AzureSynapseDataSourceProperties object itself.
     */
    public AzureSynapseDataSourceProperties withServer(String server) {
        this.server = server;
        return this;
    }

    /**
     * Get the database property: The name of the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     * @return the database value.
     */
    public String database() {
        return this.database;
    }

    /**
     * Set the database property: The name of the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     * @param database the database value to set.
     * @return the AzureSynapseDataSourceProperties object itself.
     */
    public AzureSynapseDataSourceProperties withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * Get the table property: The name of the table in the Azure SQL database. Required on PUT (CreateOrReplace)
     * requests.
     * 
     * @return the table value.
     */
    public String table() {
        return this.table;
    }

    /**
     * Set the table property: The name of the table in the Azure SQL database. Required on PUT (CreateOrReplace)
     * requests.
     * 
     * @param table the table value to set.
     * @return the AzureSynapseDataSourceProperties object itself.
     */
    public AzureSynapseDataSourceProperties withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * Get the user property: The user name that will be used to connect to the Azure SQL database. Required on PUT
     * (CreateOrReplace) requests.
     * 
     * @return the user value.
     */
    public String user() {
        return this.user;
    }

    /**
     * Set the user property: The user name that will be used to connect to the Azure SQL database. Required on PUT
     * (CreateOrReplace) requests.
     * 
     * @param user the user value to set.
     * @return the AzureSynapseDataSourceProperties object itself.
     */
    public AzureSynapseDataSourceProperties withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * Get the password property: The password that will be used to connect to the Azure SQL database. Required on PUT
     * (CreateOrReplace) requests.
     * 
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: The password that will be used to connect to the Azure SQL database. Required on PUT
     * (CreateOrReplace) requests.
     * 
     * @param password the password value to set.
     * @return the AzureSynapseDataSourceProperties object itself.
     */
    public AzureSynapseDataSourceProperties withPassword(String password) {
        this.password = password;
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
        jsonWriter.writeStringField("server", this.server);
        jsonWriter.writeStringField("database", this.database);
        jsonWriter.writeStringField("table", this.table);
        jsonWriter.writeStringField("user", this.user);
        jsonWriter.writeStringField("password", this.password);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureSynapseDataSourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureSynapseDataSourceProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureSynapseDataSourceProperties.
     */
    public static AzureSynapseDataSourceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureSynapseDataSourceProperties deserializedAzureSynapseDataSourceProperties
                = new AzureSynapseDataSourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("server".equals(fieldName)) {
                    deserializedAzureSynapseDataSourceProperties.server = reader.getString();
                } else if ("database".equals(fieldName)) {
                    deserializedAzureSynapseDataSourceProperties.database = reader.getString();
                } else if ("table".equals(fieldName)) {
                    deserializedAzureSynapseDataSourceProperties.table = reader.getString();
                } else if ("user".equals(fieldName)) {
                    deserializedAzureSynapseDataSourceProperties.user = reader.getString();
                } else if ("password".equals(fieldName)) {
                    deserializedAzureSynapseDataSourceProperties.password = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureSynapseDataSourceProperties;
        });
    }
}
