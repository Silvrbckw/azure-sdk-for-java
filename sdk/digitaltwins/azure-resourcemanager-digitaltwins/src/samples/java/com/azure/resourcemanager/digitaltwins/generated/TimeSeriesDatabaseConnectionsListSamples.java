// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.generated;

/**
 * Samples for TimeSeriesDatabaseConnections List.
 */
public final class TimeSeriesDatabaseConnectionsListSamples {
    /*
     * x-ms-original-file:
     * specification/digitaltwins/resource-manager/Microsoft.DigitalTwins/stable/2023-01-31/examples/
     * TimeSeriesDatabaseConnectionsList_example.json
     */
    /**
     * Sample code: List time series database connections for a DigitalTwins instance.
     * 
     * @param manager Entry point to AzureDigitalTwinsManager.
     */
    public static void listTimeSeriesDatabaseConnectionsForADigitalTwinsInstance(
        com.azure.resourcemanager.digitaltwins.AzureDigitalTwinsManager manager) {
        manager.timeSeriesDatabaseConnections()
            .list("resRg", "myDigitalTwinsService", com.azure.core.util.Context.NONE);
    }
}
