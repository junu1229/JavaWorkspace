package com.coupang.controller;

import java.util.HashMap;

import com.coupang.model.Product;

public class ProductController {
	UserController uc = new UserController();
	HashMap<String, Product> buyerHashMap = new HashMap<>();
	
//	private String proName;
//	private String proDescribe;
//	private int proprice;
//	private String proSeller;
	
	public void uploadproduct(String name, String describe, int price) {
		if(uc.loginStatus) {
			buyerHashMap.put(name, new Product(name, describe, price, uc.loggedInUser.getUserName()));
		}
		

	}

	public Product showProduct(String name) {
		
		return buyerHashMap.get(name);
		
	}


	public Product updateProduct(String name, String describe, int price) {
		
		if(uc.loggedInUser.getUserName().equals(buyerHashMap.get(name).getProSeller())) {
			
			buyerHashMap.get(name).setProName(name);
			buyerHashMap.get(name).setProDescribe(describe);
			buyerHashMap.get(name).setProprice(price);
			return buyerHashMap.get(name);
		
		}
		return null;

	}

	public void deleteProduct(String name) {
		if(uc.loggedInUser.getUserName().equals(buyerHashMap.get(name).getProSeller())) {
			buyerHashMap.remove(name);
		}
	}

}
