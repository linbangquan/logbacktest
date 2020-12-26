package com.lbq.run;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lbq.logback.Foo;
import com.lbq.logback.LogBackTest;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

public class Main {

	private final static Logger logger = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		logger.info("main start");
		LoggerContext lc = (LoggerContext)LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);
		LogBackTest logbackTest = new LogBackTest();
		logbackTest.outputlog();
		
		
		Foo foo = new Foo();
        foo.doIt();
        logger.info("main end");
	}
}
