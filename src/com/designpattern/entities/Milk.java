package com.designpattern.entities;

import com.designpattern.controller.BeverageDecorator;
import com.designpattern.handlers.Beverage;

/**
 * Apply Decorator Pattern
 * 
 * @author taila
 *
 */
public class Milk extends BeverageDecorator {

	private Beverage beverage;

	public Milk(Beverage beverage) {
		super(beverage);
		this.beverage = beverage;
	}

	@Override
	public int getCost() {
		return this.beverage.getCost() + 7;
	}

	@Override
	public String getDecription() {
		return this.beverage.getDecription() + "| Milk |";
	}

}
