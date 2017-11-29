package com.flightscheduler.JavaEE.dto;

public class CardHolderDetailsDto {
	private Long id;
	private Long noOfAdults;
	private Long noOfChildrens;
	private String chFirstName;
	private String chMiddleName;
	private String chLastName;
	private Long phoneNumber;
	private String emailAddress;
	private Long pid;
	private Long fid;
	public CardHolderDetailsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CardHolderDetailsDto(Long id, Long noOfAdults, Long noOfChildrens, String chFirstName, String chMiddleName,
			String chLastName, Long phoneNumber, String emailAddress, Long pid, Long fid) {
		super();
		this.id = id;
		this.noOfAdults = noOfAdults;
		this.noOfChildrens = noOfChildrens;
		this.chFirstName = chFirstName;
		this.chMiddleName = chMiddleName;
		this.chLastName = chLastName;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.pid = pid;
		this.fid = fid;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getNoOfAdults() {
		return noOfAdults;
	}
	public void setNoOfAdults(Long noOfAdults) {
		this.noOfAdults = noOfAdults;
	}
	public Long getNoOfChildrens() {
		return noOfChildrens;
	}
	public void setNoOfChildrens(Long noOfChildrens) {
		this.noOfChildrens = noOfChildrens;
	}
	public String getChFirstName() {
		return chFirstName;
	}
	public void setChFirstName(String chFirstName) {
		this.chFirstName = chFirstName;
	}
	public String getChMiddleName() {
		return chMiddleName;
	}
	public void setChMiddleName(String chMiddleName) {
		this.chMiddleName = chMiddleName;
	}
	public String getChLastName() {
		return chLastName;
	}
	public void setChLastName(String chLastName) {
		this.chLastName = chLastName;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public Long getFid() {
		return fid;
	}
	public void setFid(Long fid) {
		this.fid = fid;
	}
	
}
