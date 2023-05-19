package com.kh.practice;
import java.util.Scanner;

public class CastingPractice {

	public static void main(String[] args) {
		CastingPractice c = new CastingPractice();
//		c.method1();
//		c.method2();
//		c.method1_1();
		c.method1_2();

	}
//	public void method1() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("문자 : ");
//		String text = sc.next();
//		char textchar = text.charAt(0);
//		int unicode1 = textchar;
//		int unicode2 = unicode1 + 1; // 앗! 이런 기발한 방법을 쓰셨네요! 이 부분 형변환을 사용해서 해보실래요?
//		System.out.println("A unicode : "+unicode1);
//		System.out.println("B unicode : "+unicode2);
//	}
//	
//	// Good! 잘하셨습니다!!
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
	
	public void method1_1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 문자 : ");
		String textA = sc.next();
		char textCharA = textA.charAt(0);
		System.out.println("두번째 문자 : ");
		String textB = sc.next();
		char textCharB = textB.charAt(0);
		int numA = (int)textCharA;
		int numB = (int)textCharB;
		
		System.out.println("A unicode : " + numA);
		System.out.println("B unicode : " + numB);
		
	}
	public void method1_2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 : ");
		String text = sc.next();
		char textCharA = text.charAt(0);
		
		int num1 = (int)textCharA;
		char textCharB = (char)(num1+1);
		int num2 = (int)textCharB;
		
		System.out.println("A unicode : "+textCharA);
		System.out.println("B unicode : "+textCharB);
	}
	
}
