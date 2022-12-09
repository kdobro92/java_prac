package com.in28minutes.oops;

public class MotorBike {
	// state
	private int speed;
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	// behavior
	void start() {
		System.out.println("Bike started");
	}
}
