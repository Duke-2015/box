package com.java.lesson.anoserLesson;

public class MainClass {

	public static void main(String[] args) {
		DinamicArrayOfString Arr1 = new DinamicArrayOfString();
//		for (int i = 0; i < 10; i++) {
//			String strI = Integer.toString(i);
//			Arr1.add(strI);
//			System.out.println("Step " + strI + ": " + Arr1);
//		}
		try {
			Arr1.deleteLast();
		} catch (MyExtention e) {
			e.getMessage();
		}
		
//		System.out.println("What type " + ": " + Arr1.getElement(1).getClass());
//		int z = (Integer)Arr1.getElement(0) + (Integer)Arr1.getElement(1);
//		System.out.println("Arr1[1] + Arr1[2]" + ": " + (Arr1.getElement(0) + Arr1.getElement(1)));
		
//		DinamicArrayOfInteger Arr2 = new DinamicArrayOfInteger();
//		for (int i = 0; i < 10; i++) {
//			String strI = Integer.toString(i);
//			Arr2.add(i);
//			System.out.println("Step " + strI + ": " + Arr2);
//		}
//		System.out.println("What type " + ": " + Arr2.getElement(1).getClass());
////		int z = (Integer)Arr2.getElement(0) + (Integer)Arr2.getElement(1);
//		System.out.println("Arr2[1] + Arr2[2]" + ": " + (Arr2.getElement(0) + Arr2.getElement(1)));
		
//		for (int i = 0; i < 10; i++) {
//			String strI = Integer.toString(i);
//			Arr1.add("Number " + strI);
//			System.out.println("Step " + strI + ": " + Arr1);
//		}
//		Arr1.deleteLast();
//		System.out.println("Delete last " + ": " + Arr1);
//		Arr1.delete(5);
//		System.out.println("Delete 5" + ": " + Arr1);
		
		
//		Arr1.add("1st");
//		Arr1.add("2nd");
//		Arr1.add("3rd");
//		Arr1.add("4th");
//		Arr1.add("5th");
//		Arr1.add("6th");
//		Arr1.add("7th");
//		Arr1.add("8th");
//		Arr1.add("9th");
//		Arr1.add("10th");
//		Arr1.add("11th");

	}

}
