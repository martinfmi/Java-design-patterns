package com.toshev.martin.patterns.behavioral.templatemethod;

public abstract class JuniperConfigurationValidator extends DeviceConfigurationValidator {

	protected boolean validateConfigurationSyntax() {
		boolean result = true;
		// validate Juniper configuration syntax ...
		return result;
	}

	protected boolean validateCommandParameters() {
		boolean result = true;
		// validate Juniper configuration command parameters ...
		return result;
	}

}
