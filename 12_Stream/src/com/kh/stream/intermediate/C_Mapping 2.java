package com.kh.stream.intermediate;

import java.util.Arrays;
import java.util.List;

import com.kh.model.Student;

/*
 * 
 * 매핑
 * - 중간 처리 기능으로 스트림의 요소를 다른 요소를 대체하는 역활
 * 
 */

public class C_Mapping {

	public static void main(String[] args) {
		
		C_Mapping c = new C_Mapping();
//		c.method1();
//		c.method2();
		c.method3();

	}
	
	// mapXXX() : 요소를 대체하는 요소로 구성된 새로운 스트림을 생성
	public void method1() {
		List<Student> students = Arrays.asList(
				new Student("김민수", 18, "남자", 80, 70),
				new Student("구관원", 12, "남자", 90, 50),
				new Student("임지우", 16, "여자", 80, 90),
				new Student("박승환", 11, "남자", 70, 100)
				);
		
//		students.stream().map(Student ->Student.getName()).forEach(name -> System.out.print(name+" "));
		students.stream().map(Student::getName).forEach(System.out::println);
		System.out.println();
		
		// 수학 점수의 평균
		double avg = students.stream().mapToInt(Student::getMath).average().getAsDouble();
	}
	
	// flatMapXXX() : 하나의 요소를 복수의 요소들로 구성된 새로운 스트림을 생성
	public void method2() {
		
		List<String> list = Arrays.asList("Java11 Lambda", "StreamAPI Filtering Sorted Mapping");
		
		list.stream().flatMap(str -> Arrays.stream(str.split(" "))).forEach(System.out::println);;
		
	}
	
	//asDoubleStream() : IntStream, LongStream을 DoubleStream으로 변환
	public void method3() {
		
		Arrays.stream(new int[] {1,2,3,4,5}).asDoubleStream().forEach(System.out::println);
		
	}

}
