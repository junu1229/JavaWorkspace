package com.kh.step4;


public class Car {
	
	private String color;
	private String geartype;
	private int door;
	/*
	 * 
	 * 기본 생성자(default constructor)
	 * - 매개변수가 없는 생성자
	 * - 클래스에 생성자가 하나도 없으면 컴파일러가 기본 생성자를 추가
	 * - 생성자가 하나라도 있으면 컴파일러는 기본 생성자를 추가하지 않음
	 */
	public Car() {
		
	}
	
	public Car(String color, String geartype, int door) {
		/*
		 * this : 인스턴스 자신을 가르키는 참조변수
		 * 			인스턴스의 주소가 저장되어있음
		 * 			모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재
		 */
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		/*
		 * 위와 같이 중복되는 동일한 초기화하는 내용의 생성자가 이미 있는 경우 this() 사용가능
		 */
		
	}
	
	public Car(String color, String geartype) {
		this.color = color;
		this.geartype = geartype;
	}
	
	public String toString() {
		return " 색상 : " + color + ", 변속기 : " + geartype + ", 문의 개수 : " + door;
	}
	/*
	 * 오버로딩 : 한 클래스 내에 동일한 이름의 메소드를 매개변수의 자료형과 갯수, 순서가 다르게 작성되어야 함
	 * 
	 * 
	 */
	void test() {}
//	void test() {} 똑같은건 안됨
	void test(int a) {}
	void test(int a, String b) {}
	void test(String b, int a) {}
	/*
	 * 매개변수의 자료형의 객수와 순서가 다르게 작성되어야 함
	 */
	

}
