// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storagecache.models.ClfsTarget;
import com.azure.resourcemanager.storagecache.models.NamespaceJunction;
import com.azure.resourcemanager.storagecache.models.Nfs3Target;
import com.azure.resourcemanager.storagecache.models.ProvisioningStateType;
import com.azure.resourcemanager.storagecache.models.StorageTargetResource;
import com.azure.resourcemanager.storagecache.models.UnknownTarget;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Type of the Storage Target. */
@JsonFlatten
@Fluent
public class StorageTargetInner extends StorageTargetResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StorageTargetInner.class);

    /*
     * List of Cache namespace junctions to target for namespace associations.
     */
    @JsonProperty(value = "properties.junctions")
    private List<NamespaceJunction> junctions;

    /*
     * ARM provisioning state, see
     * https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/Addendum.md#provisioningstate-property
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningStateType provisioningState;

    /*
     * Properties when targetType is nfs3.
     */
    @JsonProperty(value = "properties.nfs3")
    private Nfs3Target nfs3;

    /*
     * Properties when targetType is clfs.
     */
    @JsonProperty(value = "properties.clfs")
    private ClfsTarget clfs;

    /*
     * Properties when targetType is unknown.
     */
    @JsonProperty(value = "properties.unknown")
    private UnknownTarget unknown;

    /**
     * Get the junctions property: List of Cache namespace junctions to target for namespace associations.
     *
     * @return the junctions value.
     */
    public List<NamespaceJunction> junctions() {
        return this.junctions;
    }

    /**
     * Set the junctions property: List of Cache namespace junctions to target for namespace associations.
     *
     * @param junctions the junctions value to set.
     * @return the StorageTargetInner object itself.
     */
    public StorageTargetInner withJunctions(List<NamespaceJunction> junctions) {
        this.junctions = junctions;
        return this;
    }

    /**
     * Get the provisioningState property: ARM provisioning state, see
     * https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/Addendum.md#provisioningstate-property.
     *
     * @return the provisioningState value.
     */
    public ProvisioningStateType provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: ARM provisioning state, see
     * https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/Addendum.md#provisioningstate-property.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the StorageTargetInner object itself.
     */
    public StorageTargetInner withProvisioningState(ProvisioningStateType provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the nfs3 property: Properties when targetType is nfs3.
     *
     * @return the nfs3 value.
     */
    public Nfs3Target nfs3() {
        return this.nfs3;
    }

    /**
     * Set the nfs3 property: Properties when targetType is nfs3.
     *
     * @param nfs3 the nfs3 value to set.
     * @return the StorageTargetInner object itself.
     */
    public StorageTargetInner withNfs3(Nfs3Target nfs3) {
        this.nfs3 = nfs3;
        return this;
    }

    /**
     * Get the clfs property: Properties when targetType is clfs.
     *
     * @return the clfs value.
     */
    public ClfsTarget clfs() {
        return this.clfs;
    }

    /**
     * Set the clfs property: Properties when targetType is clfs.
     *
     * @param clfs the clfs value to set.
     * @return the StorageTargetInner object itself.
     */
    public StorageTargetInner withClfs(ClfsTarget clfs) {
        this.clfs = clfs;
        return this;
    }

    /**
     * Get the unknown property: Properties when targetType is unknown.
     *
     * @return the unknown value.
     */
    public UnknownTarget unknown() {
        return this.unknown;
    }

    /**
     * Set the unknown property: Properties when targetType is unknown.
     *
     * @param unknown the unknown value to set.
     * @return the StorageTargetInner object itself.
     */
    public StorageTargetInner withUnknown(UnknownTarget unknown) {
        this.unknown = unknown;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (junctions() != null) {
            junctions().forEach(e -> e.validate());
        }
        if (nfs3() != null) {
            nfs3().validate();
        }
        if (clfs() != null) {
            clfs().validate();
        }
        if (unknown() != null) {
            unknown().validate();
        }
    }
}
