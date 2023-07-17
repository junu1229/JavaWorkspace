package com.kh.step5;


public class InputThreadTest2 {

	public boolean inputCheck = false;
	public boolean timeCheck = false;

	public static void main(String[] args) {
		Thread cth = new Thread(new CountDown(), "countDown");
		Thread ith = new Thread(new InputThread(), "InputThread");
		cth.start();
		ith.start();


		// 1. 데이터 입력

		// 2. 카운팅 작업

	}
	
	
}
