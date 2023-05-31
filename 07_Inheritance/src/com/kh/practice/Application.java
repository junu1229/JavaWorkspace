package com.kh.practice;

import java.util.Scanner;

import com.kh.practice.controller.CircleController;
import com.kh.practice.controller.RectangleController;

public class Application {

	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	static boolean power = true;

	public static void main(String[] args) {
		Application a = new Application();

		while (power) {
			a.mainMenu();
		}

	}

	public void mainMenu() {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 원");
		System.out.println("2. 사각형");
		System.out.println("9. 끝내기");
		switch (sc.nextInt()) {
		case 1:
			circleMenu();
			break;
		case 2:
			rectangleMenu();
			break;
		case 9:
			System.out.println("종료합니다.");
			power = false;
			break;

		default:
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("다시 입력해주세요.");
			break;
		}

	}

	public void circleMenu() {
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		switch (sc.nextInt()) {
		case 1:
			calcCircum();
			break;
		case 2:
			calcCircleArea();
			break;
		case 9:
			System.out.println("메인 메뉴로 돌아갑니다.");
			break;

		default:
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("메인 메뉴로 돌아갑니다.");
			break;
		}

	}

	public void rectangleMenu() {
		System.out.println("===== 사각형 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		switch (sc.nextInt()) {
		case 1:
			calcPerimeter();
			break;
		case 2:
			calcRectArea();
			break;
		case 9:
			System.out.println("메인 메뉴로 돌아갑니다.");
			break;

		default:
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("메인 메뉴로 돌아갑니다.");
			break;
		}

	}

	public void calcCircum() {
		int x;
		int y;
		int radius;
		System.out.println("x 좌표 : ");
		x = sc.nextInt();
		System.out.println("y 좌표 : ");
		y = sc.nextInt();
		System.out.println("반지름 : ");
		radius = sc.nextInt();

		System.out.println(cc.calcCircum(x, y, radius));

	}

	public void calcCircleArea() {
		int x;
		int y;
		int radius;
		System.out.println("x 좌표 : ");
		x = sc.nextInt();
		System.out.println("y 좌표 : ");
		y = sc.nextInt();
		System.out.println("반지름 : ");
		radius = sc.nextInt();

		System.out.println(cc.calcArea(x, y, radius));

	}

	public void calcPerimeter() {
		int x;
		int y;
		int height;
		int width;
		System.out.println("x 좌표 : ");
		x = sc.nextInt();
		System.out.println("y 좌표 : ");
		y = sc.nextInt();
		System.out.println("높이 : ");
		height = sc.nextInt();
		System.out.println("너비 : ");
		width = sc.nextInt();

		System.out.println(rc.calcPerimeter(x, y, height, width));

	}

	public void calcRectArea() {
		int x;
		int y;
		int height;
		int width;
		System.out.println("x 좌표 : ");
		x = sc.nextInt();
		System.out.println("y 좌표 : ");
		y = sc.nextInt();
		System.out.println("높이 : ");
		height = sc.nextInt();
		System.out.println("너비 : ");
		width = sc.nextInt();

		System.out.println(rc.calcArea(x, y, height, width));

	}

}
