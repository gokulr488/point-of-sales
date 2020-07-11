package com.algol.PointOfSales.api.stockmanagement.allItems.response;

import java.util.ArrayList;
import java.util.List;

import com.algol.PointOfSales.api.BaseResponse;

public class AllItemsResponse extends BaseResponse {

	List<ItemDetails> allItems = new ArrayList<ItemDetails>();

	public List<ItemDetails> getAllItems() {
		return allItems;
	}

	public void setAllItems(List<ItemDetails> allItems) {
		this.allItems = allItems;
	}
}
