/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the properties of the last installed patch summary.
 */
public class LastPatchInstallationSummary {
    /**
     * The overall success or failure status of the operation. It remains
     * "InProgress" until the operation completes. At that point it will become
     * "Failed", "Succeeded", or "CompletedWithWarnings.". Possible values
     * include: 'InProgress', 'Failed', 'Succeeded', 'CompletedWithWarnings'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private PatchOperationStatus status;

    /**
     * The activity ID of the operation that produced this result. It is used
     * to correlate across CRP and extension logs.
     */
    @JsonProperty(value = "installationActivityId", access = JsonProperty.Access.WRITE_ONLY)
    private String installationActivityId;

    /**
     * Describes whether the operation ran out of time before it completed all
     * its intended actions.
     */
    @JsonProperty(value = "maintenanceWindowExceeded", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean maintenanceWindowExceeded;

    /**
     * The reboot status of the machine after the patch operation. It will be
     * in "NotNeeded" status if reboot is not needed after the patch operation.
     * "Required" will be the status once the patch is applied and machine is
     * required to reboot. "Started" will be the reboot status when the machine
     * has started to reboot. "Failed" will be the status if the machine is
     * failed to reboot. "Completed" will be the status once the machine is
     * rebooted successfully. Possible values include: 'NotNeeded', 'Required',
     * 'Started', 'Failed', 'Completed'.
     */
    @JsonProperty(value = "rebootStatus", access = JsonProperty.Access.WRITE_ONLY)
    private RebootStatus rebootStatus;

    /**
     * The number of all available patches but not going to be installed
     * because it didn't match a classification or inclusion list entry.
     */
    @JsonProperty(value = "notSelectedPatchCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer notSelectedPatchCount;

    /**
     * The number of all available patches but excluded explicitly by a
     * customer-specified exclusion list match.
     */
    @JsonProperty(value = "excludedPatchCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer excludedPatchCount;

    /**
     * The number of all available patches expected to be installed over the
     * course of the patch installation operation.
     */
    @JsonProperty(value = "pendingPatchCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer pendingPatchCount;

    /**
     * The count of patches that successfully installed.
     */
    @JsonProperty(value = "installedPatchCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer installedPatchCount;

    /**
     * The count of patches that failed installation.
     */
    @JsonProperty(value = "failedPatchCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer failedPatchCount;

    /**
     * The UTC timestamp when the operation began.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startTime;

    /**
     * The UTC timestamp when the operation began.
     */
    @JsonProperty(value = "lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModifiedTime;

    /**
     * The person or system account that started the operation.
     */
    @JsonProperty(value = "startedBy", access = JsonProperty.Access.WRITE_ONLY)
    private String startedBy;

    /**
     * The errors that were encountered during execution of the operation. The
     * details array contains the list of them.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private ApiError error;

    /**
     * Get the overall success or failure status of the operation. It remains "InProgress" until the operation completes. At that point it will become "Failed", "Succeeded", or "CompletedWithWarnings.". Possible values include: 'InProgress', 'Failed', 'Succeeded', 'CompletedWithWarnings'.
     *
     * @return the status value
     */
    public PatchOperationStatus status() {
        return this.status;
    }

    /**
     * Get the activity ID of the operation that produced this result. It is used to correlate across CRP and extension logs.
     *
     * @return the installationActivityId value
     */
    public String installationActivityId() {
        return this.installationActivityId;
    }

    /**
     * Get describes whether the operation ran out of time before it completed all its intended actions.
     *
     * @return the maintenanceWindowExceeded value
     */
    public Boolean maintenanceWindowExceeded() {
        return this.maintenanceWindowExceeded;
    }

    /**
     * Get the reboot status of the machine after the patch operation. It will be in "NotNeeded" status if reboot is not needed after the patch operation. "Required" will be the status once the patch is applied and machine is required to reboot. "Started" will be the reboot status when the machine has started to reboot. "Failed" will be the status if the machine is failed to reboot. "Completed" will be the status once the machine is rebooted successfully. Possible values include: 'NotNeeded', 'Required', 'Started', 'Failed', 'Completed'.
     *
     * @return the rebootStatus value
     */
    public RebootStatus rebootStatus() {
        return this.rebootStatus;
    }

    /**
     * Get the number of all available patches but not going to be installed because it didn't match a classification or inclusion list entry.
     *
     * @return the notSelectedPatchCount value
     */
    public Integer notSelectedPatchCount() {
        return this.notSelectedPatchCount;
    }

    /**
     * Get the number of all available patches but excluded explicitly by a customer-specified exclusion list match.
     *
     * @return the excludedPatchCount value
     */
    public Integer excludedPatchCount() {
        return this.excludedPatchCount;
    }

    /**
     * Get the number of all available patches expected to be installed over the course of the patch installation operation.
     *
     * @return the pendingPatchCount value
     */
    public Integer pendingPatchCount() {
        return this.pendingPatchCount;
    }

    /**
     * Get the count of patches that successfully installed.
     *
     * @return the installedPatchCount value
     */
    public Integer installedPatchCount() {
        return this.installedPatchCount;
    }

    /**
     * Get the count of patches that failed installation.
     *
     * @return the failedPatchCount value
     */
    public Integer failedPatchCount() {
        return this.failedPatchCount;
    }

    /**
     * Get the UTC timestamp when the operation began.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the UTC timestamp when the operation began.
     *
     * @return the lastModifiedTime value
     */
    public DateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get the person or system account that started the operation.
     *
     * @return the startedBy value
     */
    public String startedBy() {
        return this.startedBy;
    }

    /**
     * Get the errors that were encountered during execution of the operation. The details array contains the list of them.
     *
     * @return the error value
     */
    public ApiError error() {
        return this.error;
    }

}