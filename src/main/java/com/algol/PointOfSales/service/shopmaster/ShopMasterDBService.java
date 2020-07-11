package com.algol.PointOfSales.service.shopmaster;

import java.util.List;

import com.algol.PointOfSales.dao.ShopMasterDao;
import com.algol.PointOfSales.service.BaseDBService;

public interface ShopMasterDBService extends BaseDBService {

	List<ShopMasterDao> getAll();

	int insert(ShopMasterDao dao);
}
