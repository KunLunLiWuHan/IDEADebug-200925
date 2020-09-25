package com.itheima.test06;

public class User {
	private String userName;
	private String pwd;
	private String userType;

	public User(String userName, String pwd) {
		this.userName = userName;
		this.pwd = pwd;
	}

	public User(String userName, String pwd, String userType) {
		this.userName = userName;
		this.pwd = pwd;
		this.userType = userType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
}