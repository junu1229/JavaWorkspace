package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public static void main(String[] args) {
		
		OperatorPractice o = new OperatorPractice();
//		o.method1();
//		o.method2();
//		o.method3();
//		o.method4();
//		o.method5();
		o.method6();
//		o.method3_1();
		
	}
	public void method1() {
		Scanner sc = new Scanner(System.in);
		int peoples = 0;
		int pencils = 0;
		
		System.out.println("인원수를 입력해주세요 : ");
		peoples = sc.nextInt();
		System.out.println("연필개수 입력해주세요 : ");
		pencils = sc.nextInt();
		
		System.out.println("1인당 연필 개수 : "+ pencils/peoples);
		System.out.println("남은 연필 개수 : "+ pencils%peoples);
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("양수를 입력해주세요 > ");
		num1 = sc.nextInt();
		num2 = (num1 % 100); // 요렇게 되면 1의 자리만 버려질거에요! 10의 자리도 버려볼까요?
		num1 -= num2;
		System.out.println(num1);
		
		
		
		
	}
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		String s = "";
		System.out.println("첫번째 수를 입력해주세요 > ");
		num1 = sc.nextInt();
		System.out.println("두번째 수를 입력해주세요 > ");
		num2 = sc.nextInt();
		System.out.println("세번째 수를 입력해주세요 > ");
		num3 = sc.nextInt();
		
		s = num1 == num2 ? (num1 == num3 ? "true" : "false") : "false"; 
		// 삼항 연산자를 사용한 것도 좋지만! 삼항 연산자에서 오히려 true, false를 직접 넣지 않거든요!
		// 논리 연산자를 사용해볼 수 있을까요?
		
		System.out.println(s);
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		String s = "";
		
		System.out.println("정수를 입력해주세요 > ");
		num1 = sc.nextInt();
		s = num1%2 == 0 ? "짝수다" : "홀수다";
		System.out.println(s);
	
	}
	
	public void method5() {
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		String s = "";
		
		System.out.println("나이를 입력해주세요 > ");
		num1 = sc.nextInt();
		s = num1 > 19 ? "성인" : (num1 > 13 ? "청소년" : "어린이");
		
		
		System.out.println(s);
	}
	
	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		System.out.println("사과의 개수를 입력해주세요 > ");
		num1 = sc.nextInt();
		System.out.println("바구니의 개수를 입력해주세요 > ");
		num2 = sc.nextInt();
		num3 = num1/num2;

		if (num1%num2 != 0) {
			num3 +=1;
		}

		System.out.println("필요한 바구니의 수 : " + num3);
		
	}
	
	public void method3_1() {
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		boolean result = true;
		String s = "";
		System.out.println("첫번째 수를 입력해주세요 > ");
		num1 = sc.nextInt();
		System.out.println("두번째 수를 입력해주세요 > ");
		num2 = sc.nextInt();
		System.out.println("세번째 수를 입력해주세요 > ");
		num3 = sc.nextInt();
		result = (num1 == num2) && (num2 == num3);
		System.out.println(result);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
