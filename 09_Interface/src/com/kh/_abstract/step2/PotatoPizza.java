package com.kh._abstract.step2;

public class PotatoPizza extends Pizza {

	public PotatoPizza(int price, String storeName) {

		this.price = price;
		this.storeName = storeName;

	}

	@Override
	public void topping() {

		System.out.println("Potato Topping...");

	}

}
