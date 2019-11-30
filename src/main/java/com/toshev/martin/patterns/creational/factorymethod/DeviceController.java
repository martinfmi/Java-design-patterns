package com.toshev.martin.patterns.creational.factorymethod;

import com.toshev.martin.patterns.creational.abstractfactory.Device;

public abstract class DeviceController {
	
	public void start() {
		Device device = createDevice();
		// ... do something with device
	}
	
	public abstract Device createDevice();
	
	public static void main(String[] args) {
		new CiscoRouterController().start();
	}
}
