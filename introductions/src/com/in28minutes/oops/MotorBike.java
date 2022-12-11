package com.in28minutes.oops;

public class MotorBike {
	// state
	private int speed; // member variable

	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;			
		}
	}
	
	// behavior
	void start() {
		System.out.println("Bike started");
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}
	
	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}
}
