package com.algol.PointOfSales.service.userdetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.algol.PointOfSales.dao.StocksMasterDao;
import com.algol.PointOfSales.dao.UserDetailsDao;

@Service
public class UserManagementService {

	private final UserDetailsDBService userDetailsService;

	@Autowired
	public UserManagementService(@Qualifier("UserDetails") UserDetailsDBService userDetailsService) {
		this.userDetailsService = userDetailsService;
	}

	public int insertUser(List<UserDetailsDao> users) {
		userDetailsService.insert(users);
		return 0;
	}

	public StocksMasterDao getUser(int id) {

		return null;
	}

	public int deleteUser(int id) {

		return 0;
	}

	public int updateUser(StocksMasterDao baseDao) {

		return 0;
	}

	public List<StocksMasterDao> getAllUsers() {

		return null;
	}

}
