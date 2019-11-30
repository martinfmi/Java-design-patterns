package com.toshev.martin.patterns.creational.lazyinitialization;

import com.toshev.martin.patterns.creational.abstractfactory.CiscoRouter;
import com.toshev.martin.patterns.creational.abstractfactory.Device;
import com.toshev.martin.patterns.creational.factorymethod.DeviceController;

public class CiscoRouterController extends DeviceController {
	
	private Device device;
	
	@Override
	public Device createDevice() {
		if(device == null) {
			device = new CiscoRouter();
		}
		return device;
	}

}
