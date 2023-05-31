package com.kh.composite;

import com.kh.inheritance.parent.Product;

/*
 * 클래스 간의 관계 : 상속 vs 포함
 * - 상속 관계 : ~은 ~이다. (is-a)
 * - 포함 관계 : ~은 ~를 가지고 있다. (has~a)
 * - 자바는 단일상속만 허용
 * - 클래스간의 관계를 많이 맺을수록 재사용을 높이고 관리하기 쉽다.
 */
public class Customer extends Object{
	
	protected String name;
	protected String grade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	Product product;
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(String name) {
		this.name = name;
		this.grade = "silver";
		this.bonusRatio = 0.01;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", grade=" + grade + ", bonusPoint=" + ", bonusRatio="
				+ bonusRatio + "]";
	}
	
	public boolean equals(Object obj) {
		Customer customer = (Customer) obj;
		return this.name == customer.name;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}

}
