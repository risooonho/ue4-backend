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
public class Match implements Serializable {

    private static final long serialVersionUID = -1490684897;

    private String id;
    private String mapId;
    private String chaId;
    private OffsetDateTime dateInit;
    private OffsetDateTime dateEnd;
    private String gamId;
    private Long winnerTeam;
    private String srvId;
    private OffsetDateTime dateStart;
    private Boolean sanctioned;
    private Long botsAmount;
    private Long matchTime;
    private Long scoreLimit;

    public Match() {
    }

    public Match(Match value) {
        this.id = value.id;
        this.mapId = value.mapId;
        this.chaId = value.chaId;
        this.dateInit = value.dateInit;
        this.dateEnd = value.dateEnd;
        this.gamId = value.gamId;
        this.winnerTeam = value.winnerTeam;
        this.srvId = value.srvId;
        this.dateStart = value.dateStart;
        this.sanctioned = value.sanctioned;
        this.botsAmount = value.botsAmount;
        this.matchTime = value.matchTime;
        this.scoreLimit = value.scoreLimit;
    }

    public Match(String id, String mapId, String chaId, OffsetDateTime dateInit, OffsetDateTime dateEnd, String gamId, Long winnerTeam, String srvId,
        OffsetDateTime dateStart, Boolean sanctioned, Long botsAmount, Long matchTime, Long scoreLimit) {
        this.id = id;
        this.mapId = mapId;
        this.chaId = chaId;
        this.dateInit = dateInit;
        this.dateEnd = dateEnd;
        this.gamId = gamId;
        this.winnerTeam = winnerTeam;
        this.srvId = srvId;
        this.dateStart = dateStart;
        this.sanctioned = sanctioned;
        this.botsAmount = botsAmount;
        this.matchTime = matchTime;
        this.scoreLimit = scoreLimit;
    }

    @NotNull
    public String getMchId() {
        return this.id;
    }

    public void setMchId(String id) {
        this.id = id;
    }

    @NotNull
    public String getMchMapId() {
        return this.mapId;
    }

    public void setMchMapId(String mapId) {
        this.mapId = mapId;
    }

    public String getMchChaId() {
        return this.chaId;
    }

    public void setMchChaId(String chaId) {
        this.chaId = chaId;
    }

    public OffsetDateTime getMchDateInit() {
        return this.dateInit;
    }

    public void setMchDateInit(OffsetDateTime dateInit) {
        this.dateInit = dateInit;
    }

    public OffsetDateTime getMchDateEnd() {
        return this.dateEnd;
    }

    public void setMchDateEnd(OffsetDateTime dateEnd) {
        this.dateEnd = dateEnd;
    }

    @NotNull
    public String getMcue4mId() {
        return this.gamId;
    }

    public void setMcue4mId(String gamId) {
        this.gamId = gamId;
    }

    public Long getMchWinnerTeam() {
        return this.winnerTeam;
    }

    public void setMchWinnerTeam(Long winnerTeam) {
        this.winnerTeam = winnerTeam;
    }

    @NotNull
    public String getMchSrvId() {
        return this.srvId;
    }

    public void setMchSrvId(String srvId) {
        this.srvId = srvId;
    }

    public OffsetDateTime getMchDateStart() {
        return this.dateStart;
    }

    public void setMchDateStart(OffsetDateTime dateStart) {
        this.dateStart = dateStart;
    }

    public Boolean getMchSanctioned() {
        return this.sanctioned;
    }

    public void setMchSanctioned(Boolean sanctioned) {
        this.sanctioned = sanctioned;
    }

    public Long getMchBotsAmount() {
        return this.botsAmount;
    }

    public void setMchBotsAmount(Long botsAmount) {
        this.botsAmount = botsAmount;
    }

    public Long getMchMatchTime() {
        return this.matchTime;
    }

    public void setMchMatchTime(Long matchTime) {
        this.matchTime = matchTime;
    }

    public Long getMchScoreLimit() {
        return this.scoreLimit;
    }

    public void setMchScoreLimit(Long scoreLimit) {
        this.scoreLimit = scoreLimit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Match (");

        sb.append(id);
        sb.append(", ").append(mapId);
        sb.append(", ").append(chaId);
        sb.append(", ").append(dateInit);
        sb.append(", ").append(dateEnd);
        sb.append(", ").append(gamId);
        sb.append(", ").append(winnerTeam);
        sb.append(", ").append(srvId);
        sb.append(", ").append(dateStart);
        sb.append(", ").append(sanctioned);
        sb.append(", ").append(botsAmount);
        sb.append(", ").append(matchTime);
        sb.append(", ").append(scoreLimit);

        sb.append(")");
        return sb.toString();
    }
}
