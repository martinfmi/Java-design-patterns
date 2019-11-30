package com.toshev.martin.patterns.structural.adapter;

import com.toshev.martin.patterns.creational.abstractfactory.CiscoRouter;
import com.toshev.martin.patterns.creational.abstractfactory.JuniperRouter;

public class JuniperRouterAdapter extends CiscoRouter {

	private JuniperRouter juniperRouter;
	
	public JuniperRouterAdapter(JuniperRouter juniperRouter) {
		this.juniperRouter = juniperRouter;
	}
	
	@Override
	public void start() {
		juniperRouter.start();
	}
	
	@Override
	public void stop() {
		juniperRouter.stop();
	}
	
	public static void main(String[] args) {
		JuniperRouter juniperRouter = new JuniperRouter();
		CiscoRouter ciscoRouter = new JuniperRouterAdapter(juniperRouter);
		ciscoRouter.start();
	}
}
