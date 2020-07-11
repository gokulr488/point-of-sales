package com.algol.PointOfSales.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "userdetails")
public class UserDetailsDao extends BaseDao {

	public UserDetailsDao() {

	}

	public UserDetailsDao(int userId) {
		this.userId = userId;
	}

	@Id
	@Column(name = "userid")
	private int userId;

	@Column(name = "username")
	private String userName;

	@Column(name = "pass")
	private String password;

	@Column(name = "privilagelevel")
	private int privilageLevel;

	@JoinColumn(name = "shopid")
	private ShopMasterDao shopMaster;

	public UserDetailsDao(ShopMasterDao shopMaster) {
		this.shopMaster = shopMaster;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPrivilageLevel() {
		return privilageLevel;
	}

	public void setPrivilageLevel(int privilageLevel) {
		this.privilageLevel = privilageLevel;
	}

}
