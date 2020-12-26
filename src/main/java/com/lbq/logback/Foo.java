package com.lbq.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Foo {

	public static final Logger logger = LoggerFactory.getLogger(Foo.class);

    public void doIt() {
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
