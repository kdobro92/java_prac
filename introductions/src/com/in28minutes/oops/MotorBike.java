package com.in28minutes.oops;

public class MotorBike {
	// state
	private int speed;

	// behavior
	void start() {
		System.out.println("Bike started");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
