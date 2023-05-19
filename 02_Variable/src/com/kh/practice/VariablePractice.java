package com.kh.practice;

import java.util.Scanner;

public class VariablePractice {

	public static void main(String[] args) {
		
		VariablePractice v = new VariablePractice();
//		v.method();
//		v.method2();
//		v.method3();
		v.method4();
		
		
	}
	
	// 혹시 일부로 주석 처리 하셨을까요?
	// 메인 메소드에서 호출 하지 않으면 해당 코드가 실행이 안되니 주석처리를 일부로 하지 않으셔도 괜찮아요 :)
	
	
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
	
	
	// 사실 출력만해도 되었던 문제인데 입력까지 하셨군요! 잘하셨습니다 :)
//	
//	public void method2(){
//		Scanner sc = new Scanner(System.in);
//		int adultPrice = 10000;
//		int studentPrice = 7000;
//		System.out.println("성인은 몇명입니까? > ");
//		int adultNum = sc.nextInt();
//		System.out.println("학생은 몇명입니까? > ");
//		int studentNum = sc.nextInt();
//		int adultTotal = adultNum*adultPrice;
//		int studenTotal = studentNum*studentPrice;
//		int totalAll = adultTotal + studenTotal;
//		
//		System.out.println("성인 " + adultNum + "명 : " + adultTotal + "원");
//		System.out.println("성인 " + studentNum + "명 : " + studenTotal + "원");
//		System.out.println();
//		System.out.println("총 금액 : " + totalAll + "원");
//			
//	}
//	
//	// 잘하신거라 주석 풀어놓았어요!
//	public void method3() {
//		int x = 5;
//		int y = 7;
//		int z = 9;
//		int x_ = x;
//		
//		
//		x = y;
//		y = z;
//		z = x_; // 잘하셨는데요! 보통 이런 식으로 다른 변수 하나를 지정해서 하는 게 맞거든요! 일반적으로 temp라는 변수명을 사용하긴 해요. 
//		
//		
//		System.out.println("x=" + x);
//		System.out.println("y=" + y);
//		System.out.println("z=" + z);
//	}
//	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		char strFirst = str.charAt(0);
		char strLast = str.charAt(str.length()-1); // 이거 일부로 사용해보라고 한건데 잘하셨어요!
		System.out.println("첫번째 문자 : "+ strFirst);
		System.out.println("마지막 문자 : "+ strLast);
	}
	

}
