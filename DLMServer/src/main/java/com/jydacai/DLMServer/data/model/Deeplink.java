package com.jydacai.DLMServer.data.model;

public class Deeplink {
    private String id;

    private String code;

    private String target;

    private String channelid;

    private String embbedinfo;

    private String deniedtarget;

    private Integer filtertype;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public String getEmbbedinfo() {
        return embbedinfo;
    }

    public void setEmbbedinfo(String embbedinfo) {
        this.embbedinfo = embbedinfo == null ? null : embbedinfo.trim();
    }

    public String getDeniedtarget() {
        return deniedtarget;
    }

    public void setDeniedtarget(String deniedtarget) {
        this.deniedtarget = deniedtarget == null ? null : deniedtarget.trim();
    }

    public Integer getFiltertype() {
        return filtertype;
    }

    public void setFiltertype(Integer filtertype) {
        this.filtertype = filtertype;
    }
}