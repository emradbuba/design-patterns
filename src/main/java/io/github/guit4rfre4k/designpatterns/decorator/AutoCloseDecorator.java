package io.github.guit4rfre4k.designpatterns.decorator;

import org.apache.log4j.Logger;

public class AutoCloseDecorator extends RouterDefaultDecorator {

	private static Logger LOG = Logger.getLogger(BasicRouter.class);
	private static final String LOG_MESSAGE = "Performig the resource closing in AutoCloseable logic";

	public AutoCloseDecorator(Router router) {
		super(router);
	}

	@Override
	public void close() throws Exception {
		LOG.info(LOG_MESSAGE);
		super.close();
	}

}
