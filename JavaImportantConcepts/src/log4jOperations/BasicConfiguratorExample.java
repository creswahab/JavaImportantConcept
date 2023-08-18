package log4jOperations;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfiguratorExample {
	
	static Logger logger = Logger.getLogger(BasicConfiguratorExample.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasicConfigurator.configure();
		
		logger.debug("This is Debug Message");
		logger.info("This is Info Message");
		logger.warn("This is Warn Message");
		logger.error("This is Error Message");
		logger.fatal("This is Fatal Message");

	}

}
