package com.kh.condition;

import java.util.Scanner;


/*
 * 
 * if 문
 * 
 * [표현법]
 * 
 * if(조건식){
 * 		조건식이 참이면 
 * }
 * 
 * - 보통 조건식에는 비교연산자,논리연산자를 사용한다.
 */
public class A_if {
	
	public void method1() {
		
		int score = 80; // 지역변수
		
		// 60점 이상이어야 합격!
		/*
		 * 만약 (60점 이상) {  의사코드
		 * 		합격
		 * }
		 */
		
		if (score >= 60); {
			System.out.println("합격");
		}
		
		if (score < 60) System.out.println("불합격");
		
	}
	/*
	 * 
	 * if else문
	 * [표현법] 
	 * 
	 * if(조건식) {
	 * 		조건식이 참일때 실행 할 코드
	 * }
	 * else {
	 * 		조건식이 거짓일 경우 실행 할 코
	 * }
	 * 
	 * 
	 */
	public void method2() {
		
		int score = 0;
		System.out.println("점수를 입력해주세요 > ");
		score = sc.nextInt();
		String s = "";
		
		if(score >= 60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		
		s = 60 <= score ? "합격" : "불합격";
		System.out.print(s);
		
	}
	
	public void method3() {
		
		String name = "";
		
		System.out.println("이름을 입력해주세요");
		name = sc.nextLine();
		
		System.out.println("김준우" == name); // false
		System.out.println("김준우".equals(name)); // true, string class method
		System.out.println("김준우".charAt(0)); // string class char at method
		
		// 본인이면 "본인이다," , 본인이 아니면 "본인이 아니다"
		
		if ("김준우" == name) {
			System.out.println("본인이다.");
		}
		else {
			System.out.println("본인이 아니다.");
		
		}
		
	}
	
	public void method4() {
		int number = 0;
		
		System.out.println("숫자 입력 > ");
		number = sc.nextInt();
		
		if (number > 0) {
			System.out.println("양수");
			
		}
		else {
			if (number == 0) {
				System.out.println("0입니다.");
			}
			else {
				System.out.println("음수");
			}
		}
		
	}
	
	public void method5() {
		
		/*
		 * if-else if-else문
		 * 
		 * [표현법]
		 * 
		 * if (조건식1) {
		 * 		조선식이 참(true)일 때 실행할 코드
		 * }
		 * else if(조건식2) {
		 * 		조건식2가 참일 때 실행할 코드
		 * }
		 * else {
		 * 		어느 조건식에도 참이 아닐 때 
		 * }
		 * 
		 * - else if 수는 제한이 없다.
		 * - else 는 생략이 가능하다.
		 */
		int number = 0;
		
		System.out.println("숫자를 입력해주세요 > ");
		number = sc.nextInt();
		
		if(number>0) {
			System.out.println("양수이다.");
		}
		else if (number<0) {
			System.out.println("음수이다.");
		}
		else {
			System.out.println("0이다.");
		}
		
		
	}
	/*
	 * 
	 * 사용자에게 점수 100에서 0까지 입력 받아 등급 나누기
	 * 90> A 
	 * 90 ~ 80 b
	 * 80~70 c
	 * 70~60 d
	 * 60>f
	 */
	public void method6() {
		
		int score = 0;
		char grade = '\u0000';
		
		System.out.println("점수를 입력해주세요 > ");
		score = sc.nextInt();
		
		if (score >= 90) {
			grade = 'A';
		}
		else if (score >= 80) {
			grade = 'B';
		}
		else if (score >= 70) {
			grade = 'C';
		}
		else if (score >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		System.out.println(grade);
		
	}
	
	/*
	 * 세 정수를 입력 했을 때 짝수만 출
	 */
	
	public void practice1() {
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.println("숫자를 입력해주세요 > ");
		num1 = sc.nextInt();
		System.out.println("숫자를 입력해주세요 > ");
		num2 = sc.nextInt();
		System.out.println("숫자를 입력해주세요 > ");
		num3 = sc.nextInt();
		
		if (num1%2 == 0 ) {
			System.out.println(num1);
		}
		if (num2%2 == 0 ) {
			System.out.println(num2);
		}
		if(num3%2 == 0 ) {
			System.out.println(num3);
		}
		
	}
	
	/*
	 * 정수 한개를 입력했을 때 음(minus)/양(plus)/0(zero)/짝(even)/홀(odd) 출
	 */
	
	public void practice2() {
		
		int num1 = 0;
		String r = "";
		
		System.out.println("숫자를 입력해주세요 > ");
		num1 = sc.nextInt();
		
		if (num1 > 0) {
			System.out.println("plus");
		}
		else if (num1 == 0) {
			System.out.println("zero");
		}
		else  {
			System.out.println("minus");
		}
		System.out.println(r = num1%2 == 0 ? "even" : "odd");

	}

	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		A_if a = new A_if();
//		a.method1();
//		a.method2();
//		a.method3();
//		a.method4();
//		a.method5();
//		a.method6();
//		a.practice1();
		a.practice2();
		
		
	}

}
