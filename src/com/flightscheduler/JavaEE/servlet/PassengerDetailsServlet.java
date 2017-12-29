package com.flightscheduler.JavaEE.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flightscheduler.JavaEE.database.SavePassengerDetails;
import com.flightscheduler.JavaEE.dto.PassengerDetailsDto;
import com.flightscheduler.JavaEE.dto.PassengerDetailsRequestDto;
import com.flightscheduler.JavaEE.model.PassengerDetails;

/**
 * Servlet implementation class PassengerDetailsServlet
 */
@WebServlet("/PassengerDetailsServlet")
public class PassengerDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PassengerDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PassengerDetailsRequestDto passengerDetailsRequestDto = new PassengerDetailsRequestDto();
		String[] title=request.getParameterValues("title");
		String[] firstName=request.getParameterValues("firstName");
		String[] middleName=request.getParameterValues("middleName");
		String[] lastName=request.getParameterValues("lastName");
		//String[] id=request.getParameterValues("id");
		PassengerDetails passengerDetails = new PassengerDetails();
		passengerDetailsRequestDto.setTitle(title);
		passengerDetailsRequestDto.setFirstName(firstName);
		passengerDetailsRequestDto.setLastName(lastName);
		passengerDetailsRequestDto.setMiddleName(middleName);
		int size = title.length;
		for(int i=0;i<=size-1;i++) {
			passengerDetails.setTitle(passengerDetailsRequestDto.getTitle(i));
			passengerDetails.setFirstName(passengerDetailsRequestDto.getFirstName(i));
			passengerDetails.setMiddleName(passengerDetailsRequestDto.getMiddleName(i));
			passengerDetails.setLastName(passengerDetailsRequestDto.getLastName(i));
			SavePassengerDetails.savePassengerDetails(passengerDetails);
		}
	
	}
}