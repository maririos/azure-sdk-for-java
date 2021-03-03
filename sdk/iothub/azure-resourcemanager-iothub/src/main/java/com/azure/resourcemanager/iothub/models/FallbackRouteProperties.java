// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The properties of the fallback route. IoT Hub uses these properties when it routes messages to the fallback endpoint.
 */
@Fluent
public final class FallbackRouteProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FallbackRouteProperties.class);

    /*
     * The name of the route. The name can only include alphanumeric
     * characters, periods, underscores, hyphens, has a maximum length of 64
     * characters, and must be unique.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The source to which the routing rule is to be applied to. For example,
     * DeviceMessages
     */
    @JsonProperty(value = "source", required = true)
    private RoutingSource source;

    /*
     * The condition which is evaluated in order to apply the fallback route.
     * If the condition is not provided it will evaluate to true by default.
     * For grammar, See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-query-language
     */
    @JsonProperty(value = "condition")
    private String condition;

    /*
     * The list of endpoints to which the messages that satisfy the condition
     * are routed to. Currently only 1 endpoint is allowed.
     */
    @JsonProperty(value = "endpointNames", required = true)
    private List<String> endpointNames;

    /*
     * Used to specify whether the fallback route is enabled.
     */
    @JsonProperty(value = "isEnabled", required = true)
    private boolean isEnabled;

    /**
     * Get the name property: The name of the route. The name can only include alphanumeric characters, periods,
     * underscores, hyphens, has a maximum length of 64 characters, and must be unique.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the route. The name can only include alphanumeric characters, periods,
     * underscores, hyphens, has a maximum length of 64 characters, and must be unique.
     *
     * @param name the name value to set.
     * @return the FallbackRouteProperties object itself.
     */
    public FallbackRouteProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the source property: The source to which the routing rule is to be applied to. For example, DeviceMessages.
     *
     * @return the source value.
     */
    public RoutingSource source() {
        return this.source;
    }

    /**
     * Set the source property: The source to which the routing rule is to be applied to. For example, DeviceMessages.
     *
     * @param source the source value to set.
     * @return the FallbackRouteProperties object itself.
     */
    public FallbackRouteProperties withSource(RoutingSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the condition property: The condition which is evaluated in order to apply the fallback route. If the
     * condition is not provided it will evaluate to true by default. For grammar, See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-query-language.
     *
     * @return the condition value.
     */
    public String condition() {
        return this.condition;
    }

    /**
     * Set the condition property: The condition which is evaluated in order to apply the fallback route. If the
     * condition is not provided it will evaluate to true by default. For grammar, See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-query-language.
     *
     * @param condition the condition value to set.
     * @return the FallbackRouteProperties object itself.
     */
    public FallbackRouteProperties withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Get the endpointNames property: The list of endpoints to which the messages that satisfy the condition are routed
     * to. Currently only 1 endpoint is allowed.
     *
     * @return the endpointNames value.
     */
    public List<String> endpointNames() {
        return this.endpointNames;
    }

    /**
     * Set the endpointNames property: The list of endpoints to which the messages that satisfy the condition are routed
     * to. Currently only 1 endpoint is allowed.
     *
     * @param endpointNames the endpointNames value to set.
     * @return the FallbackRouteProperties object itself.
     */
    public FallbackRouteProperties withEndpointNames(List<String> endpointNames) {
        this.endpointNames = endpointNames;
        return this;
    }

    /**
     * Get the isEnabled property: Used to specify whether the fallback route is enabled.
     *
     * @return the isEnabled value.
     */
    public boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: Used to specify whether the fallback route is enabled.
     *
     * @param isEnabled the isEnabled value to set.
     * @return the FallbackRouteProperties object itself.
     */
    public FallbackRouteProperties withIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (source() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property source in model FallbackRouteProperties"));
        }
        if (endpointNames() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property endpointNames in model FallbackRouteProperties"));
        }
    }
}
