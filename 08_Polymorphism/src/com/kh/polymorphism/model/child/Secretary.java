package com.kh.polymorphism.model.child;

import com.kh.polymorphism.model.parent.Employee;

public class Secretary extends Employee{
	
	private String nameOfBoss;

	public Secretary() {
		// TODO Auto-generated constructor stub
	}

	public Secretary(String name, int salary, String nameOfBoss) {
		super(name, salary);
		this.nameOfBoss = nameOfBoss;
		// TODO Auto-generated constructor stub
	}

	public String getNameOfBoss() {
		return nameOfBoss;
	}

	public void setNameOfBoss(String nameOfBoss) {
		this.nameOfBoss = nameOfBoss;
	}

	@Override
	public String toString() {
		return super.toString()+"Secretary [nameOfBoss=" + nameOfBoss + "]";
	}
	
	

}
