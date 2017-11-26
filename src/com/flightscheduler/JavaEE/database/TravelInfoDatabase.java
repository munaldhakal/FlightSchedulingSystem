package com.flightscheduler.JavaEE.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TravelInfoDatabase {
	
	public static void createTravelInfoDatabase() {
		Connection cn = CreateDatabase.createDatabase();
		try {
			Statement st = cn.createStatement();
			String query = "create table if not exists travelinfo(id int(16) auto_increment,createdBy varchar(20),triptype varchar(20),noOfAdults int(3),noOfChildren int(3),departurePlace varchar(20),departureDate Date,returnPlace varchar(20),returnDate Date,PRIMARY KEY (id))";
			st.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
