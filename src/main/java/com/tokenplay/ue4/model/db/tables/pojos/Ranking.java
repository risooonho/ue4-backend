/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {
    "http://www.jooq.org", "jOOQ version:3.10.6"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({
    "all", "unchecked", "rawtypes"})
public class Ranking implements Serializable {

    private static final long serialVersionUID = 985651994;

    private String id;
    private String pilId;
    private Long score;
    private String lebId;

    public Ranking() {
    }

    public Ranking(Ranking value) {
        this.id = value.id;
        this.pilId = value.pilId;
        this.score = value.score;
        this.lebId = value.lebId;
    }

    public Ranking(String id, String pilId, Long score, String lebId) {
        this.id = id;
        this.pilId = pilId;
        this.score = score;
        this.lebId = lebId;
    }

    @NotNull
    public String getRnkId() {
        return this.id;
    }

    public void setRnkId(String id) {
        this.id = id;
    }

    @NotNull
    public String getRnkPilId() {
        return this.pilId;
    }

    public void setRnkPilId(String pilId) {
        this.pilId = pilId;
    }

    @NotNull
    public Long getRnkScore() {
        return this.score;
    }

    public void setRnkScore(Long score) {
        this.score = score;
    }

    @NotNull
    public String getRnkLebId() {
        return this.lebId;
    }

    public void setRnkLebId(String lebId) {
        this.lebId = lebId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Ranking (");

        sb.append(id);
        sb.append(", ").append(pilId);
        sb.append(", ").append(score);
        sb.append(", ").append(lebId);

        sb.append(")");
        return sb.toString();
    }
}
