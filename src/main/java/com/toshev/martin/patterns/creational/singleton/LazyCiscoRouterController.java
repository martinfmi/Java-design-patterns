package com.toshev.martin.patterns.creational.singleton;

public class LazyCiscoRouterController  {
	
	private static LazyCiscoRouterController controller;
	
	private LazyCiscoRouterController() {}
	
	public static LazyCiscoRouterController instance() {
		if(controller == null) {
			controller = new LazyCiscoRouterController();
		}
		return controller;
	}
}
