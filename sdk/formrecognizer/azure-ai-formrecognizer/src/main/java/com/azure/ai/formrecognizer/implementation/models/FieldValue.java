// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/** An object representing the content and location of a field value. */
@Fluent
public final class FieldValue {
    /*
     * Data type of the field value.
     */
    @JsonProperty(value = "type", required = true)
    private FieldValueType type;

    /*
     * String value.
     */
    @JsonProperty(value = "valueString")
    private String valueString;

    /*
     * Date value in YYYY-MM-DD format (ISO 8601).
     */
    @JsonProperty(value = "valueDate")
    private LocalDate valueDate;

    /*
     * Time value in hh:mm:ss format (ISO 8601).
     */
    @JsonProperty(value = "valueTime")
    private String valueTime;

    /*
     * Phone number value in E.164 format (ex. +19876543210).
     */
    @JsonProperty(value = "valuePhoneNumber")
    private String valuePhoneNumber;

    /*
     * Floating point value.
     */
    @JsonProperty(value = "valueNumber")
    private Float valueNumber;

    /*
     * Integer value.
     */
    @JsonProperty(value = "valueInteger")
    private Integer valueInteger;

    /*
     * Selection mark value.
     */
    @JsonProperty(value = "valueSelectionMark")
    private SelectionMarkState valueSelectionMark;

    /*
     * Presence of signature.
     */
    @JsonProperty(value = "valueSignature")
    private DocumentSignatureType valueSignature;

    /*
     * 3-letter country code value (ISO 3166-1 alpha-3).
     */
    @JsonProperty(value = "valueCountryRegion")
    private String valueCountryRegion;

    /*
     * 3-letter currency code value (ISO 4217).
     */
    @JsonProperty(value = "valueCurrency")
    private String valueCurrency;

    /*
     * Array of field values.
     */
    @JsonProperty(value = "valueArray")
    private List<FieldValue> valueArray;

    /*
     * Dictionary of named field values.
     */
    @JsonProperty(value = "valueObject")
    private Map<String, FieldValue> valueObject;

    /*
     * Field content.
     */
    @JsonProperty(value = "content")
    private String content;

    /*
     * Bounding regions covering the field.
     */
    @JsonProperty(value = "boundingRegions")
    private List<BoundingRegion> boundingRegions;

    /*
     * Confidence of correctly extracting the field.
     */
    @JsonProperty(value = "confidence")
    private Float confidence;

    /*
     * Location of the field in the reading order concatenated content.
     */
    @JsonProperty(value = "spans")
    private List<DocumentSpan> spans;

    /**
     * Get the type property: Data type of the field value.
     *
     * @return the type value.
     */
    public FieldValueType getType() {
        return this.type;
    }

    /**
     * Set the type property: Data type of the field value.
     *
     * @param type the type value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setType(FieldValueType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the valueString property: String value.
     *
     * @return the valueString value.
     */
    public String getValueString() {
        return this.valueString;
    }

    /**
     * Set the valueString property: String value.
     *
     * @param valueString the valueString value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setValueString(String valueString) {
        this.valueString = valueString;
        return this;
    }

    /**
     * Get the valueDate property: Date value in YYYY-MM-DD format (ISO 8601).
     *
     * @return the valueDate value.
     */
    public LocalDate getValueDate() {
        return this.valueDate;
    }

    /**
     * Set the valueDate property: Date value in YYYY-MM-DD format (ISO 8601).
     *
     * @param valueDate the valueDate value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setValueDate(LocalDate valueDate) {
        this.valueDate = valueDate;
        return this;
    }

    /**
     * Get the valueTime property: Time value in hh:mm:ss format (ISO 8601).
     *
     * @return the valueTime value.
     */
    public String getValueTime() {
        return this.valueTime;
    }

    /**
     * Set the valueTime property: Time value in hh:mm:ss format (ISO 8601).
     *
     * @param valueTime the valueTime value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setValueTime(String valueTime) {
        this.valueTime = valueTime;
        return this;
    }

    /**
     * Get the valuePhoneNumber property: Phone number value in E.164 format (ex. +19876543210).
     *
     * @return the valuePhoneNumber value.
     */
    public String getValuePhoneNumber() {
        return this.valuePhoneNumber;
    }

    /**
     * Set the valuePhoneNumber property: Phone number value in E.164 format (ex. +19876543210).
     *
     * @param valuePhoneNumber the valuePhoneNumber value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setValuePhoneNumber(String valuePhoneNumber) {
        this.valuePhoneNumber = valuePhoneNumber;
        return this;
    }

    /**
     * Get the valueNumber property: Floating point value.
     *
     * @return the valueNumber value.
     */
    public Float getValueNumber() {
        return this.valueNumber;
    }

    /**
     * Set the valueNumber property: Floating point value.
     *
     * @param valueNumber the valueNumber value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setValueNumber(Float valueNumber) {
        this.valueNumber = valueNumber;
        return this;
    }

    /**
     * Get the valueInteger property: Integer value.
     *
     * @return the valueInteger value.
     */
    public Integer getValueInteger() {
        return this.valueInteger;
    }

    /**
     * Set the valueInteger property: Integer value.
     *
     * @param valueInteger the valueInteger value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setValueInteger(Integer valueInteger) {
        this.valueInteger = valueInteger;
        return this;
    }

    /**
     * Get the valueSelectionMark property: Selection mark value.
     *
     * @return the valueSelectionMark value.
     */
    public SelectionMarkState getValueSelectionMark() {
        return this.valueSelectionMark;
    }

    /**
     * Set the valueSelectionMark property: Selection mark value.
     *
     * @param valueSelectionMark the valueSelectionMark value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setValueSelectionMark(SelectionMarkState valueSelectionMark) {
        this.valueSelectionMark = valueSelectionMark;
        return this;
    }

    /**
     * Get the valueSignature property: Presence of signature.
     *
     * @return the valueSignature value.
     */
    public DocumentSignatureType getValueSignature() {
        return this.valueSignature;
    }

    /**
     * Set the valueSignature property: Presence of signature.
     *
     * @param valueSignature the valueSignature value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setValueSignature(DocumentSignatureType valueSignature) {
        this.valueSignature = valueSignature;
        return this;
    }

    /**
     * Get the valueCountryRegion property: 3-letter country code value (ISO 3166-1 alpha-3).
     *
     * @return the valueCountryRegion value.
     */
    public String getValueCountryRegion() {
        return this.valueCountryRegion;
    }

    /**
     * Set the valueCountryRegion property: 3-letter country code value (ISO 3166-1 alpha-3).
     *
     * @param valueCountryRegion the valueCountryRegion value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setValueCountryRegion(String valueCountryRegion) {
        this.valueCountryRegion = valueCountryRegion;
        return this;
    }

    /**
     * Get the valueCurrency property: 3-letter currency code value (ISO 4217).
     *
     * @return the valueCurrency value.
     */
    public String getValueCurrency() {
        return this.valueCurrency;
    }

    /**
     * Set the valueCurrency property: 3-letter currency code value (ISO 4217).
     *
     * @param valueCurrency the valueCurrency value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setValueCurrency(String valueCurrency) {
        this.valueCurrency = valueCurrency;
        return this;
    }

    /**
     * Get the valueArray property: Array of field values.
     *
     * @return the valueArray value.
     */
    public List<FieldValue> getValueArray() {
        return this.valueArray;
    }

    /**
     * Set the valueArray property: Array of field values.
     *
     * @param valueArray the valueArray value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setValueArray(List<FieldValue> valueArray) {
        this.valueArray = valueArray;
        return this;
    }

    /**
     * Get the valueObject property: Dictionary of named field values.
     *
     * @return the valueObject value.
     */
    public Map<String, FieldValue> getValueObject() {
        return this.valueObject;
    }

    /**
     * Set the valueObject property: Dictionary of named field values.
     *
     * @param valueObject the valueObject value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setValueObject(Map<String, FieldValue> valueObject) {
        this.valueObject = valueObject;
        return this;
    }

    /**
     * Get the content property: Field content.
     *
     * @return the content value.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Set the content property: Field content.
     *
     * @param content the content value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get the boundingRegions property: Bounding regions covering the field.
     *
     * @return the boundingRegions value.
     */
    public List<BoundingRegion> getBoundingRegions() {
        return this.boundingRegions;
    }

    /**
     * Set the boundingRegions property: Bounding regions covering the field.
     *
     * @param boundingRegions the boundingRegions value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setBoundingRegions(List<BoundingRegion> boundingRegions) {
        this.boundingRegions = boundingRegions;
        return this;
    }

    /**
     * Get the confidence property: Confidence of correctly extracting the field.
     *
     * @return the confidence value.
     */
    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * Set the confidence property: Confidence of correctly extracting the field.
     *
     * @param confidence the confidence value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * Get the spans property: Location of the field in the reading order concatenated content.
     *
     * @return the spans value.
     */
    public List<DocumentSpan> getSpans() {
        return this.spans;
    }

    /**
     * Set the spans property: Location of the field in the reading order concatenated content.
     *
     * @param spans the spans value to set.
     * @return the FieldValue object itself.
     */
    public FieldValue setSpans(List<DocumentSpan> spans) {
        this.spans = spans;
        return this;
    }
}
