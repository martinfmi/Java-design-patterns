package com.toshev.martin.patterns.creational.dependencyinjection;

import com.toshev.martin.patterns.creational.abstractfactory.Device;

public class DeviceController {

	private Device device;
	
	public void setDevice(Device device) {
		this.device = device;
	}
}
