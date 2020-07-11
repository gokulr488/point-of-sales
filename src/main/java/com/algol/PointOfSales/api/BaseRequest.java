package com.algol.PointOfSales.api;

public class BaseRequest {

	public BaseRequest(long sessionCode) {
		this.sessionCode = sessionCode;
	}

	private long sessionCode;

	public long getSessionCode() {
		return sessionCode;
	}

	public void setSessionCode(long sessionCode) {
		this.sessionCode = sessionCode;
	}

}
