package com.toshev.martin.patterns.behavioral.mediator;

public class CiscoIOSInterpreter {
	
	private CiscoDeviceManager manager;
	
	public void execute(String script) {
	}
	
	public void startDevice() {
		manager.startDevice();
	}
	
	public void stopDevice() {
		manager.stopDevice();
	}
}

