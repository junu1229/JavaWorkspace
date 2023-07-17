package com.kh.practice1;

import java.io.FileNotFoundException;

public class E_SubClass extends E_SuperClass{
	
//	// 오버라이딩 시 throws 하지 않아도 됨
//	@Override
//	public void method() {
//		
//	}
//	@Override
//	public void method() {
//		
//		// 부모 클래스의 메서드와 같은 Exception을 throws 하는것은 가능
//		
//	}
//	@Override
//	public void method() throws Exception {
//		// 부모 클래스의 메서드보다 더 상위 타입의 Exception은 throws 불가능
//	}
	
	@Override
	public void method() throws FileNotFoundException{
		// 부모 클래스의 메서드보다 더 하위 타입의 Exception은 throws 가능
	}


}
