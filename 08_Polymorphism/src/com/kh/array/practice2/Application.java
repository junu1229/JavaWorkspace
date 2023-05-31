package com.kh.array.practice2;

import java.util.Scanner;

import com.kh.array.practice2.controller.MemberController;
import com.kh.array.practice2.model.Member;

public class Application {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	private Member m = new Member();
	static boolean power = true;

	public static void main(String[] args) {

		Application a = new Application();

		while (power) {
			a.mainMenu();
		}

	}

	public void mainMenu() {
		if (mc.getCount() < 3) {
			System.out.println("최대 등록 가능한 회원 수는 " + (3 - mc.getCount()) + "명입니다.");
			System.out.println("현재 등록된 회원 수는 " + mc.getCount() + "명입니다.");
			System.out.println("메뉴를 입력해주세요 > ");
			System.out.println("1. 새 회원 등록");
			System.out.println("2. 회원 정보 수정");
			System.out.println("3. 전체 회원 정보 출력");
			System.out.println("4. 회원 삭제");
			System.out.println("9. 끝내기");
			switch (sc.nextInt()) {
			case 1:
				insertMember();
				break;
			case 2:
				updateMember();
				break;
			case 3:
				printAll();
				break;
			case 4:
				deleteAccount();
				break;
			case 9:
				power = false;
				break;

			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}

		} else {
			System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			System.out.println("메뉴를 입력해주세요 > ");
			System.out.println("2. 회원 정보 수정");
			System.out.println("3. 전체 회원 정보 출력");
			System.out.println("4. 회원 삭제");
			System.out.println("9. 끝내기");
			switch (sc.nextInt()) {
			case 2:
				updateMember();
				break;
			case 3:
				printAll();
				break;
			case 4:
				deleteAccount();
				break;
			case 9:
				power = false;
				break;

			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}

		}

	}

	public void insertMember() {

		sc.nextLine();
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		if (mc.checkId(id) != -1) {
			System.out.println("중복된 아이디입니다.");
			insertMember();
		} else {

			m.setId(id);
			System.out.println("이름 : ");
			m.setName(sc.nextLine());
			System.out.println("비밀번호 : ");
			m.setPassword(sc.nextLine());
			System.out.println("이메일 : ");
			m.setEmail(sc.nextLine());
			System.out.println("성별(M/F) : ");
			m.setGender(sc.nextLine().charAt(0));
			System.out.println("나이 : ");
			m.setAge(sc.nextInt());
			mc.insertMember(m);
		}

	}

	public void updateMember() {
		sc.nextLine();
		System.out.println("수정할 회원의 아이디 : ");
		int check = mc.checkId(sc.nextLine());
		if (check != -1) {
			System.out.println("수정할 회원의 아이디 : ");
			String id = (sc.nextLine());
			System.out.println("수정할 이름 : ");
			String name = (sc.nextLine());
			System.out.println("수정할 이메일 : ");
			String email = sc.nextLine();
			System.out.println("수정할 비밀번호 : ");
			String password = sc.nextLine();
			mc.updateMember(id, name, password, email, check);

		} else {

			System.out.println("회원 정보가 없습니다.");

		}

	}

	public void printAll() {
		for (int i = 0; i < mc.printAll().length; i++) {
			if (mc.printAll()[i] != null) {
				System.out.println(mc.printAll()[i]);
			}
		}

	}
	public void deleteAccount() {
		sc.nextLine();
		System.out.println("삭제할 아이디 : ");
		int check = mc.checkId(sc.nextLine());
		if (check != -1) {
			mc.deleteCount(check);
			
		}
		
	}

}
