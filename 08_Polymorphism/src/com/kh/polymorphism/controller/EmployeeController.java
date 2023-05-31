package com.kh.polymorphism.controller;

import com.kh.polymorphism.model.child.Engineer;
import com.kh.polymorphism.model.parent.Employee;

public class EmployeeController {

	// Employee 객체배열과 이름을 반환
	public Employee findEmployeeByName(Employee[] ea, String name) {
		Employee temp = ea[1];
		for (int i = 0; i < ea.length; i++) {
			if (ea[i] != null && name.equals(ea[i].getName())) {
				temp = ea[i];
			}
		}
		return temp;
	}

	// 연봉 계산 : engineer인 경우 보너스가 있음!
	public int getAnnualSalary(Employee e) {

		int salary = 0;
		// instance 연산자 : 현재 참조변수가 실제로 어떤 클래스 형의 객체의 주소를 참조하고 있는지 확인할 때 사용
		if (e instanceof Engineer) {
			salary = e.getSalary() * 12 + ((Engineer) e).getBonus(); // 부모 -> 자식 : 강제 형 변환!
		} else {

			salary = e.getSalary() * 12;
		}

		return salary;
	}

	// 전체 연봉 총 합계
	public int getTotalcoast(Employee[] ea) {
		int totalCoast = 0;
		for (int i = 0; i < ea.length; i++) {
			totalCoast += getAnnualSalary(ea[i]);
		}

		return totalCoast;
	}

}
