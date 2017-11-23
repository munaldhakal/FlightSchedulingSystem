package com.flightscheduler.JavaEE.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flightscheduler.JavaEE.database.SaveUserInfo;
import com.flightscheduler.JavaEE.dto.RegisterUserDto;
import com.flightscheduler.JavaEE.model.RegisterUser;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	RegisterUser registerUser = new RegisterUser();
	RegisterUserDto registerUserDto = new RegisterUserDto();

	public RegisterServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		registerUserDto.setUserType(request.getParameter("userType"));
		registerUser.setUserType(registerUserDto.getUserType());
		registerUserDto.setEmail(request.getParameter("email"));
		registerUser.setEmail(registerUserDto.getEmail());
		registerUserDto.setUserName(request.getParameter("username"));
		registerUser.setUserName(registerUserDto.getUserName());
		registerUserDto.setPassword(request.getParameter("password"));
		registerUser.setPassword(registerUserDto.getPassword());
		registerUserDto.setPhoneNumber(request.getParameter("phoneNumber"));
		registerUser.setPhoneNumber(registerUserDto.getPhoneNumber());
		SaveUserInfo.saveUser(registerUser);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
