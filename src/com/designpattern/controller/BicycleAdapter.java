package com.designpattern.controller;

import com.designpattern.entities.Bicycle;
import com.designpattern.handlers.Vehicle;

/**
 * Apply Adapter Pattern
 * 
 * @author taila
 *
 */
public class BicycleAdapter implements Vehicle {

	private Bicycle bicycle;

	public BicycleAdapter(Bicycle bicycle) {
		this.bicycle = bicycle;
	}

	@Override
	public void accelerate() {
		this.bicycle.go();
	}

}
