package com.java.lesson.task01;

public class SubClass extends SuperClass{
	
	public SubClass() {
		super("!!!");
		System.out.println("From SubClass conctract -> " + this.varPublic);		
	}

	static{
		System.out.println("From static init section from SubClass -> " + SuperClass.varStatic);
	}
	
	{
		System.out.println("From init section from SubClass -> " + this.varPublic);
	}
	
	public static void main(String[] args) {
		System.out.println("MAIN in SubClass");
//		SuperClass memberOfSuperClass = new SuperClass("111");
		SubClass memberOfSubClass = new SubClass();
	}
}
