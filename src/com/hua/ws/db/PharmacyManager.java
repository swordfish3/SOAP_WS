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

public String SearchBarcode(Long barcode){
	 
	String name;
	Double wholesale_price;
	Double retail_price;
	String producer;
	Integer available ;
	//String result = "" ;
	Pharmacy product = null;
	try {
		PreparedStatement query = connection.prepareStatement("select name,wholesale_price,retail_price,producer,availability from pharmacy where barcode = ?");
		query.setString(1,barcode.toString());
		ResultSet reply = query.executeQuery();
		
		while(reply.next()){
			
			name = reply.getString("name");
			wholesale_price = reply.getDouble("wholesale_price");
			retail_price = reply.getDouble("retail_price");
			producer = reply.getString("producer");
			available = reply.getInt("availability");
			
			//result = "Name: " +name+"\n" + wholesale_price +"\n"+ retail_price+"\n" + producer +"\n"+ available;
			product = new Pharmacy(barcode,name,wholesale_price,retail_price,producer,available);
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return product.myPrint();
		
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
	
	public String Purchase(Long barcode){
		 
		String name = null;
		Double wholesale_price = null;
		Double retail_price = null;
		String producer = null;
		Integer available = null ;
		//String result = "" ;
		Pharmacy product = null;
		try {
			PreparedStatement query = connection.prepareStatement("select name,wholesale_price,retail_price,producer,availability from pharmacy where barcode = ?");
			query.setString(1,barcode.toString());
			ResultSet reply = query.executeQuery();
			while(reply.next()){
				
				name = reply.getString("name");
				wholesale_price = reply.getDouble("wholesale_price");
				retail_price = reply.getDouble("retail_price");
				producer = reply.getString("producer");
				available = reply.getInt("availability");
				available = available -1;
				PreparedStatement query2 = connection.prepareStatement("update pharmacy set availability =?  where barcode = ?");
				
				query2.setString(1,available.toString());
				query2.setString(2,barcode.toString());
				query2.executeUpdate();
				
				//while(reply2.next()){
					
				//}
				//result = "Name: " +name+"\n" + wholesale_price +"\n"+ retail_price+"\n" + producer +"\n"+ available;
				product = new Pharmacy(barcode,name,wholesale_price,retail_price,producer,available);
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return product.myPrint();
			
		}
	
	

}
