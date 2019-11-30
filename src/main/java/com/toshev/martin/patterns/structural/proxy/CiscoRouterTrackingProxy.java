package com.toshev.martin.patterns.structural.proxy;

import java.util.logging.Logger;

import com.toshev.martin.patterns.structural.composite.Device;
import com.toshev.martin.patterns.structural.frontcontroller.CiscoRouter;

public class CiscoRouterTrackingProxy extends Device {

	private Logger logger = Logger.getLogger(CiscoRouterTrackingProxy.class.getName());

	private CiscoRouter ciscoRouter;

	public CiscoRouterTrackingProxy(CiscoRouter ciscoRouter) {
		this.ciscoRouter = ciscoRouter;
	}

	@Override
	public void start() {
		logger.info("Starting cisco router ...");
		ciscoRouter.start();
	}

	@Override
	public void stop() {
		logger.info("Stopping cisco router ...");
		ciscoRouter.stop();
	}

}
