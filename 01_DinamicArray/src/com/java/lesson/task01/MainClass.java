package com.java.lesson.task01;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("MAIN in MainClass");
		SuperClass memberOfSuperClass = new SuperClass("111");
		SubClass memberOfSubClass = new SubClass();
	}
}
