package com.flightscheduler.JavaEE.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.flightscheduler.JavaEE.model.RegisterUser;

public class SaveUserInfo {
	public static void saveUser(RegisterUser registerUser) {
		Connection cn=RegisterUserDatabase.createRegisterUserDatabase();
		try {
			Statement st=cn.createStatement();
			String query="insert into registeruser(userType,userName,password,email,phoneNumber)values('"+registerUser.getUserType()+"','"+registerUser.getUserName()+"','"+registerUser.getPassword()+"','"+registerUser.getEmail()+"','"+registerUser.getPassword()+"')";
			st.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
