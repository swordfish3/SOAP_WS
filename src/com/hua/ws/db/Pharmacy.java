package com.hua.ws.db;

public class Pharmacy {

	private long barcode;
	private String name;
	private double wholesale_price;
	private double retail_price;
	private String producer;
	private int available ;
	
	
	
	public Pharmacy(long barcode, String name, double wholesale_price, double retail_price, String producer,
			int available) {
		super();
		this.barcode = barcode;
		this.name = name;
		this.wholesale_price = wholesale_price;
		this.retail_price = retail_price;
		this.producer = producer;
		this.available = available;
	}
	public long getBarcode() {
		return barcode;
	}
	public void setBarcode(long barcode) {
		this.barcode = barcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWholesale_price() {
		return wholesale_price;
	}
	public void setWholesale_price(double wholesale_price) {
		this.wholesale_price = wholesale_price;
	}
	public double getRetail_price() {
		return retail_price;
	}
	public void setRetail_price(double retail_price) {
		this.retail_price = retail_price;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
}
