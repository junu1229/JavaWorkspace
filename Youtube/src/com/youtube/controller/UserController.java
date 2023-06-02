package com.youtube.controller;

import com.youtube.model.User;

public class UserController implements UserControllerImpl{
	User user = null;

	@Override
	public void loginProfile() {
		
	}

	@Override
	public boolean signupProfile(User user) {
		this.user = user;
	}

	@Override
	public User viewProfile() {
		if (loginProfile(user.getId())), loginProfile(user.getPassword()) {
			
		}
		return null;
	}

	@Override
	public User updateProfile(User user) {
		if (loginProfile(this.user.getId()), this.user.getPassword()) {
			
		}
			return null;
	}

	@Override
	public void deleteProfile(String id) {
		if(user.getId().equals(id))
	}
	
}
