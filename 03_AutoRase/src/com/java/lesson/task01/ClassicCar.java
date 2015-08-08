package com.java.lesson.task01;

@SuppressWarnings("rawtypes")
public class ClassicCar extends BasicCar implements Car, Comparable {
	private char classCar;
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
	static public ClassicCar buildCar(String name, int maxSpeed, int numberOfWheel, int maxPower, String markEngine){
		return new ClassicCar(name, maxSpeed, numberOfWheel, new Engine(maxPower, markEngine));
	}
	
	private ClassicCar(String name, int maxSpeed, int numberOfWheel, Engine engine) {
		super(name, maxSpeed, numberOfWheel, engine);
		setClassCar(engine.getMaxPower());
	}

	public char getClassCar() {
		return classCar;
	}

	private void setClassCar(int engineMaxPower){
		if ( engineMaxPower <= 100) {
			classCar = 'A';
		} else if (engineMaxPower <= 200) {
			classCar = 'B';
		} else if (engineMaxPower <= 300) {
			classCar = 'C';
		} else classCar = 'D';		
	}

	@Override
	public String toString() {
		String str = super.toString(); 
		return "ClassicCar [classCar=" + classCar + ", "+str + "]";
	}
	
	public int compareTo(Object obj) {
		if (obj instanceof ClassicCar ) {
			return stupidHash(this) - stupidHash((ClassicCar)obj);  
		} else {
			System.out.println("This is bad car");
			return -1;
		}
	}
	
	private int stupidHash(ClassicCar car){
		return car.maxSpeed + car.engine.getMaxPower();
	}
}
