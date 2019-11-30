package com.toshev.martin.patterns.creational.factorymethod;

import com.toshev.martin.patterns.creational.abstractfactory.Device;
import com.toshev.martin.patterns.creational.abstractfactory.JuniperRouter;

public class JuniperRouterController extends DeviceController {
	
	@Override
	public Device createDevice() {
		return new JuniperRouter();
	}
	
}
