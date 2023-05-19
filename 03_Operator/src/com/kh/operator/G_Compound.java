package com.kh.operator;

public class G_Compound {
	
	/*
	 * 복합 대입 연산자
	 * - 산술 연산자와 대입 연산자가 결합되어있는 형태
	 * - 연산처리 속도가 빨라지므로 사용하는걸 권장!
	 * 
	 * +=, -=, *=, /=, %=
	 * 
	 * a = a + 1; => a += 1;
	 * a = a - 1; => a -= 1;
	 * a = a * 1; => a *= 1;
	 * a = a / 1; => a /= 1;
	 * a = a % 1; => a %= 1;
	 * 
	 * 
	 */
	public static void main(String[] args){
		int number = 12;
		String str = "hello";
		
		number += 3; // numver = number + 3
		System.out.println(number); // 15
		number -= 5; // number = number - 3
		System.out.println(number); // 10
		number *= 6; // number = number * 6
		System.out.println(number); // 60
		number /= 3; // number = number / 3
		System.out.println(number); // 20
		number &= 3; // number = number % 3
		System.out.println(number); // 2
		
		str += ", World!"; // str = str + ". World!"; 
		
	}

}
