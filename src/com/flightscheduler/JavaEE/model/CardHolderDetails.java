package com.flightscheduler.JavaEE.model;

public class CardHolderDetails {
private Long documentId;
private Long id;
private String chFirstName;
private String chMiddleName;
private String chLastName;
private Long phoneNumber;
private String emailAddress;
private Long pid;
private Long fid;
public CardHolderDetails() {
	super();
	// TODO Auto-generated constructor stub
}

public CardHolderDetails(Long documentId, Long id, String chFirstName,
		String chMiddleName, String chLastName, Long phoneNumber, String emailAddress,
		Long pid, Long fid) {
	super();
	this.documentId = documentId;
	this.id = id;
	this.chFirstName = chFirstName;
	this.chMiddleName = chMiddleName;
	this.chLastName = chLastName;
	this.phoneNumber = phoneNumber;
	this.emailAddress = emailAddress;
	this.pid = pid;
	this.fid = fid;
}

public Long getDocumentId() {
	return documentId;
}

public void setDocumentId(Long documentId) {
	this.documentId = documentId;
}

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
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

