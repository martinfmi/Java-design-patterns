package com.toshev.martin.patterns.structural.bridge;

import com.toshev.martin.patterns.creational.abstractfactory.Device;

public class CiscoDeviceController extends DeviceController {
	
	public CiscoDeviceController(Device device) {
		super(device);
	}
}
