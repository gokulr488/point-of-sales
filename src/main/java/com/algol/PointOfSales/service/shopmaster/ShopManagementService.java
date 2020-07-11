package com.algol.PointOfSales.service.shopmaster;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.algol.PointOfSales.dao.ShopMasterDao;

@Service
public class ShopManagementService {

	private final ShopMasterDBService shopMasterService;

	@Autowired
	public ShopManagementService(@Qualifier("ShopMaster") ShopMasterDBService shopMasterService) {
		this.shopMasterService = shopMasterService;
	}

	public int insertShop(ShopMasterDao dao) {
		return shopMasterService.insert(dao);
	}

	public ShopMasterDao getShop(int id) {

		return null;
	}

	public int deleteShop(int id) {

		return 0;
	}

	public int updateShop(ShopMasterDao baseDao) {

		return 0;
	}

	public List<ShopMasterDao> getAllShops() {

		return null;
	}

}
