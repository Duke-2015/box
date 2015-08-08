package com.java.lesson.task01;

@SuppressWarnings("rawtypes")
public class RetroCar extends BasicCar implements Car, Comparable {
	private String classCar;
	private int year;
	private int price = 0;
//	extends
//	final protected String name;
//	protected int maxSpeed; 
//	protected int numberOfWheel; 
//	protected Engine engine;
//	
//	@Override
//	public void moveForward(int speed) {
//	@Override
//	public void moveBack(int speed) {
//	@Override
//	public void turnLeft(int angle) {
//	@Override
//	public void turnRigth(int angle) {
//	@Override
//	public void changeWheel(int index) {

//	factory
	static public RetroCar buildCar(String name, int maxSpeed, int numberOfWheel, int maxPower, String markEngine, int year){
		return new RetroCar(name, maxSpeed, numberOfWheel, new Engine(maxPower, markEngine), year);
	}
	
	private RetroCar(String name, int maxSpeed, int numberOfWheel, Engine engine, int year) {
		super(name, maxSpeed, numberOfWheel, engine);
		this.year = year;
		setClassCar(engine.getMaxPower());
		setPrice(year, engine.getMaxPower());
	}
	
	private void setClassCar(int engineMaxPower){
		if (engineMaxPower <= 100) {
			classCar = "retroA";
		} else if (engineMaxPower <= 200) {
			classCar = "retroB";
		} else if (engineMaxPower <= 300) {
			classCar = "retroC";
		} else classCar = "retroD";
	}
	
	@Override
	public String toString() {
		String str = super.toString(); 
		return "RetroCar [classCar=" + classCar + ", year=" + year + ", price="
				+ price + " " + str +"]";
	}
	
	public int compareTo(Object obj) {
		if (obj instanceof RetroCar ) {
			return stupidHash(this) -stupidHash((RetroCar)obj);  
		} else {
			System.out.println("This is bad car 2");
			return -1;
		}
	}
	
	private int stupidHash(RetroCar car){
		return (car.price);
	}
	
	private void setPrice(int year, int engineMaxPower){
		price = year * engineMaxPower;
	}

	public String getClassCar() {
		return classCar;
	}

	public int getYear() {
		return year;
	}

	public int getPrice() {
		return price;
	}

}
