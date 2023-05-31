package com.kh.overriding.model;
/*
 * 
 * 모든 클래스는 Object 클래스의 후손이다.
 * 즉, 최상위 클래스는 항상 Object다.
 * Object 클래스에 있는 모든 메서드를 사용할 수 있다.
 */
public class Customer extends Object{
	
	protected String name;
	protected String grade;
	protected int bonusPoint;
	protected double bonusRatio;
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
