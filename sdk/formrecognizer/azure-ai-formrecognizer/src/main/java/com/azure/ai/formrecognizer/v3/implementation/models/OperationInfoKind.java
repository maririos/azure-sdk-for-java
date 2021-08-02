// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.v3.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OperationInfoKind. */
public final class OperationInfoKind extends ExpandableStringEnum<OperationInfoKind> {
    /** Static value documentModelBuild for OperationInfoKind. */
    public static final OperationInfoKind DOCUMENT_MODEL_BUILD = fromString("documentModelBuild");

    /** Static value documentModelCompose for OperationInfoKind. */
    public static final OperationInfoKind DOCUMENT_MODEL_COMPOSE = fromString("documentModelCompose");

    /** Static value documentModelCopyTo for OperationInfoKind. */
    public static final OperationInfoKind DOCUMENT_MODEL_COPY_TO = fromString("documentModelCopyTo");

    /**
     * Creates or finds a OperationInfoKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OperationInfoKind.
     */
    @JsonCreator
    public static OperationInfoKind fromString(String name) {
        return fromString(name, OperationInfoKind.class);
    }

    /** @return known OperationInfoKind values. */
    public static Collection<OperationInfoKind> values() {
        return values(OperationInfoKind.class);
    }
}
