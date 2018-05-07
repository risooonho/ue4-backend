/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.tokenplay.ue4.model.db.tables.Tue4BmPayee;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {
    "http://www.jooq.org", "jOOQ version:3.10.6"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({
    "all", "unchecked", "rawtypes"})
public class BmPayeeRecord extends UpdatableRecordImpl<BmPayeeRecord> implements
    Record7<String, String, String, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1805871756;

    /**
     * Setter for <code>tue4_bm_payee.bm_payee_id</code>.
     */
    public void setBmPayeeId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>tue4_bm_payee.bm_payee_id</code>.
     */
    @NotNull
    @Size(max = 32)
    public String getBmPayeeId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>tue4_bm_payee.pil_id</code>.
     */
    public void setPilId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>tue4_bm_payee.pil_id</code>.
     */
    @NotNull
    @Size(max = 32)
    public String getPilId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>tue4_bm_payee.bm_payeename</code>.
     */
    public void setBmPayeename(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>tue4_bm_payee.bm_payeename</code>.
     */
    @NotNull
    @Size(max = 255)
    public String getBmPayeename() {
        return (String) get(2);
    }

    /**
     * Setter for <code>tue4_bm_payee.bm_accountnumber</code>.
     */
    public void setBmAccountnumber(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>tue4_bm_payee.bm_accountnumber</code>.
     */
    @NotNull
    @Size(max = 32)
    public String getBmAccountnumber() {
        return (String) get(3);
    }

    /**
     * Setter for <code>tue4_bm_payee.bm_accounttype</code>.
     */
    public void setBmAccounttype(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>tue4_bm_payee.bm_accounttype</code>.
     */
    @NotNull
    @Size(max = 255)
    public String getBmAccounttype() {
        return (String) get(4);
    }

    /**
     * Setter for <code>tue4_bm_payee.created_at</code>.
     */
    public void setCreatedAt(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>tue4_bm_payee.created_at</code>.
     */
    @NotNull
    public Timestamp getCreatedAt() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>tue4_bm_payee.updated_at</code>.
     */
    public void setUpdatedAt(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>tue4_bm_payee.updated_at</code>.
     */
    @NotNull
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Tue4BmPayee.BM_PAYEE.BM_PAYEE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Tue4BmPayee.BM_PAYEE.PIL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Tue4BmPayee.BM_PAYEE.BM_PAYEENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Tue4BmPayee.BM_PAYEE.BM_ACCOUNTNUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Tue4BmPayee.BM_PAYEE.BM_ACCOUNTTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Tue4BmPayee.BM_PAYEE.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Tue4BmPayee.BM_PAYEE.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getBmPayeeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getPilId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getBmPayeename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getBmAccountnumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getBmAccounttype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getBmPayeeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPilId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getBmPayeename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getBmAccountnumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getBmAccounttype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BmPayeeRecord value1(String value) {
        setBmPayeeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BmPayeeRecord value2(String value) {
        setPilId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BmPayeeRecord value3(String value) {
        setBmPayeename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BmPayeeRecord value4(String value) {
        setBmAccountnumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BmPayeeRecord value5(String value) {
        setBmAccounttype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BmPayeeRecord value6(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BmPayeeRecord value7(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BmPayeeRecord values(String value1, String value2, String value3, String value4, String value5, Timestamp value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BmPayeeRecord
     */
    public BmPayeeRecord() {
        super(Tue4BmPayee.BM_PAYEE);
    }

    /**
     * Create a detached, initialised BmPayeeRecord
     */
    public BmPayeeRecord(String bmPayeeId, String id, String bmPayeename, String bmAccountnumber, String bmAccounttype, Timestamp createdAt,
        Timestamp updatedAt) {
        super(Tue4BmPayee.BM_PAYEE);

        set(0, bmPayeeId);
        set(1, id);
        set(2, bmPayeename);
        set(3, bmAccountnumber);
        set(4, bmAccounttype);
        set(5, createdAt);
        set(6, updatedAt);
    }
}
