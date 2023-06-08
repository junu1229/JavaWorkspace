package com.coupang.controller;

import java.util.HashMap;

import com.coupang.model.User;

public class UserController {
	HashMap<String, User> userMap = new HashMap<>();
	User loggedInUser = new User();
	public boolean loginStatus = false;

//	private String userPW;
//	private String userName;
//	private int userPhone;
//	private int userCash;
//	private String userAdress;
	// C
	public boolean signUp(String id, String password, String name, int phoneNum, int cash, String adress) {
		if (!userMap.containsKey(id)) {

			userMap.put(id, new User(password, name, phoneNum, cash, adress));
			return true;
		}
		return false;
	}

	// R
	public void login(String id, String password) {
		if (userMap.containsKey(id) && userMap.get(id).getUserPW().equals(password)) {
			loggedInUser = userMap.get(id);
			loggedInUser.setUserId(id);
			loginStatus = true;
		}
	}

	public User readProfile() {
		if (loginStatus) {
			return loggedInUser;
		}
		return null;
	}

	// U
	public User updateUser(String password, String name, String adress) {
		if (loginStatus) {
			userMap.get(loggedInUser.getUserId()).setUserPW(password);
			userMap.get(loggedInUser.getUserId()).setUserName(name);
			userMap.get(loggedInUser.getUserId()).setUserAdress(adress);
			return loggedInUser;
		}
		return null;

	}

	// D
	public boolean deleteUser() {
		if (loginStatus) {
			userMap.remove(loggedInUser);
			loggedInUser = new User();
			loginStatus = false;
			
			return true;
		}
		return false;
	}

	public boolean logout() {
		if (loginStatus) {
			
			loggedInUser = new User();
			loginStatus = false;
			return true;
		}
		return false;


	}

}
