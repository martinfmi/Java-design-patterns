package com.toshev.martin.patterns.creational.objectpool;

import java.util.HashMap;
import java.util.Map;

import com.toshev.martin.patterns.creational.abstractfactory.CiscoRouter;
import com.toshev.martin.patterns.creational.abstractfactory.Device;

public class CiscoDevicePool {

	private Map<String, Device> devicePool = new HashMap<String, Device>();
	
	public Device getDevice(String serialNumber) {
		Device device = devicePool.get(serialNumber);
		if(device == null) {
			device = new CiscoRouter();
			// set proper device settings ...
			devicePool.put(serialNumber, device);
		}
		return device;
	}
	
}
