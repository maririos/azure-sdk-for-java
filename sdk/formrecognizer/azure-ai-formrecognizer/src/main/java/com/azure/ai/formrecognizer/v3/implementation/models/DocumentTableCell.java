// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.v3.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An object representing the location and content of a table cell. */
@Fluent
public final class DocumentTableCell {
    /*
     * The kind property.
     */
    @JsonProperty(value = "kind", required = true)
    private DocumentTableCellKind kind;

    /*
     * Row index of the cell.
     */
    @JsonProperty(value = "rowIndex", required = true)
    private int rowIndex;

    /*
     * Column index of the cell.
     */
    @JsonProperty(value = "columnIndex", required = true)
    private int columnIndex;

    /*
     * Number of rows spanned by this cell.
     */
    @JsonProperty(value = "rowSpan")
    private Integer rowSpan;

    /*
     * Number of columns spanned by this cell.
     */
    @JsonProperty(value = "columnSpan")
    private Integer columnSpan;

    /*
     * Concatenated content of the table cell in reading order.
     */
    @JsonProperty(value = "content", required = true)
    private String content;

    /*
     * Bounding regions covering the table cell.
     */
    @JsonProperty(value = "boundingRegions", required = true)
    private List<BoundingRegion> boundingRegions;

    /*
     * Location of the table cell in the reading order concatenated content.
     */
    @JsonProperty(value = "spans", required = true)
    private List<DocumentSpan> spans;

    /**
     * Get the kind property: The kind property.
     *
     * @return the kind value.
     */
    public DocumentTableCellKind getKind() {
        return this.kind;
    }

    /**
     * Set the kind property: The kind property.
     *
     * @param kind the kind value to set.
     * @return the DocumentTableCell object itself.
     */
    public DocumentTableCell setKind(DocumentTableCellKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the rowIndex property: Row index of the cell.
     *
     * @return the rowIndex value.
     */
    public int getRowIndex() {
        return this.rowIndex;
    }

    /**
     * Set the rowIndex property: Row index of the cell.
     *
     * @param rowIndex the rowIndex value to set.
     * @return the DocumentTableCell object itself.
     */
    public DocumentTableCell setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
        return this;
    }

    /**
     * Get the columnIndex property: Column index of the cell.
     *
     * @return the columnIndex value.
     */
    public int getColumnIndex() {
        return this.columnIndex;
    }

    /**
     * Set the columnIndex property: Column index of the cell.
     *
     * @param columnIndex the columnIndex value to set.
     * @return the DocumentTableCell object itself.
     */
    public DocumentTableCell setColumnIndex(int columnIndex) {
        this.columnIndex = columnIndex;
        return this;
    }

    /**
     * Get the rowSpan property: Number of rows spanned by this cell.
     *
     * @return the rowSpan value.
     */
    public Integer getRowSpan() {
        return this.rowSpan;
    }

    /**
     * Set the rowSpan property: Number of rows spanned by this cell.
     *
     * @param rowSpan the rowSpan value to set.
     * @return the DocumentTableCell object itself.
     */
    public DocumentTableCell setRowSpan(Integer rowSpan) {
        this.rowSpan = rowSpan;
        return this;
    }

    /**
     * Get the columnSpan property: Number of columns spanned by this cell.
     *
     * @return the columnSpan value.
     */
    public Integer getColumnSpan() {
        return this.columnSpan;
    }

    /**
     * Set the columnSpan property: Number of columns spanned by this cell.
     *
     * @param columnSpan the columnSpan value to set.
     * @return the DocumentTableCell object itself.
     */
    public DocumentTableCell setColumnSpan(Integer columnSpan) {
        this.columnSpan = columnSpan;
        return this;
    }

    /**
     * Get the content property: Concatenated content of the table cell in reading order.
     *
     * @return the content value.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Set the content property: Concatenated content of the table cell in reading order.
     *
     * @param content the content value to set.
     * @return the DocumentTableCell object itself.
     */
    public DocumentTableCell setContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get the boundingRegions property: Bounding regions covering the table cell.
     *
     * @return the boundingRegions value.
     */
    public List<BoundingRegion> getBoundingRegions() {
        return this.boundingRegions;
    }

    /**
     * Set the boundingRegions property: Bounding regions covering the table cell.
     *
     * @param boundingRegions the boundingRegions value to set.
     * @return the DocumentTableCell object itself.
     */
    public DocumentTableCell setBoundingRegions(List<BoundingRegion> boundingRegions) {
        this.boundingRegions = boundingRegions;
        return this;
    }

    /**
     * Get the spans property: Location of the table cell in the reading order concatenated content.
     *
     * @return the spans value.
     */
    public List<DocumentSpan> getSpans() {
        return this.spans;
    }

    /**
     * Set the spans property: Location of the table cell in the reading order concatenated content.
     *
     * @param spans the spans value to set.
     * @return the DocumentTableCell object itself.
     */
    public DocumentTableCell setSpans(List<DocumentSpan> spans) {
        this.spans = spans;
        return this;
    }
}
