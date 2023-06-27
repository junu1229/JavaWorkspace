package com.kh.step5;

public class CountDown implements Runnable {

	@Override
	public void run() {

		for (int i = 10; i > 0; i--) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

		}
		System.out.println("10초가 경과되었습니다.");
		System.exit(0);

	}

}
