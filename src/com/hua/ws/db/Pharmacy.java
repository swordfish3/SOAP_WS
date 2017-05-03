package com.hua.ws.db;

public class Pharmacy {

	private Long barcode;
	private String name;
	private Double wholesale_price;
	private Double retail_price;
	private String producer;
	private Integer available ;
	
	
	
	public Pharmacy(Long barcode, String name, Double wholesale_price, Double retail_price, String producer,
			Integer available) {
		super();
		this.barcode = barcode;
		this.name = name;
		this.wholesale_price = wholesale_price;
		this.retail_price = retail_price;
		this.producer = producer;
		this.available = available;
	}
	public Long getBarcode() {
		return barcode;
	}
	public void setBarcode(Long barcode) {
		this.barcode = barcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getWholesale_price() {
		return wholesale_price;
	}
	public void setWholesale_price(Double wholesale_price) {
		this.wholesale_price = wholesale_price;
	}
	public Double getRetail_price() {
		return retail_price;
	}
	public void setRetail_price(Double retail_price) {
		this.retail_price = retail_price;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public Integer getAvailable() {
		return available;
	}
	public void setAvailable(Integer available) {
		this.available = available;
	}
	
	
	public String myPrint() { 
	   return "Product: "+ name +"\n"+"Wholesale Price: "+ wholesale_price.toString() +"\n"+"Retain Price: "+ retail_price.toString()+"\n"+"Producer"+ producer+"\n"+"Availability: "+ available.toString();
	} 
}
