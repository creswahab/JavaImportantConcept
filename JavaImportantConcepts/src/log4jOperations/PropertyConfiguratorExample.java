package log4jOperations;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyConfiguratorExample {
	
	static Logger logger = Logger.getLogger(PropertyConfiguratorExample.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PropertyConfigurator.configure("log4j.properties");
		
		logger.debug("This is Debug Message");
		logger.info("This is Info Message");
		logger.warn("This is Warn Message");
		logger.error("This is Error Message");
		logger.fatal("This is Fatal Message");

	}

}
