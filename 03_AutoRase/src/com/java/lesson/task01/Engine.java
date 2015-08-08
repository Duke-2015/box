package com.java.lesson.task01;

public class Engine {
	private int maxPower;
	final private String mark;
	
	public Engine(int maxPower, String mark) {
		this.maxPower = maxPower;
		this.mark = mark;
	}

	public int getMaxPower() {
		return maxPower;
	}

	public void setMaxPower(int maxPower) {
		this.maxPower = maxPower;
	}

	public String getMark() {
		return mark;
	}

	@Override
	public String toString() {
		return "[maxPower=" + maxPower + ", mark=" + mark + "]";
	}

	
}
