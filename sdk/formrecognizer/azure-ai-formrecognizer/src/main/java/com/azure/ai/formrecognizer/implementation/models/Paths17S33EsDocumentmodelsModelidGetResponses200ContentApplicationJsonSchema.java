// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The Paths17S33EsDocumentmodelsModelidGetResponses200ContentApplicationJsonSchema model. */
@Fluent
public final class Paths17S33EsDocumentmodelsModelidGetResponses200ContentApplicationJsonSchema extends ModelInfo {
    /*
     * Supported document types.
     */
    @JsonProperty(value = "docTypes")
    private Map<
                    String,
                    Paths1Mp6JdlDocumentmodelsModelidGetResponses200ContentApplicationJsonSchemaAllof1PropertiesDoctypesAdditionalproperties>
            docTypes;

    /**
     * Get the docTypes property: Supported document types.
     *
     * @return the docTypes value.
     */
    public Map<
                    String,
                    Paths1Mp6JdlDocumentmodelsModelidGetResponses200ContentApplicationJsonSchemaAllof1PropertiesDoctypesAdditionalproperties>
            getDocTypes() {
        return this.docTypes;
    }

    /**
     * Set the docTypes property: Supported document types.
     *
     * @param docTypes the docTypes value to set.
     * @return the Paths17S33EsDocumentmodelsModelidGetResponses200ContentApplicationJsonSchema object itself.
     */
    public Paths17S33EsDocumentmodelsModelidGetResponses200ContentApplicationJsonSchema setDocTypes(
            Map<
                            String,
                            Paths1Mp6JdlDocumentmodelsModelidGetResponses200ContentApplicationJsonSchemaAllof1PropertiesDoctypesAdditionalproperties>
                    docTypes) {
        this.docTypes = docTypes;
        return this;
    }
}
