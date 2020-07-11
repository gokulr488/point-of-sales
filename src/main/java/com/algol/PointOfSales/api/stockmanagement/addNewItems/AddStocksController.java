package com.algol.PointOfSales.api.stockmanagement.addNewItems;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algol.PointOfSales.api.stockmanagement.addNewItems.request.AddNewItem;
import com.algol.PointOfSales.api.stockmanagement.addNewItems.request.AddNewItemsRequest;
import com.algol.PointOfSales.dao.StocksMasterDao;
import com.algol.PointOfSales.service.stocksmaster.StockManagementService;

@RequestMapping("api/v1/addNewItems")
@RestController
public class AddStocksController {

	private final StockManagementService stockManagementService;

	public AddStocksController(StockManagementService stockManagementService) {
		this.stockManagementService = stockManagementService;
	}

	@PostMapping
	public void addNewItems(@RequestBody AddNewItemsRequest req) {
		List<StocksMasterDao> stockList = new ArrayList<StocksMasterDao>();
		for (AddNewItem item : req.getItemsList()) {
			stockList.add(addItems(item));
		}
		stockManagementService.insertItem(stockList);
	}

	private StocksMasterDao addItems(AddNewItem item) {
		StocksMasterDao dao = new StocksMasterDao();
		dao.setItemCode(item.getItemCode());
		dao.setItemName(item.getItemName());
		dao.setPrice(item.getPrice());
		dao.setRemainingQty(item.getQty());
		dao.setShopId(4);
		dao.setUnit(item.getUnit());
		return dao;
	}
}
