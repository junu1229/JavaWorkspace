package com.kh.practice;

public class S23Ultra extends SmartPhone implements Pen {

	public String name = "S23 Ultra";
	public String brand = "삼성";

	public void printInformation() {

		printInformation(name, brand);
		picture();
		System.out.print("펜 탑재 여부 : ");
		pen();

	}

	@Override
	public void pen() {
		System.out.println(true);
	}

	@Override
	public void picture() {
		System.out.println("2억 화소 카메라");
	}

}
