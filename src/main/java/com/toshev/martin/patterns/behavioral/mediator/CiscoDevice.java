package com.toshev.martin.patterns.behavioral.mediator;

public class CiscoDevice {
	
	private CiscoDeviceManager manager;
	
	public void start() {
	}
	
	public void stop() {
	}
	
	public void executeScript(String script) {
		manager.executeScript(script);
	}
	
}
