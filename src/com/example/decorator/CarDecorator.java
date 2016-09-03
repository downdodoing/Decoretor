package com.example.decorator;

import com.example.decorator.myinterface.Car;

public abstract class CarDecorator implements Car {
	private Car car;

	public CarDecorator(Car car) {
		this.car = car;
	}

	@Override
	public void show() {
		this.car.show();
	}
}
