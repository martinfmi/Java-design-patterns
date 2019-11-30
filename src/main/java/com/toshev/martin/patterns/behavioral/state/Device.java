package com.toshev.martin.patterns.behavioral.state;

public class Device {

	private String serialNumber;

	private String shortName;

	private double price;

	private DeviceState state;

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

	public void setState(DeviceState state) {
		this.state = state;
	}

	public DeviceState getState() {
		return state;
	}

	public void restart() {
		state.restart();
	}

}
