package com.algol.PointOfSales.api.shopmanagement.addnewshop.request;

public class UserData {

	private int userId;
	private String userName;
	private String password;
	private int privilageLevel;

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
