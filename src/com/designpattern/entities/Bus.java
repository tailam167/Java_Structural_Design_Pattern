package com.designpattern.entities;

import com.designpattern.handlers.Vehicle;
import com.designpattern.logger.ConsoleLogger;

/**
 * Apply Adapter Pattern
 * 
 * @author taila
 *
 */
public class Bus implements Vehicle {

	// Create logging
	private ConsoleLogger consoleLogger = new ConsoleLogger();

	@Override
	public void accelerate() {
		consoleLogger.writeInfor("Going by bus ...");
		System.out.println("Bus is accelerating ...");
	}

}
