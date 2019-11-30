package com.toshev.martin.patterns.behavioral.strategy;

import com.toshev.martin.patterns.creational.builder.Device;

public abstract class DeviceValidator {
	
	public abstract boolean validate(Device device);
	
}
