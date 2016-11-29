package com.dev4free.devbuy.devbuyWeb.po;

public class Banner {
    private String bnId;

    private String bnName;

    private String bnUrl;

    private String bnShow;

    private String bnCreatetime;

    private String bnModifytime;

    private String itemsId;

    public String getBnId() {
        return bnId;
    }

    public void setBnId(String bnId) {
        this.bnId = bnId == null ? null : bnId.trim();
    }

    public String getBnName() {
        return bnName;
    }

    public void setBnName(String bnName) {
        this.bnName = bnName == null ? null : bnName.trim();
    }

    public String getBnUrl() {
        return bnUrl;
    }

    public void setBnUrl(String bnUrl) {
        this.bnUrl = bnUrl == null ? null : bnUrl.trim();
    }

    public String getBnShow() {
        return bnShow;
    }

    public void setBnShow(String bnShow) {
        this.bnShow = bnShow == null ? null : bnShow.trim();
    }

    public String getBnCreatetime() {
        return bnCreatetime;
    }

    public void setBnCreatetime(String bnCreatetime) {
        this.bnCreatetime = bnCreatetime == null ? null : bnCreatetime.trim();
    }

    public String getBnModifytime() {
        return bnModifytime;
    }

    public void setBnModifytime(String bnModifytime) {
        this.bnModifytime = bnModifytime == null ? null : bnModifytime.trim();
    }

    public String getItemsId() {
        return itemsId;
    }

    public void setItemsId(String itemsId) {
        this.itemsId = itemsId == null ? null : itemsId.trim();
    }
}