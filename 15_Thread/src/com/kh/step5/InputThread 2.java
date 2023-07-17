package com.kh.step5;

import javax.swing.JOptionPane;

public class InputThread implements Runnable {
	InputThreadTest2 itt2 = new InputThreadTest2();

	@Override
	public void run() {
		String input = JOptionPane.showInputDialog("최종 로또 번호를 입력하세요...");
		System.out.println("입력하신 숫자는 " + input + " 입니다.");
		System.exit(0);
		
	}

}
