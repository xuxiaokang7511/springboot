package com.retire.pojo;

import java.util.Date;

public class Org {
    private Short orgId;

    private String orgCode;

    private String orgProperty;

    private String orgName;

    private Date orgTime;

    private String orgMonthMoney;

    private String orgYearMoney;

    public Short getOrgId() {
        return orgId;
    }

    public void setOrgId(Short orgId) {
        this.orgId = orgId;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgProperty() {
        return orgProperty;
    }

    public void setOrgProperty(String orgProperty) {
        this.orgProperty = orgProperty;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Date getOrgTime() {
        return orgTime;
    }

    public void setOrgTime(Date orgTime) {
        this.orgTime = orgTime;
    }

    public String getOrgMonthMoney() {
        return orgMonthMoney;
    }

    public void setOrgMonthMoney(String orgMonthMoney) {
        this.orgMonthMoney = orgMonthMoney;
    }

    public String getOrgYearMoney() {
        return orgYearMoney;
    }

    public void setOrgYearMoney(String orgYearMoney) {
        this.orgYearMoney = orgYearMoney;
    }
}