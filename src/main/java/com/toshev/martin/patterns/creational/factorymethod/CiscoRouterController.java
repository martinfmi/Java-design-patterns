package com.toshev.martin.patterns.creational.factorymethod;

import com.toshev.martin.patterns.creational.abstractfactory.CiscoRouter;
import com.toshev.martin.patterns.creational.abstractfactory.Device;

public class CiscoRouterController extends DeviceController {
	
	@Override
	public Device createDevice() {
		return new CiscoRouter();
	}

}
