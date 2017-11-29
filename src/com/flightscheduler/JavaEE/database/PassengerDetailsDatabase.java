package com.flightscheduler.JavaEE.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class PassengerDetailsDatabase {
	public static Connection createPassengerDetailsDatabase() {
		Connection cn = CreateDatabase.createDatabase();
		try {
			Statement st = cn.createStatement();

			String query = "create table if not exists passengerdetails(id int(16) auto_increment,title varchar(3),firstName varchar(20),lastName varchar(20),middleName varchar(20),PRIMARY KEY (id))";

			st.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cn;
	}
}
