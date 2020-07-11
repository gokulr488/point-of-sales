package com.algol.PointOfSales.api.stockmanagement.addNewItems.request;

import java.util.List;

import com.algol.PointOfSales.api.BaseRequest;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AddNewItemsRequest extends BaseRequest {

	public AddNewItemsRequest(@JsonProperty("sessionCode") long sessionCode,
			@JsonProperty("itemsList") List<AddNewItem> itemsList) {
		super(sessionCode);
		this.itemsList = itemsList;
	}

	private List<AddNewItem> itemsList;

	public List<AddNewItem> getItemsList() {
		return itemsList;
	}

	public void setItemsList(List<AddNewItem> itemsList) {
		this.itemsList = itemsList;
	}

}
