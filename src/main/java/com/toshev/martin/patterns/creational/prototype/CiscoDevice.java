package com.toshev.martin.patterns.creational.prototype;

public class CiscoDevice extends Device {
	
	private String serialNumber;
	
	private String shortName; 
	
	private double price;

	public CiscoDevice(String serialNumber, String shortName, double price) {
		this.serialNumber = serialNumber;
		this.shortName = shortName;
		this.price = price;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public String getShortName() {
		return shortName;
	}
	
	public double getPrice() {
		return price;
	}
	
	@Override
	protected Device clone() throws CloneNotSupportedException {
		return new CiscoDevice(serialNumber, shortName, price);
	}
	
}
