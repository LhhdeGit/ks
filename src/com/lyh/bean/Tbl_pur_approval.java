package com.lyh.bean;

public class Tbl_pur_approval {
    private int paId;
    private int pId;
    private int paDate;
    private int paState;

    @Override
    public String toString() {
        return "Tbl_pur_approval{" +
                "paId=" + paId +
                ", pId=" + pId +
                ", paDate=" + paDate +
                ", paState=" + paState +
                '}';
    }

    public int getPaId() {
        return paId;
    }

    public void setPaId(int paId) {
        this.paId = paId;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public int getPaDate() {
        return paDate;
    }

    public void setPaDate(int paDate) {
        this.paDate = paDate;
    }

    public int getPaState() {
        return paState;
    }

    public void setPaState(int paState) {
        this.paState = paState;
    }
}
