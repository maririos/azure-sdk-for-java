// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An object representing various categories of entities. */
@Fluent
public final class DocumentEntity {
    /*
     * Entity type.
     */
    @JsonProperty(value = "category", required = true)
    private String category;

    /*
     * Entity sub type.
     */
    @JsonProperty(value = "subCategory")
    private String subCategory;

    /*
     * Entity content.
     */
    @JsonProperty(value = "content", required = true)
    private String content;

    /*
     * Bounding regions covering the entity.
     */
    @JsonProperty(value = "boundingRegions")
    private List<BoundingRegion> boundingRegions;

    /*
     * Confidence of correctly extracting the entity.
     */
    @JsonProperty(value = "confidence", required = true)
    private float confidence;

    /*
     * Location of the entity in the reading order concatenated content.
     */
    @JsonProperty(value = "spans", required = true)
    private List<DocumentSpan> spans;

    /**
     * Get the category property: Entity type.
     *
     * @return the category value.
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Set the category property: Entity type.
     *
     * @param category the category value to set.
     * @return the DocumentEntity object itself.
     */
    public DocumentEntity setCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the subCategory property: Entity sub type.
     *
     * @return the subCategory value.
     */
    public String getSubCategory() {
        return this.subCategory;
    }

    /**
     * Set the subCategory property: Entity sub type.
     *
     * @param subCategory the subCategory value to set.
     * @return the DocumentEntity object itself.
     */
    public DocumentEntity setSubCategory(String subCategory) {
        this.subCategory = subCategory;
        return this;
    }

    /**
     * Get the content property: Entity content.
     *
     * @return the content value.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Set the content property: Entity content.
     *
     * @param content the content value to set.
     * @return the DocumentEntity object itself.
     */
    public DocumentEntity setContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get the boundingRegions property: Bounding regions covering the entity.
     *
     * @return the boundingRegions value.
     */
    public List<BoundingRegion> getBoundingRegions() {
        return this.boundingRegions;
    }

    /**
     * Set the boundingRegions property: Bounding regions covering the entity.
     *
     * @param boundingRegions the boundingRegions value to set.
     * @return the DocumentEntity object itself.
     */
    public DocumentEntity setBoundingRegions(List<BoundingRegion> boundingRegions) {
        this.boundingRegions = boundingRegions;
        return this;
    }

    /**
     * Get the confidence property: Confidence of correctly extracting the entity.
     *
     * @return the confidence value.
     */
    public float getConfidence() {
        return this.confidence;
    }

    /**
     * Set the confidence property: Confidence of correctly extracting the entity.
     *
     * @param confidence the confidence value to set.
     * @return the DocumentEntity object itself.
     */
    public DocumentEntity setConfidence(float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * Get the spans property: Location of the entity in the reading order concatenated content.
     *
     * @return the spans value.
     */
    public List<DocumentSpan> getSpans() {
        return this.spans;
    }

    /**
     * Set the spans property: Location of the entity in the reading order concatenated content.
     *
     * @param spans the spans value to set.
     * @return the DocumentEntity object itself.
     */
    public DocumentEntity setSpans(List<DocumentSpan> spans) {
        this.spans = spans;
        return this;
    }
}
