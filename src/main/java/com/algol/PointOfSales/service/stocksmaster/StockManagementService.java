package com.algol.PointOfSales.service.stocksmaster;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.algol.PointOfSales.dao.StocksMasterDao;

@Service
public class StockManagementService {

	private final StocksMasterDBService stockMasterService;

	@Autowired
	public StockManagementService(@Qualifier("StockMaster") StocksMasterDBService stockMasterService) {
		this.stockMasterService = stockMasterService;
	}

	public int insertItem(List<StocksMasterDao> stockList) {
		stockMasterService.insert(stockList);
		return 0;
	}

	public StocksMasterDao getItem(int id) {

		return null;
	}

	public int deleteItem(int id) {

		return 0;
	}

	public int updateItem(StocksMasterDao baseDao) {

		return 0;
	}

	public List<StocksMasterDao> getAllItems() {

		return null;
	}

}
