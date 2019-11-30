package com.toshev.martin.patterns.structural.frontcontroller;

import com.toshev.martin.patterns.structural.composite.Device;

public class CiscoDeviceManager extends DeviceManager {

	@Override
	public Device createDevice(String serialNumber) {
		Device device = null;
		if(serialNumber.contains("router")) {
			device = new CiscoRouter();
		} else {
			throw new RuntimeException(String.format("Unsupported device: %s", serialNumber));
		}
		
		return device;
	}
}
