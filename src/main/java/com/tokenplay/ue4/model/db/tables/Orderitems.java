/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables;


import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import com.tokenplay.ue4.model.db.DefaultSchema;
import com.tokenplay.ue4.model.db.Indexes;
import com.tokenplay.ue4.model.db.Keys;
import com.tokenplay.ue4.model.db.tables.records.OrderitemsRecord;

import org.jooq.Field;
import org.jooq.Identity;
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
public class Orderitems extends TableImpl<OrderitemsRecord> {

    private static final long serialVersionUID = -130433651;

    /**
     * The reference instance of <code>orderitems</code>
     */
    public static final Orderitems ORDERITEMS = new Orderitems();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderitemsRecord> getRecordType() {
        return OrderitemsRecord.class;
    }

    /**
     * The column <code>orderitems.id</code>.
     */
    public final TableField<OrderitemsRecord, Long> ID = createField(
        "id",
        org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(
            org.jooq.impl.DSL.field("nextval('orderitems_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>orderitems.order_id</code>.
     */
    public final TableField<OrderitemsRecord, Long> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>orderitems.product_id</code>.
     */
    public final TableField<OrderitemsRecord, Long> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>orderitems.title</code>.
     */
    public final TableField<OrderitemsRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>orderitems.price</code>.
     */
    public final TableField<OrderitemsRecord, BigDecimal> PRICE = createField("price", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>orderitems.quantity</code>.
     */
    public final TableField<OrderitemsRecord, Long> QUANTITY = createField("quantity", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>orderitems.created_at</code>.
     */
    public final TableField<OrderitemsRecord, OffsetDateTime> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE,
        this, "");

    /**
     * The column <code>orderitems.updated_at</code>.
     */
    public final TableField<OrderitemsRecord, OffsetDateTime> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE,
        this, "");

    /**
     * Create a <code>orderitems</code> table reference
     */
    public Orderitems() {
        this(DSL.name("orderitems"), null);
    }

    /**
     * Create an aliased <code>orderitems</code> table reference
     */
    public Orderitems(String alias) {
        this(DSL.name(alias), ORDERITEMS);
    }

    /**
     * Create an aliased <code>orderitems</code> table reference
     */
    public Orderitems(Name alias) {
        this(alias, ORDERITEMS);
    }

    private Orderitems(Name alias, Table<OrderitemsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Orderitems(Name alias, Table<OrderitemsRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.IDX_16447_ID_UNIQUE, Indexes.ORDERITEMS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OrderitemsRecord, Long> getIdentity() {
        return Keys.IDENTITY_ORDERITEMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OrderitemsRecord> getPrimaryKey() {
        return Keys.ORDERITEMS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OrderitemsRecord>> getKeys() {
        return Arrays.<UniqueKey<OrderitemsRecord>>asList(Keys.ORDERITEMS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Orderitems as(String alias) {
        return new Orderitems(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Orderitems as(Name alias) {
        return new Orderitems(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Orderitems rename(String name) {
        return new Orderitems(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Orderitems rename(Name name) {
        return new Orderitems(name, null);
    }
}
