package com.flightscheduler.JavaEE.servlet;

import java.io.IOException;
import java.io.PrintWriter;

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
		String[] departureDate=request.getParameterValues("departureDate");
		String[] departureTime=request.getParameterValues("departureTime");
		String[] departurePlace=request.getParameterValues("departurePlace");
		String[] arrivalTime=request.getParameterValues("arrivalTime");
		String[] arrivalPlace=request.getParameterValues("arrivalPlace");
		String[] fare=request.getParameterValues("fare");
		String[] status=request.getParameterValues("status");
		String createdBy=request.getParameter("createdBy");
		System.out.println("Created by: "+createdBy);
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println(createdBy);
		travelDetailsRequestDto.setDate(departureDate);
		travelDetailsRequestDto.setArrivalPlace(arrivalPlace);
		travelDetailsRequestDto.setArrivalTime(arrivalTime);
		travelDetailsRequestDto.setDepartureTime(departureTime);
		travelDetailsRequestDto.setDeparturePlace(departurePlace);
		travelDetailsRequestDto.setCreatedBy(createdBy);
		travelDetailsRequestDto.setFare(fare);
		travelDetailsRequestDto.setStatus(status);
		int size =departurePlace.length;
		TravelDetails travelDetails= new TravelDetails();
		for(int i=0;i<=size-1;i++) {	
			travelDetails.setDeparturePlace(travelDetailsRequestDto.getDeparturePlace(i));
			travelDetails.setArrivalPlace(travelDetailsRequestDto.getArrivalPlace(i));
			travelDetails.setDate(travelDetailsRequestDto.getDate(i));
			travelDetails.setFare(Long.parseLong(travelDetailsRequestDto.getFare(i)));
			travelDetails.setStatus(travelDetailsRequestDto.getStatus(i));
			travelDetails.setCreatedBy(travelDetailsRequestDto.getCreatedBy());
			travelDetails.setDepartureTime(travelDetailsRequestDto.getDepartureTime(i));
			travelDetails.setArrivalTime(travelDetailsRequestDto.getArrivalTime(i));
			SaveTravelInfo.saveTravelInfo(travelDetails);
		}					
	}

}
