package com.toshev.martin.patterns.creational.abstractfactory;

public interface DeviceFactory {

	public Device device(String serialNumber);
	
	public static DeviceFactory factory(String vendor) {
		
		DeviceFactory factory = null;
		switch (vendor) {
		case "cisco":
			factory = new CiscoDeviceFactory();
			break;
		case "juniper":
			factory = new JuniperDeviceFactory();
			break;
		default:
			throw new RuntimeException(String.format("Unsupported vendor: %s", vendor));
		}
		
		return factory;
	}
	
	
	public static void main(String[] args) {
		Device device = DeviceFactory.factory("cisco").device("router SN123");
	}
}
