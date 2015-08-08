package com.java.lesson.task02;

import java.util.Arrays;

public class DinamicArray {
	static final int MAX_COUNT_DEFAULT = 5;
	private Object[] data =  new Object[MAX_COUNT_DEFAULT];
	private int count;
	private int maxCount;
	
	public DinamicArray() {
		this.count = 0;
		this.maxCount = MAX_COUNT_DEFAULT;
	}
	
	public void add(Object element){
		if (this.count < this.maxCount) {
			this.data[count++] = element;
		} else {
			this.maxCount *= 2;
			Object[] newData = new Object[this.maxCount];
			System.arraycopy(this.data, 0, newData, 0, this.count);
			this.data = newData;
			this.data[count++] = element;
		}
	}
	
	public void deleteLast(){
		if (this.count > 0) {
			this.data[--count] = null;
		} else {
			System.out.println("End of data.");
		}
	}
	
	public void delete(int number){
		if ((number >=0) && (number<this.count)) {
			this.data[number] = null;
		} else {
			System.out.println("Imposible number.");
		}
	}
	
	public int getCount(){
		return this.count;
	}
	
	public Object getElement(int number){
		return this.data[number];
	}

	@Override
	public String toString() {
		return "DinamicArray [data=" + Arrays.toString(data)
				+ ", count=" + count + ", maxCount=" + maxCount + "]";
	}
	
}
