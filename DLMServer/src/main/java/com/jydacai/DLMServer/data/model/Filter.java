package com.jydacai.DLMServer.data.model;

public class Filter {
    private String deeplinkid;

    private String channelid;

    private String name;

    private String filterfield;

    private Integer filtertype;

    private Boolean filterinverse;

    private Boolean filtermusthave;

    private Integer valuetype;

    private String value;

    private String extvalue;

    private Double dvalue;

    private Double extdvalue;

    private Integer ivalue;

    private Integer extivalue;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFilterfield() {
        return filterfield;
    }

    public void setFilterfield(String filterfield) {
        this.filterfield = filterfield == null ? null : filterfield.trim();
    }

    public Integer getFiltertype() {
        return filtertype;
    }

    public void setFiltertype(Integer filtertype) {
        this.filtertype = filtertype;
    }

    public Boolean getFilterinverse() {
        return filterinverse;
    }

    public void setFilterinverse(Boolean filterinverse) {
        this.filterinverse = filterinverse;
    }

    public Boolean getFiltermusthave() {
        return filtermusthave;
    }

    public void setFiltermusthave(Boolean filtermusthave) {
        this.filtermusthave = filtermusthave;
    }

    public Integer getValuetype() {
        return valuetype;
    }

    public void setValuetype(Integer valuetype) {
        this.valuetype = valuetype;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getExtvalue() {
        return extvalue;
    }

    public void setExtvalue(String extvalue) {
        this.extvalue = extvalue == null ? null : extvalue.trim();
    }

    public Double getDvalue() {
        return dvalue;
    }

    public void setDvalue(Double dvalue) {
        this.dvalue = dvalue;
    }

    public Double getExtdvalue() {
        return extdvalue;
    }

    public void setExtdvalue(Double extdvalue) {
        this.extdvalue = extdvalue;
    }

    public Integer getIvalue() {
        return ivalue;
    }

    public void setIvalue(Integer ivalue) {
        this.ivalue = ivalue;
    }

    public Integer getExtivalue() {
        return extivalue;
    }

    public void setExtivalue(Integer extivalue) {
        this.extivalue = extivalue;
    }
}