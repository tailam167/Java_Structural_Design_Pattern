package com.designpattern;

import com.designpattern.controller.BicycleAdapter;
import com.designpattern.controller.SortingManager;
import com.designpattern.entities.Bicycle;
import com.designpattern.entities.Bus;
import com.designpattern.entities.Car;
import com.designpattern.entities.Milk;
import com.designpattern.entities.PlainBeverage;
import com.designpattern.entities.Sugar;
import com.designpattern.handlers.Beverage;
import com.designpattern.handlers.Vehicle;
import com.designpattern.logger.ConsoleLogger;

/**
 * Demo Apply Structural Design Pattern
 * 
 * @author taila
 *
 */
public class App {

	public static void main(String[] args) {

		// Create Logging
		ConsoleLogger consoleLogger = new ConsoleLogger();
		consoleLogger.writeInfor("<STRUCTURAL DESIGN PATTERN>");

		/**
		 * Apply Decorator Pattern: Class should be opened for extension and closed for
		 * modification. Allow classes to be easily extended with new behavior without
		 * modifying existing code. Make your code more flexible, if requirement is
		 * changed we do not have to rewrite the whole application. Applying OCP
		 * everywhere can lead to hard to understand code. So Decorator Pattern attaches
		 * additional responsibilities to an object dynamically. It will provide a
		 * flexible alternative to sub-class for extending functionality.
		 */
		Beverage beverage1 = new Sugar(new Milk(new PlainBeverage()));

		consoleLogger.writeNotify("Calculating...");
		System.out.println(beverage1.getCost());
		System.out.println(beverage1.getDecription());

		Beverage beverage2 = new Sugar(new Sugar(new Milk(new PlainBeverage())));
		consoleLogger.writeNotify("Calculating...");
		System.out.println(beverage2.getCost());
		System.out.println(beverage2.getDecription());

		/**
		 * Apply Facade Pattern: provides a unified interface to a set of interface in a
		 * system. It will define a high level interface that make the subsystem which
		 * easier to use.
		 */
		SortingManager sortingManager = new SortingManager();
		sortingManager.doBubbleSort();
		sortingManager.doMergeSort();
		sortingManager.doQuickSort();

		/**
		 * Apply Adapter Pattern: converts an interface of a class into another
		 * interface which client expect. Enables classes working together that could
		 * not otherwise because of the incompatible interfaces. Relies heavily on
		 * composition. Composition is very important --> Favor composition over
		 * inheritance.
		 */
		Vehicle bus = new Bus();
		Vehicle car = new Car();
		Vehicle bicycle = new BicycleAdapter(new Bicycle());

		consoleLogger.writeNotify("Choosing vehicle...");
		bus.accelerate();
		car.accelerate();
		bicycle.accelerate();
	}
}
