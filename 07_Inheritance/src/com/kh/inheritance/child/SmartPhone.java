package com.kh.inheritance.child;

import com.kh.inheritance.parent.Product;

public class SmartPhone extends Product{
	
	private String mobileAgency;

	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}

	public SmartPhone(String brand, String pCode, String name, int price, String mobileAgency) {
		super(brand, pCode, name, price);
		this.mobileAgency = mobileAgency;
	}

	@Override
	public String toString() {
		return super.toString() + ", SmartPhone [mobileAgency=" + mobileAgency + "]";
	}

}
