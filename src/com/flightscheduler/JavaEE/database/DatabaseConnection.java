package com.flightscheduler.JavaEE.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/";
		String con = "com.mysql.jdbc.Driver";
		Connection cn = null;
		try {
			Class.forName(con);
			cn = DriverManager.getConnection(url, "root", "");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return cn;
	}
}
