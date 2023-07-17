package com.kh.practice1;

import java.util.Scanner;
import com.kh.practice1.controller.MusicController;
import com.kh.practice1.model.Music;

public class Application {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();

	public static void main(String[] args) {

		Application a = new Application();
		a.mainMenu();

	}

	public void mainMenu() {
		try {
			boolean power = true;
			while (power) {

				System.out.println("==== 메인 메뉴 ====");
				System.out.println("1. 마지막 위치에 곡 추가");
				System.out.println("2. 첫 위치에 곡 추가");
				System.out.println("3. 전체 곡 목록 출력");
				System.out.println("4. 특정 곡 검색");
				System.out.println("5. 특정 곡 삭제");
				System.out.println("6. 특정 곡 정보 수정");
				System.out.println("7. 곡명 오름차순 정렬");
				System.out.println("8. 가수명 내림차순 정렬");
				System.out.println("9. 종료");
				System.out.println("메뉴 번호 입력 : >> ");

				switch (sc.nextInt()) {
				case 1:
					addlist();
					break;
				case 2:
					addAtZero();
					break;
				case 3:
					printAll();
					break;
				case 4:
					searchMusic();
					break;
				case 5:
					removeMusic();
					break;
				case 6:
					setMusic();
					break;
				case 7:
					ascTitle();
					break;
				case 8:
					desArtist();
					break;
				case 9:
					power = false;
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
				}

			}

		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다 : " + e.getMessage());

			mainMenu();
		}
	}

	public void addlist() {
		sc.nextLine();
		System.out.println("곡 명을 입력해주세요");
		String name = sc.nextLine();
		System.out.println("가수 명을 입력해주세요");
		String artist = sc.nextLine();
		Music m = new Music(name, artist);

		System.out.println(mc.addList(m) == true ? "추가 성공" : "추가 실패");

	}

	public void addAtZero() {
		sc.nextLine();
		System.out.println("곡 명을 입력해주세요");
		String name = sc.nextLine();
		System.out.println("가수 명을 입력해주세요");
		String artist = sc.nextLine();
		Music m = new Music(name, artist);

		System.out.println(mc.addAtZero(m) == true ? "추가 성공" : "추가 실패");

	}

	public void printAll() {
		System.out.println("****** 전체곡 목록 출력 ******");
		for (Music m : mc.printAll()) {

			System.out.println(m);
		}

	}

	public void searchMusic() {
		sc.nextLine();
		System.out.println("곡 명을 입력해주세요");
		String name = sc.nextLine();
		if (mc.searchMusic(name).equals(null)) {
			System.out.println("검색한 곡이 없습니다.");
		} else {
			System.out.println(mc.searchMusic(name) + " 을 검색 했습니다.");
		}

	}

	public void removeMusic() {
		sc.nextLine();
		System.out.println("곡 명을 입력해주세요");
		String name = sc.nextLine();
		if (mc.removeMusic(name).equals(null)) {
			System.out.println("삭제할 곡이 없습니다.");
		} else {
			System.out.println(mc.removeMusic(name) + "을 삭제 했습니다.");
		}

	}

	public void setMusic() {
		sc.nextLine();
		System.out.println("곡 명을 입력해주세요");
		String name = sc.nextLine();
		System.out.println("수정할 곡 명을 입력해주세요");
		String setname = sc.nextLine();
		System.out.println("수정할 가수 명을 입력해주세요");
		String setartist = sc.nextLine();
		Music music = new Music(setname, setartist);
		Music result = mc.setMusic(name, music);
		if (result.equals(null)) {
			System.out.println("수정할 곡이 없습니다.");
		} else {
			System.out.println(result + "의 값이 변경 되었습니다.");
		}

	}

	public void ascTitle() {
		for (Music music : mc.ascTitle()) {
			System.out.println(music);
		}

	}

	public void desArtist() {
		for (Music music : mc.descArtist()) {
			System.out.println(music);
		}

	}
	

}
