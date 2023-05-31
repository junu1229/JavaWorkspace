package com.kh.polymorphism.model.child;

import com.kh.polymorphism.model.parent.Employee;

public class Manager extends Employee{
	
	private String dept;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, int salary, String dept) {
		super(name, salary);
		this.dept = dept;
		// TODO Auto-generated constructor stub
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString()+"Manager [dept=" + dept + "]";
	}
	

}
