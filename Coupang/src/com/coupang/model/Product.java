package com.coupang.model;


public class Product {
	/*
	 * 0. 이름
	 * 1. 설명
	 * 2. 가격
	 * 3. 판매자
	 * 4. 이미지
	 * 5. 리뷰
	 * 6. 질의 응답
	 * 
	 */
	private String proName;
	private String proDescribe;
	private int proprice;
	private String proSeller;
	private String proImg;
	private String proReview;
	private String proQnA;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String proName, String proDescribe, int proprice, String proSeller, String proImg, String proReview,
			String proQnA) {
		this.proName = proName;
		this.proDescribe = proDescribe;
		this.proprice = proprice;
		this.proSeller = proSeller;
		this.proImg = proImg;
		this.proReview = proReview;
		this.proQnA = proQnA;
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
	public String getProImg() {
		return proImg;
	}
	public void setProImg(String proImg) {
		this.proImg = proImg;
	}
	public String getProReview() {
		return proReview;
	}
	public void setProReview(String proReview) {
		this.proReview = proReview;
	}
	public String getProQnA() {
		return proQnA;
	}
	public void setProQnA(String proQnA) {
		this.proQnA = proQnA;
	}
	@Override
	public String toString() {
		return "Product [proName=" + proName + ", proDescribe=" + proDescribe + ", proprice=" + proprice
				+ ", proSeller=" + proSeller + ", proImg=" + proImg + ", proReview=" + proReview + ", proQnA=" + proQnA
				+ "]";
	}
	
	

}
