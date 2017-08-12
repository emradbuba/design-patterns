package io.github.guit4rfre4k.designpatterns.decorator;

import org.apache.log4j.Logger;

/**
 * Decorator responsible for ensure the auto connection before each send in
 * required.
 * 
 * @author rmu
 *
 */
public class RouterAutoConnectDecorator extends RouterDefaultDecorator {

	private static final Logger LOG = Logger.getLogger(RouterAutoConnectDecorator.class);

	public RouterAutoConnectDecorator(Router router) {
		super(router);
	}

	@Override
	public void send(String command) {
		connectIfDisconnected();
		super.send(command);
	}

	private void connectIfDisconnected() {
		if (!isConnected()) {
			super.connect();
		} else {
			LOG.info("Router already connected - no need to connect");
		}
	}

}
