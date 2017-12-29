package com.flightscheduler.JavaEE.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.flightscheduler.JavaEE.model.PassengerDetails;

public class SavePassengerDetails {
	public static void savePassengerDetails(PassengerDetails passengerDetails) {
		Connection cn=PassengerDetailsDatabase.createPassengerDetailsDatabase();
		try {
			Statement st=cn.createStatement();
			String query="insert into passengerdetails(title,firstName,middleName,lastName)values('"+passengerDetails.getTitle()+"','"+passengerDetails.getFirstName()+"','"+passengerDetails.getMiddleName()+"','"+passengerDetails.getLastName()+"')";
			st.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
