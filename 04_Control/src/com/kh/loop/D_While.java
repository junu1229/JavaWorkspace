package com.kh.loop;

import java.util.Scanner;

public class D_While {

	Scanner sc = new Scanner(System.in);

	public void method1() {
		int i = 0;

		while (i < 5) {
			System.out.println(i);
			i++;
		}

	}

	public void method2() {

	}

	public void method3() {
		int input = 0;
		while (true) {
			System.out.println("숫자 입력 >");
			input = sc.nextInt();
			System.out.println(input);
		}
	}

	public void method4() {
		int num = 1;
		while (num == 0) {
			System.out.println("while");
		}
		do {
			System.out.println("while");

		} while (num == 0);
	}

	// 반복문 + 조건문
	/*
	 * 숫자 맞히기 게임! 1과 100사이의 값을 입력해서 임의로 지정한(Random) 값을 맞히기 몇번만에 숫자를 맞혔는지 출
	 */

	public void method5() {

		double ranNum = Math.random() * 100;
		int iRanNum = (int) ranNum;
		int userNum = 0;
		int i = 1;

		while (true) {

			System.out.println("숫자를 입력해주세요 > ");
			userNum = sc.nextInt();
			if (userNum == iRanNum) {
				System.out.printf("당신은 %d번 만에 맞혔습니다. ", i);
				break;
			} else {
				System.out.println("틀렸습니다.");
				i++;

			}

		}

	}

	/*
	 * 1. 예금 예금액을 출력 2. 출금 출금액을 출력 3. 잔고 잔고를 출력 4. 종료 종료
	 */
	public void method6() {
		int menu = 0;
		int balance = 0;
		boolean quit = true;

		while (quit) {
			System.out.println("메뉴를 선택해주세요 > ");
			System.out.println("1. 예금");
			System.out.println("2. 출금");
			System.out.println("3. 잔고");
			System.out.println("4. 종료");
			menu = sc.nextInt();

			// integer.parseint : int 클래스의 parseint 메소드
			// string -> int
			switch (menu) {
			case 1:
				System.out.println("예금할 금액을 입력해주세요 > ");

				balance += Integer.parseInt(sc.nextLine());
				break;
			case 2:
				System.out.println("예금할 금액을 입력해주세요 > ");
				balance -= Integer.parseInt(sc.nextLine());
				break;
			case 3:
				System.out.println(" 계좌의 잔액은 " + balance + "원 입니다.");
				break;
			case 4:
				System.out.println("실행을 종료합니다.");
				quit = false;
				break;

			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}

	}

	public static void main(String[] args) {
		D_While d = new D_While();
//		d.method1();
//		d.method2();
//		d.method3();
//		d.method4();
//		d.method5();
		d.method6();
		/*
		 * 
		 * while(조건식) {
		 * 
		 * }
		 */

		/*
		 * break문 - switch, 반복문의 실행을 중지하고 빠져나간다 - 반복문이 중첩되는 경우 break문이 포함되어있는 반복문에서만
		 * 빠져나간다.
		 */
		/*
		 * do-while 문
		 * 
		 * [표현법]
		 * 
		 * do {
		 * 
		 * }while(조건식);
		 * 
		 * - 조건과 상관없이 무조건 한번은 실
		 */

	}

}
