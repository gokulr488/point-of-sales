package com.algol.PointOfSales.api.shopmanagement.addnewshop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algol.PointOfSales.api.shopmanagement.addnewshop.request.AddShopRequest;
import com.algol.PointOfSales.api.shopmanagement.addnewshop.request.UserData;
import com.algol.PointOfSales.dao.ShopMasterDao;
import com.algol.PointOfSales.dao.UserDetailsDao;
import com.algol.PointOfSales.service.shopmaster.ShopManagementService;
import com.algol.PointOfSales.service.userdetails.UserManagementService;

@RequestMapping("api/v1/addNewShop")
@RestController
public class AddShopController {

	private final ShopManagementService shopManagement;
	private final UserManagementService userManagement;

	public AddShopController(ShopManagementService shopManagement, UserManagementService userManagement) {
		this.shopManagement = shopManagement;
		this.userManagement = userManagement;
	}

	@PostMapping
	public void addNewShop(@RequestBody AddShopRequest req) {
		int shopId =addShop(req);
		System.out.println("Added new shop " + req.getShopName());
		List<UserDetailsDao> users = new ArrayList<UserDetailsDao>();
		for (UserData user : req.getUsers()) {
			users.add(addUser(user,shopId));
			System.out.println("Added new user " + user.getUserName());
		}
		userManagement.insertUser(users);
	}

	private int addShop(AddShopRequest req) {

		ShopMasterDao shop = new ShopMasterDao();
		shop.setShopName(req.getShopName());
		shop.setAddress(req.getAddress());
		shop.setGstNo(req.getGstNo());
		shop.setPhoneNumber(req.getPhoneNumber());
		return shopManagement.insertShop(shop);
	}

	private UserDetailsDao addUser(UserData user, int shopId) {
		UserDetailsDao userData = new UserDetailsDao();
		userData.setPassword(user.getPassword());
		userData.setPrivilageLevel(user.getPrivilageLevel());
		userData.setUserName(user.getUserName());
		//userData.setShopId(shopId);
		return userData;
	}
}
