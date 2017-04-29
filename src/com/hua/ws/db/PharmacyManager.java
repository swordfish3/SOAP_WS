package com.hua.ws.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PharmacyManager {
	
	private Connection connection ;
	
	
	
	public PharmacyManager() {
	
		this.connection = Database.getConnection();
	}



	public int getAvailability(String name){
		int counter = 0;
		
		try {
			PreparedStatement query = connection.prepareStatement("select availability from pharmacy where name = ?");
			query.setString(1,name);
			ResultSet reply = query.executeQuery();
			
			while(reply.next()){
				
				counter = reply.getInt("availability");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return counter;
	}

}
