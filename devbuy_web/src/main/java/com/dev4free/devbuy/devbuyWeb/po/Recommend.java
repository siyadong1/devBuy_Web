package com.dev4free.devbuy.devbuyWeb.po;

public class Recommend {
    private String rcId;

    private String rcCategory;

    private String rcName;

    private String rcUrl;

    private String rcIslarge;

    private String rcCreatetime;

    private String rcModifytime;

    private String rcShow;

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

    public String getRcCreatetime() {
        return rcCreatetime;
    }

    public void setRcCreatetime(String rcCreatetime) {
        this.rcCreatetime = rcCreatetime == null ? null : rcCreatetime.trim();
    }

    public String getRcModifytime() {
        return rcModifytime;
    }

    public void setRcModifytime(String rcModifytime) {
        this.rcModifytime = rcModifytime == null ? null : rcModifytime.trim();
    }

    public String getRcShow() {
        return rcShow;
    }

    public void setRcShow(String rcShow) {
        this.rcShow = rcShow == null ? null : rcShow.trim();
    }

    public String getItemsId() {
        return itemsId;
    }

    public void setItemsId(String itemsId) {
        this.itemsId = itemsId == null ? null : itemsId.trim();
    }
}