/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.tokenplay.ue4.model.db.tables.Tue4LoreEarthtimeline;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {
    "http://www.jooq.org", "jOOQ version:3.10.6"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({
    "all", "unchecked", "rawtypes"})
public class LoreEarthtimelineRecord extends UpdatableRecordImpl<LoreEarthtimelineRecord> implements
    Record6<String, String, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1987637750;

    /**
     * Setter for <code>tue4_lore_earthtimeline.learth_id</code>.
     */
    public void setLearthId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>tue4_lore_earthtimeline.learth_id</code>.
     */
    @NotNull
    @Size(max = 32)
    public String getLearthId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>tue4_lore_earthtimeline.learth_era</code>.
     */
    public void setLearthEra(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>tue4_lore_earthtimeline.learth_era</code>.
     */
    @NotNull
    @Size(max = 255)
    public String getLearthEra() {
        return (String) get(1);
    }

    /**
     * Setter for <code>tue4_lore_earthtimeline.learth_dates</code>.
     */
    public void setLearthDates(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>tue4_lore_earthtimeline.learth_dates</code>.
     */
    @NotNull
    @Size(max = 255)
    public String getLearthDates() {
        return (String) get(2);
    }

    /**
     * Setter for <code>tue4_lore_earthtimeline.learth_descrip</code>.
     */
    public void setLearthDescrip(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>tue4_lore_earthtimeline.learth_descrip</code>.
     */
    @NotNull
    @Size(max = 255)
    public String getLearthDescrip() {
        return (String) get(3);
    }

    /**
     * Setter for <code>tue4_lore_earthtimeline.created_at</code>.
     */
    public void setCreatedAt(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>tue4_lore_earthtimeline.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>tue4_lore_earthtimeline.updated_at</code>.
     */
    public void setUpdatedAt(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>tue4_lore_earthtimeline.updated_at</code>.
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Tue4LoreEarthtimeline.LORE_EARTHTIMELINE.LEARTH_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Tue4LoreEarthtimeline.LORE_EARTHTIMELINE.LEARTH_ERA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Tue4LoreEarthtimeline.LORE_EARTHTIMELINE.LEARTH_DATES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Tue4LoreEarthtimeline.LORE_EARTHTIMELINE.LEARTH_DESCRIP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Tue4LoreEarthtimeline.LORE_EARTHTIMELINE.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Tue4LoreEarthtimeline.LORE_EARTHTIMELINE.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getLearthId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getLearthEra();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLearthDates();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getLearthDescrip();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getLearthId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getLearthEra();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLearthDates();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLearthDescrip();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoreEarthtimelineRecord value1(String value) {
        setLearthId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoreEarthtimelineRecord value2(String value) {
        setLearthEra(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoreEarthtimelineRecord value3(String value) {
        setLearthDates(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoreEarthtimelineRecord value4(String value) {
        setLearthDescrip(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoreEarthtimelineRecord value5(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoreEarthtimelineRecord value6(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoreEarthtimelineRecord values(String value1, String value2, String value3, String value4, Timestamp value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LoreEarthtimelineRecord
     */
    public LoreEarthtimelineRecord() {
        super(Tue4LoreEarthtimeline.LORE_EARTHTIMELINE);
    }

    /**
     * Create a detached, initialised LoreEarthtimelineRecord
     */
    public LoreEarthtimelineRecord(String learthId, String learthEra, String learthDates, String learthDescrip, Timestamp createdAt,
        Timestamp updatedAt) {
        super(Tue4LoreEarthtimeline.LORE_EARTHTIMELINE);

        set(0, learthId);
        set(1, learthEra);
        set(2, learthDates);
        set(3, learthDescrip);
        set(4, createdAt);
        set(5, updatedAt);
    }
}
