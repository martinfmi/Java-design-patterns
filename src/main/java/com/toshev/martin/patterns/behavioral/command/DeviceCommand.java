package com.toshev.martin.patterns.behavioral.command;

import com.toshev.martin.patterns.structural.composite.Device;

public abstract class DeviceCommand {

	public abstract void execute(Device device);
	
}
