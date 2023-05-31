package com.kh.step1.model;

public class Tv {
	// 속성(property) : 멤버 변수(member variable), 특징(attribute), 필드(field)
	public boolean power = false; // 전원 상태 (on/off)
	public int channel = 20;
	// 기능(function) : 함수, 메소드(method)

	public void power() { // tv를 키거나 끄는 기능
		power = !power;

	}

	public void channelup() { //
		++channel;
	}

	public void channeldown() {
		--channel;
	}

}
