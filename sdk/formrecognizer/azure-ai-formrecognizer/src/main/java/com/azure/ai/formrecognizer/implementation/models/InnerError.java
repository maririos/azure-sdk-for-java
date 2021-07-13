// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Detailed error. */
@Fluent
public final class InnerError {
    /*
     * Error code.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /*
     * Detailed error.
     */
    @JsonProperty(value = "innererror")
    private InnerError innererror;

    /**
     * Get the code property: Error code.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Set the code property: Error code.
     *
     * @param code the code value to set.
     * @return the InnerError object itself.
     */
    public InnerError setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the innererror property: Detailed error.
     *
     * @return the innererror value.
     */
    public InnerError getInnererror() {
        return this.innererror;
    }

    /**
     * Set the innererror property: Detailed error.
     *
     * @param innererror the innererror value to set.
     * @return the InnerError object itself.
     */
    public InnerError setInnererror(InnerError innererror) {
        this.innererror = innererror;
        return this;
    }
}
