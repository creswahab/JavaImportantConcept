package log4jOperations;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class XmlConfiguratorExample {
	
	static Logger logger = Logger.getLogger(XmlConfiguratorExample.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DOMConfigurator.configure("log4j.xml");
		
		logger.debug("This is Debug Message");
		logger.info("This is Info Message");
		logger.warn("This is Warn Message");
		logger.error("This is Error Message");
		logger.fatal("This is Fatal Message");

	}

}
