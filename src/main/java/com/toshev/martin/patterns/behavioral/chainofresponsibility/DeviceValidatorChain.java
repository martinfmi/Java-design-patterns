package com.toshev.martin.patterns.behavioral.chainofresponsibility;
import com.toshev.martin.patterns.creational.builder.Device;

public class DeviceValidatorChain {

	public boolean validate(DeviceValidator start, Device device) {
		DeviceValidator validator = start;
		boolean valid = true;
		do {
			valid = validator.validate(device);
			validator = validator.getNext();
		} while(valid && validator != null);
		
		return valid;
	}
	
}
