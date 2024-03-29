package com.youtube.impl;

import com.youtube.model.User;

public interface UserControllerImpl {
	// 로그인
	public void loginProfile();

	// 회원가입
	public boolean signupProfile(User user);

	// 프로필 보기
	public User viewProfile();

	// 프로필 수정
	public User updateProfile();

	// 계정 삭제
	public boolean deleteProfile();

}
