// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Properties describing the software upgrade state of the Cache. */
@Immutable
public final class CacheUpgradeStatus {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CacheUpgradeStatus.class);

    /*
     * Version string of the firmware currently installed on this Cache.
     */
    @JsonProperty(value = "currentFirmwareVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String currentFirmwareVersion;

    /*
     * True if there is a firmware update ready to install on this Cache. The
     * firmware will automatically be installed after firmwareUpdateDeadline if
     * not triggered earlier via the upgrade operation.
     */
    @JsonProperty(value = "firmwareUpdateStatus", access = JsonProperty.Access.WRITE_ONLY)
    private FirmwareStatusType firmwareUpdateStatus;

    /*
     * Time at which the pending firmware update will automatically be
     * installed on the Cache.
     */
    @JsonProperty(value = "firmwareUpdateDeadline", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime firmwareUpdateDeadline;

    /*
     * Time of the last successful firmware update.
     */
    @JsonProperty(value = "lastFirmwareUpdate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastFirmwareUpdate;

    /*
     * When firmwareUpdateAvailable is true, this field holds the version
     * string for the update.
     */
    @JsonProperty(value = "pendingFirmwareVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String pendingFirmwareVersion;

    /**
     * Get the currentFirmwareVersion property: Version string of the firmware currently installed on this Cache.
     *
     * @return the currentFirmwareVersion value.
     */
    public String currentFirmwareVersion() {
        return this.currentFirmwareVersion;
    }

    /**
     * Get the firmwareUpdateStatus property: True if there is a firmware update ready to install on this Cache. The
     * firmware will automatically be installed after firmwareUpdateDeadline if not triggered earlier via the upgrade
     * operation.
     *
     * @return the firmwareUpdateStatus value.
     */
    public FirmwareStatusType firmwareUpdateStatus() {
        return this.firmwareUpdateStatus;
    }

    /**
     * Get the firmwareUpdateDeadline property: Time at which the pending firmware update will automatically be
     * installed on the Cache.
     *
     * @return the firmwareUpdateDeadline value.
     */
    public OffsetDateTime firmwareUpdateDeadline() {
        return this.firmwareUpdateDeadline;
    }

    /**
     * Get the lastFirmwareUpdate property: Time of the last successful firmware update.
     *
     * @return the lastFirmwareUpdate value.
     */
    public OffsetDateTime lastFirmwareUpdate() {
        return this.lastFirmwareUpdate;
    }

    /**
     * Get the pendingFirmwareVersion property: When firmwareUpdateAvailable is true, this field holds the version
     * string for the update.
     *
     * @return the pendingFirmwareVersion value.
     */
    public String pendingFirmwareVersion() {
        return this.pendingFirmwareVersion;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
