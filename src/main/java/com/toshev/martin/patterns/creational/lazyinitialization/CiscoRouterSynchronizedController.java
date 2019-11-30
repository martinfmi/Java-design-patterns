package com.toshev.martin.patterns.creational.lazyinitialization;

import com.toshev.martin.patterns.creational.abstractfactory.CiscoRouter;
import com.toshev.martin.patterns.creational.abstractfactory.Device;
import com.toshev.martin.patterns.creational.factorymethod.DeviceController;

public class CiscoRouterSynchronizedController extends DeviceController {
	
	private volatile Device device;
	
	@Override
	public Device createDevice() {
		if(device == null) {
			synchronized (this) {
				if(device == null) {
					device = new CiscoRouter();
				}
			}
		}
		return device;
	}
}
