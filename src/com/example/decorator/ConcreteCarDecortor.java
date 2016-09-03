package com.example.decorator;

import android.util.Log;

import com.example.decorator.myinterface.Car;

public class ConcreteCarDecortor extends CarDecorator {

	public ConcreteCarDecortor(Car car) {
		super(car);
	}

	private void print() {
		Log.i("ConcreteCarDecortor", "新手");
	}

	private void setGps() {
		Log.i("ConcreteCarDecortor", "安装GPS导航");
	}

	@Override
	public void show() {
		super.show();
		print();
		setGps();
	}
}
