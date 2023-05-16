package com.kh.variable;

public class C_Printf {
	
	public static void main(String[] args) {
		
		//system.out.print(출력하고자하는값); - 출력만함 (줄바꿈 없음) \n 줄바
		//system.out.println출력하고자하는값); 줄 바꿔줌 
		
		System.out.print("hello\n");
		System.out.println("hello");
		
		// sysyem.out.printf("출력하고자하는형식(포맷)", 출력하고자하는값, 값,,,,);
		// 출력하고자 하는 값들이 제시한 형식에 맞춰서 출력만 진행 (줄바꿈이 자동으로 안됨)
		
		/*
		 * 포맷으로 쓰이는 키워드
		 * %d : 정수 
		 * %f : 실수 
		 * %c : 문
		 * %s : 문자열(문자도 가능)
		 */
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		System.out.print(iNum1+"%\n");
		System.out.print(iNum2+"%\n");
		System.out.printf("%d%%, %d%%", iNum1, iNum2);
		System.out.println("___________________");
		// 5칸의 공간을 확보하고 오른쪽 정렬 (음수면 왼쪽)
		System.out.printf("%5d\n", iNum1); 
		System.out.printf("%-5d\n", iNum1); 
		System.out.println("_______________");
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		// \t 탭
		// 무조건 소수점 6째자리까지 보여
		System.out.printf("%f\t %f\n ", dNum1,dNum2);
		// f 앞에 .x 를 넣으면 소수점 몇번째 자리까지 표현하는게 가능
		System.out.printf("%.3f\t %.2f\n", dNum1, dNum2);
		
		System.out.println("__________________-----______");
		
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s %c\n", ch, str, ch);
		
		// A HELLO A
		System.out.printf("%C %S %C", ch, str, ch);
		
	}

}
