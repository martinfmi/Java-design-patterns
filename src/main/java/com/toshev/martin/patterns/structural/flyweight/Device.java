package com.toshev.martin.patterns.structural.flyweight;

import java.util.HashMap;

public class Device {
	
	private static HashMap<String, Manufacturer> manufacturersCache = new HashMap<>();
	
	private String serialNumber;
	
	private Manufacturer manufacturer;
	
	public static Device of(String manufacturer, String serialNumber) {
		
		Device device = new Device();
		device.setSerialNumber(serialNumber);
		Manufacturer manufacturerItem = manufacturersCache.computeIfAbsent(manufacturer, 
				(key) -> new Manufacturer(manufacturer));
		
		device.setManufacturer(manufacturerItem);
		return device;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
}
