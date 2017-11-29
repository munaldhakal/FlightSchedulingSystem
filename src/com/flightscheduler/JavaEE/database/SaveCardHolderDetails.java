package com.flightscheduler.JavaEE.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.flightscheduler.JavaEE.model.CardHolderDetails;

public class SaveCardHolderDetails {
	public static void saveCardHolderDetails(CardHolderDetails cardHolderDetails) {
		Connection cn=CardHolderDetailsDatabase.createCardHolderDetailsDatabase();
		try {
			Statement st=cn.createStatement();
			String query="insert into cardholderdetails(id,noOfAdults,noOfChildrens,chFirstName,chMiddleName,chLastName,phoneNumber,emailAddress,pid,fid)values('"+cardHolderDetails.getId()+"','"+cardHolderDetails.getNoOfAdults()+"','"+cardHolderDetails.getNoOfChildrens()+"','"+cardHolderDetails.getChFirstName()+"','"+cardHolderDetails.getChMiddleName()+"','"+cardHolderDetails.getChLastName()+"','"+cardHolderDetails.getPhoneNumber()+"','"+cardHolderDetails.getEmailAddress()+"','"+cardHolderDetails.getPid()+"','"+cardHolderDetails.getFid()+"')";
			st.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
