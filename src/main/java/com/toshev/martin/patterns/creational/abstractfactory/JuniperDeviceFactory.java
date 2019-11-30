package com.toshev.martin.patterns.creational.abstractfactory;

public class JuniperDeviceFactory implements DeviceFactory {

	@Override
	public Device device(String serialNumber) {
		Device device = null;
		if(serialNumber != null && serialNumber.contains("router")) {
			device = new JuniperRouter();
		} else {
			throw new RuntimeException(String.format("Unsupported device: %s", serialNumber));
		}
		return device;
	}

}
