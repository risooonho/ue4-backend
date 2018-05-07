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
import com.tokenplay.ue4.model.db.tables.records.LoreCorporationsRecord;

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
public class Tue4LoreCorporations extends TableImpl<LoreCorporationsRecord> {

    private static final long serialVersionUID = -1627297482;

    /**
     * The reference instance of <code>tue4_lore_corporations</code>
     */
    public static final Tue4LoreCorporations LORE_CORPORATIONS = new Tue4LoreCorporations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LoreCorporationsRecord> getRecordType() {
        return LoreCorporationsRecord.class;
    }

    /**
     * The column <code>tue4_lore_corporations.lco_id</code>.
     */
    public final TableField<LoreCorporationsRecord, String> LCO_ID = createField("lco_id", org.jooq.impl.SQLDataType.CHAR(32).nullable(false), this,
        "");

    /**
     * The column <code>tue4_lore_corporations.lco_name</code>.
     */
    public final TableField<LoreCorporationsRecord, String> LCO_NAME = createField("lco_name",
        org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>tue4_lore_corporations.lco_industry</code>.
     */
    public final TableField<LoreCorporationsRecord, String> LCO_INDUSTRY = createField("lco_industry", org.jooq.impl.SQLDataType.VARCHAR(255)
        .nullable(false), this, "");

    /**
     * The column <code>tue4_lore_corporations.lco_hemisphere</code>.
     */
    public final TableField<LoreCorporationsRecord, String> LCO_HEMISPHERE = createField("lco_hemisphere", org.jooq.impl.SQLDataType.VARCHAR(255)
        .nullable(false), this, "");

    /**
     * The column <code>tue4_lore_corporations.lco_location</code>.
     */
    public final TableField<LoreCorporationsRecord, String> LCO_LOCATION = createField("lco_location", org.jooq.impl.SQLDataType.VARCHAR(255)
        .nullable(false), this, "");

    /**
     * The column <code>tue4_lore_corporations.lloc_id</code>.
     */
    public final TableField<LoreCorporationsRecord, String> LLOC_ID = createField("lloc_id", org.jooq.impl.SQLDataType.CHAR(32).nullable(false),
        this, "");

    /**
     * The column <code>tue4_lore_corporations.lco_marketcap</code>.
     */
    public final TableField<LoreCorporationsRecord, Double> LCO_MARKETCAP = createField("lco_marketcap",
        org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>tue4_lore_corporations.lco_price</code>.
     */
    public final TableField<LoreCorporationsRecord, Double> LCO_PRICE = createField("lco_price", org.jooq.impl.SQLDataType.DOUBLE.nullable(false),
        this, "");

    /**
     * The column <code>tue4_lore_corporations.lco_valuation</code>.
     */
    public final TableField<LoreCorporationsRecord, Double> LCO_VALUATION = createField("lco_valuation",
        org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>tue4_lore_corporations.lco_seed</code>.
     */
    public final TableField<LoreCorporationsRecord, Double> LCO_SEED = createField("lco_seed", org.jooq.impl.SQLDataType.DOUBLE.nullable(false),
        this, "");

    /**
     * The column <code>tue4_lore_corporations.created_at</code>.
     */
    public final TableField<LoreCorporationsRecord, Timestamp> CREATED_AT = createField("created_at",
        org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)),
        this, "");

    /**
     * The column <code>tue4_lore_corporations.updated_at</code>.
     */
    public final TableField<LoreCorporationsRecord, Timestamp> UPDATED_AT = createField("updated_at",
        org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)),
        this, "");

    /**
     * Create a <code>tue4_lore_corporations</code> table reference
     */
    public Tue4LoreCorporations() {
        this(DSL.name("tue4_lore_corporations"), null);
    }

    /**
     * Create an aliased <code>tue4_lore_corporations</code> table reference
     */
    public Tue4LoreCorporations(String alias) {
        this(DSL.name(alias), LORE_CORPORATIONS);
    }

    /**
     * Create an aliased <code>tue4_lore_corporations</code> table reference
     */
    public Tue4LoreCorporations(Name alias) {
        this(alias, LORE_CORPORATIONS);
    }

    private Tue4LoreCorporations(Name alias, Table<LoreCorporationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tue4LoreCorporations(Name alias, Table<LoreCorporationsRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.LORE_CORPORATIONS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LoreCorporationsRecord> getPrimaryKey() {
        return Keys.LORE_CORPORATIONS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LoreCorporationsRecord>> getKeys() {
        return Arrays.<UniqueKey<LoreCorporationsRecord>>asList(Keys.LORE_CORPORATIONS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tue4LoreCorporations as(String alias) {
        return new Tue4LoreCorporations(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tue4LoreCorporations as(Name alias) {
        return new Tue4LoreCorporations(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tue4LoreCorporations rename(String name) {
        return new Tue4LoreCorporations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tue4LoreCorporations rename(Name name) {
        return new Tue4LoreCorporations(name, null);
    }
}
