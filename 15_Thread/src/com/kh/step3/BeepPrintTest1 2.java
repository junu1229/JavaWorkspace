package com.kh.step3;


public class BeepPrintTest1 {

	public static void main(String[] args) {
		DingThread dt = new DingThread();
		DingSoundThread dst = new DingSoundThread();
		
		Thread dsst = new Thread(dst, "sound");
		Thread dth = new Thread(dt, "print");
		
		dsst.start();
		dth.start();
		
		

	}

}
