package com.toshev.martin.patterns.behavioral.mediator;

import com.toshev.martin.patterns.behavioral.interpreter.CiscoIOSInterpreter;
import com.toshev.martin.patterns.creational.abstractfactory.CiscoDevice;

public class CiscoDeviceManager {

	private CiscoIOSInterpreter interpreter;
	
	private CiscoDevice ciscoDevice;

	public void setInterpreter(CiscoIOSInterpreter interpreter) {
		this.interpreter = interpreter;
	}
	
	public void setCiscoDevice(CiscoDevice ciscoDevice) {
		this.ciscoDevice = ciscoDevice;
	}

	public void executeScript(String script) {
		interpreter.execute(script);
	}

	public void startDevice() {
		ciscoDevice.start();
	}

	public void stopDevice() {
		ciscoDevice.start();
	}
	
}
