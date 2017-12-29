package com.flightscheduler.JavaEE.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flightscheduler.JavaEE.database.CreateDatabase;

/**
 * Servlet implementation class ReturnTravelInfoResultSetServlet
 */
@WebServlet("/ReturnTravelInfoResultSetServlet")
public class ReturnTravelInfoResultSetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ReturnTravelInfoResultSetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String departurePlace=request.getParameter("departurePlace");
		PrintWriter out=response.getWriter();
		out.println(departurePlace);
		String arrivalPlace=request.getParameter("arrivalPlace");
		out.println(arrivalPlace);
		String date=request.getParameter("date");
		out.println(date);
		ResultSet rs = null;
		Statement st = null;
		Connection cn = CreateDatabase.createDatabase();
		String query = "select * from travelinfo where departurePlace='"+departurePlace+"'&& arrivalPlace='"+arrivalPlace+"'&& date='"+date+"'";
		try {
			st = cn.createStatement();
			rs = st.executeQuery(query);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		//out.println(rs);
		request.setAttribute("rs", rs);
		request.getRequestDispatcher("TravelDetails.jsp").forward(request, response);
	}

}
