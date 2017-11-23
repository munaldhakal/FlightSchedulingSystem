package com.flightscheduler.JavaEE.dto;

public class RegisterUserDto {

	private String userType;
	private String userName;
	private String password;
	private String email;
	private String phoneNumber;
	private Long id;

	public RegisterUserDto() {
		super();
	}

	public RegisterUserDto(String userType, String userName, String password, String email, String phoneNumber,
			Long id) {
		super();
		this.userType = userType;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
