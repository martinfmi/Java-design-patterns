package com.toshev.martin.patterns.behavioral.interpreter;

public class CiscoIOSContext {
	
	// contains some IOS-related parameters etc.
	
	private String configurationTarget;
	
	private String hostname;
	
	public String getConfigurationTarget() {
		return configurationTarget;
	}
	
	public void setConfigurationTarget(String configurationTarget) {
		this.configurationTarget = configurationTarget;
	}
	
	public String getHostname() {
		return hostname;
	}
	
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	
}
