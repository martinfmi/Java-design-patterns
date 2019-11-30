package com.toshev.martin.patterns.behavioral.chainofresponsibility;

public class DeviceController {

	public static void main(String[] args) {
		
		DeviceValidator startValidator = new SerialNumberValidator();
		startValidator.addNext(new PriceValidator());
		
		DeviceValidatorChain validationChain = new DeviceValidatorChain();
		boolean valid = validationChain.validate(startValidator, new CiscoRouter("SN 123", "router", 1000));
		System.out.println(valid);
	}
	
}
