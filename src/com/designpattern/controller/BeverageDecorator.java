package com.designpattern.controller;

import com.designpattern.handlers.Beverage;

/**
 * Apply Decorator Pattern
 * 
 * @author taila
 *
 */
public abstract class BeverageDecorator implements Beverage {
	
	protected Beverage beverage;

	public BeverageDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public int getCost() {
		return this.beverage.getCost();
	}

	@Override
	public String getDecription() {
		return this.beverage.getDecription();
	}
	
}
