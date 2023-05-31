package com.kh.practice;

import java.util.Scanner;

import com.kh.practice.controller.LibraryController;

public class Application {
	Scanner sc = new Scanner(System.in);
	LibraryController lc = new LibraryController();

	public static void main(String[] args) {

		Application app = new Application();
		app.mainMenu();

	}

	public void mainMenu() {

		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		lc.insultMember(name, age);
		boolean check = true;
		while (check) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 검색하기");
			System.out.println("3. 도서 대여하기");
			System.out.println("4. 프로그램 종료하기");
			System.out.println("메뉴 번호 : ");
			int select = Integer.parseInt(sc.nextLine());
			switch (select) {
			case 1:
				System.out.println(lc.myInfo());
				break;
			case 2:
				searchBook();
				break;
			case 3:

				rentBook();
				break;
			case 4:
				check = false;
				break;

			default:
				System.out.println("잘못 입력하셨습니다. ");
				break;
			}
		}

	}

	// 검색할 책 (LibraryController 의 searchBook 메서드 이용 )
	public void searchBook() {

		System.out.println("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		System.out.println(lc.searchBook(keyword));

	}

	// 빌릴 책 관련 (librarycontroller의 rentBook 메서드 이용)
	public void rentBook() {
		for (int i = 0; i < lc.viewBooks().length; i++) {
			System.out.println(i + "번 도서 : " + lc.viewBooks()[i]);
		}
		System.out.println("대여할 도서 번호 선택 : ");
		int select = sc.nextInt();
		if (lc.rentBook(select) == true) {
			System.out.println("성공적으로 대여 되었습니다.");
		} else {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		}
		sc.nextLine();

	}

}
