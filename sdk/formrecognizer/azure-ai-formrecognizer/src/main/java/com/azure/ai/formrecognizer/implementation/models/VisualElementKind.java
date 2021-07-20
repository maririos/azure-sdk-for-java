// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for VisualElementKind. */
public final class VisualElementKind extends ExpandableStringEnum<VisualElementKind> {
    /** Static value image for VisualElementKind. */
    public static final VisualElementKind IMAGE = fromString("image");

    /** Static value separator for VisualElementKind. */
    public static final VisualElementKind SEPARATOR = fromString("separator");

    /** Static value paragraph for VisualElementKind. */
    public static final VisualElementKind PARAGRAPH = fromString("paragraph");

    /** Static value column for VisualElementKind. */
    public static final VisualElementKind COLUMN = fromString("column");

    /**
     * Creates or finds a VisualElementKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VisualElementKind.
     */
    @JsonCreator
    public static VisualElementKind fromString(String name) {
        return fromString(name, VisualElementKind.class);
    }

    /** @return known VisualElementKind values. */
    public static Collection<VisualElementKind> values() {
        return values(VisualElementKind.class);
    }
}
