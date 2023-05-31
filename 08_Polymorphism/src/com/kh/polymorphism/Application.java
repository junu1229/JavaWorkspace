package com.kh.polymorphism;

import com.kh.polymorphism.controller.EmployeeController;
import com.kh.polymorphism.model.child.Engineer;
import com.kh.polymorphism.model.child.Manager;
import com.kh.polymorphism.model.child.Secretary;
import com.kh.polymorphism.model.parent.Employee;

public class Application {

	public static void main(String[] args) {

		/*
		 * 다형성(polymorphism) - 하나의 객체 변수가 여러가지 모양괴 모습을 가지는 능력 - 부모 타입으로 자식객체를 생성하는 것
		 */

		Employee e1 = new Employee("이수근", 12000);
		Manager m1 = new Manager("강호동", 23000, "체육부");
		Engineer eg1 = new Engineer("김영철", 56000, "Java", 200);
		Secretary s1 = new Secretary("서장훈", 34000, "강호동");


		// 다형성 방식으로 객체 생성
		Employee e2 = new Manager("강호동", 23000, "체육부");
		Employee e3 = new Manager("강호동", 23000, "체육부");
		Employee e4 = new Engineer("김영철", 56000, "Java", 200);
		Employee e5 = new Secretary("서장훈", 34000, "강호동");
		

		// 디형성 + 객체 배열

		Employee[] empArr = { e1, e3, e4, e5 };


		EmployeeController ec = new EmployeeController();

		Employee find = ec.findEmployeeByName(empArr, "김영철");
		System.out.println(find);
		System.out.println(find.getName() + "의 연봉 : " + ec.getAnnualSalary(find));

		// 전체 사람들의 연봉 총합은?

		System.out.println("연봉 총 합계 : " + ec.getTotalcoast(empArr));

	}

}
