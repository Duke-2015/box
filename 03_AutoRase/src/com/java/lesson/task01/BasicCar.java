package com.java.lesson.task01;

public abstract class BasicCar implements Car {
	final protected String name;
	protected int maxSpeed; 
	protected int numberOfWheel; 
	protected Engine engine;
	
	protected BasicCar(String name, int maxSpeed, int numberOfWheel, Engine engine) {
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.numberOfWheel = numberOfWheel;
		this.engine = engine;
	}

	@Override
	public void moveForward(int speed) {
		System.out.println(name + " moves by speed " + speed);
	}

	@Override
	public void moveBack(int speed) {
		System.out.println(name + " moves back by speed " + speed);
	}

	@Override
	public void turnLeft(int angle) {
		System.out.println(name + " turns left by angle " + angle);
	}

	@Override
	public void turnRigth(int angle) {
		System.out.println(name + " turns rigth by angle " + angle);
	}

	@Override
	public void changeWheel(int index) {
		System.out.println(name + " chenges wheel number " + index);
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getNumberOfWheel() {
		return numberOfWheel;
	}

	public void setNumberOfWheel(int numberOfWheel) {
		this.numberOfWheel = numberOfWheel;
	}

	@Override
	public String toString() {
		return "name=" + name + ", maxSpeed=" + maxSpeed
				+ ", numberOfWheel=" + numberOfWheel + ", engine=" + engine
				+ "";
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getName() {
		return name;
	}

	
	
}
