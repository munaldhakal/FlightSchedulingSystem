package com.flightscheduler.JavaEE.model;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class TravelDetails {
	private Long id;
	private String departurePlace;
	private String arrivalPlace;
	private String date;
	private String departureTime;
	private String status;
	private String arrivalTime;
	private Long fare;
	private String createdBy;
	public TravelDetails() {
		super();
	}
	
	public TravelDetails(Long id, String departurePlace, String arrivalPlace, String date,
			String departureTime, String status, String arrivalTime, Long fare,
			String createdBy) {
		super();
		this.id = id;
		this.departurePlace = departurePlace;
		this.arrivalPlace = arrivalPlace;
		this.date = date;
		this.departureTime = departureTime;
		this.status = status;
		this.arrivalTime = arrivalTime;
		this.fare = fare;
		this.createdBy = createdBy;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDeparturePlace() {
		return departurePlace;
	}
	public void setDeparturePlace(String departurePlace) {
		this.departurePlace = departurePlace;
	}
	public String getArrivalPlace() {
		return arrivalPlace;
	}
	public void setArrivalPlace(String arrivalPlace) {
		this.arrivalPlace = arrivalPlace;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public Long getFare() {
		return fare;
	}
	public void setFare(Long fare) {
		this.fare = fare;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
}
