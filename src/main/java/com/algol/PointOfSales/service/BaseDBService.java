package com.algol.PointOfSales.service;


import com.algol.PointOfSales.dao.BaseDao;

public interface BaseDBService {

	//int insert(List<BaseDao> baseDao);

	BaseDao get(int id);

	int delete(int id);

	int update(BaseDao baseDao);
}
