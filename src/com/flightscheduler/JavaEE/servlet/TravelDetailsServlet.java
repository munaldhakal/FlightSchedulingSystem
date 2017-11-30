package com.flightscheduler.JavaEE.servlet;

import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flightscheduler.JavaEE.database.SaveTravelInfo;
import com.flightscheduler.JavaEE.dto.TravelDetailsRequestDto;
import com.flightscheduler.JavaEE.model.TravelDetails;

@WebServlet("/TravelDetailsServlet")
public class TravelDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public TravelDetailsServlet() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		TravelDetailsRequestDto travelDetailsRequestDto = new TravelDetailsRequestDto();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");		
		String[] departureDate=request.getParameterValues("departureDate");
		String[] departureTime=request.getParameterValues("departureTime");
		String[] departurePlace=request.getParameterValues("departurePlace");
		String[] arrivalTime=request.getParameterValues("arrivalTime");
		String[] arrivalPlace=request.getParameterValues("arrivalPlace");
		String[] fare=request.getParameterValues("fare");
		String createdBy=request.getParameter("createdBy");
		travelDetailsRequestDto.setDate(departureDate);
		travelDetailsRequestDto.setArrivalPlace(arrivalPlace);
		travelDetailsRequestDto.setArrivalTime(arrivalTime);
		travelDetailsRequestDto.setDepartureTime(departureTime);
		travelDetailsRequestDto.setCreatedBy(createdBy);
		travelDetailsRequestDto.setFare(fare);
		int size =departurePlace.length;
		TravelDetails travelDetails= new TravelDetails();
		for(int i=0;i<=size;i++) {	
			travelDetails.setDeparturePlace(travelDetailsRequestDto.getDeparturePlace(i));
			travelDetails.setArrivalPlace(travelDetailsRequestDto.getArrivalPlace(i));
			try {
				travelDetails.setDate(formatter.parse(travelDetailsRequestDto.getDate(i)));
			}
			catch (ParseException e) {
				e.printStackTrace();
			}
			travelDetails.setDepartureTime(Time.valueOf(travelDetailsRequestDto.getDepartureTime(i)));
			travelDetails.setArrivalTime(Time.valueOf(travelDetailsRequestDto.getArrivalTime(i)));
			travelDetails.setFare(Long.parseLong(travelDetailsRequestDto.getFare(i)));
			travelDetails.setStatus(travelDetailsRequestDto.getStatus(i));
			travelDetails.setCreatedBy(travelDetailsRequestDto.getCreatedBy());
			SaveTravelInfo.saveTravelInfo(travelDetails);
		}					
	}

}
