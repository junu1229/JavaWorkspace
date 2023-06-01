package com.kh.practice;

public class SmartPhone implements Phone {

	public void printInformation(String name, String brand) {

		System.out.println(name+"는" +brand+"에서 만들어졌고 제원은 다음과 같다.");
		makeCall();
		takeCall();

	}

	@Override
	public void picture() {

	}

	@Override
	public void makeCall() {

		System.out.println("번호를 누르고 통화버튼을 누름");

	}

	@Override
	public void takeCall() {

		System.out.println("수신 버튼을 누름");

	}

}
