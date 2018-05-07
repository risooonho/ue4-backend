/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.tokenplay.ue4.model.db.tables.Tue4LorePlanets;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {
    "http://www.jooq.org", "jOOQ version:3.10.6"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({
    "all", "unchecked", "rawtypes"})
public class LorePlanetsRecord extends UpdatableRecordImpl<LorePlanetsRecord> implements
    Record11<String, String, String, String, Integer, String, Long, Double, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1475037099;

    /**
     * Setter for <code>tue4_lore_planets.lpla_id</code>.
     */
    public void setLplaId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>tue4_lore_planets.lpla_id</code>.
     */
    @NotNull
    @Size(max = 32)
    public String getLplaId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>tue4_lore_planets.lpla_star_system</code>.
     */
    public void setLplaStarSystem(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>tue4_lore_planets.lpla_star_system</code>.
     */
    @Size(max = 255)
    public String getLplaStarSystem() {
        return (String) get(1);
    }

    /**
     * Setter for <code>tue4_lore_planets.lpla_lstar_id</code>.
     */
    public void setLplaLstarId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>tue4_lore_planets.lpla_lstar_id</code>.
     */
    @Size(max = 32)
    public String getLplaLstarId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>tue4_lore_planets.lpla_name</code>.
     */
    public void setLplaName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>tue4_lore_planets.lpla_name</code>.
     */
    @NotNull
    @Size(max = 255)
    public String getLplaName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>tue4_lore_planets.lpla_position</code>.
     */
    public void setLplaPosition(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>tue4_lore_planets.lpla_position</code>.
     */
    public Integer getLplaPosition() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>tue4_lore_planets.lpla_owner</code>.
     */
    public void setLplaOwner(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>tue4_lore_planets.lpla_owner</code>.
     */
    @Size(max = 255)
    public String getLplaOwner() {
        return (String) get(5);
    }

    /**
     * Setter for <code>tue4_lore_planets.lpla_star_distance</code>.
     */
    public void setLplaStarDistance(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>tue4_lore_planets.lpla_star_distance</code>.
     */
    public Long getLplaStarDistance() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>tue4_lore_planets.lpla_star_au</code>.
     */
    public void setLplaStarAu(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>tue4_lore_planets.lpla_star_au</code>.
     */
    public Double getLplaStarAu() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>tue4_lore_planets.lpla_description</code>.
     */
    public void setLplaDescription(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>tue4_lore_planets.lpla_description</code>.
     */
    public String getLplaDescription() {
        return (String) get(8);
    }

    /**
     * Setter for <code>tue4_lore_planets.created_at</code>.
     */
    public void setCreatedAt(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>tue4_lore_planets.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>tue4_lore_planets.updated_at</code>.
     */
    public void setUpdatedAt(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>tue4_lore_planets.updated_at</code>.
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, String, String, Integer, String, Long, Double, String, Timestamp, Timestamp> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, String, String, Integer, String, Long, Double, String, Timestamp, Timestamp> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Tue4LorePlanets.LORE_PLANETS.LPLA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Tue4LorePlanets.LORE_PLANETS.LPLA_STAR_SYSTEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Tue4LorePlanets.LORE_PLANETS.LPLA_LSTAR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Tue4LorePlanets.LORE_PLANETS.LPLA_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Tue4LorePlanets.LORE_PLANETS.LPLA_POSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Tue4LorePlanets.LORE_PLANETS.LPLA_OWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return Tue4LorePlanets.LORE_PLANETS.LPLA_STAR_DISTANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field8() {
        return Tue4LorePlanets.LORE_PLANETS.LPLA_STAR_AU;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Tue4LorePlanets.LORE_PLANETS.LPLA_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return Tue4LorePlanets.LORE_PLANETS.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return Tue4LorePlanets.LORE_PLANETS.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getLplaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getLplaStarSystem();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLplaLstarId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getLplaName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getLplaPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getLplaOwner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getLplaStarDistance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component8() {
        return getLplaStarAu();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getLplaDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getLplaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getLplaStarSystem();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLplaLstarId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLplaName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getLplaPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getLplaOwner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getLplaStarDistance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value8() {
        return getLplaStarAu();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getLplaDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LorePlanetsRecord value1(String value) {
        setLplaId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LorePlanetsRecord value2(String value) {
        setLplaStarSystem(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LorePlanetsRecord value3(String value) {
        setLplaLstarId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LorePlanetsRecord value4(String value) {
        setLplaName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LorePlanetsRecord value5(Integer value) {
        setLplaPosition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LorePlanetsRecord value6(String value) {
        setLplaOwner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LorePlanetsRecord value7(Long value) {
        setLplaStarDistance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LorePlanetsRecord value8(Double value) {
        setLplaStarAu(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LorePlanetsRecord value9(String value) {
        setLplaDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LorePlanetsRecord value10(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LorePlanetsRecord value11(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LorePlanetsRecord values(String value1, String value2, String value3, String value4, Integer value5, String value6, Long value7,
        Double value8, String value9, Timestamp value10, Timestamp value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LorePlanetsRecord
     */
    public LorePlanetsRecord() {
        super(Tue4LorePlanets.LORE_PLANETS);
    }

    /**
     * Create a detached, initialised LorePlanetsRecord
     */
    public LorePlanetsRecord(String lplaId, String lplaStarSystem, String lplaLstarId, String lplaName, Integer lplaPosition, String lplaOwner,
        Long lplaStarDistance, Double lplaStarAu, String lplaDescription, Timestamp createdAt, Timestamp updatedAt) {
        super(Tue4LorePlanets.LORE_PLANETS);

        set(0, lplaId);
        set(1, lplaStarSystem);
        set(2, lplaLstarId);
        set(3, lplaName);
        set(4, lplaPosition);
        set(5, lplaOwner);
        set(6, lplaStarDistance);
        set(7, lplaStarAu);
        set(8, lplaDescription);
        set(9, createdAt);
        set(10, updatedAt);
    }
}
