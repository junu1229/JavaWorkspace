package com.kh.overriding.model;

public class VipCustomer extends Customer{
	
	private double saleRatio;

	public VipCustomer() {
		// TODO Auto-generated constructor stub
	}

	public VipCustomer(String name) {
		this.grade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		this.name = name;
	}

	@Override
	public String toString() {
		return super.toString() + "VipCustomer [saleRatio=" + saleRatio + "]";
	}
	/*
	 * 오버라이딩 ( overriding ) 
	 * : 자식 클래스가 상속받은 부모 클래스의 메소드를 재정의하는 것
	 * 
	 * 오버라이딩 조건
	 * - 부모 클래스의 메소드명, 매개변수, 리턴타입 모두 동일
	 * - 접근 제어자를 좁은 범위로 변경할 수 없다.
	 *  -> 부모 클래스 메서드가 protected 라면 , 범위가 같거나 넓은 protected나 public으로만 변경 가능
	 *  
	 * @override 애노테이션
	 *  
	 * - 명시를 안해줘도 오버라이딩 가능
	 * - 애노테이션을 붙이는 이유 
	 *  - 해당 메소드가 오버라이딩 된 메소드라는 것을 컴파일러에게 알려주는 역활
	 *  - 자식 메소드에서 재정의를 잘못하고 있는 경우 컴파일 에러 표시
	 *  
	 */
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		price = (int)(price*(1-saleRatio));
		return price;
	}

}
