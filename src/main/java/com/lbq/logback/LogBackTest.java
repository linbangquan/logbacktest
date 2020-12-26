package com.lbq.logback;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
public class LogBackTest {

	private final static Logger logger = LoggerFactory.getLogger(LogBackTest.class);
	
	public void outputlog() {
		if(logger.isInfoEnabled()) {
			logger.info("test info");
		}
		
		if(logger.isDebugEnabled()) {
			logger.debug("test debug");
		}
		
		if(logger.isWarnEnabled()) {
			logger.warn("test warn");
		}
		
		if(logger.isTraceEnabled()) {
			logger.trace("test trace");
		}
		
		if(logger.isErrorEnabled()) {
			logger.error("test error");
		}
			
	}
}
