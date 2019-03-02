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
 * The details of the operation.
 */
public class OperationInner {
    /**
     * The name of the operation.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The display details for the operation.
     */
    @JsonProperty(value = "display")
    private Object display;

    /**
     * Get the name of the operation.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the operation.
     *
     * @param name the name value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display details for the operation.
     *
     * @return the display value
     */
    public Object display() {
        return this.display;
    }

    /**
     * Set the display details for the operation.
     *
     * @param display the display value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withDisplay(Object display) {
        this.display = display;
        return this;
    }

}
