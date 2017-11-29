
package com.flightscheduler.JavaEE.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.flightscheduler.JavaEE.model.TravelDetails;

public class SaveTravelInfo {
	public static void saveTravelInfo(TravelDetails travelDetails) {
		Connection cn=TravelInfoDatabase.createTravelInfoDatabase();
		try {
			Statement st=cn.createStatement();
			String query="insert into travelinfo(departurePlace,arrivalPlace,date,departureTime,arrivalTime,fare,status,createdBy)values('"+travelDetails.getDeparturePlace()+"','"+travelDetails.getArrivalPlace()+"','"+travelDetails.getDate()+"','"+travelDetails.getDepartureTime()+"','"+travelDetails.getArrivalTime()+"','"+travelDetails.getFare()+"','"+travelDetails.getStatus()+"','"+travelDetails.getCreatedBy()+"')";
			st.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
