package com.toshev.martin.patterns.behavioral.iterator;

import com.toshev.martin.patterns.structural.composite.Device;
import com.toshev.martin.patterns.structural.composite.DeviceGroup;

public class DeviceGroupIterator extends Iterator<Device>{

	private DeviceGroup group;
	
	private int currentIndex = 0;
	
	public DeviceGroupIterator(DeviceGroup group) {
		this.group = group;
	}
	
	@Override
	public boolean hasNext() {
		return currentIndex < group.getDevices().size();
	}
	
	@Override
	public Device next() {
		return group.getDevices().get(currentIndex++);
	}
	
}
