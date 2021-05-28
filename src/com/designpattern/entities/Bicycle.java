package com.designpattern.entities;

import com.designpattern.logger.ConsoleLogger;

/**
 * Apply Adapter Pattern
 * 
 * @author taila
 *
 */
public class Bicycle {
	
	// Create logging
	private ConsoleLogger consoleLogger = new ConsoleLogger();
	
	public void go() {
		consoleLogger.writeInfor("Going by bicycle...");
		System.out.println("Bicycle is chosen !");
	}

}
