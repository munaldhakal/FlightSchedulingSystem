package com.flightscheduler.JavaEE.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TravelInfoDatabase {
	
	public static void createTravelInfoDatabase() {
		Connection cn = CreateDatabase.createDatabase();
		try {
			Statement st = cn.createStatement();

			String query = "create table if not exists travelinfo(id int(16) auto_increment,createdBy varchar(20),departurePlace varchar(20),arrivalPlace varchar(20),date Date,departureTime Time,arrivalTime Time,fare bigint(20),status varchar(7),PRIMARY KEY (id))";

			st.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
