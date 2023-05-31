package com.kh.practice.controller;

import com.kh.practice.model.AniBook;
import com.kh.practice.model.Book;
import com.kh.practice.model.CookBook;
import com.kh.practice.model.Member;

public class LibraryController {

	private Member member = null;
	private Book[] bookList = new Book[4];

	{
		bookList[0] = new CookBook("김대석 셰프의 집밥 레시피", true);
		bookList[1] = new CookBook("에브리데이 베이글", false);
		bookList[2] = new AniBook("원피스 105", 19);
		bookList[3] = new AniBook("최애의 아이", 15);

	}

	// 멤버 생성자 이용해서 멤버 정보 추가
	public void insultMember(String name, int age) {
		member = new Member(name, age);

	}

	public Member myInfo() {
		return member;
	}

	// 매개 변수로 받은 키워드가 포함된 제목을 가진 책 1권 반환
	public Book searchBook(String keyword) {
		Book reBook = null;
		for (int i = 0; i < bookList.length; i++) {
			if (bookList[i].getTitle().contains(keyword)) {

				reBook = bookList[i];

			}
		}
		return reBook;
	}

	public Book[] viewBooks() {
		return bookList;
	}

	/*
	 * 대여할 책의 인덱스를 매개변수로 받아서 조건에 따라 처리 - 만화책 인 경우 나이제한 - 요리책인 경우 쿠폰이 있을 때 없을 때
	 */
	public boolean rentBook(int index) {
		boolean result = false;
		if (bookList[index] instanceof AniBook) {
			if (member.getAge() > ((AniBook) bookList[index]).getAccessAge()) {
				member.setBook(bookList[index]);
				result = true;
			}

		} else if (bookList[index] instanceof CookBook) {
			if (((CookBook) bookList[index]).isCoupon() == true) {
				member.setBook(bookList[index]);
				member.setCookCoupon(member.getCookCoupon() + 1);
			} else {
				member.setBook(bookList[index]);

			}
			result = true;

		} else {
			System.out.println("잘못 입력하셨습니다. ");

		}

		return result;
	}

}
