package com.coupang.impl;

import com.coupang.model.User;

public interface UserControllerImpl {
	//C
	public boolean createProfile(String id, String password, String name, int phoneNum, int cash, String adress);
	//R
	public void login(String id, String password);
	public User readProfile();
	//U
	public User updateUser(String password, String name, String adress);
	//D
	public boolean deleteUser();
}
