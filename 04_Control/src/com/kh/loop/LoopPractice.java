package com.kh.loop;

import java.util.Scanner;

class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		LoopPractice lp = new LoopPractice();
//		lp.method1();
//		lp.method2();
//		lp.method3();
//		lp.method4();
//		lp.method5();
		lp.method6();

	}

	/*
	 * 사용자로부터 숫자(1~100) 1개가 입력되었을 때 카운트다운 출력하시오. 사용자 입력 : 5 5 4 3 2 1
	 */
	public void method1() {

		int num = 0;
		System.out.println("숫자를 입력해주세요 > ");
		num = sc.nextInt();

		for (int i = num; i > 0; i--) {
			System.out.println(i);
		}

	}

	// 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상 되는지 출력하시오.
	public void method2() {
		int k = 0;
		int i = 1;
		for (; k < 100; i++) {
			if (i % 2 == 0) {
				k -= i;
			} else {
				k += i;
			}
		}
		System.out.println(i);

	}

	/*
	 * 사용자로부터 문자열을 입력 받고 문자열에서 검색될 문자를 입력 받아 해당 문자열에 그 문자가 몇 개 있는지 개수를 출력하세요.
	 * 
	 * 문자열 : banana 문자 : a banana 안에 포함된 a 개수 : 3
	 * 
	 */
	public void method3() {

		String input = "";
		char cha = '\u0000';
		int chaCount = 0;

		System.out.println("문자를 입력해주세요 > ");
		input = sc.nextLine();
		System.out.println("개수를 카운트 할 문자를 입력해주세요 > ");
		cha = sc.nextLine().charAt(0);
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == cha) {
				chaCount++;
			}
		}
		System.out.printf("%s 안에 포함된 %s 개수 : %d", input, cha, chaCount);

	}

	/*
	 * 0이 나올 때까지 숫자를 출력하시오. (random 사용!) 7 3 4 2 3 4 0
	 */
	public void method4() {

		double ranNum = 0;
		int iraNum = 0;

		while (iraNum != 0) {
			ranNum = Math.random() * 11;
			iraNum = (int) ranNum;
			System.out.println(iraNum);

		}

	}

	/*
	 * 주사위를 10번 굴렸을 때 각 눈의 수가 몇 번 나왔는지 출력하세요. (random 사용!)
	 * 
	 * 1 : 3 2 : 2 3 : 1 4 : 0 5 : 4 6 : 0
	 * 
	 */
	public void method5() {
		double ranNum = 0;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;
		int iranNum = 0;

		for (int i = 0; i < 10; i++) {
			ranNum = Math.random() * 6 + 1;
			iranNum = (int) ranNum;

			switch (iranNum) {
			case 1:
				num1++;
				break;
			case 2:
				num2++;
				break;
			case 3:
				num3++;
				break;
			case 4:
				num4++;
				break;
			case 5:
				num5++;
				break;
			case 6:
				num6++;
				break;
			}
		}
		System.out.printf("1: %d\n", num1);
		System.out.printf("2: %d\n", num2);
		System.out.printf("3: %d\n", num3);
		System.out.printf("4: %d\n", num4);
		System.out.printf("5: %d\n", num5);
		System.out.printf("6: %d", num6);

	}

	/*
	 * 사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 컴퓨터가 가위인지 보인지 주먹인지는 랜덤한 수를 통해서 결정하도록 하고,
	 * 사용자에게는 직접 가위바위보를 받으세요. 사용자가 이겼을 때 반복을 멈추고 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.
	 * 
	 * 
	 * 당신의 이름을 입력해주세요 : 가위바위보 : 가위 컴퓨터 : 가위 박신우 : 가위 비겼습니다.
	 * 
	 * 가위바위보 : 가위 컴퓨터 : 바위 박신우 : 가위 졌습니다 ㅠㅠ
	 * 
	 * 가위바위보 : 보 컴퓨터 : 바위 박신우 : 보 이겼습니다 !
	 */
	public void method6() {
		String name = "";
		String sCpu = "";
		double cpu = 0;
		int iCpu = 0;
		String user = "";
		int iUser = 0;
		int winCount = 0;
		int drawCount = 0;
		int loseCount = 0;

		System.out.println("이름을 입력해주세요 > ");
		name = sc.nextLine();

		while (winCount == 0) {
			cpu = Math.random() * 3;
			iCpu = (int) cpu;
			System.out.println("가위바위보를 입력해주세요 > ");
			user = sc.nextLine();
			switch (user) {
			case "가위":
				iUser = 0;
				break;
			case "바위":
				iUser = 1;
				break;
			case "보":
				iUser = 2;
				break;

			default:
				iUser = -1;
				System.out.println("잘못 입력하셨습니다. 몰수패입니다.");
				break;
			}
			switch (iCpu) {
			case 0:
				sCpu = "가위";
				break;
			case 1:
				sCpu = "바위";
				break;
			case 2:
				sCpu = "보";
				break;

			default:
				break;
			}
			if (iCpu == 2 && iUser == 0) {
				System.out.printf("컴퓨터 : %s\n %s : %s\n 이겼습니다!\n.", sCpu, name, user);
				winCount++;

			} else if (iCpu == iUser) {
				System.out.printf("컴퓨터 : %s\n %s : %s\n 비겼습니다.", sCpu, name, user);
				drawCount++;
			} else if (iCpu < iUser) {
				System.out.printf("컴퓨터 : %s\n%s : %s\n이겼습니다!\n", sCpu, name, user);
				winCount++;
			} else {
				System.out.printf("컴퓨터 : %s\n%s : %s\n졌습니다 ㅠㅠ", sCpu, name, user);
				loseCount++;

			}

		}
		System.out.printf("%d번 이겼습니다.\n%d번 비겼습니다.\n%d번 졌습니다.", winCount, drawCount, loseCount);
	}
}