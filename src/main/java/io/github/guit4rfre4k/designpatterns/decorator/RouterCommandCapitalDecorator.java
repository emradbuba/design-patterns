package io.github.guit4rfre4k.designpatterns.decorator;

import org.apache.log4j.Logger;

/**
 * Router decorator transforming the entire send command to UPPERCASE before sending.
 * @author rmu
 *
 */
public class RouterCommandCapitalDecorator extends RouterDefaultDecorator {

	private static Logger LOG = Logger.getLogger(BasicRouter.class);
	
	public RouterCommandCapitalDecorator(Router router) {
		super(router);
	}

	@Override
	public void send(String command) {
		if(command != null) {
			LOG.info(String.format("Changing command \"%s\" to upper case...", command));
			command = command.toUpperCase();
		}
		super.send(command);
	}
	
	
	
	

}
