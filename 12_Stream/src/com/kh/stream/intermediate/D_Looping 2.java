package com.kh.stream.intermediate;

import java.util.Arrays;

/*
 * 
 * 반복
 * - 요소 전체를 반복하는 역활
 * - peek() : 중간 처리 단계에서 전체 요소를 반복
 * - forEach() : 최종 처리 단계에서 전체 요소를 반복
 * 
 */

public class D_Looping {

	public static void main(String[] args) {
		
		int sum = 0;
		int[] values = {1,2,3,4,5};
		
		// 최종 처리 메서드가 호출되어야 동작
		sum=Arrays.stream(values).filter(i->i%2==0).peek(value->System.out.println(value)).sum();
		System.out.println("sum : "+sum);
		
		sum =Arrays.stream(values).filter(i->i%2==0).sum();
		System.out.println("sum2 : "+sum);

	}

}
