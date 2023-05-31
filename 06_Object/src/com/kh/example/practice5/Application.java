package com.kh.example.practice5;

import java.util.Scanner;

import com.kh.example.practice5.controller.EmployeeController;

public class Application {
	EmployeeController employeeController = new EmployeeController();

	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean programPower = true;

		Application application = new Application();
		
		while(programPower) {
			
			switch (application.employeeMenu()) {
			case 1:
				application.insertEmp();
				break;
			case 2:
				application.updateEmp();
				break;
			case 3:
				application.printEmp();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				programPower = false;
				break;

			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
		
		
		
		
	}
	
	public int employeeMenu() {
		
		System.out.println("1. 사원 정보 추가");
		System.out.println("2. 사원 정보 수정");
		System.out.println("3. 사원 정보 출력");
		System.out.println("9. 프로그램 종료");
		System.out.println("메뉴 번호를 누르세요 : ");
		
		return sc.nextInt();
		
	}
	
	public void insertEmp() {
//		private int empNo;
//		private String name;
//		private char gender;
//		private String phone;
//		private String dept;
//		private int salary;
//		private double bon
		sc.nextLine();
		char more;
		System.out.println("사원 번호");
		int empNo = Integer.parseInt(sc.nextLine());
		System.out.println("사원 이름");
		String name = sc.nextLine();
		System.out.println("사원 성별");
		char gender = sc.nextLine().charAt(0);
		System.out.println("전화 번호");
		String phone = sc.nextLine();
		System.out.println("추가 정보를 더 입력하시겠습니까?");
		more = sc.nextLine().charAt(0);
		if (more == 'y') {
			System.out.println("사원 부서");
			String dept = sc.nextLine();
			System.out.println("사원 연봉");
			int salary = Integer.parseInt(sc.nextLine());
			System.out.println("보너스 율");
			double bonus = Double.parseDouble(sc.nextLine());
			
			employeeController.add(empNo, name, gender, phone, dept, salary, bonus);
			
		}
		else if (more == 'n') {
			employeeController.add(empNo, name, gender, phone);;
			
		}
		
		else {
			System.out.println("잘못 입력하셨습니다. 뒤로갑니다.");
		}
		
		
		
	}
	
	public void updateEmp() {
		sc.nextLine();
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 전화 번호");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스 율");
		System.out.println("9. 돌아가기");
		switch (sc.nextInt()) {
		case 1:
			sc.nextLine();
			System.out.println("수정할 전화번호를 입력해주세요");
			employeeController.modify(sc.nextLine());
			break;
		case 2:
			sc.nextLine();
			System.out.println("수정할 사원연봉을 입력해주세요");
			employeeController.modify(Integer.parseInt(sc.nextLine()));
			break;
		case 3:
			sc.nextLine();
			System.out.println("수정할 보너스율을 입력해주세요");
			employeeController.modify(Double.parseDouble(sc.nextLine()));
			break;
		case 9:
			System.out.println("뒤로 갑니다");
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 뒤로갑니다");
			break;
		}
		
	}
	
	public void printEmp() {
		sc.nextLine();
		System.out.println(employeeController.info());
	}
	

}
