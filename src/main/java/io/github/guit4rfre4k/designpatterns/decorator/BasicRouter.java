package io.github.guit4rfre4k.designpatterns.decorator;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * A concrete class implementing a basic router.
 * 
 * @author rmu
 *
 */
public class BasicRouter implements Router {

	private boolean isConnected = false;
	private final String routerName;
	
	private static Logger LOG = Logger.getLogger(BasicRouter.class.toString());
	static {
		LOG.setLevel(Level.INFO);
	}
	
	public BasicRouter(String routerName) {
		this.routerName = routerName;
	}
	
	public void send(String command) {
		if(!isConnected) {
			LOG.error("Connection error - device not connected");
			return;
		}
		LOG.info("## Sending command \"" + command + "\" to the router");
		// TODO: Implement the real function of sending...
	}
	
	public void connect() {
		LOG.info(String.format("Connecting the %s router...", this.routerName));
		isConnected = true;
	}
	
	public void disconnect() {
		LOG.info(String.format("Disconnecting the %s router...", this.routerName));
		isConnected = false;
	}
	
	public boolean isConnected() {
		return this.isConnected;
	}

	public String getRouterInfo() {
		StringBuilder builder = new StringBuilder("\n================\nRouter info:")
				.append("\n\tDevice name: " + this.routerName)
				.append("\n\tConnection state: " + (isConnected ? "CONNECTED" : "DISCONNECTED"))
				.append("\n================");
		return builder.toString();
	}

}
