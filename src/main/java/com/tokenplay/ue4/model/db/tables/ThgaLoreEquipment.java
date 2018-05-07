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
import com.tokenplay.ue4.model.db.tables.records.LoreEquipmentRecord;

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
public class Tue4LoreEquipment extends TableImpl<LoreEquipmentRecord> {

    private static final long serialVersionUID = -1512149045;

    /**
     * The reference instance of <code>tue4_lore_equipment</code>
     */
    public static final Tue4LoreEquipment LORE_EQUIPMENT = new Tue4LoreEquipment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LoreEquipmentRecord> getRecordType() {
        return LoreEquipmentRecord.class;
    }

    /**
     * The column <code>tue4_lore_equipment.leq_id</code>.
     */
    public final TableField<LoreEquipmentRecord, String> LEQ_ID = createField("leq_id", org.jooq.impl.SQLDataType.CHAR(32).nullable(false), this, "");

    /**
     * The column <code>tue4_lore_equipment.leq_code</code>.
     */
    public final TableField<LoreEquipmentRecord, String> LEQ_CODE = createField("leq_code", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false),
        this, "");

    /**
     * The column <code>tue4_lore_equipment.leq_type</code>.
     */
    public final TableField<LoreEquipmentRecord, String> LEQ_TYPE = createField("leq_type", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false),
        this, "");

    /**
     * The column <code>tue4_lore_equipment.leq_manufacture</code>.
     */
    public final TableField<LoreEquipmentRecord, String> LEQ_MANUFACTURE = createField("leq_manufacture", org.jooq.impl.SQLDataType.VARCHAR(255)
        .nullable(false), this, "");

    /**
     * The column <code>tue4_lore_equipment.leq_lco_id</code>.
     */
    public final TableField<LoreEquipmentRecord, String> LEQ_LCO_ID = createField("leq_lco_id", org.jooq.impl.SQLDataType.CHAR(32), this, "");

    /**
     * The column <code>tue4_lore_equipment.leq_faction</code>.
     */
    public final TableField<LoreEquipmentRecord, String> LEQ_FACTION = createField("leq_faction", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>tue4_lore_equipment.leq_equipment</code>.
     */
    public final TableField<LoreEquipmentRecord, String> LEQ_EQUIPMENT = createField("leq_equipment", org.jooq.impl.SQLDataType.VARCHAR(255)
        .nullable(false), this, "");

    /**
     * The column <code>tue4_lore_equipment.leq_ino_id</code>.
     */
    public final TableField<LoreEquipmentRecord, String> LEQ_INO_ID = createField("leq_ino_id", org.jooq.impl.SQLDataType.CHAR(32), this, "");

    /**
     * The column <code>tue4_lore_equipment.leq_lge_id</code>.
     */
    public final TableField<LoreEquipmentRecord, String> LEQ_LGE_ID = createField("leq_lge_id", org.jooq.impl.SQLDataType.CHAR(32), this, "");

    /**
     * The column <code>tue4_lore_equipment.leq_rounds</code>.
     */
    public final TableField<LoreEquipmentRecord, Integer> LEQ_ROUNDS = createField("leq_rounds", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>tue4_lore_equipment.leq_store_order_id</code>.
     */
    public final TableField<LoreEquipmentRecord, String> LEQ_STORE_ORDER_ID = createField("leq_store_order_id",
        org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>tue4_lore_equipment.leq_threat</code>.
     */
    public final TableField<LoreEquipmentRecord, Integer> LEQ_THREAT = createField("leq_threat", org.jooq.impl.SQLDataType.INTEGER.nullable(false),
        this, "");

    /**
     * The column <code>tue4_lore_equipment.leq_ratio</code>.
     */
    public final TableField<LoreEquipmentRecord, Integer> LEQ_RATIO = createField("leq_ratio", org.jooq.impl.SQLDataType.INTEGER.nullable(false),
        this, "");

    /**
     * The column <code>tue4_lore_equipment.leq_cost</code>.
     */
    public final TableField<LoreEquipmentRecord, Double> LEQ_COST = createField("leq_cost", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this,
        "");

    /**
     * The column <code>tue4_lore_equipment.leq_tec</code>.
     */
    public final TableField<LoreEquipmentRecord, Integer> LEQ_TEC = createField("leq_tec", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this,
        "");

    /**
     * The column <code>tue4_lore_equipment.created_at</code>.
     */
    public final TableField<LoreEquipmentRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP
        .nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>tue4_lore_equipment.updated_at</code>.
     */
    public final TableField<LoreEquipmentRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP
        .nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>tue4_lore_equipment</code> table reference
     */
    public Tue4LoreEquipment() {
        this(DSL.name("tue4_lore_equipment"), null);
    }

    /**
     * Create an aliased <code>tue4_lore_equipment</code> table reference
     */
    public Tue4LoreEquipment(String alias) {
        this(DSL.name(alias), LORE_EQUIPMENT);
    }

    /**
     * Create an aliased <code>tue4_lore_equipment</code> table reference
     */
    public Tue4LoreEquipment(Name alias) {
        this(alias, LORE_EQUIPMENT);
    }

    private Tue4LoreEquipment(Name alias, Table<LoreEquipmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tue4LoreEquipment(Name alias, Table<LoreEquipmentRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.LORE_EQUIPMENT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LoreEquipmentRecord> getPrimaryKey() {
        return Keys.LORE_EQUIPMENT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LoreEquipmentRecord>> getKeys() {
        return Arrays.<UniqueKey<LoreEquipmentRecord>>asList(Keys.LORE_EQUIPMENT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tue4LoreEquipment as(String alias) {
        return new Tue4LoreEquipment(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tue4LoreEquipment as(Name alias) {
        return new Tue4LoreEquipment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tue4LoreEquipment rename(String name) {
        return new Tue4LoreEquipment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tue4LoreEquipment rename(Name name) {
        return new Tue4LoreEquipment(name, null);
    }
}
