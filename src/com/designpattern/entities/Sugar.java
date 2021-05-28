package com.designpattern.entities;

import com.designpattern.controller.BeverageDecorator;
import com.designpattern.handlers.Beverage;

/**
 * Apply Decorator Pattern
 * 
 * @author taila
 *
 */
public class Sugar extends BeverageDecorator {

	private Beverage beverage;

	public Sugar(Beverage beverage) {
		super(beverage);
		this.beverage = beverage;
	}

	@Override
	public int getCost() {
		return this.beverage.getCost() + 4;
	}

	@Override
	public String getDecription() {
		return this.beverage.getDecription() + "| Sugar |";
	}

}
