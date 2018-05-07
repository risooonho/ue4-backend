/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables.pojos;


import java.io.Serializable;
import java.time.OffsetDateTime;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {
    "http://www.jooq.org", "jOOQ version:3.10.6"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({
    "all", "unchecked", "rawtypes"})
public class Participation implements Serializable {

    private static final long serialVersionUID = -63724571;

    private String id;
    private String pilId;
    private String mchId;
    private OffsetDateTime dateEnd;
    private OffsetDateTime dateInit;
    private Long team;
    private Long score;
    private Long deathRanking;
    private Long kills;
    private Long deaths;
    private OffsetDateTime dateSummary;
    private Boolean flgSurvived;

    public Participation() {
    }

    public Participation(Participation value) {
        this.id = value.id;
        this.pilId = value.pilId;
        this.mchId = value.mchId;
        this.dateEnd = value.dateEnd;
        this.dateInit = value.dateInit;
        this.team = value.team;
        this.score = value.score;
        this.deathRanking = value.deathRanking;
        this.kills = value.kills;
        this.deaths = value.deaths;
        this.dateSummary = value.dateSummary;
        this.flgSurvived = value.flgSurvived;
    }

    public Participation(String id, String pilId, String mchId, OffsetDateTime dateEnd, OffsetDateTime dateInit, Long team, Long score,
        Long deathRanking, Long kills, Long deaths, OffsetDateTime dateSummary, Boolean flgSurvived) {
        this.id = id;
        this.pilId = pilId;
        this.mchId = mchId;
        this.dateEnd = dateEnd;
        this.dateInit = dateInit;
        this.team = team;
        this.score = score;
        this.deathRanking = deathRanking;
        this.kills = kills;
        this.deaths = deaths;
        this.dateSummary = dateSummary;
        this.flgSurvived = flgSurvived;
    }

    @NotNull
    public String getParId() {
        return this.id;
    }

    public void setParId(String id) {
        this.id = id;
    }

    @NotNull
    public String getParPilId() {
        return this.pilId;
    }

    public void setParPilId(String pilId) {
        this.pilId = pilId;
    }

    @NotNull
    public String getParMchId() {
        return this.mchId;
    }

    public void setParMchId(String mchId) {
        this.mchId = mchId;
    }

    public OffsetDateTime getParDateEnd() {
        return this.dateEnd;
    }

    public void setParDateEnd(OffsetDateTime dateEnd) {
        this.dateEnd = dateEnd;
    }

    public OffsetDateTime getParDateInit() {
        return this.dateInit;
    }

    public void setParDateInit(OffsetDateTime dateInit) {
        this.dateInit = dateInit;
    }

    public Long getParTeam() {
        return this.team;
    }

    public void setParTeam(Long team) {
        this.team = team;
    }

    public Long getParScore() {
        return this.score;
    }

    public void setParScore(Long score) {
        this.score = score;
    }

    public Long getParDeathRanking() {
        return this.deathRanking;
    }

    public void setParDeathRanking(Long deathRanking) {
        this.deathRanking = deathRanking;
    }

    public Long getParKills() {
        return this.kills;
    }

    public void setParKills(Long kills) {
        this.kills = kills;
    }

    public Long getParDeaths() {
        return this.deaths;
    }

    public void setParDeaths(Long deaths) {
        this.deaths = deaths;
    }

    public OffsetDateTime getParDateSummary() {
        return this.dateSummary;
    }

    public void setParDateSummary(OffsetDateTime dateSummary) {
        this.dateSummary = dateSummary;
    }

    public Boolean getParFlgSurvived() {
        return this.flgSurvived;
    }

    public void setParFlgSurvived(Boolean flgSurvived) {
        this.flgSurvived = flgSurvived;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Participation (");

        sb.append(id);
        sb.append(", ").append(pilId);
        sb.append(", ").append(mchId);
        sb.append(", ").append(dateEnd);
        sb.append(", ").append(dateInit);
        sb.append(", ").append(team);
        sb.append(", ").append(score);
        sb.append(", ").append(deathRanking);
        sb.append(", ").append(kills);
        sb.append(", ").append(deaths);
        sb.append(", ").append(dateSummary);
        sb.append(", ").append(flgSurvived);

        sb.append(")");
        return sb.toString();
    }
}
