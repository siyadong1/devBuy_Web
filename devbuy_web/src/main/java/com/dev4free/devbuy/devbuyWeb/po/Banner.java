package com.dev4free.devbuy.devbuyWeb.po;

public class Banner {
    private String bnId;

    private String bnName;

    private String bnUrl;

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

    public String getItemsId() {
        return itemsId;
    }

    public void setItemsId(String itemsId) {
        this.itemsId = itemsId == null ? null : itemsId.trim();
    }
}