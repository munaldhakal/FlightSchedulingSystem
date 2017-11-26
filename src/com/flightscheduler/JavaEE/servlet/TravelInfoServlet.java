package com.flightscheduler.JavaEE.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flightscheduler.JavaEE.database.CreateDatabase;
import com.flightscheduler.JavaEE.dto.TravelInfoDto;
import com.flightscheduler.JavaEE.model.TravelInfo;

/**
 * Servlet implementation class TravelInfoServlet
 */
@WebServlet("/TravelInfoServlet")
public class TravelInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     TravelInfoDto travelInfoDto = new TravelInfoDto();
     SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
     TravelInfo travelInfo = new TravelInfo();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TravelInfoServlet() {
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
		
		doGet(request, response);
		try {
			travelInfoDto.setDepartureDate(formatter.parse(request.getParameter("departureDate")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		travelInfoDto.setTripType(request.getParameter("tripType"));
		travelInfoDto.setNoOfAdults(Integer.parseInt(request.getParameter("noOfAdults")));
		travelInfoDto.setNoOfChildren(Integer.parseInt(request.getParameter("noOfChildren")));
		travelInfoDto.setDeparturePlace(request.getParameter("departurePlace"));
		travelInfoDto.setReturnPlace(request.getParameter("returnPlace"));
		try {
			travelInfoDto.setReturnDate(formatter.parse(request.getParameter("returnDate")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Connection cn = CreateDatabase.createDatabase();
		try {
			Statement st= cn.createStatement();
			
			String query="select * from travelinfo where departurePlace='+travelInfoDto.getDeparturePlace()+'&& departureDay='+travelInfoDto.getDepartureDate()+'";
			ResultSet rs;
			rs = st.executeQuery(query);
			ArrayList<TravelInfoDto> travelInfoDtoList = new ArrayList<TravelInfoDto>();
			TravelInfoDto storeTravelInfo;
		while(rs.next()) {
			storeTravelInfo = new TravelInfoDto(
					rs.getLong("id"),
					rs.getString("tripType"),
					rs.getInt("noOfAdult"),
					rs.getInt("noOfChildren"),
					rs.getString("departurePlace"),
					rs.getDate("departureDate"),
					rs.getDate("returnDate"),
					rs.getString("returnPlace")
					);
			travelInfoDtoList.add(storeTravelInfo)
		}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
