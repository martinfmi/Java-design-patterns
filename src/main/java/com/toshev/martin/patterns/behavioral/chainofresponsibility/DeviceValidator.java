package com.toshev.martin.patterns.behavioral.chainofresponsibility;

import com.toshev.martin.patterns.creational.builder.Device;

public abstract class DeviceValidator {
	
	private DeviceValidator next;
	
	public abstract boolean validate(Device device);
	
	public DeviceValidator addNext(DeviceValidator validator) {
		next = validator;
		return this;
	}
	
	public boolean hasNext() {
		return next != null;
	}
	
	public DeviceValidator getNext() {
		return next;
	}
	
}
