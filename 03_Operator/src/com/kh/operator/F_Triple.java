package com.kh.operator;

import java.util.Scanner;

public class F_Triple {
	
	/*
	 * 삼항 연산자
	 * [표현법] 조건식 ? 식1 : 식2;
	 * 
	 * - 조건식에는 주로 비교, 논리 연산자가 사용된다.
	 * - 조건식의 결과가 true면 식1을 출력한다.
	 * - 조건식의 결과가 false면 식2를 출력한다.
	 * 
	 */
	
	public static void main(String[] args) {
		
		F_Triple f = new F_Triple();
//		f.method();
//		f.practice1();
		f.practice2();
		
	}
	
	public void method() {
		
		int num = 0;
		String result = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값을 입력 > ");
		num = sc.nextInt();
		
		// 입력받은 정수가 양수인지 음수인지 판단하기
		
		result = (num > 0) ? "양수이다." : "음수이다.";
		System.out.println(result);
		
		// 양수이다, 음수이다, 0이다.
		result = (num >= 0) ? ((num==0) ? "0이다." : "양수이다.")  : ("음수이다.");
		System.out.println(result);
		
		
	}
	/*
	 * 문제 1
	 * 
	 * 사용자한테 두 개의 정수값을 입력받아 두 정수의 곱셈결과 100보다 큰경우 "결과가 100이상입니다" 아닌경우 "결과가 100보다 작습니다"
	 * 
	 */
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		String result = ""; // 조건식이 들어가는거지 true, false가 들어가는게 아니므로 String이 맞는것이다.
		
		System.out.println("첫 번째 정수를 입력해주세요 >");
		num1 = sc.nextInt();
		System.out.println("두 번째 정수를 입력해주세요 >");
		num2 = sc.nextInt();
		
		result = ((num1 * num2) > 100) ? "결과가 100이상입니다." : "결과가 100보다 작습니다.";
		System.out.println(result);
		
		
	}
	/*
	 * 문제 2
	 * 
	 * 사용자 한테 문자를 하나 입력받아서 입력한 문자가 대문자이면 "알파벳 대문자이다." 아니면 "알파벳 대문자가 아니다." 출력
	 * 65 ~ 90
	 * 
	 */
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		char c = 'a';
		String s = "";
		System.out.println("대문자를 입력해주세요 > ");
		c = sc.nextLine().charAt(0);
		
		s = c > 64 ? (c<91 ? "대문자 입니다.":"대문자가 아닙니다.") : "대문자가 아닙니다."; // 숫자 대신 문자 입력 가능
		
		System.out.println(s);
		
		
		
	}

	
	
	
	
	
	
}
