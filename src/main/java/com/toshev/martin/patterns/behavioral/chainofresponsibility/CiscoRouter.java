package com.toshev.martin.patterns.behavioral.chainofresponsibility;

import com.toshev.martin.patterns.creational.builder.Device;

public class CiscoRouter extends Device {

	public CiscoRouter(String serialNumber, String shortName, double price) {
		super(serialNumber, shortName, price);
	}

}
