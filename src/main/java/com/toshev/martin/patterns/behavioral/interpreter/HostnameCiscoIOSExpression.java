package com.toshev.martin.patterns.behavioral.interpreter;

public class HostnameCiscoIOSExpression extends CiscoIOSExpression {
	
	public void execute(CiscoIOSContext context) {
		String hostname = context.getHostname();
		// execute hostname <hostname> ... 
	}
	
}
