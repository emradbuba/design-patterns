package io.github.guit4rfre4k.designpatterns.decorator;

import org.apache.log4j.Logger;

/**
 * Decorator responsible for ensuring that router is always disconnected after
 * send.
 * 
 * @author rmu
 *
 */
public class RouterAutoDisconnectDecorator extends RouterDefaultDecorator {

	private static final Logger LOG = Logger.getLogger(RouterAutoDisconnectDecorator.class);

	public RouterAutoDisconnectDecorator(Router router) {
		super(router);
	}

	@Override
	public void send(String command) {
		super.send(command);
		disconnectIfConnected();
	}

	private void disconnectIfConnected() {
		if (isConnected()) {
			super.disconnect();
		} else {
			LOG.info("Router already disconnected - no need to disconnect");
		}
	}

}
