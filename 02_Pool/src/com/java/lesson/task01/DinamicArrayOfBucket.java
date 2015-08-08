package com.java.lesson.task01;

//import java.util.Arrays;
import com.java.lesson.anoserLesson.DinamicArray;

final public class DinamicArrayOfBucket extends DinamicArray {
	
	public Bucket getElement(int number){
		return (Bucket)super.getElement(number);
	}

	public Bucket add(Bucket element){
		return (Bucket)super.add((Bucket)element);
	}

//	public void add_old(Bucket element){
//		super.add((Bucket)element);
//	}

//	@Override
//	public String toString() {
//		return "DinamicArrayOfBucket ["
//				+ "data=" + Arrays.toString(data)
//				+ ", count=" + count() + "]";
//	}
	
	
}
