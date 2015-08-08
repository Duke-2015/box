package com.java.lesson.task01;

public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		Car car1 = ClassicCar.buildCar(name, maxSpeed, numberOfWheel, maxPower, markEngine);
//		Car car3 = RetroCar.buildCar(name, maxSpeed, numberOfWheel, maxPower, markEngine, year)
		Car car1 = ClassicCar.buildCar("First", 100, 4, 200, "Evgen");
		Car car2 = ClassicCar.buildCar("Second", 10, 4, 100, "Evgen");
		Car car3 = RetroCar.buildCar("Third", 100500, 4, 120, "Vova", 1987);
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		car1.moveBack(10);
		RetroCar car04 = RetroCar.buildCar("Fourth", 15, 4, 20, "Vova", 2000);
		ClassicCar car05 = ClassicCar.buildCar("Fifth", 100, 4, 20, "Evgen");
		ClassicCar car06 = ClassicCar.buildCar("Sixth", 500, 4, 1, "Evgen");
		car04.moveForward(444);
		System.out.println(car04.getClassCar());
		System.out.println(car05.compareTo(car06));
		System.out.println(car05.compareTo(car04));
		
	}

}
