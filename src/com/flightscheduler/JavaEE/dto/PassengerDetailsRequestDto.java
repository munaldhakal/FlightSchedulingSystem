/*************************************************************************
 * 
 *  All Rights Reserved.
 * 
 * NOTICE:  All information contained here in is, and remains
 * the property of Texas Imaginology and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * here in are proprietary to Texas Imaginology. Dissemination of this
 * information or reproduction of this material is strictly forbidden unless
 * prior written permission is obtained from Texas Imaginology.
 * 
 */
package com.flightscheduler.JavaEE.dto;

/**
 * <<Description Here>>
 * @author Munal
 * @version 
 * @since , 29 Dec 2017
 */
public class PassengerDetailsRequestDto {
	private Long id[];
	private String title[] ;
	private String firstName[];
	private String lastName[];
	private String middleName[];
	public PassengerDetailsRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PassengerDetailsRequestDto(Long[] id, String[] title, String[] firstName,
			String[] lastName, String[] middleName) {
		super();
		this.id = id;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
	}
	
	public Long getId(int i) {
		return id[i];
	}

	public void setId(Long[] id) {
		this.id = id;
	}

	public String getTitle(int i) {
		return title[i];
	}
	public void setTitle(String[] title) {
		this.title = title;
	}
	public String getFirstName(int i) {
		return firstName[i];
	}
	public void setFirstName(String[] firstName) {
		this.firstName = firstName;
	}
	public String getLastName(int i) {
		return lastName[i];
	}
	public void setLastName(String[] lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName(int i) {
		return middleName[i];
	}
	public void setMiddleName(String[] middleName) {
		this.middleName = middleName;
	}
	
}
