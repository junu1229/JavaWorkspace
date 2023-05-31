package com.kh.step4;

public class Application {

	public static void main(String[] args) {
		
		
		Car c1 = new Car("white", "auto", 4);
		Car c2 = new Car("black", "manual");
		
		System.out.println(c1);
		System.out.println(c2);

		/*
		 * 
		 * 접근제어자 (access modifier)
		 * 
		 * - private : 같은 클래스 내에서만 접근이 가능
		 * - default : 같은 패키지 내에서만 접근이 가능
		 * - protected : 같은 패키지 내에서, 그리고 다른 패키지의 자손 클래스에서 접근이 가능
		 * - public : 접근 제헌이 없음
		 * 
		 * 접근제어자를 사용하는 이유
		 * - 외부로부터 데이터를 보호하기 위해
		 * - 외부에는 불 필요한 , 내부적으로만 사용되는, 부분을 감추기 위해
		 * 
		 */
		
		/*
		 * 생성자
		 * - 인스턴스가 생성될 때마다 호출되는 ' 인스턴스 초기화 메서드'
		 * 
		 * - 인스턴스 변수의 초기화 또는 인스턴스 생성 시 수행할 작업에 사용
		 * 
		 * [표현법]
		 * 
		 * 클래스명(타입 변수명, 타입 변수명,,,)
		 *  //인스턴스 생성시 수행될 코드
		 *  // 주로 인스턴스 변수의 초기화 코드 작성 
		 *  - 반드시 생성자 명은 클래스명과 동일 (대/소문자 구별)
		 *  - 반환형이 존재하지 않음 --> 만약 반환형을 사용하면 일반 메소드로 인식 
		 */
	}

}
