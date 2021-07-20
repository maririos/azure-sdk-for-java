// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Model info. */
@Fluent
public class ModelInfo {
    /*
     * Unique model name.
     */
    @JsonProperty(value = "modelId", required = true)
    private String modelId;

    /*
     * Model description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Date and time (UTC) when the model was created.
     */
    @JsonProperty(value = "createdDateTime", required = true)
    private String createdDateTime;

    /**
     * Get the modelId property: Unique model name.
     *
     * @return the modelId value.
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * Set the modelId property: Unique model name.
     *
     * @param modelId the modelId value to set.
     * @return the ModelInfo object itself.
     */
    public ModelInfo setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * Get the description property: Model description.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Model description.
     *
     * @param description the description value to set.
     * @return the ModelInfo object itself.
     */
    public ModelInfo setDescription(String description) {
        this.description = description;
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
     * @return the ModelInfo object itself.
     */
    public ModelInfo setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }
}
