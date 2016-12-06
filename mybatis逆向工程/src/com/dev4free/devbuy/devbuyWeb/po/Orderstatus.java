package com.dev4free.devbuy.devbuyWeb.po;

public class Orderstatus {
    private String osId;

    private String osName;

    private String osCode;

    private String osDescription;

    private String osCreatetime;

    private String osModifytime;

    public String getOsId() {
        return osId;
    }

    public void setOsId(String osId) {
        this.osId = osId == null ? null : osId.trim();
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName == null ? null : osName.trim();
    }

    public String getOsCode() {
        return osCode;
    }

    public void setOsCode(String osCode) {
        this.osCode = osCode == null ? null : osCode.trim();
    }

    public String getOsDescription() {
        return osDescription;
    }

    public void setOsDescription(String osDescription) {
        this.osDescription = osDescription == null ? null : osDescription.trim();
    }

    public String getOsCreatetime() {
        return osCreatetime;
    }

    public void setOsCreatetime(String osCreatetime) {
        this.osCreatetime = osCreatetime == null ? null : osCreatetime.trim();
    }

    public String getOsModifytime() {
        return osModifytime;
    }

    public void setOsModifytime(String osModifytime) {
        this.osModifytime = osModifytime == null ? null : osModifytime.trim();
    }
}