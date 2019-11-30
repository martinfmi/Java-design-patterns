package com.toshev.martin.patterns.behavioral.templatemethod;

public abstract class CiscoConfigurationValidator extends DeviceConfigurationValidator {

	protected boolean validateConfigurationSyntax() {
		boolean result = true;
		// validate Cisco configuration syntax ...
		return result;
	}

	protected boolean validateCommandParameters() {
		boolean result = true;
		// validate Cisco configuration command parameters ...
		return result;
	}

}
