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
import com.tokenplay.ue4.model.db.tables.records.LoreEarthtimelineRecord;

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
public class Tue4LoreEarthtimeline extends TableImpl<LoreEarthtimelineRecord> {

    private static final long serialVersionUID = 1164607065;

    /**
     * The reference instance of <code>tue4_lore_earthtimeline</code>
     */
    public static final Tue4LoreEarthtimeline LORE_EARTHTIMELINE = new Tue4LoreEarthtimeline();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LoreEarthtimelineRecord> getRecordType() {
        return LoreEarthtimelineRecord.class;
    }

    /**
     * The column <code>tue4_lore_earthtimeline.learth_id</code>.
     */
    public final TableField<LoreEarthtimelineRecord, String> LEARTH_ID = createField("learth_id", org.jooq.impl.SQLDataType.CHAR(32).nullable(false),
        this, "");

    /**
     * The column <code>tue4_lore_earthtimeline.learth_era</code>.
     */
    public final TableField<LoreEarthtimelineRecord, String> LEARTH_ERA = createField("learth_era",
        org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>tue4_lore_earthtimeline.learth_dates</code>.
     */
    public final TableField<LoreEarthtimelineRecord, String> LEARTH_DATES = createField("learth_dates", org.jooq.impl.SQLDataType.VARCHAR(255)
        .nullable(false), this, "");

    /**
     * The column <code>tue4_lore_earthtimeline.learth_descrip</code>.
     */
    public final TableField<LoreEarthtimelineRecord, String> LEARTH_DESCRIP = createField("learth_descrip", org.jooq.impl.SQLDataType.VARCHAR(255)
        .nullable(false), this, "");

    /**
     * The column <code>tue4_lore_earthtimeline.created_at</code>.
     */
    public final TableField<LoreEarthtimelineRecord, Timestamp> CREATED_AT = createField("created_at",
        org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)),
        this, "");

    /**
     * The column <code>tue4_lore_earthtimeline.updated_at</code>.
     */
    public final TableField<LoreEarthtimelineRecord, Timestamp> UPDATED_AT = createField("updated_at",
        org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)),
        this, "");

    /**
     * Create a <code>tue4_lore_earthtimeline</code> table reference
     */
    public Tue4LoreEarthtimeline() {
        this(DSL.name("tue4_lore_earthtimeline"), null);
    }

    /**
     * Create an aliased <code>tue4_lore_earthtimeline</code> table reference
     */
    public Tue4LoreEarthtimeline(String alias) {
        this(DSL.name(alias), LORE_EARTHTIMELINE);
    }

    /**
     * Create an aliased <code>tue4_lore_earthtimeline</code> table reference
     */
    public Tue4LoreEarthtimeline(Name alias) {
        this(alias, LORE_EARTHTIMELINE);
    }

    private Tue4LoreEarthtimeline(Name alias, Table<LoreEarthtimelineRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tue4LoreEarthtimeline(Name alias, Table<LoreEarthtimelineRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.LORE_EARTHTIMELINE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LoreEarthtimelineRecord> getPrimaryKey() {
        return Keys.LORE_EARTHTIMELINE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LoreEarthtimelineRecord>> getKeys() {
        return Arrays.<UniqueKey<LoreEarthtimelineRecord>>asList(Keys.LORE_EARTHTIMELINE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tue4LoreEarthtimeline as(String alias) {
        return new Tue4LoreEarthtimeline(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tue4LoreEarthtimeline as(Name alias) {
        return new Tue4LoreEarthtimeline(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tue4LoreEarthtimeline rename(String name) {
        return new Tue4LoreEarthtimeline(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tue4LoreEarthtimeline rename(Name name) {
        return new Tue4LoreEarthtimeline(name, null);
    }
}
