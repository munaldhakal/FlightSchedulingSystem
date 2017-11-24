package com.flightscheduler.JavaEE.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterUserDatabase {
	public static Connection createRegisterUserDatabase() {
		Connection cn = CreateDatabase.createDatabase();
		try {
			Statement st = cn.createStatement();
			String query = "create table if not exists registeruser(id int(16) auto_increment,userType varchar(5),userName varchar(20),password varchar(20),email varchar(255),phoneNumber varchar(20),PRIMARY KEY (id))";
			st.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cn;
	}
}
