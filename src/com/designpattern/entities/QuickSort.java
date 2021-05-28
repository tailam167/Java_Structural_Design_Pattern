package com.designpattern.entities;

import com.designpattern.handlers.AlgorithmFacade;
import com.designpattern.logger.ConsoleLogger;

/**
 * Apply Facade Pattern
 * 
 * @author taila
 *
 */
public class QuickSort implements AlgorithmFacade {

	// Create logging
	private ConsoleLogger consoleLogger = new ConsoleLogger();

	@Override
	public void sort() {
		consoleLogger.writeNotify("Using Quick Sort...");
		System.out.println("Quick Sort is applied !");
	}

}
