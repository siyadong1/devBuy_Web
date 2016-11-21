package com.dev4free.devbuy.devbuyWeb.po;

public class Classification {
    private String cfId;

    private String cfName;

    private String cfUrl;

    private String category;

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
}