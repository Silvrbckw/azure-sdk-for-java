// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

/**
 * Samples for SapLandscapeMonitor List.
 */
public final class SapLandscapeMonitorListSamples {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/stable/2023-04-01/examples/workloadmonitor/
     * SapLandscapeMonitor_List.json
     */
    /**
     * Sample code: Get properties of a SAP monitor.
     * 
     * @param manager Entry point to WorkloadsManager.
     */
    public static void getPropertiesOfASAPMonitor(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.sapLandscapeMonitors()
            .listWithResponse("myResourceGroup", "mySapMonitor", com.azure.core.util.Context.NONE);
    }
}
