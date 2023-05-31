package com.kh.example.practice1;

import java.util.Scanner;

import com.kh.example.practice1.model.Member;

public class Run {
	

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		Member member = new Member();
		System.out.println("이름을 입력해주세요 > ");
		
		member.changeName(sc.nextLine());
		member.printName();
		
	}

}