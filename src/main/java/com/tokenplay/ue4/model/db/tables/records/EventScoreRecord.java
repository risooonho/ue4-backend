/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables.records;


import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import com.tokenplay.ue4.model.db.tables.Tue4EventScore;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {
    "http://www.jooq.org", "jOOQ version:3.10.6"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({
    "all", "unchecked", "rawtypes"})
public class EventScoreRecord extends UpdatableRecordImpl<EventScoreRecord> implements Record4<String, String, String, Integer> {

    private static final long serialVersionUID = 762988556;

    /**
     * Setter for <code>tue4_event_score.esc_id</code>.
     */
    public void setEscId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>tue4_event_score.esc_id</code>.
     */
    @NotNull
    public String getEscId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>tue4_event_score.esc_sco_id</code>.
     */
    public void setEscScoId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>tue4_event_score.esc_sco_id</code>.
     */
    @NotNull
    public String getEscScoId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>tue4_event_score.esc_event_type</code>.
     */
    public void setEscEventType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>tue4_event_score.esc_event_type</code>.
     */
    @NotNull
    public String getEscEventType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>tue4_event_score.esc_event_score</code>.
     */
    public void setEscEventScore(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>tue4_event_score.esc_event_score</code>.
     */
    @NotNull
    public Integer getEscEventScore() {
        return (Integer) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Tue4EventScore.EVENT_SCORE.ESC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Tue4EventScore.EVENT_SCORE.ESC_SCO_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Tue4EventScore.EVENT_SCORE.ESC_EVENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Tue4EventScore.EVENT_SCORE.ESC_EVENT_SCORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getEscId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getEscScoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getEscEventType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getEscEventScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getEscId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getEscScoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getEscEventType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getEscEventScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventScoreRecord value1(String value) {
        setEscId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventScoreRecord value2(String value) {
        setEscScoId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventScoreRecord value3(String value) {
        setEscEventType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventScoreRecord value4(Integer value) {
        setEscEventScore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventScoreRecord values(String value1, String value2, String value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EventScoreRecord
     */
    public EventScoreRecord() {
        super(Tue4EventScore.EVENT_SCORE);
    }

    /**
     * Create a detached, initialised EventScoreRecord
     */
    public EventScoreRecord(String id, String scoId, String eventType, Integer eventScore) {
        super(Tue4EventScore.EVENT_SCORE);

        set(0, id);
        set(1, scoId);
        set(2, eventType);
        set(3, eventScore);
    }
}
