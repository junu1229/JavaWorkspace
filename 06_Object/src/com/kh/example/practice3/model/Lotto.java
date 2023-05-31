package com.kh.example.practice3.model;

import java.util.Arrays;

public class Lotto {
	
	public String information() {
		int[] lotto = new int[6];
		String information = "";
		for(int i = 0; i<lotto.length; i++) {
			for(int j = 0; j<i; j++) {
				while(lotto[i]==lotto[j])
					lotto[i] = (int) (Math.random()*45+1);
			}
		}
		Arrays.sort(lotto);
		information = Arrays.toString(lotto);
		return information;
	}

	

}
