// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.v3.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DocumentSignatureType. */
public final class DocumentSignatureType extends ExpandableStringEnum<DocumentSignatureType> {
    /** Static value signed for DocumentSignatureType. */
    public static final DocumentSignatureType SIGNED = fromString("signed");

    /** Static value unsigned for DocumentSignatureType. */
    public static final DocumentSignatureType UNSIGNED = fromString("unsigned");

    /**
     * Creates or finds a DocumentSignatureType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DocumentSignatureType.
     */
    @JsonCreator
    public static DocumentSignatureType fromString(String name) {
        return fromString(name, DocumentSignatureType.class);
    }

    /** @return known DocumentSignatureType values. */
    public static Collection<DocumentSignatureType> values() {
        return values(DocumentSignatureType.class);
    }
}
