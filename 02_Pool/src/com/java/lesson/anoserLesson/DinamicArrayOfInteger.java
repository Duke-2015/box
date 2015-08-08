package com.java.lesson.anoserLesson;

final public class DinamicArrayOfInteger extends DinamicArray{
	
	public Integer getElement(int number){
		return (Integer)super.getElement(number);
	}

	public void add(Integer element){
		super.add((Integer)element);
	}
	
}
