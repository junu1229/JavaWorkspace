package com.kh.example.practice2.run;

import java.util.Scanner;

import com.kh.example.practice2.model.Circle;

public class Run {

	public static void main(String[] args) {
		double r = 0;
		double pi = 3.14;
		Circle circle = new Circle();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반지름을 입력해주세요 > ");
		r = sc.nextDouble();
		System.out.println("원의 둘레는 : "+ r*2*pi);
		System.out.println("원의 넓이는 : "+ r*r*pi);
		System.out.println("반지름 1 증가");
		circle.incrementRadius(r);

	}

}
