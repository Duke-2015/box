package com.java.lesson.task01;

@SuppressWarnings("static-access")
//final public class MyString implements InternString {
final public class MyString {
	private String data;
	static private Pool pool;
	
	static{
		pool = new Pool();
		pool.addInPool("");
	}
	
	private MyString(String data) {
		this.data = data;
//		System.out.println(this);
	}
	
//	It is very bad!
	public static MyString new_MyStringForBucket(String str){
		return new MyString(str);
	}
	
	public static MyString new_MyString(String str){
		return pool.addInPool(str); 
	}
	
	
	public boolean equals(String str) {
		return data.equals(str);
 	}

	
		@Override
	public String toString() {
		return data;
	}

	static public int internPoolSize() {
		return pool.count();
	}

	static public void printInternPool() {
		System.out.println(pool.getPool());
	}
	

	static public void printInternPoolHash() {
		System.out.println(pool.getPoolHash());
	}
	
//	@Override
//	public String concat(String string) {
//		data.concat(string);
//		return data;
//	}
//
//	@Override
//	public long size() {
//		return data.length();
//	}
//
//	@Override
//	public void trim() {
//		data.trim();
//	}
//
//	@Override
//	public boolean isEmpty() {
//		return data.isEmpty();
// 	}
	
}

