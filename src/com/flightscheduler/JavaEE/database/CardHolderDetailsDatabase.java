package com.flightscheduler.JavaEE.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CardHolderDetailsDatabase {
	public static Connection createCardHolderDetailsDatabase() {
		System.out.println("Hello0");
		Connection cn = CreateDatabase.createDatabase();
		System.out.println("Hello : "+cn);
		try {
			Statement st = cn.createStatement();
			System.out.println("Hello :"+st);
			String query = "create table if not exists cardholderdetails(id int(16) auto_increment,documentId int(12),chFirstName varchar(20),chMiddleName varchar(20),chLastName varchar(20),phoneNumber bigint(15),emailAddress varchar(40),pid int(16),fid int(16),PRIMARY KEY (id),FOREIGN KEY(fid) REFERENCES travelinfo(id),FOREIGN KEY(pid) REFERENCES passengerdetails(id))";
			System.out.println("Hello :"+query);
			st.executeUpdate(query);
			System.out.println("Hello3");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cn;
	}
}
