package com.toshev.martin.patterns.behavioral.command;

import java.util.HashMap;

import com.toshev.martin.patterns.structural.composite.Device;
import com.toshev.martin.patterns.structural.frontcontroller.CiscoRouter;

public class DeviceController {

	private HashMap<String, DeviceCommand> commandHandlers = new HashMap<String, DeviceCommand>();
	
	public void addCommand(String command, DeviceCommand commandHandler) {
		commandHandlers.put(command, commandHandler);
	}

	public void execute(Device device, String operation) {
		DeviceCommand command = commandHandlers.get(operation);
		if(command != null) {
			command.execute(device);
		}
	}
	
	public static void main(String[] args) {
		DeviceController controller = new DeviceController();
		controller.addCommand("start", new StartCommand());
		controller.addCommand("stop", new StartCommand());
		
		CiscoRouter router = new CiscoRouter();
		controller.execute(router, "start");
	}
	
}
