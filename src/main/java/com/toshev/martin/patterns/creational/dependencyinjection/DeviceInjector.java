package com.toshev.martin.patterns.creational.dependencyinjection;

import com.toshev.martin.patterns.creational.abstractfactory.CiscoRouter;
import com.toshev.martin.patterns.creational.abstractfactory.Device;

public class DeviceInjector {

	public void inject(DeviceController controller, Device device) {
		controller.setDevice(device);
	}
	
	public static void main(String[] args) {
		DeviceInjector injector = new DeviceInjector();
		Device router = new CiscoRouter();
		DeviceController controller = new DeviceController();
		injector.inject(controller, router);
	}
	
}
