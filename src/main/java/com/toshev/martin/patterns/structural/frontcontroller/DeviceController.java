package com.toshev.martin.patterns.structural.frontcontroller;

import java.util.HashMap;

// device controller serves as the front controller
public class DeviceController {

	private HashMap<String, DeviceManager> vendorToDeviceManager = new HashMap<String, DeviceManager>();
	
	public DeviceController() {
		vendorToDeviceManager.put("cisco", new CiscoDeviceManager());
		vendorToDeviceManager.put("juniper", new JuniperDeviceManager());
		
	}
	
	public void invokeOperation(String vendor, String serialNumber, String operation) {
		DeviceManager manager = vendorToDeviceManager.get(vendor);
		if("create".equals(operation)) {
			manager.createDevice(serialNumber);
		}
	}

	public static void main(String[] args) {
		DeviceController controller = new DeviceController();
		controller.invokeOperation("cisco", "router SN123", "create");
	}
}
