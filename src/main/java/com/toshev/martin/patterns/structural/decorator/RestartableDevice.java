package com.toshev.martin.patterns.structural.decorator;

import com.toshev.martin.patterns.structural.composite.Device;

public abstract class RestartableDevice extends Device {

	private Device device;

	public RestartableDevice(Device device) {
		this.device = device;
	}

	public void restart() {
		device.stop();
		device.start();
	}

}
