package com.kh.example.practice4.controller;

import com.kh.example.practice4.model.Snack;

public class SnackController {
	
	// 멤버변수 - > 모델로 만들어놓은 클래스! 
	
	Snack snack = new Snack();
	
	// 생성자
	public SnackController() {}
	
	// 메서드 
	// 데이터를 setter 를 이용해 저장하고 저장되었다는 결과를 반환하는 메서드
	
	
	
	public boolean saveData(Snack snack) {
		
		// snack은 controller에서 만든 임시 데이터 창고
		// viewSnack은 Application 에서 데이터를 담은 임시 데이터 창고
		this.snack.setKind(snack.getKind());
		this.snack.setName(snack.getName());
		this.snack.setFlavor(snack.getFlavor());
		this.snack.setNumOf(snack.getNumOf());
		this.snack.setPrice(snack.getPrice());
		
		return true;
	}
	// 컨트롤러에서 저장된 데이터를 반환하는 메서드 
	
	public Snack confirmData() {
		return snack;
	}

}
