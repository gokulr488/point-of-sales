package com.algol.PointOfSales.api.stockmanagement.addNewItems.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddNewItem {

	public AddNewItem(@JsonProperty("itemCode") String itemCode, @JsonProperty("itemName") String itemName,
			@JsonProperty("price") double price, @JsonProperty("unit") String unit, @JsonProperty("qty") float qty) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
		this.unit = unit;
		this.qty = qty;
	}

	private String itemCode;
	private String itemName;
	private double price;
	private String unit;
	private float qty;

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
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

	public float getQty() {
		return qty;
	}

	public void setQty(float qty) {
		this.qty = qty;
	}

}
