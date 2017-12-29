package com.flightscheduler.JavaEE.dto;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class TravelDetailsRequestDto {
	private Long id[];
	private String departurePlace[];
	private String arrivalPlace[];
	private String date[];
	private String departureTime[];
	private String status[];
	private String arrivalTime[];
	private String fare[];
	private String createdBy;
	public TravelDetailsRequestDto() {
		super();
	}
	public TravelDetailsRequestDto(Long[] id, String[] departurePlace, String[] arrivalPlace,
			String[] date, String[] departureTime, String[] status,
			String[] arrivalTime, String[] fare, String createdBy) {
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
	public Long getId(int i) {
		return id[i];
	}
	public void setId(Long[] id) {
		this.id = id;
	}
	public String getDeparturePlace(int i) {
		return departurePlace[i];
	}
	public void setDeparturePlace(String[] departurePlace) {
		this.departurePlace = departurePlace;
	}
	public String getArrivalPlace(int i) {
		return arrivalPlace[i];
	}
	public void setArrivalPlace(String[] arrivalPlace) {
		this.arrivalPlace = arrivalPlace;
	}
	public String getStatus(int i) {
		return status[i];
	}
	public void setStatus(String[] status) {
		this.status = status;
	}
	public String getDate(int i) {
		return date[i];
	}
	public void setDate(String[] date) {
		this.date = date;
	}
	public String getDepartureTime(int i) {
		return departureTime[i];
	}
	public void setDepartureTime(String[] departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime(int i) {
		return arrivalTime[i];
	}
	public void setArrivalTime(String[] arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getFare(int i) {
		return fare[i];
	}
	public void setFare(String[] fare) {
		this.fare = fare;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
}
