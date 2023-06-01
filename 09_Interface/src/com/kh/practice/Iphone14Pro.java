package com.kh.practice;

public class Iphone14Pro extends SmartPhone implements Pen{
	String name = "Iphone14 pro";
	String brand = "Apple";
	
	public Iphone14Pro() {
		
	}
	
	public void printInformation() {
		printInformation(name, brand);
		picture();
		System.out.print("펜 탑재 여부 : ");
		pen();
		
	}

	@Override
	public void pen() {
		System.out.println(false);
	}
	@Override
	public void picture() {
		System.out.println("4800만 화소 카메라");
	}

}
