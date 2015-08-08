package com.java.lesson.task01;

import com.java.lesson.anoserLesson.DinamicArray;

public class DinamicArrayOfMyString extends DinamicArray {

	public MyString getElement(int number){
		return (MyString)super.getElement(number);
	}

	public MyString add(MyString element){
		return (MyString)super.add((MyString)element);
	}	

//	public void add(MyString element){
//		super.add((MyString)element);
//	}	
	
	
}
