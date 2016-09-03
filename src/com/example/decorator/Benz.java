package com.example.decorator;

import android.util.Log;

import com.example.decorator.myinterface.Car;

public class Benz implements Car {
	@Override
	public void show() {
		Log.i("Benz", "奔驰车的默认颜色为黑色");
	}
}
