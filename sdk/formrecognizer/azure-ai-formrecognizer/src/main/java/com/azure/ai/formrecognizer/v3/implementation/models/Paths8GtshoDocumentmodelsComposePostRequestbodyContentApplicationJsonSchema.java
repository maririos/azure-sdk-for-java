// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.v3.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Request body to create a composed model from component models. */
@Fluent
public final class Paths8GtshoDocumentmodelsComposePostRequestbodyContentApplicationJsonSchema {
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
     * List of component models to compose.
     */
    @JsonProperty(value = "componentModels", required = true)
    private List<PostContentSchemaComponentModelsItem> componentModels;

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
     * @return the Paths8GtshoDocumentmodelsComposePostRequestbodyContentApplicationJsonSchema object itself.
     */
    public Paths8GtshoDocumentmodelsComposePostRequestbodyContentApplicationJsonSchema setModelId(String modelId) {
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
     * @return the Paths8GtshoDocumentmodelsComposePostRequestbodyContentApplicationJsonSchema object itself.
     */
    public Paths8GtshoDocumentmodelsComposePostRequestbodyContentApplicationJsonSchema setDescription(
            String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the componentModels property: List of component models to compose.
     *
     * @return the componentModels value.
     */
    public List<PostContentSchemaComponentModelsItem> getComponentModels() {
        return this.componentModels;
    }

    /**
     * Set the componentModels property: List of component models to compose.
     *
     * @param componentModels the componentModels value to set.
     * @return the Paths8GtshoDocumentmodelsComposePostRequestbodyContentApplicationJsonSchema object itself.
     */
    public Paths8GtshoDocumentmodelsComposePostRequestbodyContentApplicationJsonSchema setComponentModels(
            List<PostContentSchemaComponentModelsItem> componentModels) {
        this.componentModels = componentModels;
        return this;
    }
}
