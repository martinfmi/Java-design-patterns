package com.toshev.martin.patterns.creational.singleton;

public class LazyCiscoRouterSynchronizedController {
	
	private static volatile LazyCiscoRouterSynchronizedController controller;
	
	private LazyCiscoRouterSynchronizedController() {}
	
	public static LazyCiscoRouterSynchronizedController instance() {
		if(controller == null) {
			synchronized (LazyCiscoRouterSynchronizedController.class) {
				if(controller == null) {
					controller = new LazyCiscoRouterSynchronizedController();
				}
			}
		}
		return controller;
	}
}
