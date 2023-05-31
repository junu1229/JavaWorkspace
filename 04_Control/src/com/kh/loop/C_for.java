package com.kh.loop;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class C_for {

	Scanner sc = new Scanner(System.in);

	public void method1() {

		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println();

		for (int i = 1; i < 6; i++) {

			System.out.println(i);

		}

	}

	public void method2() {

		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}

	}

	// 1부터 10사이에 홀수만 출력
	public void method3() {

		for (int i = 1; i < 11; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		for (int i = 1; i < 11; i += 2) {

			System.out.println(i);
		}

	}

	/*
	 * continue문
	 * 
	 * - continue 문은 만복문 안에서 사용 - 만복문 안에서 continue문을 만나게 되면 "현재 구문"을 종료 - 반복문을 벗어나는
	 * 건 아님! 다음 반복을 계속 수행
	 * 
	 */

	public void method4() {

		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

	// 1~10까지의 합 구하기
	public void method5() {
		int j = 0;
		for (int i = 1; i < 11; i++) {
			j += i;
		}
		System.out.println(j);

	}

	/*
	 * 1~ 사용자가 입력한 숫자까지의 합계를 구하
	 */
	public void method6() {

		int userNum = 0;
		int sum = 0;
		System.out.println("숫자를 입력하세요 > ");
		userNum = sc.nextInt();

		for (int i = 1; i <= userNum; i++) {
			sum += i;
		}

		System.out.println(sum);
	}

	/*
	 * 1부터 랜덤값까지의 합계
	 */
	public void method7() {

		double randomNum = Math.random() * 100 + 1;
		int sum = 0;

		for (int i = 1; i < randomNum; i++) {
			sum += i;
		}
		System.out.println(sum);

		/*
		 * java.lang.matf 클래스에서 random() 메소드를 허출해서 매번 다른 랜덤값을 얻어낼 수 있음! Math.random()
		 * int로 형변환, 곱하기 더하기 가능
		 * 
		 */

	}
	/*
	 * H E L L O 로 출력되게 만들기
	 */

	public void method8() {

		String s = "";
		System.out.println("문자를 입력해주세요 > ");
		s = sc.nextLine();

		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

	}

	public void method9() {

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
			System.out.println();

		}

	}

	/*
	 * 단수 입력 만약에 다른 단수 입력시 잘못 입력했습니다.
	 */
	public void method10() {

		int num = 0;
		System.out.println("단수를 입력해주세요 > ");
		num = sc.nextInt();

		if (num > 9 || num < 2) {
			System.out.println("잘못 입력하셨습니다.");
		}

		else {
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d x %d = %d\n", num, i, num * i);
			}
		}

	}

	public void method11() {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

	public void method12() {
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				if (j == i) {
					System.out.print(j);
				} else {
					System.out.print("*");
				}

			}
			System.out.print("\n");
		}
	}

	public void method13() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {

				System.out.print("*");

			}
			System.out.print("\n");
		}
	}

	public void method14() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i + 1; j++) {

				System.out.print(" ");

			}
			for (int j = 0; j < i + 1; j++) {

				System.out.print("*");

			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {

		C_for c = new C_for();
//		c.method1();
//		c.method2();
//		c.method3();
//		c.method4();
//		c.method5();
//		c.method6();
//		c.method7();
//		c.method7();
//		c.method8();
//		c.method9();
//		c.method10();
//		c.method11();
//		c.method12();
//		c.method13();
//		c.method14();

		/*
		 * for(초기식; 조건식; 증감식) { 실행코드 }
		 * 
		 * - 주어진 횟수 만큼 코드를 반복 실행하는 구문 - 초기식은 반복문이 수행될 때 단 한 번만 실행되는 구문으로 반복문 안에서 사용 하게 될
		 * 변수를 선언하고 초기값을 대입한다. - 조건식의 결과가 false면 실행코드를 수행하지 않고 반복문을 빠져나간다 - 증감식은 반복문을
		 * 제어하는 변수의 값을 증감시키는 구문으로 주로 초기식에 제시한 변수를 가지고 증감 연산자를 사용한다.
		 * 
		 */
//		c.baseball();
	}

	public void baseball() {
		int userNum1 = 0;
		int userNum2 = 0;
		int userNum3 = 0;
		double ranNum1 = 0;
		double ranNum2 = 0;
		double ranNum3 = 0;

		for (;;) {
			ranNum1 = Math.random() * 10;
			ranNum2 = Math.random() * 10;
			ranNum3 = Math.random() * 10;
			if (ranNum1 != 10 && ranNum2 != 10 && ranNum3 != 10) {
				break;
			}
		}

		int iRanNum1 = (int) ranNum1;
		int iRanNum2 = (int) ranNum2;
		int iRanNum3 = (int) ranNum3;

		for (int i = 0; i < 5; i++) {

			System.out.printf("현재 도전 회수는 %d회 기회가 %d번 남았습니다.", i, 5 - i);
			System.out.println("첫 번째 숫자를 입력해주세요 > ");
			userNum1 = sc.nextInt();
			System.out.println("두 번째 숫자를 입력해주세요 > ");
			userNum2 = sc.nextInt();
			System.out.println("세 번째 숫자를 입력해주세요 > ");
			userNum3 = sc.nextInt();

			if (userNum1 == iRanNum1 && userNum2 == iRanNum2 && userNum3 == iRanNum3) {
				System.out.println("정답입니다!");
				break;
			} else {
				if (userNum1 == iRanNum1) {
					System.out.println("S ");
				} else if (userNum1 == iRanNum2) {
					System.out.println("B ");
				} else if (userNum1 == iRanNum3) {
					System.out.println("B ");
				} else {
					System.out.println("O ");
				}
				if (userNum2 == iRanNum2) {
					System.out.println("S ");
				} else if (userNum2 == iRanNum1) {
					System.out.println("B ");
				} else if (userNum2 == iRanNum3) {
					System.out.println("B ");
				} else {
					System.out.println("O ");
				}
				if (userNum3 == iRanNum3) {
					System.out.println("S ");
				} else if (userNum3 == iRanNum1) {
					System.out.println("B ");
				} else if (userNum3 == iRanNum2) {
					System.out.println("B ");
				} else {
					System.out.println("O ");
				}

			}
		}

	}

}
