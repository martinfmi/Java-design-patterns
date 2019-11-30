package com.toshev.martin.patterns.creational.abstractfactory;

public class CiscoDeviceFactory implements DeviceFactory {

	@Override
	public Device device(String serialNumber) {
		Device device = null;
		if(serialNumber != null && serialNumber.contains("router")) {
			device = new CiscoRouter();
		} else {
			throw new RuntimeException(String.format("Unsupported device: %s", serialNumber));
		}
		return device;
	}

}
