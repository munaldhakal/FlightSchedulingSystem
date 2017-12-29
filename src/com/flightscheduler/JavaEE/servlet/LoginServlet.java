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
import com.flightscheduler.JavaEE.dto.LoginInfoDto;
import com.flightscheduler.JavaEE.dto.RegisterUserDto;
import com.flightscheduler.JavaEE.model.LoginInfo;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	LoginInfo loginInfo = new LoginInfo();
    	LoginInfoDto loginInfoDto = new LoginInfoDto();
    	String userName = request.getParameter("userName");
    	String password = request.getParameter("password");
    	String userType=request.getParameter("userType");
    	response.getWriter().append("Served at: ").append(request.getContextPath());
    	Connection cn = CreateDatabase.createDatabase();
    	try {
    		PrintWriter printWriter= response.getWriter();
			Statement st = cn.createStatement();
			String query = "select * from registeruser where userName='"+userName+"'&& userType='"+userType+"'&& password='"+password+"'";
			ResultSet rs;
			rs = st.executeQuery(query);
			if(rs.next())
			{
				RegisterUserDto getUser = new RegisterUserDto(rs.getLong("id"));
				loginInfoDto.setPassword(password);
				loginInfoDto.setUserName(userName);
				loginInfoDto.setUserType(userType);
				//request.setAttribute("loginInfoDto", loginInfoDto);
				request.setAttribute("createdBy", loginInfoDto.getUserName());
				printWriter.println("Login Successful");
				//request.setAttribute("getUser", getUser);
				request.getRequestDispatcher("TravelInfoEntry.jsp").forward(request, response);
			}
			else {
			//	PrintWriter printWriter= response.getWriter();
				printWriter.println("User Not Found");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
    	
	}

}
