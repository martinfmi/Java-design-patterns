package com.toshev.martin.patterns.structural.facade;

import com.toshev.martin.patterns.structural.composite.Device;
import com.toshev.martin.patterns.structural.composite.DeviceGroup;

public class DeviceManager {

	private DeviceGroup devices;
	
	public void initialize() {
		devices = new DeviceGroup();
		// do some complex device initialization ...
		for(Device device : devices.getDevices()) {
			device.start();
		}
	}

	public static void main(String[] args) {
		DeviceManager manager = new DeviceManager();
		manager.initialize();
	}
}
