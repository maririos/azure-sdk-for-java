// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Operation info. */
@Fluent
public class OperationInfo {
    /*
     * Operation ID
     */
    @JsonProperty(value = "operationId", required = true)
    private String operationId;

    /*
     * Operation status.
     */
    @JsonProperty(value = "status", required = true)
    private OperationStatus status;

    /*
     * Operation progress (0-100).
     */
    @JsonProperty(value = "percentCompleted")
    private Integer percentCompleted;

    /*
     * Date and time (UTC) when the model was created.
     */
    @JsonProperty(value = "createdDateTime", required = true)
    private String createdDateTime;

    /*
     * Date and time (UTC) when the status was last updated.
     */
    @JsonProperty(value = "lastUpdatedDateTime", required = true)
    private String lastUpdatedDateTime;

    /*
     * Type of operation.
     */
    @JsonProperty(value = "kind")
    private OperationInfoKind kind;

    /*
     * URL of the resource targeted by this operation.
     */
    @JsonProperty(value = "resourceLocation", required = true)
    private String resourceLocation;

    /**
     * Get the operationId property: Operation ID.
     *
     * @return the operationId value.
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * Set the operationId property: Operation ID.
     *
     * @param operationId the operationId value to set.
     * @return the OperationInfo object itself.
     */
    public OperationInfo setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * Get the status property: Operation status.
     *
     * @return the status value.
     */
    public OperationStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Operation status.
     *
     * @param status the status value to set.
     * @return the OperationInfo object itself.
     */
    public OperationInfo setStatus(OperationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the percentCompleted property: Operation progress (0-100).
     *
     * @return the percentCompleted value.
     */
    public Integer getPercentCompleted() {
        return this.percentCompleted;
    }

    /**
     * Set the percentCompleted property: Operation progress (0-100).
     *
     * @param percentCompleted the percentCompleted value to set.
     * @return the OperationInfo object itself.
     */
    public OperationInfo setPercentCompleted(Integer percentCompleted) {
        this.percentCompleted = percentCompleted;
        return this;
    }

    /**
     * Get the createdDateTime property: Date and time (UTC) when the model was created.
     *
     * @return the createdDateTime value.
     */
    public String getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: Date and time (UTC) when the model was created.
     *
     * @param createdDateTime the createdDateTime value to set.
     * @return the OperationInfo object itself.
     */
    public OperationInfo setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the lastUpdatedDateTime property: Date and time (UTC) when the status was last updated.
     *
     * @return the lastUpdatedDateTime value.
     */
    public String getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * Set the lastUpdatedDateTime property: Date and time (UTC) when the status was last updated.
     *
     * @param lastUpdatedDateTime the lastUpdatedDateTime value to set.
     * @return the OperationInfo object itself.
     */
    public OperationInfo setLastUpdatedDateTime(String lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
        return this;
    }

    /**
     * Get the kind property: Type of operation.
     *
     * @return the kind value.
     */
    public OperationInfoKind getKind() {
        return this.kind;
    }

    /**
     * Set the kind property: Type of operation.
     *
     * @param kind the kind value to set.
     * @return the OperationInfo object itself.
     */
    public OperationInfo setKind(OperationInfoKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the resourceLocation property: URL of the resource targeted by this operation.
     *
     * @return the resourceLocation value.
     */
    public String getResourceLocation() {
        return this.resourceLocation;
    }

    /**
     * Set the resourceLocation property: URL of the resource targeted by this operation.
     *
     * @param resourceLocation the resourceLocation value to set.
     * @return the OperationInfo object itself.
     */
    public OperationInfo setResourceLocation(String resourceLocation) {
        this.resourceLocation = resourceLocation;
        return this;
    }
}
