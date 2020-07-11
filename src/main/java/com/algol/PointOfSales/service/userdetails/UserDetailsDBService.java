package com.algol.PointOfSales.service.userdetails;

import java.util.List;

import com.algol.PointOfSales.dao.UserDetailsDao;
import com.algol.PointOfSales.service.BaseDBService;

public interface UserDetailsDBService extends BaseDBService {

	List<UserDetailsDao> getAll();

	int insert(List<UserDetailsDao> users);
}
