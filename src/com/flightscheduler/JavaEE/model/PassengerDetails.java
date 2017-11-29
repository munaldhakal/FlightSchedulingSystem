package com.flightscheduler.JavaEE.model;

public class PassengerDetails {
	private String title ;
	private String firstName;
	private String lastName;
	private String middleName;
	private Long id;
	public PassengerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PassengerDetails(String title, String firstName, String lastName, String middleName, Long id) {
		super();
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}


}
