package com.kh.overriding;

import com.kh.overriding.model.Customer;
import com.kh.overriding.model.VipCustomer;

public class Application {

	public static void main(String[] args) {

		Customer customer1 = new Customer("홍수민");
		Customer customer2 = new Customer("신수민");
		System.out.println(customer1);
		System.out.println(customer2);
		System.out.println(customer1.equals(customer2));
		
		VipCustomer customer3 = new VipCustomer("최승환");
		VipCustomer customer4 = new VipCustomer("최승환");
		System.out.println(customer3);
		System.out.println(customer4);
		System.out.println(customer3.equals(customer4));
		System.out.println(customer1.calcPrice(30000));
		System.out.println(customer3.calcPrice(30000));
		System.out.printf("%s 고객님의 등급은 %s 등급이고 물건의 가격은 %d 원 이며 포인트는 %d 원 입니다.", customer1.getName(), customer1.getGrade(), customer1.calcPrice(30000), customer1.getBonusPoint());
		System.out.printf("%s 고객님의 등급은 %s 등급이고 물건의 가격은 %d 원 이며 포인트는 %d 원 입니다.", customer3.getName(), customer3.getGrade(), customer3.calcPrice(30000), customer3.getBonusPoint());

	}

}
