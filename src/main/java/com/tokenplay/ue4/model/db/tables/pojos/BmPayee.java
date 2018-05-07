/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {
    "http://www.jooq.org", "jOOQ version:3.10.6"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({
    "all", "unchecked", "rawtypes"})
public class BmPayee implements Serializable {

    private static final long serialVersionUID = -1269471522;

    private String bmPayeeId;
    private String id;
    private String bmPayeename;
    private String bmAccountnumber;
    private String bmAccounttype;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public BmPayee() {
    }

    public BmPayee(BmPayee value) {
        this.bmPayeeId = value.bmPayeeId;
        this.id = value.id;
        this.bmPayeename = value.bmPayeename;
        this.bmAccountnumber = value.bmAccountnumber;
        this.bmAccounttype = value.bmAccounttype;
        this.createdAt = value.createdAt;
        this.updatedAt = value.updatedAt;
    }

    public BmPayee(String bmPayeeId, String id, String bmPayeename, String bmAccountnumber, String bmAccounttype, Timestamp createdAt,
        Timestamp updatedAt) {
        this.bmPayeeId = bmPayeeId;
        this.id = id;
        this.bmPayeename = bmPayeename;
        this.bmAccountnumber = bmAccountnumber;
        this.bmAccounttype = bmAccounttype;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @NotNull
    @Size(max = 32)
    public String getBmPayeeId() {
        return this.bmPayeeId;
    }

    public void setBmPayeeId(String bmPayeeId) {
        this.bmPayeeId = bmPayeeId;
    }

    @NotNull
    @Size(max = 32)
    public String getPilId() {
        return this.id;
    }

    public void setPilId(String id) {
        this.id = id;
    }

    @NotNull
    @Size(max = 255)
    public String getBmPayeename() {
        return this.bmPayeename;
    }

    public void setBmPayeename(String bmPayeename) {
        this.bmPayeename = bmPayeename;
    }

    @NotNull
    @Size(max = 32)
    public String getBmAccountnumber() {
        return this.bmAccountnumber;
    }

    public void setBmAccountnumber(String bmAccountnumber) {
        this.bmAccountnumber = bmAccountnumber;
    }

    @NotNull
    @Size(max = 255)
    public String getBmAccounttype() {
        return this.bmAccounttype;
    }

    public void setBmAccounttype(String bmAccounttype) {
        this.bmAccounttype = bmAccounttype;
    }

    @NotNull
    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @NotNull
    public Timestamp getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BmPayee (");

        sb.append(bmPayeeId);
        sb.append(", ").append(id);
        sb.append(", ").append(bmPayeename);
        sb.append(", ").append(bmAccountnumber);
        sb.append(", ").append(bmAccounttype);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);

        sb.append(")");
        return sb.toString();
    }
}
