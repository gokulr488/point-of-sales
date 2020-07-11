package com.algol.PointOfSales.dao;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "shopmaster")
public class ShopMasterDao extends BaseDao {

	public ShopMasterDao() {

	}

	public ShopMasterDao(int shopId) {
		this.shopId = shopId;
	}

	@Id
	@GeneratedValue
	@Column(name = "shopid")
	private int shopId;

	@Column(name = "shopname")
	private String shopName;

	@Column(name = "gstno")
	private long gstNo;

	@Column(name = "address")
	private String address;

	@Column(name = "phonenumber")
	private String phoneNumber;

	@OneToMany(mappedBy = "shopMaster")
	private List<UserDetailsDao> users;

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public long getGstNo() {
		return gstNo;
	}

	public void setGstNo(long gstNo) {
		this.gstNo = gstNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
