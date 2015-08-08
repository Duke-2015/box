package com.java.lesson.task02;

public class DinamicArrayOfString extends DinamicArray{
	
	public String getElement(int number){
		return (String)super.getElement(number);
	}

	public void add(String element){
		super.add((String)element);
	}
	
}
