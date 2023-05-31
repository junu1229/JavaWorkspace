package com.kh.example.practice2.model;

public class Circle {
	
	final double PI = 3.14;
	int radius = 1;
	
	public void incrementRadius(double a) {
		
		a+= radius;
		System.out.println(2*a*PI);
		System.out.println(PI*a*a);
	}

}
