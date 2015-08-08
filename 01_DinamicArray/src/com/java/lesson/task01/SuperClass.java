package com.java.lesson.task01;

public class SuperClass {
	static String varStatic;
	public String varPublic;
// Why I cann't do its final
	static final String varStatic1 = "!!!!";
	
	public SuperClass(String varPublic) {
		super();
		this.varPublic = varPublic;
		System.out.println("From Superclass conctract -> " + this.varPublic);		
	}

	static{
		SuperClass.varStatic = "Static varible";
//		SuperClass.varStatic1 = "!!!!";
		System.out.println("From static init section from SuperClass -> " + SuperClass.varStatic);
	}
	
	{
		this.varPublic = "Public varible";
		System.out.println("From init section from Superclass -> " + this.varPublic);
	}	
	
	public static void main(String[] args) {
		System.out.println("MAIN in SuperClass");
		SuperClass memberOfSuperClass = new SuperClass("111");
		SuperClass memberOfSuperClass1 = new SuperClass("111");
		SubClass memberOfSubClass = new SubClass();
		SubClass memberOfSubClass1 = new SubClass();
	}
	
	
}
