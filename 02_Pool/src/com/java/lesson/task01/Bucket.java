package com.java.lesson.task01;

public class Bucket {
	private int hash;
	private DinamicArrayOfMyString data;
	
	public Bucket(String str) {
		data = new DinamicArrayOfMyString();
		hash = str.hashCode();
		addString(str);
	}

	public int getHash() {
		return hash;
	}

	public MyString getMyString(int number) {
		return data.getElement(number);
	}
	
	public MyString addString(String str) {
		if (isCorectString(str)){
			MyString answer = MyString.new_MyStringForBucket(str);			
			return data.add(answer);
		} else {
			System.out.println("Bad hash from string" + str);
			return null;
		}
	}
	
	public int findNumberStringInBucket(String str){
		return data.findNumber(str);
	}

	@Override
	public String toString() {
		return "\n	Bucket [hash=" + hash + ", data=" + data + "]";
	}
	
	private boolean isCorectString(String str){
		return hash == str.hashCode();
	}
	
}
