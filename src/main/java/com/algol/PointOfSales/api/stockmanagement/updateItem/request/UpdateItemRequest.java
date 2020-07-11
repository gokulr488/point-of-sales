package com.algol.PointOfSales.api.stockmanagement.updateItem.request;

import java.util.ArrayList;
import java.util.List;

import com.algol.PointOfSales.api.BaseRequest;

public class UpdateItemRequest extends BaseRequest {

	private List<UpdateItem> itemsList = new ArrayList<UpdateItem>();

	public List<UpdateItem> getItemsList() {
		return itemsList;
	}

	public UpdateItemRequest(long sessionCode, List<UpdateItem> itemsList) {
		super(sessionCode);
		this.itemsList = itemsList;
	}

	public void setItemsList(List<UpdateItem> itemsList) {
		this.itemsList = itemsList;
	}
}
