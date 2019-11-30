package com.toshev.martin.patterns.behavioral.observer;

import java.util.LinkedList;
import java.util.List;

import com.toshev.martin.patterns.behavioral.memento.DeviceSnapshot;

public class Device {
	
	private List<Device> connectedDevices = new LinkedList<>();
	
	private String serialNumber;
	
	private String shortName; 
	
	private double price;

	public Device(String serialNumber, String shortName, double price) {
		this.serialNumber = serialNumber;
		this.shortName = shortName;
		this.price = price;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public String getShortName() {
		return shortName;
	}
	
	public double getPrice() {
		return price;
	}

	public void addConnectedDevice(Device device) {
		connectedDevices.add(device);
	}
	
	public void restart() {
		// restart current device ...
		
		for(Device connectedDevice : connectedDevices) {
			connectedDevice.restart();
		}
	}
	
	public static void main(String[] args) {
		Device device = new Device("SN 123", "router", 30);
		Device switch1 = new Device("SN 124", "switch1", 10);
		Device switch2 = new Device("SN 125", "switch2", 10);
		device.addConnectedDevice(switch1);
		device.addConnectedDevice(switch2);
		
		device.restart();
	}
	
}
