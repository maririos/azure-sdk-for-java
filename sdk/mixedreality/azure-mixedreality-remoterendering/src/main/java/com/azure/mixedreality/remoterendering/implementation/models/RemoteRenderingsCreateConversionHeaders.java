// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.mixedreality.remoterendering.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RemoteRenderingsCreateConversionHeaders model. */
@Fluent
public final class RemoteRenderingsCreateConversionHeaders {
    /*
     * The MS-CV property.
     */
    @JsonProperty(value = "MS-CV")
    private String msCV;

    /**
     * Get the msCV property: The MS-CV property.
     *
     * @return the msCV value.
     */
    public String getMsCV() {
        return this.msCV;
    }

    /**
     * Set the msCV property: The MS-CV property.
     *
     * @param msCV the msCV value to set.
     * @return the RemoteRenderingsCreateConversionHeaders object itself.
     */
    public RemoteRenderingsCreateConversionHeaders setMsCV(String msCV) {
        this.msCV = msCV;
        return this;
    }
}
