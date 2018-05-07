/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import com.tokenplay.ue4.model.db.DefaultSchema;
import com.tokenplay.ue4.model.db.Indexes;
import com.tokenplay.ue4.model.db.Keys;
import com.tokenplay.ue4.model.db.tables.records.BmPayeeRecord;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {
    "http://www.jooq.org", "jOOQ version:3.10.6"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({
    "all", "unchecked", "rawtypes"})
public class Tue4BmPayee extends TableImpl<BmPayeeRecord> {

    private static final long serialVersionUID = 1189022264;

    /**
     * The reference instance of <code>tue4_bm_payee</code>
     */
    public static final Tue4BmPayee BM_PAYEE = new Tue4BmPayee();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BmPayeeRecord> getRecordType() {
        return BmPayeeRecord.class;
    }

    /**
     * The column <code>tue4_bm_payee.bm_payee_id</code>.
     */
    public final TableField<BmPayeeRecord, String> BM_PAYEE_ID = createField("bm_payee_id", org.jooq.impl.SQLDataType.CHAR(32).nullable(false), this,
        "");

    /**
     * The column <code>tue4_bm_payee.pil_id</code>.
     */
    public final TableField<BmPayeeRecord, String> PIL_ID = createField("pil_id", org.jooq.impl.SQLDataType.CHAR(32).nullable(false), this, "");

    /**
     * The column <code>tue4_bm_payee.bm_payeename</code>.
     */
    public final TableField<BmPayeeRecord, String> BM_PAYEENAME = createField("bm_payeename", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false),
        this, "");

    /**
     * The column <code>tue4_bm_payee.bm_accountnumber</code>.
     */
    public final TableField<BmPayeeRecord, String> BM_ACCOUNTNUMBER = createField("bm_accountnumber",
        org.jooq.impl.SQLDataType.CHAR(32).nullable(false), this, "");

    /**
     * The column <code>tue4_bm_payee.bm_accounttype</code>.
     */
    public final TableField<BmPayeeRecord, String> BM_ACCOUNTTYPE = createField("bm_accounttype",
        org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>tue4_bm_payee.created_at</code>.
     */
    public final TableField<BmPayeeRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false),
        this, "");

    /**
     * The column <code>tue4_bm_payee.updated_at</code>.
     */
    public final TableField<BmPayeeRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false),
        this, "");

    /**
     * Create a <code>tue4_bm_payee</code> table reference
     */
    public Tue4BmPayee() {
        this(DSL.name("tue4_bm_payee"), null);
    }

    /**
     * Create an aliased <code>tue4_bm_payee</code> table reference
     */
    public Tue4BmPayee(String alias) {
        this(DSL.name(alias), BM_PAYEE);
    }

    /**
     * Create an aliased <code>tue4_bm_payee</code> table reference
     */
    public Tue4BmPayee(Name alias) {
        this(alias, BM_PAYEE);
    }

    private Tue4BmPayee(Name alias, Table<BmPayeeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tue4BmPayee(Name alias, Table<BmPayeeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.BM_PAYEE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BmPayeeRecord> getPrimaryKey() {
        return Keys.BM_PAYEE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BmPayeeRecord>> getKeys() {
        return Arrays.<UniqueKey<BmPayeeRecord>>asList(Keys.BM_PAYEE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tue4BmPayee as(String alias) {
        return new Tue4BmPayee(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tue4BmPayee as(Name alias) {
        return new Tue4BmPayee(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tue4BmPayee rename(String name) {
        return new Tue4BmPayee(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tue4BmPayee rename(Name name) {
        return new Tue4BmPayee(name, null);
    }
}
