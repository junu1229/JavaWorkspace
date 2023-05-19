package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	
	/*
	 * 논리 연산자
	 * - 두개의 논리값을 연산해주는 연산자
	 * - 논리연산한 결과마저도 논리값임!
	 * 
	 * 논리값 && 논리값 : (and) 왼쪽, 오른쪽 둘 다 true 일 경우 결과값 true
	 * 논리값 || 논리값 : (or) 왼쪽, 오른쪽 둘 중 하나만 true 여도 결과값 true
	 * 
	 */
	
	public static void main(String[] args) {
		E_Logical e = new E_Logical();
//		e.method1();
//		e.method2();
		e.method3();
		
	}
	
	public void method1() {
		
		int number = 0;
		boolean result = false; // 사용할 변수들은 맨위 정렬
		
		Scanner sc = new Scanner(System.in);
		
		// 사용자가 입력한 정수값이 1부터 100 사이의 값인지 확인
		
		System.out.println("임의의 정수를 입력해 주세요. > ");
		number = sc.nextInt();
		result = (number <= 100) && (number >= 1);
		System.out.println(number+"는 1과 100사이의 값인가요? : "+result);
		
		
	}
	
	public void method2() {
		
		// Short Cut Evaluation
		int number = 10;
		boolean result = false;
		
		// && 연산자를 기준으로 앞에서 이미 false 가 나오면 뒤에 연산자는 실행하지 않는다.
		
		result = (number <= 5) && (++number > 0);
		System.out.println(result); // false
		System.out.println(number); // true
		
		// || 연산자를 기준으로 앞에서 이미 true 가 나오면 뒤에 연산자는 실행하지 않는다.
		result = (number < 20) || (++number > 0);
		System.out.println(result); // true
		System.out.println(number); // 10
		
		// 이런것들은 로그인에서 자주 사용
		
	}
	/*
	 * 사용자가 입력한 문자 값이 알파벳 대문자인지 확인하기
	 * 65 ~ 90
	 */
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		String text = "";
		boolean result = true;
		char text0 = 'a';
		
		System.out.println("대문자 알파벳을 입력해주세요 : ");
		text = sc.nextLine();
		text0 = text.charAt(0);
		result = text0 >64 && text0 < 91;
		System.out.printf("입력하신 %s 는 대문자 알파벳이 %b입니다.",text ,result);
		// String 타입에 .chaAt() 가능해서 char로 바로 받아올 수 있다.
		
	}

}
