package com.toshev.martin.patterns.behavioral.templatemethod;

import com.toshev.martin.patterns.behavioral.memento.Device;

public abstract class DeviceConfigurationValidator {
	
	public boolean validate(Device device) {
		
		boolean result = validateConfigurationSyntax() && validateCommandParameters();
		return result;
	}

	protected abstract boolean validateCommandParameters();

	protected abstract boolean validateConfigurationSyntax();
	
}
