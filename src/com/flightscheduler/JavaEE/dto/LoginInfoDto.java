package com.flightscheduler.JavaEE.dto;

public class LoginInfoDto {
	private String userType;
	private String userName;
	private String password;
	public LoginInfoDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginInfoDto(String userType, String userName, String password) {
		super();
		this.userType = userType;
		this.userName = userName;
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
