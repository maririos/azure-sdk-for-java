// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.v3.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Error info. */
@Fluent
public final class Error {
    /*
     * Error code.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /*
     * Error message.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /*
     * Target of the error.
     */
    @JsonProperty(value = "target")
    private String target;

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
     * @return the Error object itself.
     */
    public Error setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: Error message.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: Error message.
     *
     * @param message the message value to set.
     * @return the Error object itself.
     */
    public Error setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the target property: Target of the error.
     *
     * @return the target value.
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Set the target property: Target of the error.
     *
     * @param target the target value to set.
     * @return the Error object itself.
     */
    public Error setTarget(String target) {
        this.target = target;
        return this;
    }
}
