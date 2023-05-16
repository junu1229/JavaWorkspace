package com.kh.variable;

public class B_Casting extends A_Variable {
	/*
	 *  형 변환(Casting)
	 *  - 값의 타입을 다른 타입으로 변환하는 것
	 *  - boolean을 제외한 기본형은 서로 형변환이 가능
	 */
	public static void main(String[] args) {
		B_Casting b = new B_Casting();
//		b.autoCasting();
		b.casting();
	}
	
	/*
	 * 자동 형 변환 (묵시적 형변환)
	 *  - 자동으로 형 변환이 이루어지기 때문에 따로 형변환하지 않아도 된다.
	 *  - 데이터 범위가 작은 자료형을 큰 자료형으로 변환한다.
	 */
	public void autoCasting() {
		byte b = 10; // 1byte
		short s = b; // 2byte
		int i = s; // 4byte
		long l = i; // 8byte
		
		float f = l; // 4byte ( 표현 가능한 수의 크기가 더 크기 때문에 자동 형변환이 된다.)
		double d = f; // 8byte
		
		System.out.println("b : " + b);
		System.out.println("s : " + s);
		System.out.println("i : " + i);
		System.out.println("l : " + l);
		System.out.println("f : " + f);
		System.out.println("d : " + d);
		
		double result = 12 + 3.3;
		System.out.println("________________________");
		System.out.println(result);
		// byte, short 타입의 데이터는 연산 시 무조건 int 타입으로 변환 후 처리한다.
		int result2 = b + s;
		System.out.println(result2);
	}
	
	/*
	 *  강제 형변환 (명시적 형 변환)
	 *  
	 *  [표현법] (자료형) 데이타;
	 *  
	 *  -범위가 큰 크기의 자료형의 데이터를 작은 크기의 자료형으로 변환하려고 할 때 사용한다.
	 *  - 강제 형 변환의 경우 데이터 손실이 발생할 수 있다.
	 */
	public void casting() {
		double d = 4.1234567890123456789; // 소수점 15자리수 까지만 가능하다.
		System.out.println("d : " + d);
	    float f = (float)d;
	    System.out.println("f : " + f);
	    int i = (int)f;
	    System.out.println("i : " + i);
	    
	    int sum = (int)(i + d);
	    int sum2 = i + (int) d;
	    
	    System.out.println("sum: " + sum);
	    System.out.println("sum2: " + sum2);
	    
	    int number = 290;
	    byte bNumber = (byte)number;
	    System.out.println("bNumber: " + bNumber);
	    
	    int number2 = 128;
	    byte bnumber2 = (byte)number2;
	    System.out.println(bnumber2);
	    
	    // char <-> int : 각 문자들마다 고유한 숫자가 지정되기 때문에 쌍방향으로 형변환이 가능하다.(유니코드)
	    // char는 음수값 저장 불가 ->  값의 범위가 0~65536 
	    int num = 'A';
	    System.out.println("num : " + num);
	    char ch = 53214;
	    System.out.println("ch : " + ch);
	    
	    
	    
	}

}
