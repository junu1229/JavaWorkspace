package com.kh.condition;

import java.util.Scanner;

public class B_Switch {

	Scanner sc = new Scanner(System.in);
	
	/*
	 * switch문
	 * 
	 * [표현법]
	 * 
	 * switch(조건식) {
	 * 		case 값1:
	 * 			조건식의 결과가 값1과 같을 경우 실행코드
	 * 			break;
	 * 		case 값2:
	 * 			조건식의 결과가 값2와 같을 경우 실행코드
	 * 			break;
	 * 		default:
	 * 			조건식의 결과가 일치하는 case문이 없을 때 실행
	 * }
	 * 
	 * - case 문의 수는 제한이 없다. 
	 * - 조건식의 결과는 정수, 문자, 문자열이어야 한다.
	 * - 조건문을 빠져나오려면 break가 필요하다.
	 * - default 문 생략가능
	 * - case 문은 생략 불가
	 * - break; 는 절대적으로 필요
	 * 
	 */
	
	public void method1() {
		
		/*
		 * 숫자를 입력받아 
		 * 1일 경우 빨간색
		 * 2일 경우 파란색
		 * 3일 경우 초록색
		 * 잘못입력경우  잘못입략 
		 */
		
		int num1 = 0;
		
		System.out.println("정수를 입력해주세요 > ");
		num1 = sc.nextInt();
		
//		if (num1 == 1) {
//			System.out.println("빨간색");
//		}
//		else if (num1 == 2) {
//			System.out.println("파란색");
//		}
//		else if (num1 == 3) {
//			System.out.println("초록색");
//		}
//		else {
//			System.out.println("잘못 입력하셨습니다.");
//		}
		
		switch (num1) {
		case 1:
			System.out.println("빨간색");
			break;
		case 2:
			System.out.println("파란색");
			break;
		case 3:
			System.out.println("초록색");
			break;

		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	/*
	 * 등급별 권한
	 * 1: 관리권한, 글쓰기 권한, 읽기 권한
	 * 2: 글쓰기 권한, 읽기 권환
	 * 3: 읽기 권환 
	 */
	public void practice1() {
		
		int rank = 0;
		System.out.println("등급을 입력해주세요.");
		rank = sc.nextInt();
		
		switch (rank) {
		case 1:
			System.out.println("관리권한, 글쓰기 권한, 읽기 권한");
			break;
		case 2:
			System.out.println("글쓰기 권한, 읽기 권한");
			break;
		case 3:
			System.out.println("읽기 권한");
			break;

		default:
			System.out.println("잘못된 등급입니다.");
			break;
		}
		// 중복된게 있는경우 상위 부터 이렇게 진행도 가능 
		switch (rank) {
		case 1:
			System.out.println("관리권한");
		case 2:
			System.out.println("글쓰기 권한");
		case 3:
			System.out.println("읽기 권한");
			break;

		default:
			System.out.println("잘못된 등급입니다.");
			break;
		}
		
		
		
	}
	
	/*
	 * 월을 입력했을때 계쩔을 출력
	 * 3, 4, 5, qha
	 * 6, 7, 8
	 * 9, 10, 11
	 * 12, 1, 2
	 *
	 */
	public void practice2() {
		
		int month = 0;
		
		System.out.println("달을 입력해주세요 > ");
		month = sc.nextInt();
		
		switch (month) {
		
		case 3:case 4:case 5:
			System.out.println("봄");
			break;
		
		case 6:case 7:case 8:
			System.out.println("여름");
			break;
			
		case 9:case 10:case 11:
			System.out.println("가을");
			break;
			
		case 12:case 1:case 2:
			System.out.println("겨울");
			break;

		}
		
	}
	
	public static void main(String[] args) {
		
		B_Switch b = new B_Switch();
//		b.method1();
//		b.practice1();
		b.practice2();

		
		
	}

}
