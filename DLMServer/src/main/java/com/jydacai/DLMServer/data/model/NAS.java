package com.jydacai.DLMServer.data.model;

import java.util.Date;

public class NAS {
    private Date timeIndex;

    private Integer milliMul;

    private Integer milliIndex;

    private Double avgAmp;

    private Double maxAmp;

    private Double minAmp;

    public Date getTimeIndex() {
        return timeIndex;
    }

    public void setTimeIndex(Date timeIndex) {
        this.timeIndex = timeIndex;
    }

    public Integer getMilliMul() {
        return milliMul;
    }

    public void setMilliMul(Integer milliMul) {
        this.milliMul = milliMul;
    }

    public Integer getMilliIndex() {
        return milliIndex;
    }

    public void setMilliIndex(Integer milliIndex) {
        this.milliIndex = milliIndex;
    }

    public Double getAvgAmp() {
        return avgAmp;
    }

    public void setAvgAmp(Double avgAmp) {
        this.avgAmp = avgAmp;
    }

    public Double getMaxAmp() {
        return maxAmp;
    }

    public void setMaxAmp(Double maxAmp) {
        this.maxAmp = maxAmp;
    }

    public Double getMinAmp() {
        return minAmp;
    }

    public void setMinAmp(Double minAmp) {
        this.minAmp = minAmp;
    }
}