package com.toshev.martin.patterns.behavioral.visitor;

public class SerialNumberValidator extends DeviceValidator {

	@Override
	public boolean validate(Device device) {
		return device.getSerialNumber().contains("SN");
	}

}
