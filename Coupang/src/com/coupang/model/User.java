package com.coupang.model;


public class User {
	
	private String userId;
	private String userPW;
	private String userName;
	private int userPhone;
	private int userCash;
	private String userAdress;
	/*
	 * 아이디
	 * 비밀번호
	 * 이름
	 * 전화번호
	 * 잔액
	 * 주소
	 * 
	 */
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String userId, String userPW, String userName, int userPhone, int userCash, String userAdress) {
		this.userId = userId;
		this.userPW = userPW;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userCash = userCash;
		this.userAdress = userAdress;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPW() {
		return userPW;
	}
	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(int userPhone) {
		this.userPhone = userPhone;
	}
	public int getUserCash() {
		return userCash;
	}
	public void setUserCash(int userCash) {
		this.userCash = userCash;
	}
	public String getUserAdress() {
		return userAdress;
	}
	public void setUserAdress(String userAdress) {
		this.userAdress = userAdress;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPW=" + userPW + ", userName=" + userName + ", userPhone=" + userPhone
				+ ", userCash=" + userCash + ", userAdress=" + userAdress + "]";
	}
	

}
