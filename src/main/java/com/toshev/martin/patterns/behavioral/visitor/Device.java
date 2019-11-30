package com.toshev.martin.patterns.behavioral.visitor;

public class Device {
	
	private String serialNumber;
	
	private String shortName; 
	
	private double price;

	public Device(String serialNumber, String shortName, double price) {
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
	
	public void validate(DeviceValidator validator) {
		validator.validate(this);
	}
	
	public static void main(String[] args) {
		
		Device ciscoRouter = new CiscoRouter("SN 123", "router", 30);
		Device juniperRouter = new JuniperRouter("SN 127", "router", 20);
		
		DeviceValidator validator = new SerialNumberValidator();
		ciscoRouter.validate(validator);
		juniperRouter.validate(validator);
	}
}
