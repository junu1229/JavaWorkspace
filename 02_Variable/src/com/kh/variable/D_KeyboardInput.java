package com.kh.variable;

import java.util.Scanner;

public class D_KeyboardInput {
	
	/*
	 * Scanner
	 * - 화면(console)으로부터 데이터를 "입력"받는 클래스
	 * 
	 * 1) import java.util.Scanner; 추가
	 * 
	 * 2) Scanner 클래스 생성
	 *    Scanner sc = new Scanner(system.in);
	 * 3) Scanner 클래스 사용
	 * 		입력값이
	 * 			- 문자열일 때: 
	 * 				- sc.next() - 공백이 있을 경우 공백 이전까
	 * 				- sc.nextLine() - 공백 포함 엔터 전까지 (권장)
	 * 			- 정수일 때: sc.nextInt()
	 * 			- 실수일 때: sc.nextFloat(), sc.nextDouble()
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름은 무엇입니까? > ");
		String name = sc.next();
		sc.nextLine();
		System.out.print("당신의 집은 어디십니까? > ");
		String addr = sc.next();
		sc.nextLine();
		
		System.out.print("당신의 나이는 몇살입니까? > ");
		int age = sc.nextInt();
		System.out.print("당신의 키는 몇입니까? (소수점 첫쨰자리까지 입력하세요.) > ");
		float height = sc.nextFloat();
		sc.nextLine();
		
		System.out.print("당신의 성별은 무엇입니까? (남/여)");
		String line = sc.nextLine( );
		char gender = line.charAt(0);
		
		System.out.printf("당신의 이름은 %s 당신이 사는곳은 %s 당신의 나이는 %d 당신의 키는 %.1f 당신의 성별은 %c", name, addr, age, height, gender);
		
		
	}

}
