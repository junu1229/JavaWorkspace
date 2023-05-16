package com.kh.practice;
import java.util.Scanner;

public class CastingPractice {

	public static void main(String[] args) {
		CastingPractice c = new CastingPractice();
		c.method1();
//		c.method2();

	}
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 : ");
		String text = sc.next();
		char textchar = text.charAt(0);
		int unicode1 = textchar;
		int unicode2 = unicode1 + 1;
		System.out.println("A unicode : "+unicode1);
		System.out.println("B unicode : "+unicode2);
	}
//	public void method2() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("국어 점수를 입력해주세요 > ");
//		int koreanScore = sc.nextInt();
//		System.out.println("영어 점수를 입력해주세요 > ");
//		int englishScore = sc.nextInt();
//		System.out.println("수학 점수를 입력해주세요 > ");
//		int mathScore = sc.nextInt();
//		
//		int totalScore = koreanScore + englishScore + mathScore;
//		double averageScore = (float)totalScore/3;
//		
//		System.out.println("국어 : " + koreanScore);
//		System.out.println("영어 : " + englishScore);
//		System.out.println("수학 : " + mathScore);
//		System.out.println("총점 : " + totalScore);
//		System.out.printf("평균 : %.2f"  ,averageScore);
//		
//	}

}
