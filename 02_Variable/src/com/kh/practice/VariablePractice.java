package com.kh.practice;

import java.util.Scanner;

public class VariablePractice {

	public static void main(String[] args) {
		
		VariablePractice v = new VariablePractice();
//		v.method();
		v.method2();
//		v.method3();
//		v.method4();
		
		
	}
	/*public void method() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int minus = num1 - num2;
		int multi = num1 * num2;
		int nanugi = num1 / num2;
		System.out.println("더하기 결과 : " + sum);
		System.out.println("빼기 결과 : " + minus);
		System.out.println("곱하기 결과 : " + multi);
		System.out.println("나누기 결과 : " + nanugi);
	}*/
	public void method2(){
		Scanner sc = new Scanner(System.in);
		int adultPrice = 10000;
		int studentPrice = 7000;
		System.out.println("성인은 몇명입니까? > ");
		int adultNum = sc.nextInt();
		System.out.println("학생은 몇명입니까? > ");
		int studentNum = sc.nextInt();
		int adultTotal = adultNum*adultPrice;
		int studenTotal = studentNum*studentPrice;
		int totalAll = adultTotal + studenTotal;
		
		System.out.println("성인 " + adultNum + "명 : " + adultTotal + "원");
		System.out.println("성인 " + studentNum + "명 : " + studenTotal + "원");
		System.out.println();
		System.out.println("총 금액 : " + totalAll + "원");
		
		
		
		
	}
//	public void method3() {
//		int x = 5;
//		int y = 7;
//		int z = 9;
//		int x_ = x;
//		
//		
//		x = y;
//		y = z;
//		z = x_;
//		
//		
//		System.out.println("x=" + x);
//		System.out.println("y=" + y);
//		System.out.println("z=" + z);
//	}
//	public void method4() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("문자열을 입력하세요 : ");
//		String str = sc.nextLine();
//		char strFirst = str.charAt(0);
//		char strLast = str.charAt(str.length()-1);
//		System.out.println("첫번째 문자 : "+ strFirst);
//		System.out.println("마지막 문자 : "+ strLast);
//	}
	

}
