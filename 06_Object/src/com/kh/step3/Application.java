package com.kh.step3;

import java.util.Arrays;
import java.util.Scanner;

import com.kh.step3.model.Calculator;

public class Application {

	public static void main(String[] args) {
		/*
		 * 변수 호춟 방법
		 * - 참조변수.변수이름;
		 * 
		 * 메서드 호출방법
		 * - 참조변수.메서드이름();
		 * - 참조변수.메서드이름(값1, 값2, ...)
		 */
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int max;
		int min;
		int sum;
		int substract;
		int multi;
		double[] divide;
		int factorial;

		Calculator c = new Calculator();
		System.out.println("첫번째 숫자를 입력해주세요 > ");
		a = sc.nextInt();
		System.out.println("두번째 숫자를 입력해주세요 > ");
		b = sc.nextInt();
		min = c.min(a, b);
		max = c.max(a, b);
		sum = Calculator.sum(a, b);
		substract = Calculator.substract(a, b);
		multi = Calculator.multiple(a, b);
		divide = Calculator.divide((double)a, (double)b);
		factorial = c.factorial(a);
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
		System.out.println(substract);
		System.out.println(multi);
		System.out.println(Arrays.toString(divide));
		System.out.println(factorial);
		
		

	}

}
