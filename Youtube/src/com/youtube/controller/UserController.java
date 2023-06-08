package com.youtube.controller;

import com.youtube.impl.UserControllerImpl;
import com.youtube.model.User;

public class UserController implements UserControllerImpl{
	User user = null;

	@Override
	public void loginProfile(String id, String password) {
	}

	@Override
	public boolean signupProfile(User user) {
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
