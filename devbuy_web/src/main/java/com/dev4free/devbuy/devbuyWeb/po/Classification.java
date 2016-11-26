package com.dev4free.devbuy.devbuyWeb.po;

public class Classification {
    private String cfId;

    private String cfName;

    private String cfUrl;

    private String category;

    private String cfCreatetime;

    private String cfModifytime;

    private String cfDes;

    public String getCfId() {
        return cfId;
    }

    public void setCfId(String cfId) {
        this.cfId = cfId == null ? null : cfId.trim();
    }

    public String getCfName() {
        return cfName;
    }

    public void setCfName(String cfName) {
        this.cfName = cfName == null ? null : cfName.trim();
    }

    public String getCfUrl() {
        return cfUrl;
    }

    public void setCfUrl(String cfUrl) {
        this.cfUrl = cfUrl == null ? null : cfUrl.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getCfCreatetime() {
        return cfCreatetime;
    }

    public void setCfCreatetime(String cfCreatetime) {
        this.cfCreatetime = cfCreatetime == null ? null : cfCreatetime.trim();
    }

    public String getCfModifytime() {
        return cfModifytime;
    }

    public void setCfModifytime(String cfModifytime) {
        this.cfModifytime = cfModifytime == null ? null : cfModifytime.trim();
    }

    public String getCfDes() {
        return cfDes;
    }

    public void setCfDes(String cfDes) {
        this.cfDes = cfDes == null ? null : cfDes.trim();
    }
}