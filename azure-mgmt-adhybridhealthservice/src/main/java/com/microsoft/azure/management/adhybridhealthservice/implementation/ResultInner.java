/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The result for an operation.
 */
public class ResultInner {
    /**
     * The value.
     */
    @JsonProperty(value = "value")
    private Boolean value;

    /**
     * Get the value.
     *
     * @return the value value
     */
    public Boolean value() {
        return this.value;
    }

    /**
     * Set the value.
     *
     * @param value the value value to set
     * @return the ResultInner object itself.
     */
    public ResultInner withValue(Boolean value) {
        this.value = value;
        return this;
    }

}
