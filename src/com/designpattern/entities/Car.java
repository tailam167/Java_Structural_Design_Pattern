package com.designpattern.entities;

import com.designpattern.handlers.Vehicle;
import com.designpattern.logger.ConsoleLogger;

/**
 * Apply Adapter Pattern
 * 
 * @author taila
 *
 */
public class Car implements Vehicle {

	// Create logging
	private ConsoleLogger consoleLogger = new ConsoleLogger();

	@Override
	public void accelerate() {
		consoleLogger.writeInfor("Going by car ...");
		System.out.println("Car is accelerating ...");
	}

}
