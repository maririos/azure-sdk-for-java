// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.v3.implementation.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for OperationStatus. */
public enum OperationStatus {
    /** Enum value notStarted. */
    NOT_STARTED("notStarted"),

    /** Enum value running. */
    RUNNING("running"),

    /** Enum value failed. */
    FAILED("failed"),

    /** Enum value succeeded. */
    SUCCEEDED("succeeded"),

    /** Enum value canceled. */
    CANCELED("canceled");

    /** The actual serialized value for a OperationStatus instance. */
    private final String value;

    OperationStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a OperationStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed OperationStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static OperationStatus fromString(String value) {
        OperationStatus[] items = OperationStatus.values();
        for (OperationStatus item : items) {
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
