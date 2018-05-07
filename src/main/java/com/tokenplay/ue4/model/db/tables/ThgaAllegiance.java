/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables;


import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import com.tokenplay.ue4.model.db.DefaultSchema;
import com.tokenplay.ue4.model.db.Indexes;
import com.tokenplay.ue4.model.db.Keys;
import com.tokenplay.ue4.model.db.tables.records.AllegianceRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class Tue4Allegiance extends TableImpl<AllegianceRecord> {

    private static final long serialVersionUID = 1341219927;

    /**
     * The reference instance of <code>tue4_allegiance</code>
     */
    public static final Tue4Allegiance ALLEGIANCE = new Tue4Allegiance();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AllegianceRecord> getRecordType() {
        return AllegianceRecord.class;
    }

    /**
     * The column <code>tue4_allegiance.ali_pil_id</code>.
     */
    public final TableField<AllegianceRecord, String> ALI_PIL_ID =
        createField("ali_pil_id", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>tue4_allegiance.ali_sta_id</code>.
     */
    public final TableField<AllegianceRecord, String> ALI_STA_ID =
        createField("ali_sta_id", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>tue4_allegiance.ali_date_init</code>.
     */
    public final TableField<AllegianceRecord, OffsetDateTime> ALI_DATE_INIT = createField("ali_date_init",
        org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE.nullable(false), this, "");

    /**
     * The column <code>tue4_allegiance.ali_date_end</code>.
     */
    public final TableField<AllegianceRecord, OffsetDateTime> ALI_DATE_END = createField("ali_date_end",
        org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE.nullable(false), this, "");

    /**
     * The column <code>tue4_allegiance.ali_rank_number</code>.
     */
    public final TableField<AllegianceRecord, Long> ALI_RANK_NUMBER = createField("ali_rank_number",
        org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>tue4_allegiance.ali_rank</code>.
     */
    public final TableField<AllegianceRecord, String> ALI_RANK = createField("ali_rank", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>tue4_allegiance</code> table reference
     */
    public Tue4Allegiance() {
        this(DSL.name("tue4_allegiance"), null);
    }

    /**
     * Create an aliased <code>tue4_allegiance</code> table reference
     */
    public Tue4Allegiance(String alias) {
        this(DSL.name(alias), ALLEGIANCE);
    }

    /**
     * Create an aliased <code>tue4_allegiance</code> table reference
     */
    public Tue4Allegiance(Name alias) {
        this(alias, ALLEGIANCE);
    }

    private Tue4Allegiance(Name alias, Table<AllegianceRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tue4Allegiance(Name alias, Table<AllegianceRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.IDX_16631_Kue4_STA_ALI_FK, Indexes.ALLEGIANCE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AllegianceRecord> getPrimaryKey() {
        return Keys.ALLEGIANCE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AllegianceRecord>> getKeys() {
        return Arrays.<UniqueKey<AllegianceRecord>>asList(Keys.ALLEGIANCE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AllegianceRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AllegianceRecord, ?>>asList(Keys.ALLEGIANCE__Tue4_ALLEGIANCE_ALI_PIL_ID_FKEY,
            Keys.ALLEGIANCE__Tue4_ALLEGIANCE_ALI_STA_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tue4Allegiance as(String alias) {
        return new Tue4Allegiance(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tue4Allegiance as(Name alias) {
        return new Tue4Allegiance(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tue4Allegiance rename(String name) {
        return new Tue4Allegiance(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tue4Allegiance rename(Name name) {
        return new Tue4Allegiance(name, null);
    }
}
