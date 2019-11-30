package com.toshev.martin.patterns.behavioral.memento;

public class Device {
	
	private String serialNumber;
	
	private String shortName; 
	
	private double price;

	private String configurationScript;
	
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
	
	public String getConfigurationScript() {
		return configurationScript;
	}
	
	public void setConfigurationScript(String configurationScript) {
		this.configurationScript = configurationScript;
	}
	
	public DeviceSnapshot saveConfiguration() {
		DeviceSnapshot snapshot = new DeviceSnapshot();
		snapshot.setConfigurationScript(configurationScript);
		return snapshot;
	}
	
	public void restoreConfiguration(DeviceSnapshot snapshot) {
		this.configurationScript = snapshot.getConfigurationScript();
	}
	
	public static void main(String[] args) {
		Device device = new Device("SN 123", "router", 30);
		device.setConfigurationScript("configure terminal\nhostname machine.test.com");
		DeviceSnapshot startShapshot = device.saveConfiguration();
		device.setConfigurationScript("configure terminal\nhostname another.test.com");
		DeviceSnapshot anotherShapshot = device.saveConfiguration();
		device.restoreConfiguration(startShapshot);
		System.out.println(device.getConfigurationScript());
	}
	
}
