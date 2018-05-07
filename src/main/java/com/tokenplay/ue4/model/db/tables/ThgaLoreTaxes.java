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
import com.tokenplay.ue4.model.db.tables.records.LoreTaxesRecord;

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
public class Tue4LoreTaxes extends TableImpl<LoreTaxesRecord> {

    private static final long serialVersionUID = -1336639329;

    /**
     * The reference instance of <code>tue4_lore_taxes</code>
     */
    public static final Tue4LoreTaxes LORE_TAXES = new Tue4LoreTaxes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LoreTaxesRecord> getRecordType() {
        return LoreTaxesRecord.class;
    }

    /**
     * The column <code>tue4_lore_taxes.ltax_id</code>.
     */
    public final TableField<LoreTaxesRecord, String> LTAX_ID = createField("ltax_id", org.jooq.impl.SQLDataType.CHAR(32).nullable(false), this, "");

    /**
     * The column <code>tue4_lore_taxes.ltax_weekly</code>.
     */
    public final TableField<LoreTaxesRecord, Integer> LTAX_WEEKLY = createField("ltax_weekly", org.jooq.impl.SQLDataType.INTEGER.nullable(false),
        this, "");

    /**
     * The column <code>tue4_lore_taxes.ltax_annual</code>.
     */
    public final TableField<LoreTaxesRecord, Integer> LTAX_ANNUAL = createField("ltax_annual", org.jooq.impl.SQLDataType.INTEGER.nullable(false),
        this, "");

    /**
     * The column <code>tue4_lore_taxes.ltax_rate</code>.
     */
    public final TableField<LoreTaxesRecord, Double> LTAX_RATE = createField("ltax_rate", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>tue4_lore_taxes.created_at</code>.
     */
    public final TableField<LoreTaxesRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false)
        .defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>tue4_lore_taxes.updated_at</code>.
     */
    public final TableField<LoreTaxesRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false)
        .defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>tue4_lore_taxes</code> table reference
     */
    public Tue4LoreTaxes() {
        this(DSL.name("tue4_lore_taxes"), null);
    }

    /**
     * Create an aliased <code>tue4_lore_taxes</code> table reference
     */
    public Tue4LoreTaxes(String alias) {
        this(DSL.name(alias), LORE_TAXES);
    }

    /**
     * Create an aliased <code>tue4_lore_taxes</code> table reference
     */
    public Tue4LoreTaxes(Name alias) {
        this(alias, LORE_TAXES);
    }

    private Tue4LoreTaxes(Name alias, Table<LoreTaxesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tue4LoreTaxes(Name alias, Table<LoreTaxesRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.LORE_TAXES_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LoreTaxesRecord> getPrimaryKey() {
        return Keys.LORE_TAXES_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LoreTaxesRecord>> getKeys() {
        return Arrays.<UniqueKey<LoreTaxesRecord>>asList(Keys.LORE_TAXES_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tue4LoreTaxes as(String alias) {
        return new Tue4LoreTaxes(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tue4LoreTaxes as(Name alias) {
        return new Tue4LoreTaxes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tue4LoreTaxes rename(String name) {
        return new Tue4LoreTaxes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tue4LoreTaxes rename(Name name) {
        return new Tue4LoreTaxes(name, null);
    }
}
