package com.designpattern.entities;

import com.designpattern.handlers.Beverage;

/**
 * Apply Decorator Pattern
 * 
 * @author taila
 *
 */
public class PlainBeverage implements Beverage {

	@Override
	public int getCost() {
		return 5;
	}

	@Override
	public String getDecription() {
		return "| Plain Beverage |";
	}

}
