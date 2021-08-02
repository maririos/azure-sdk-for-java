// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.v3.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Document analysis parameters. */
@Fluent
public final class PathsHp0B6WDocumentmodelsModelidAnalyzePostRequestbodyContentImageBmpSchema {
    /*
     * Documents to analyze.
     */
    @JsonProperty(value = "source")
    private ContentSource source;

    /**
     * Get the source property: Documents to analyze.
     *
     * @return the source value.
     */
    public ContentSource getSource() {
        return this.source;
    }

    /**
     * Set the source property: Documents to analyze.
     *
     * @param source the source value to set.
     * @return the PathsHp0B6WDocumentmodelsModelidAnalyzePostRequestbodyContentImageBmpSchema object itself.
     */
    public PathsHp0B6WDocumentmodelsModelidAnalyzePostRequestbodyContentImageBmpSchema setSource(ContentSource source) {
        this.source = source;
        return this;
    }
}
