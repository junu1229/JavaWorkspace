package com.kh.step6;

public class User2 extends Thread{
	

	private Calculator calculator;
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		setName("CalculatorUser2");
	}
	@Override
	public void run() {
		
		calculator.setMemory(50);
		
	}

}
