package io.github.guit4rfre4k.designpatterns.decorator;

import org.apache.log4j.Logger;
/**
 * The example with router shows a sample implementation of the decorator design pattern. 
 * In this example it is assumed, that the Router class represents some router device to
 * which the user can send some commands (in example, commands are unreal and used as demo).
 * Decorrators are used in order to add some extra functionalities to the base implementation
 * like auto-connecting, automatic disconnection, clearing some resources in AutoClosable manner etc...
 *  
 * @author rmu
 */
public class MainClassDecorator {

	private static Logger LOG = Logger.getLogger(MainClassDecorator.class);

	/**
	 * A sample query to router without any particular sense - just for demo purposes.
	 */
	private static final String COMMAND_1 = "show routing table -r -t 5";
	/**
	 * A sample query to router without any particular sense - just for demo purposes.
	 */
	private static final String COMMAND_2 = "restart --force --no-quit";

	public static void main(String[] args) {

		try (Router router = new AutoCloseDecorator(new RouterCommandCapitalDecorator(
				new RouterAutoDisconnectDecorator(new RouterAutoConnectDecorator(
						new BasicRouter("JuniperRouter")))))) {
			router.send(COMMAND_1);
			router.send(COMMAND_2);
			LOG.info(router.getRouterInfo());			
		} catch (Exception e) {
			// Some logic performed in case of unexpected failures
		}
	}

}
