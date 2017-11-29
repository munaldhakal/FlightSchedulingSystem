package com.flightscheduler.JavaEE.model;

import java.util.Date;

public class TravelInfo {
	private String tripType;
	private int noOfAdults;
	private int noOfChildren;
	private String departurePlace;
	private Date departureDate;
	private Date returnDate;
	private String returnPlace;
	private Long id;

	public TravelInfo() {
		super();
	}
	
	public TravelInfo(String tripType, int noOfAdults, int noOfChildren, String departurePlace, Date departureDate,
			Date returnDate, String returnPlace) {
		super();
		this.tripType = tripType;
		this.noOfAdults = noOfAdults;
		this.noOfChildren = noOfChildren;
		this.departurePlace = departurePlace;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
		this.returnPlace = returnPlace;
	}
	
	
	
	public String getTripType() {
		return tripType;
	}

	public void setTripType(String tripType) {
		this.tripType = tripType;
	}

	public int getNoOfAdults() {
		return noOfAdults;
	}

	public void setNoOfAdults(int noOfAdults) {
		this.noOfAdults = noOfAdults;
	}

	public int getNoOfChildren() {
		return noOfChildren;
	}

	public void setNoOfChildren(int noOfChildren) {
		this.noOfChildren = noOfChildren;
	}

	public String getDeparturePlace() {
		return departurePlace;
	}

	public void setDeparturePlace(String departurePlace) {
		this.departurePlace = departurePlace;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public String getReturnPlace() {
		return returnPlace;
	}

	public void setReturnPlace(String returnPlace) {
		this.returnPlace = returnPlace;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
