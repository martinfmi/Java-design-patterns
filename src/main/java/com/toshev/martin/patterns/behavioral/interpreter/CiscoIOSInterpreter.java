package com.toshev.martin.patterns.behavioral.interpreter;

import java.util.ArrayList;

public class CiscoIOSInterpreter {

	public void execute(String script) {

		String[] lines = script.split("\\r?\\n");
		CiscoIOSContext context = new CiscoIOSContext();

		ArrayList<CiscoIOSExpression> expressions = new ArrayList<CiscoIOSExpression>(lines.length);
		for (String line : lines) {
			if (line.startsWith("configure ")) {
				context.setConfigurationTarget(line.replace("configure ", ""));
				expressions.add(new ConfigureCiscoIOSExpression());
			} else if (line.startsWith("hostname ")) {
				context.setHostname(line.replace("hostname ", ""));
				expressions.add(new HostnameCiscoIOSExpression());
			}
		}

		MultilineCiscoIOSExpression multilineExpression = new MultilineCiscoIOSExpression(
				expressions.toArray(new CiscoIOSExpression[0]));
		multilineExpression.execute(context);
	}

	public static void main(String[] args) {

		String script = "configure terminal\\n" + "hostname machine.hostname.com";

		CiscoIOSInterpreter interpreter = new CiscoIOSInterpreter();
		interpreter.execute(script);
	}

}
