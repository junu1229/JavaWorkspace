package com.kh.step4;

import javax.swing.JOptionPane;

public class InputThreadTest {

	public static void main(String[] args) {
		Thread cth = new Thread(new CountDown(), "countDown");
		cth.start();
		
		// 1. 데이터 입력
		String input = JOptionPane.showInputDialog("최종 로또 번호를 입력하세요...");
		System.out.println("입력하신 숫자는 "+input+" 입니다.");
		
		// 2. 카운팅 작업
		
		
	}

}
