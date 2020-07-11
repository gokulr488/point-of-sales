package com.algol.PointOfSales.api.stockmanagement.allItems.response;

public class ItemDetails {

	private int itemCode;
	private String itemName;
	private double price;
	private String unit;
	private float availableQty;

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public float getAvailableQty() {
		return availableQty;
	}

	public void setAvailableQty(float availableQty) {
		this.availableQty = availableQty;
	}
}
