package com.kh.array.practice1;

import java.util.Arrays;

import com.kh.array.practice1.model.Student;

public class Application {

	public static void main(String[] args) {

		// 객체 배열
		Student[] stuarr = new Student[5];
		
		stuarr[0] = new Student("김길동", "자바", 100);
		stuarr[1] = new Student("박길동", "디비", 90);
		stuarr[2] = new Student("이길동", "화면", 95);
		stuarr[3] = new Student("정길동", "서버", 85);
		stuarr[4] = new Student("홍길동", "디비", 20);
		
		System.out.println(Arrays.toString(stuarr));
		
		for(Student student : stuarr) {
			System.out.println(student);
		}
		
	}

}
