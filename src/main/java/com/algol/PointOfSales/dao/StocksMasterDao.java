package com.algol.PointOfSales.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stocksmaster")
public class StocksMasterDao extends BaseDao {

	public StocksMasterDao() {

	}

	public StocksMasterDao(int id) {
		this.id = id;
	}

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "itemcode")
	private String itemCode;

	@Column(name = "itemname")
	private String itemName;

	@Column(name = "price")
	private double price;

	@Column(name = "unit")
	private String unit;

	@Column(name = "shopid")
	private int shopId;

	@Column(name = "remainingqty")
	private float remainingQty;

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

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public float getRemainingQty() {
		return remainingQty;
	}

	public void setRemainingQty(float remainingQty) {
		this.remainingQty = remainingQty;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

}
