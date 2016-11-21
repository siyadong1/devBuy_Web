package com.dev4free.devbuy.devbuyWeb.po;

public class Recommend {
    private String rcId;

    private String rcCategory;

    private String rcName;

    private String rcUrl;

    private String rcIslarge;

    private String itemsId;

    public String getRcId() {
        return rcId;
    }

    public void setRcId(String rcId) {
        this.rcId = rcId == null ? null : rcId.trim();
    }

    public String getRcCategory() {
        return rcCategory;
    }

    public void setRcCategory(String rcCategory) {
        this.rcCategory = rcCategory == null ? null : rcCategory.trim();
    }

    public String getRcName() {
        return rcName;
    }

    public void setRcName(String rcName) {
        this.rcName = rcName == null ? null : rcName.trim();
    }

    public String getRcUrl() {
        return rcUrl;
    }

    public void setRcUrl(String rcUrl) {
        this.rcUrl = rcUrl == null ? null : rcUrl.trim();
    }

    public String getRcIslarge() {
        return rcIslarge;
    }

    public void setRcIslarge(String rcIslarge) {
        this.rcIslarge = rcIslarge == null ? null : rcIslarge.trim();
    }

    public String getItemsId() {
        return itemsId;
    }

    public void setItemsId(String itemsId) {
        this.itemsId = itemsId == null ? null : itemsId.trim();
    }
}