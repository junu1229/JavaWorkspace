package com.kh.composite;

// 3개의 클래스 모두 공통적으로 가지고 있는 멤버 변수만 추출하여 부모 클래스로 만든다.

public class Product {
	
	private String brand;
	String pCode;
	protected String name;
	public int price;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String brand, String pCode, String name, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.name = name;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [brand=" + brand + ", pCode=" + pCode + ", name=" + name + ", price=" + price + "]";
	}

}
