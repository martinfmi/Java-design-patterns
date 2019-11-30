package com.toshev.martin.patterns.structural.bridge;

import com.toshev.martin.patterns.creational.abstractfactory.Device;

public class JuniperDeviceController extends DeviceController {

	public JuniperDeviceController(Device device) {
		super(device);
	}
}
