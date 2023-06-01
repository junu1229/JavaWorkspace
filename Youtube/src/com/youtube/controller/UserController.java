package com.youtube.controller;

import com.youtube.model.User;

public class UserController implements UserControllerImpl{

	@Override
	public void loginProfile() {
		
	}

	@Override
	public boolean signupProfile() {
		return false;
	}

	@Override
	public User viewProfile() {
		return null;
	}

	@Override
	public User updateProfile() {
		return null;
	}

	@Override
	public boolean deleteProfile() {
		return false;
	}
	
}
