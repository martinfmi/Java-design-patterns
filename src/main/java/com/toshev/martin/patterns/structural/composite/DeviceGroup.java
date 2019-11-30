package com.toshev.martin.patterns.structural.composite;

import java.util.LinkedList;
import java.util.List;

public class DeviceGroup extends Device {

	private List<Device> devices = new LinkedList<Device>();

	public void addDevice(Device device) {
		devices.add(device);
	}
	
	@Override
	public void start() {
		for(Device device : devices) {
			device.start();
		}
	}

	@Override
	public void stop() {
		for(Device device : devices) {
			device.stop();
		}
	}
	
	public List<Device> getDevices() {
		return devices;
	}
}
