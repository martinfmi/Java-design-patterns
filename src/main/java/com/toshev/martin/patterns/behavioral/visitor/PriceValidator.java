package com.toshev.martin.patterns.behavioral.visitor;

public class PriceValidator extends DeviceValidator {

	@Override
	public boolean validate(Device device) {
		return device.getPrice() > 0;
	}

}
