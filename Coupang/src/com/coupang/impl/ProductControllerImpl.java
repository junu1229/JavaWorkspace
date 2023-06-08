package com.coupang.impl;

import com.coupang.model.Product;

public interface ProductControllerImpl {
	public void uploadproduct(String name, String describe, int price);

	public Product showProduct(String name);

	public Product updateProduct(String name, String describe, int price);
	public void deleteProduct(String name);
}
