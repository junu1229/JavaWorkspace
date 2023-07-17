package com.kh.practice2;

import java.util.TreeSet;

public class Application {

	TreeSet<Integer> lottoryNum = new TreeSet<>();
	TreeSet<Integer> myNum = new TreeSet<>();

	public static void main(String[] args) {
		Application a = new Application();
		a.main();
	}
		
	public void main() {
		int count = 0;
		while(true) {
			myNumCal();
			lottoNumCal();
			System.out.println("로또 번호 : " + lottoryNum);
			System.out.println("내 번호 : "+ myNum);
			if(lottoryNum.equals(myNum)) {
				break;
			}
			else {
				myNum.clear();
			}
			
			count++;
		}
		System.out.println("횟수 : "+count);
		System.out.println(count/52+"년 "+ count%52 +"주 걸립니다.");
		
		
	}
		

	public void myNumCal() {
		for (; myNum.size() < 6;) {
			int mNum = (int) (((Math.random()) * 45) + 1);
			myNum.add(mNum);
		}
	}

	public void lottoNumCal() {
		for (; lottoryNum.size() < 6;) {
			int mNum = (int) (((Math.random()) * 45) + 1);
			lottoryNum.add(mNum);
		}
	}

}
