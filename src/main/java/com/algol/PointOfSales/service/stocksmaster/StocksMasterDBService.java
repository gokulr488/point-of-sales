package com.algol.PointOfSales.service.stocksmaster;

import java.util.List;

import com.algol.PointOfSales.dao.StocksMasterDao;
import com.algol.PointOfSales.service.BaseDBService;

public interface StocksMasterDBService extends BaseDBService {

	List<StocksMasterDao> getAll();

	int insert(List<StocksMasterDao> stockList);

}
