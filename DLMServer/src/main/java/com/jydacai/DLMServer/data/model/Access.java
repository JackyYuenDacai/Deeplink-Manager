package com.jydacai.DLMServer.data.model;

import java.util.Date;

public class Access {
    private String deeplinkid;

    private String channelid;

    private String ipaddr;

    private Date accessdate;

    private Date accesstime;

    private Integer accesstimezone;

    private String extrainfo;

    private Boolean denied;

    private byte[] ip;

    public String getDeeplinkid() {
        return deeplinkid;
    }

    public void setDeeplinkid(String deeplinkid) {
        this.deeplinkid = deeplinkid == null ? null : deeplinkid.trim();
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public String getIpaddr() {
        return ipaddr;
    }

    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr == null ? null : ipaddr.trim();
    }

    public Date getAccessdate() {
        return accessdate;
    }

    public void setAccessdate(Date accessdate) {
        this.accessdate = accessdate;
    }

    public Date getAccesstime() {
        return accesstime;
    }

    public void setAccesstime(Date accesstime) {
        this.accesstime = accesstime;
    }

    public Integer getAccesstimezone() {
        return accesstimezone;
    }

    public void setAccesstimezone(Integer accesstimezone) {
        this.accesstimezone = accesstimezone;
    }

    public String getExtrainfo() {
        return extrainfo;
    }

    public void setExtrainfo(String extrainfo) {
        this.extrainfo = extrainfo == null ? null : extrainfo.trim();
    }

    public Boolean getDenied() {
        return denied;
    }

    public void setDenied(Boolean denied) {
        this.denied = denied;
    }

    public byte[] getIp() {
        return ip;
    }

    public void setIp(byte[] ip) {
        this.ip = ip;
    }
}