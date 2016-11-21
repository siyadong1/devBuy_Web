package com.dev4free.devbuy.devbuyWeb.po;

public class Items {
    private String itemsId;

    private String itemsname;

    private String description;

    private String category;

    private String itemsLb;

    private String price;

    private String currentPrice;

    private String image;

    private String inventory;

    private String salesVolume;

    private String area;

    private String expressFee;

    public String getItemsId() {
        return itemsId;
    }

    public void setItemsId(String itemsId) {
        this.itemsId = itemsId == null ? null : itemsId.trim();
    }

    public String getItemsname() {
        return itemsname;
    }

    public void setItemsname(String itemsname) {
        this.itemsname = itemsname == null ? null : itemsname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getItemsLb() {
        return itemsLb;
    }

    public void setItemsLb(String itemsLb) {
        this.itemsLb = itemsLb == null ? null : itemsLb.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice == null ? null : currentPrice.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory == null ? null : inventory.trim();
    }

    public String getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(String salesVolume) {
        this.salesVolume = salesVolume == null ? null : salesVolume.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getExpressFee() {
        return expressFee;
    }

    public void setExpressFee(String expressFee) {
        this.expressFee = expressFee == null ? null : expressFee.trim();
    }

	@Override
	public String toString() {
		return "Items [itemsId=" + itemsId + ", itemsname=" + itemsname + ", description=" + description + ", category="
				+ category + ", itemsLb=" + itemsLb + ", price=" + price + ", currentPrice=" + currentPrice + ", image="
				+ image + ", inventory=" + inventory + ", salesVolume=" + salesVolume + ", area=" + area
				+ ", expressFee=" + expressFee + "]";
	}
 
    
    
}