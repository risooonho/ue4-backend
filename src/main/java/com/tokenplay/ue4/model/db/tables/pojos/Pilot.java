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
public class Pilot implements Serializable {

    private static final long serialVersionUID = -1165824115;

    private String id;
    private String callsign;
    private Long usuId;
    private String srvId;
    private String token;
    private OffsetDateTime lastPing;
    private String lastIp;
    private String lastVersion;
    private OffsetDateTime lastLogin;
    private Boolean disableChat;
    private String rmbrToken;
    private String uthId;
    private Boolean disableRequests;
    private String leaveReason;
    private OffsetDateTime leaveDate;
    private Boolean offLimits;
    private String defaultScheme;
    private Boolean useCustomScheme;

    public Pilot() {
    }

    public Pilot(Pilot value) {
        this.id = value.id;
        this.callsign = value.callsign;
        this.usuId = value.usuId;
        this.srvId = value.srvId;
        this.token = value.token;
        this.lastPing = value.lastPing;
        this.lastIp = value.lastIp;
        this.lastVersion = value.lastVersion;
        this.lastLogin = value.lastLogin;
        this.disableChat = value.disableChat;
        this.rmbrToken = value.rmbrToken;
        this.uthId = value.uthId;
        this.disableRequests = value.disableRequests;
        this.leaveReason = value.leaveReason;
        this.leaveDate = value.leaveDate;
        this.offLimits = value.offLimits;
        this.defaultScheme = value.defaultScheme;
        this.useCustomScheme = value.useCustomScheme;
    }

    public Pilot(String id, String callsign, Long usuId, String srvId, String token, OffsetDateTime lastPing, String lastIp, String lastVersion,
        OffsetDateTime lastLogin, Boolean disableChat, String rmbrToken, String uthId, Boolean disableRequests, String leaveReason,
        OffsetDateTime leaveDate, Boolean offLimits, String defaultScheme, Boolean useCustomScheme) {
        this.id = id;
        this.callsign = callsign;
        this.usuId = usuId;
        this.srvId = srvId;
        this.token = token;
        this.lastPing = lastPing;
        this.lastIp = lastIp;
        this.lastVersion = lastVersion;
        this.lastLogin = lastLogin;
        this.disableChat = disableChat;
        this.rmbrToken = rmbrToken;
        this.uthId = uthId;
        this.disableRequests = disableRequests;
        this.leaveReason = leaveReason;
        this.leaveDate = leaveDate;
        this.offLimits = offLimits;
        this.defaultScheme = defaultScheme;
        this.useCustomScheme = useCustomScheme;
    }

    @NotNull
    public String getPilId() {
        return this.id;
    }

    public void setPilId(String id) {
        this.id = id;
    }

    @NotNull
    public String getPilCallsign() {
        return this.callsign;
    }

    public void setPilCallsign(String callsign) {
        this.callsign = callsign;
    }

    @NotNull
    public Long getPilUsuId() {
        return this.usuId;
    }

    public void setPilUsuId(Long usuId) {
        this.usuId = usuId;
    }

    public String getPilSrvId() {
        return this.srvId;
    }

    public void setPilSrvId(String srvId) {
        this.srvId = srvId;
    }

    public String getPilToken() {
        return this.token;
    }

    public void setPilToken(String token) {
        this.token = token;
    }

    public OffsetDateTime getPilLastPing() {
        return this.lastPing;
    }

    public void setPilLastPing(OffsetDateTime lastPing) {
        this.lastPing = lastPing;
    }

    public String getPilLastIp() {
        return this.lastIp;
    }

    public void setPilLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public String getPilLastVersion() {
        return this.lastVersion;
    }

    public void setPilLastVersion(String lastVersion) {
        this.lastVersion = lastVersion;
    }

    public OffsetDateTime getPilLastLogin() {
        return this.lastLogin;
    }

    public void setPilLastLogin(OffsetDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Boolean getPilDisableChat() {
        return this.disableChat;
    }

    public void setPilDisableChat(Boolean disableChat) {
        this.disableChat = disableChat;
    }

    public String getPilRmbrToken() {
        return this.rmbrToken;
    }

    public void setPilRmbrToken(String rmbrToken) {
        this.rmbrToken = rmbrToken;
    }

    public String getPilUthId() {
        return this.uthId;
    }

    public void setPilUthId(String uthId) {
        this.uthId = uthId;
    }

    public Boolean getPilDisableRequests() {
        return this.disableRequests;
    }

    public void setPilDisableRequests(Boolean disableRequests) {
        this.disableRequests = disableRequests;
    }

    public String getPilLeaveReason() {
        return this.leaveReason;
    }

    public void setPilLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason;
    }

    public OffsetDateTime getPilLeaveDate() {
        return this.leaveDate;
    }

    public void setPilLeaveDate(OffsetDateTime leaveDate) {
        this.leaveDate = leaveDate;
    }

    public Boolean getPilOffLimits() {
        return this.offLimits;
    }

    public void setPilOffLimits(Boolean offLimits) {
        this.offLimits = offLimits;
    }

    public String getPilDefaultScheme() {
        return this.defaultScheme;
    }

    public void setPilDefaultScheme(String defaultScheme) {
        this.defaultScheme = defaultScheme;
    }

    public Boolean getPilUseCustomScheme() {
        return this.useCustomScheme;
    }

    public void setPilUseCustomScheme(Boolean useCustomScheme) {
        this.useCustomScheme = useCustomScheme;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Pilot (");

        sb.append(id);
        sb.append(", ").append(callsign);
        sb.append(", ").append(usuId);
        sb.append(", ").append(srvId);
        sb.append(", ").append(token);
        sb.append(", ").append(lastPing);
        sb.append(", ").append(lastIp);
        sb.append(", ").append(lastVersion);
        sb.append(", ").append(lastLogin);
        sb.append(", ").append(disableChat);
        sb.append(", ").append(rmbrToken);
        sb.append(", ").append(uthId);
        sb.append(", ").append(disableRequests);
        sb.append(", ").append(leaveReason);
        sb.append(", ").append(leaveDate);
        sb.append(", ").append(offLimits);
        sb.append(", ").append(defaultScheme);
        sb.append(", ").append(useCustomScheme);

        sb.append(")");
        return sb.toString();
    }
}
