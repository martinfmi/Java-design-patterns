package com.toshev.martin.patterns.behavioral.command;

import com.toshev.martin.patterns.structural.composite.Device;

public class StopCommand extends DeviceCommand {

	@Override
	public void execute(Device device) {
		device.stop();
	}
	
}
