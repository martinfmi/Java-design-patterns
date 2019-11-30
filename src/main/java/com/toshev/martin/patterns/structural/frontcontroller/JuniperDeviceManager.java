package com.toshev.martin.patterns.structural.frontcontroller;

import com.toshev.martin.patterns.structural.composite.Device;

public class JuniperDeviceManager extends DeviceManager {

	@Override
	public Device createDevice(String serialNumber) {
		Device device = null;
		if (serialNumber.contains("router")) {
			device = new JuniperRouter();
		} else {
			throw new RuntimeException(String.format("Unsupported device: %s", serialNumber));
		}

		return device;
	}

}
