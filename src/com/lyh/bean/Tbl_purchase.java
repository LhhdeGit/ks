package com.lyh.bean;

public class Tbl_purchase {
    private Integer pId;
    private String pType;
    private String pName;
    private String pUnit;
    private int pNum;
    private String pPerson;

    @Override
    public String toString() {
        return "Tbl_purchase{" +
                "pId=" + pId +
                ", pType='" + pType + '\'' +
                ", pName='" + pName + '\'' +
                ", pUnit='" + pUnit + '\'' +
                ", pNum=" + pNum +
                ", pPerson='" + pPerson + '\'' +
                '}';
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpUnit() {
        return pUnit;
    }

    public void setpUnit(String pUnit) {
        this.pUnit = pUnit;
    }

    public int getpNum() {
        return pNum;
    }

    public void setpNum(int pNum) {
        this.pNum = pNum;
    }

    public String getpPerson() {
        return pPerson;
    }

    public void setpPerson(String pPerson) {
        this.pPerson = pPerson;
    }
}
