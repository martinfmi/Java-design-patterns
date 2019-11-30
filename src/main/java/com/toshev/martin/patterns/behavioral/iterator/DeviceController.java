package com.toshev.martin.patterns.behavioral.iterator;

import com.toshev.martin.patterns.structural.composite.DeviceGroup;
import com.toshev.martin.patterns.structural.frontcontroller.CiscoRouter;
import com.toshev.martin.patterns.structural.frontcontroller.JuniperRouter;

public class DeviceController {

	
	public void startCiscoDevices(DeviceGroup deviceGroup) {
	
		DeviceGroupIterator iterator = new DeviceGroupIterator(deviceGroup);
		
		while (iterator.hasNext()) {
			iterator.next().start();
		}
		
	}

	public static void main(String[] args) {
		
		DeviceGroup group = new DeviceGroup();
		group.addDevice(new CiscoRouter());
		group.addDevice(new JuniperRouter());
		
		DeviceController controller = new DeviceController();
		controller.startCiscoDevices(group);
	}
	
}
