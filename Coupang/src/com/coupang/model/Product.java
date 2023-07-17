package com.coupang.model;


public class Product {
	/*
	 * 0. 이름
	 * 1. 설명
	 * 2. 가격
	 * 3. 판매자
	 * 
	 */
	private String proName;
	private String proDescribe;
	private int proprice;
	private String proSeller;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String proName, String proDescribe, int proprice, String proSeller) {
		this.proName = proName;
		this.proDescribe = proDescribe;
		this.proprice = proprice;
		this.proSeller = proSeller;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getProDescribe() {
		return proDescribe;
	}
	public void setProDescribe(String proDescribe) {
		this.proDescribe = proDescribe;
	}
	public int getProprice() {
		return proprice;
	}
	public void setProprice(int proprice) {
		this.proprice = proprice;
	}
	public String getProSeller() {
		return proSeller;
	}
	public void setProSeller(String proSeller) {
		this.proSeller = proSeller;
	}
	@Override
	public String toString() {
		return "Product [proName=" + proName + ", proDescribe=" + proDescribe + ", proprice=" + proprice
				+ ", proSeller=" + proSeller + "]";
	}
	
	

}
