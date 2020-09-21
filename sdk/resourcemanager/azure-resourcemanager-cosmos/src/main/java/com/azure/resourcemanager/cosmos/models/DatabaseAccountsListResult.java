// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.fluent.inner.DatabaseAccountGetResultsInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DatabaseAccountsListResult model. */
@Immutable
public final class DatabaseAccountsListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabaseAccountsListResult.class);

    /*
     * List of database account and their properties.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<DatabaseAccountGetResultsInner> value;

    /**
     * Get the value property: List of database account and their properties.
     *
     * @return the value value.
     */
    public List<DatabaseAccountGetResultsInner> value() {
        return this.value;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}