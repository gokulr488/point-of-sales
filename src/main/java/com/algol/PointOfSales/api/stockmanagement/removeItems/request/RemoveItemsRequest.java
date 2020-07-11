package com.algol.PointOfSales.api.stockmanagement.removeItems.request;

import java.util.ArrayList;
import java.util.List;

import com.algol.PointOfSales.api.BaseRequest;

public class RemoveItemsRequest extends BaseRequest {

	private List<RemoveItem> itemsList = new ArrayList<RemoveItem>();

	public RemoveItemsRequest(long sessionCode, List<RemoveItem> itemsList) {
		super(sessionCode);
		this.itemsList = itemsList;
	}

	public List<RemoveItem> getItemsList() {
		return itemsList;
	}

	public void setItemsList(List<RemoveItem> itemsList) {
		this.itemsList = itemsList;
	}
}
