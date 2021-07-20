// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for AnalyzeResultOperationStatus. */
public enum AnalyzeResultOperationStatus {
    /** Enum value notStarted. */
    NOT_STARTED("notStarted"),

    /** Enum value running. */
    RUNNING("running"),

    /** Enum value failed. */
    FAILED("failed"),

    /** Enum value succeeded. */
    SUCCEEDED("succeeded");

    /** The actual serialized value for a AnalyzeResultOperationStatus instance. */
    private final String value;

    AnalyzeResultOperationStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AnalyzeResultOperationStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AnalyzeResultOperationStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static AnalyzeResultOperationStatus fromString(String value) {
        AnalyzeResultOperationStatus[] items = AnalyzeResultOperationStatus.values();
        for (AnalyzeResultOperationStatus item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
