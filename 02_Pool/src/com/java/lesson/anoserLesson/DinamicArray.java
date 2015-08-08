package com.java.lesson.anoserLesson;

//import java.util.Arrays;

public class DinamicArray {
	static final int MAX_COUNT_DEFAULT = 5;
	private Object[] data =  new Object[MAX_COUNT_DEFAULT];
	private int count;
	private int maxCount;
	
	public DinamicArray() {
		count = 0;
		maxCount = MAX_COUNT_DEFAULT;
	}
	
	public void add_oldVersion(Object element){
		if (count >= maxCount) {
			doubleDataSize();
		};
		data[count++] = element;
	}

	public Object add(Object element){
		if (count >= maxCount) {
			doubleDataSize();
		};
		data[count++] = element;
		return element;
	}
	
	public void deleteLast() throws MyExtention{
		try {
			data[--count] = null;
		}
		catch (Exception e) {
			throw new MyExtention();
//			System.out.println("End of data.");
		}
		finally{
			if (count < 0) {
				count = 0; 
			}
		}
	}
	
	public void delete(int number){
		if (isCorrectNumber(number)) {
			data[number] = null;
		} else {
			System.out.println("Imposible number.");
		}
	}
	
	public int count(){
		return count;
	}
	
	public Object getElement(int number){
		if (isCorrectNumber(number)) {
			return data[number];
		} else {
			System.out.println("Imposible number.");
			return null;
		}
	}
	
	public int findNumber(Object element){
		for(int i = 0; i < count; i++){
			if (data[i] == element)
				return i;
		}
		return -1;
	}

//	@Override
//	public String toString() {
//		return "DinamicArray [data=" + Arrays.toString(data)
//				+ ", count=" + count + "]";
//	}
//	
	@Override
	public String toString() {
		String str = "DinamicArray [count=" + count + ", data=[";
		for (int i=0; i < count-1; i++) {
			str += (String.valueOf(data[i]) + ", ");
		}
		str += String.valueOf(data[count-1]); 
		return str + "]";
	}

	private void doubleDataSize(){
		maxCount *= 2;
		Object[] newData = new Object[maxCount];
		System.arraycopy(data, 0, newData, 0, count);
		data = newData;
	}
	
	private boolean isCorrectNumber(int number){
		return ((number >=0) && (number<count));
	}
	
}
