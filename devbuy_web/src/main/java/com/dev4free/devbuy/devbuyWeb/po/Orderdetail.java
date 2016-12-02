package com.dev4free.devbuy.devbuyWeb.po;

public class Orderdetail {
    private String detailsId;

    private String ordersId;

    private String itemsId;

    private String itemsNum;

    public String getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(String detailsId) {
        this.detailsId = detailsId == null ? null : detailsId.trim();
    }

    public String getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(String ordersId) {
        this.ordersId = ordersId == null ? null : ordersId.trim();
    }

    public String getItemsId() {
        return itemsId;
    }

    public void setItemsId(String itemsId) {
        this.itemsId = itemsId == null ? null : itemsId.trim();
    }

    public String getItemsNum() {
        return itemsNum;
    }

    public void setItemsNum(String itemsNum) {
        this.itemsNum = itemsNum == null ? null : itemsNum.trim();
    }

	@Override
	public String toString() {
		return "Orderdetail [detailsId=" + detailsId + ", ordersId=" + ordersId + ", itemsId=" + itemsId + ", itemsNum="
				+ itemsNum + "]";
	}
    
    
    
    
    
}