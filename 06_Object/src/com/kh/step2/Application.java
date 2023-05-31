package com.kh.step2;

import com.kh.step2.model.Card;

public class Application {

	public static void main(String[] args) {

		/*
		 * 
		 * * 변수의 종류
		 * 1. 지역변수 (local variable)
		 * 		- 메소드 내에 선언되며, 메소드의 종료와 함께 소멸
		 * 		- 조건문, 반복문의 블럭 {} 내에 선언된 지역변수는 블럭을 벗어나면 소멸
		 * 
		 * 2. 인스턴스 변수 (instance variable)
		 * 		- 각 인스턴스의 개별적인 저장공간
		 * 		- 인스턴스 생성 후, '참조변수.인스턴스변수명;
		 * 
		 * 3. 클래스 변수 ( class variable )
		 * 		- 같은 클래스의 모든 인스턴스 들이 공유하는 변수
		 * 		- 인스턴스 생성 없이 '클래스이름.클래스변수명'으로 접근
		 * 		- 클래스가 메모리에 올라갈 때 생성되고, 프로그램이 종료될 때 소멸 
		 */
		// 클래스 변수는 인스턴스 생성 없이 호출 가능! 
		System.out.println(Card.width);
		Card c1 = new Card();
		c1.kind = "heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 3;
		// 클래스 변수는 모든 인스턴스가 하나의 저장공간을 공유하므로 항상 공통된 값을 갖는다.
		System.out.println("첫번째 카드는 "+ c2.kind+c2.number+"입니다."+c2.height +"X" +c2.width);
		System.out.println("첫번째 카드는 "+ c1.kind+c1.number+"입니다."+c1.height +"X" +c1.width);
		
	}

}
