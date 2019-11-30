package com.toshev.martin.patterns.creational.prototype;

public abstract class Device {
	
	@Override
	protected abstract Device clone() throws CloneNotSupportedException;
}
