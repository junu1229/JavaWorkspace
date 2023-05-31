package com.kh.inheritance;

import com.kh.inheritance.child.Notebook;
import com.kh.inheritance.child.SmartPhone;
import com.kh.inheritance.child.Tv;

public class Application {

	public static void main(String[] args) {
		
		Notebook notebook = new Notebook("애플", "a1111", "맥북프로 14", 2790000, "M2");
		Tv tv = new Tv("엘지", "42LX3QKNA", "올레드 Flex", 3000000, 43);
		SmartPhone smartPhone = new SmartPhone("삼성", "S22222", "s23울트라", 1590000, "SKT");
		
		System.out.println(notebook);
		System.out.println(tv);
		System.out.println(smartPhone);
		
		

	}

}
