package com.kh.step6;

public class User1 extends Thread{
	
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		setName("CalculatorUser1");
	}
	
	@Override
	public void run() {
		
		calculator.setMemory(100);
	}

}
