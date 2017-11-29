package com.flightscheduler.JavaEE.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flightscheduler.JavaEE.database.RegisterUserDatabase;
import com.flightscheduler.JavaEE.database.SaveTravelInfo;
import com.flightscheduler.JavaEE.dto.TravelDetailsDto;
import com.flightscheduler.JavaEE.model.TravelDetails;

/**
 * Servlet implementation class TravelDetailsServlet
 */
@WebServlet("/TravelDetailsServlet")
public class TravelDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TravelDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		TravelDetailsDto travelDetailsDto = new TravelDetailsDto();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		travelDetailsDto.setCreatedBy(request.getParameter("createdBy"));
		travelDetailsDto.setDeparturePlace(request.getParameter("departurePlace"));
		try {
			travelDetailsDto.setDate(formatter.parse(request.getParameter("date")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		travelDetailsDto.setArrivalPlace(request.getParameter("arrivalPlace"));
		try {
			travelDetailsDto.setDepartureTime(Time.valueOf(request.getParameter("departureTime")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			travelDetailsDto.setArrivalTime(Time.valueOf(request.getParameter("arrivalTime")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		travelDetailsDto.setFare(Long.parseLong(request.getParameter("fare")));
		travelDetailsDto.setStatus(request.getParameter("status"));
		TravelDetails travelDetails= new TravelDetails();
		travelDetails.setDeparturePlace(travelDetailsDto.getDeparturePlace());
		travelDetails.setArrivalPlace(travelDetailsDto.getArrivalPlace());
		travelDetails.setDate(travelDetailsDto.getDate());
		travelDetails.setDepartureTime(travelDetailsDto.getDepartureTime());
		travelDetails.setArrivalTime(travelDetailsDto.getArrivalTime());
		travelDetails.setFare(travelDetailsDto.getFare());
		travelDetails.setStatus(travelDetailsDto.getStatus());
		travelDetails.setCreatedBy(travelDetailsDto.getCreatedBy());
		SaveTravelInfo.saveTravelInfo(travelDetails);
		
		
	}

}
