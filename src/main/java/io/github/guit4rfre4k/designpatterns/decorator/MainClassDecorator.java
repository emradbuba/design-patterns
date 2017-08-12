package io.github.guit4rfre4k.designpatterns.decorator;

import org.apache.log4j.Logger;

public class MainClassDecorator {

	private static Logger LOG = Logger.getLogger(MainClassDecorator.class);

	private static final String COMMAND_1 = "show routing table -r -t 5";
	private static final String COMMAND_2 = "restart --force --no-quit";

	public static void main(String[] args) {

		// Router router = new BasicRouter("CiscoRouter");
		Router router = new RouterCommandCapitalDecorator(new RouterAutoDisconnectDecorator(
				new RouterAutoConnectDecorator(new BasicRouter("CiscoRouter"))));
		router.send(COMMAND_1);
		router.send(COMMAND_2);
		LOG.info(router.getRouterInfo());
	}

}
