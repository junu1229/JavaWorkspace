package com.kh.lambda.standard;

import java.util.function.BooleanSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

/*
 * 
 * Supplier
 * - 함수적 인터페이스는 매개변수가 없고 리턴 값이 있는 getxxx() 추상 메서드를 가지고 있다.
 * - getXXX() 추상 메서드는 데이터를 리턴(공급)하는 역활을 한다.
 * 
 */

public class B_Supplier {
	
	public static void main(String[] args) {
		B_Supplier b = new B_Supplier();
//		b.method1();
//		b.method2();
		b.method3();
	}
	
	// Supplier<T> : T 객체를 리턴
	public void method1() {
		
		Supplier<String> supplier = () -> "Supplier는 제네릭으로 지정된 객체를 리턴한다.";
		
		System.out.println(supplier.get());
		
	}
	
	// BooleanSupplier : boolean 값을 리턴
	public void method2() {
		
		BooleanSupplier booleanSupplier = () -> true;
		System.out.println(booleanSupplier.getAsBoolean());
		
	}
	
	/*
	 * 
	 * IntSupplier : int 값을 리턴 ( 추상메서드 : int getAsInt())
	 * DoubleSupplier : double 값을 리턴 ( 추상메서드 : double getAsDouble())
	 * LongSupplier : Long 값을 리턴 ( 추상메서드 : Long getAsLong())
	 * 
	 * 
	 */
	
	public void method3() {
		
		LongSupplier longSupplier = () -> 23456789023456789L;
		System.out.println(longSupplier.getAsLong());
		
	}

}
