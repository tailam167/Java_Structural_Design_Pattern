package com.designpattern.entities;

import com.designpattern.handlers.AlgorithmFacade;
import com.designpattern.logger.ConsoleLogger;

/**
 * Apply Facade Pattern
 * 
 * @author taila
 *
 */
public class MergeSort implements AlgorithmFacade {
	
	// Create logging
	private ConsoleLogger consoleLogger = new ConsoleLogger();

	@Override
	public void sort() {
		consoleLogger.writeNotify("Using Merge Sort...");
		System.out.println("Merge Sort is applied !");
	}

}
