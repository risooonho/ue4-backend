/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables.pojos;


import java.io.Serializable;
import java.sql.Date;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {
    "http://www.jooq.org", "jOOQ version:3.10.6"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({
    "all", "unchecked", "rawtypes"})
public class Championship implements Serializable {

    private static final long serialVersionUID = -533782518;

    private String id;
    private String name;
    private String description;
    private Date dateInit;
    private Date dateEnd;

    public Championship() {
    }

    public Championship(Championship value) {
        this.id = value.id;
        this.name = value.name;
        this.description = value.description;
        this.dateInit = value.dateInit;
        this.dateEnd = value.dateEnd;
    }

    public Championship(String id, String name, String description, Date dateInit, Date dateEnd) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dateInit = dateInit;
        this.dateEnd = dateEnd;
    }

    @NotNull
    public String getChaId() {
        return this.id;
    }

    public void setChaId(String id) {
        this.id = id;
    }

    @NotNull
    public String getChaName() {
        return this.name;
    }

    public void setChaName(String name) {
        this.name = name;
    }

    @NotNull
    public String getChaDescription() {
        return this.description;
    }

    public void setChaDescription(String description) {
        this.description = description;
    }

    @NotNull
    public Date getChaDateInit() {
        return this.dateInit;
    }

    public void setChaDateInit(Date dateInit) {
        this.dateInit = dateInit;
    }

    @NotNull
    public Date getChaDateEnd() {
        return this.dateEnd;
    }

    public void setChaDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Championship (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(description);
        sb.append(", ").append(dateInit);
        sb.append(", ").append(dateEnd);

        sb.append(")");
        return sb.toString();
    }
}
