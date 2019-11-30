package com.toshev.martin.patterns.creational.singleton;

public class CiscoRouterController{
	
	private static CiscoRouterController controller = new CiscoRouterController();
	
	private CiscoRouterController() {}
	
	public static CiscoRouterController instance() {
		return controller;
	}

}
