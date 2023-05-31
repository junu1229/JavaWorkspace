package com.kh.step3.model;

import java.util.Arrays;
import java.util.Iterator;

public class Calculator {

	/*
	 * * 메소드 (method) - 작업을 수행하기 위한 명령문의 집합 - 어떤 값을 입력받아서 처리하고 그 결과를 돌려준다. - 단, 입력받는
	 * 값이 없을 수도 있고, 결과를 돌려주지 않을 수도 있음. - 하나의 메소드는 한 가지 기능만 수행하도록 작성하는 것을 권장
	 * 
	 * [표현법]
	 * 
	 * 리턴타입 메소드이름 (타입 변수명, 타입 변수명, 타입 변수먕, , , ,) {
	 * 
	 * // 메서드 호출 시 수행될 코드 return; - 메소드에서 return문을 만나면 종료 - 반환값이 없는(void) 경우
	 * return문만 사용! - 반환값이 있는 경우 return문 뒤에 반환값을 지정해야 함
	 * 
	 * }
	 */

	public int a;
	public int b;
	int maax;
	int miin;

	// 최대값을 구하는 메서드
	public int max(int num1, int num2) {
		a = num1;
		b = num2;
		if (a > b) {
			maax = a;
		} else {
			maax = b;
		}

		return maax;
	}

	public int min(int num1, int num2) {
		a = num1;
		b = num2;
		if (a < b) {
			miin = a;
		} else {
			miin = b;
		}

		return miin;
	}

	/*
	 * 1. 인스턴스 메소드 - 인스턴스 생성 후, '참조변수, 메서드이름()'으로 호풀 - 인스턴스 변수나 인스턴스 메서드와 관련된 작업을 하는
	 * 메서드 2. 클래스 매소드 ( static 사용하는 메서드) - 객체 생성 없이 '클래스이름.메서드이름()'으로 호출 - 인스턴스 변수나
	 * 인스턴스 메서드와 관련없는 작업을
	 */
	public static int sum(int aa, int bb) {
		return aa + bb;
	}

	public static int substract(int aa, int bb) {
		return aa - bb;

	}

	public static int multiple(int aa, int bb) {
		return aa * bb;

	}

	// 나누기 형태: 몫은 ...이고 나머지는 ...
	public static double[] divide(double aa, double bb) {
		double[] d = new double[2];
		d[0] = aa / bb;
		d[1] = aa % bb;
		return d;

	}
	/*
	 * 재귀 함수 (Recursion Function)
	 * - 메서드 내에서 자기 자신을 반복적으로 호출
	 * - 반복문으로 바꿀 수 있으며 반복문보다 성능이 나쁨
	 * - 이해하기 쉽고 간결한 코드 작성이 가능 
	 */
	public int factorial(int a) {
		int A = 1;

		if(a!=1) {
			A=a*factorial(a-1);
		}
		/*
		 * 
		 */

		return A;
	}

}
