package com.hua.ws.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	
	public static Connection getConnection(){
		Connection con = null;
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
				
				try {
					con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/registry_db","root","");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
			
			return con;
				
		
	}
	
}
