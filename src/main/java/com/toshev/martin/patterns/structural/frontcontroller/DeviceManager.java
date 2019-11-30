package com.toshev.martin.patterns.structural.frontcontroller;

import java.util.HashMap;

import com.toshev.martin.patterns.structural.composite.Device;

public abstract class DeviceManager {

	private HashMap<String, Device> devices = new HashMap<String, Device>();

	public abstract Device createDevice(String serialNumber);

	public void addDevice(String serialNumber, Device device) {
		devices.put(serialNumber, device);
	}

}
