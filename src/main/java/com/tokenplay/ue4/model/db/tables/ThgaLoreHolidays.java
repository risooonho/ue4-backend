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
import com.tokenplay.ue4.model.db.tables.records.LoreHolidaysRecord;

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
public class Tue4LoreHolidays extends TableImpl<LoreHolidaysRecord> {

    private static final long serialVersionUID = -510752384;

    /**
     * The reference instance of <code>tue4_lore_holidays</code>
     */
    public static final Tue4LoreHolidays LORE_HOLIDAYS = new Tue4LoreHolidays();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LoreHolidaysRecord> getRecordType() {
        return LoreHolidaysRecord.class;
    }

    /**
     * The column <code>tue4_lore_holidays.lhol_id</code>.
     */
    public final TableField<LoreHolidaysRecord, String> LHOL_ID =
        createField("lhol_id", org.jooq.impl.SQLDataType.CHAR(32).nullable(false), this, "");

    /**
     * The column <code>tue4_lore_holidays.lhol_name</code>.
     */
    public final TableField<LoreHolidaysRecord, String> LHOL_NAME = createField("lhol_name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false),
        this, "");

    /**
     * The column <code>tue4_lore_holidays.lhol_theme</code>.
     */
    public final TableField<LoreHolidaysRecord, String> LHOL_THEME = createField("lhol_theme",
        org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>tue4_lore_holidays.lhol_tn_date</code>.
     */
    public final TableField<LoreHolidaysRecord, String> LHOL_TN_DATE = createField("lhol_tn_date",
        org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>tue4_lore_holidays.lhol_where</code>.
     */
    public final TableField<LoreHolidaysRecord, String> LHOL_WHERE = createField("lhol_where",
        org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>tue4_lore_holidays.created_at</code>.
     */
    public final TableField<LoreHolidaysRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false)
        .defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>tue4_lore_holidays.updated_at</code>.
     */
    public final TableField<LoreHolidaysRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false)
        .defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>tue4_lore_holidays</code> table reference
     */
    public Tue4LoreHolidays() {
        this(DSL.name("tue4_lore_holidays"), null);
    }

    /**
     * Create an aliased <code>tue4_lore_holidays</code> table reference
     */
    public Tue4LoreHolidays(String alias) {
        this(DSL.name(alias), LORE_HOLIDAYS);
    }

    /**
     * Create an aliased <code>tue4_lore_holidays</code> table reference
     */
    public Tue4LoreHolidays(Name alias) {
        this(alias, LORE_HOLIDAYS);
    }

    private Tue4LoreHolidays(Name alias, Table<LoreHolidaysRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tue4LoreHolidays(Name alias, Table<LoreHolidaysRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.LORE_HOLIDAYS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LoreHolidaysRecord> getPrimaryKey() {
        return Keys.LORE_HOLIDAYS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LoreHolidaysRecord>> getKeys() {
        return Arrays.<UniqueKey<LoreHolidaysRecord>>asList(Keys.LORE_HOLIDAYS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tue4LoreHolidays as(String alias) {
        return new Tue4LoreHolidays(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tue4LoreHolidays as(Name alias) {
        return new Tue4LoreHolidays(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tue4LoreHolidays rename(String name) {
        return new Tue4LoreHolidays(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tue4LoreHolidays rename(Name name) {
        return new Tue4LoreHolidays(name, null);
    }
}
