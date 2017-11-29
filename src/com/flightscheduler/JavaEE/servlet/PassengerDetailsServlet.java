package com.flightscheduler.JavaEE.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flightscheduler.JavaEE.dto.PassengerDetailsDto;
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
		PassengerDetailsDto passengerDetailsDto = new PassengerDetailsDto();
		passengerDetailsDto.setTitle(request.getParameter("title"));
		passengerDetailsDto.setFirstName(request.getParameter("firstName"));
		passengerDetailsDto.setLastName(request.getParameter("lastName"));
		passengerDetailsDto.setMiddleName(request.getParameter("middleName"));
		passengerDetailsDto.setLastName(request.getParameter("lastName"));
		passengerDetailsDto.setId(Long.parseLong(request.getParameter("id")));
		PassengerDetails passengerDetails = new PassengerDetails();
		passengerDetails.setTitle(passengerDetailsDto.getTitle());
		
	}
	
	
}
