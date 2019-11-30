package com.toshev.martin.patterns.structural.bridge;

import com.toshev.martin.patterns.creational.abstractfactory.CiscoRouter;
import com.toshev.martin.patterns.creational.abstractfactory.Device;

public abstract class DeviceController {

	private Device device;

	public DeviceController(Device device) {
		this.device = device;
	}

	public void start() {
		device.start();
	}

	public void stop() {
		device.stop();
	}
	
	public static void main(String[] args) {
		CiscoRouter device = new CiscoRouter();
		CiscoDeviceController controller = new CiscoDeviceController(device);
		controller.start(); // no need to have CiscoRouterController
	}
}
