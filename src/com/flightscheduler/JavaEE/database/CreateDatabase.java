package com.flightscheduler.JavaEE.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {

	public static Connection createDatabase() {
		Connection cn = DatabaseConnection.getConnection();
		try {
			System.out.println(cn);
			Statement st = cn.createStatement();
			String query = "create database if not exists FlightBooking";
			st.executeUpdate(query);
			String url = "jdbc:mysql://localhost:3306/FlightBooking";
			cn = DriverManager.getConnection(url, "root", "");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cn;
	}
}
